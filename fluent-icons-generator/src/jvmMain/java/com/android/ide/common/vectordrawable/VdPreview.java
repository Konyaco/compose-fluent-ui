/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.ide.common.vectordrawable;

import static com.google.common.math.DoubleMath.roundToInt;
import static java.nio.charset.StandardCharsets.UTF_8;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.ide.common.util.AssetUtil;
import com.android.utils.XmlUtils;
import com.google.common.base.Strings;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.math.RoundingMode;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Generates an image based on the VectorDrawable's XML content.
 */
public class VdPreview {
    private static final String ANDROID_ALPHA = "android:alpha";
    private static final String ANDROID_TINT = "android:tint";
    private static final String ANDROID_AUTO_MIRRORED = "android:autoMirrored";
    private static final String ANDROID_HEIGHT = "android:height";
    private static final String ANDROID_WIDTH = "android:width";
    private static final int MAX_PREVIEW_IMAGE_SIZE = 4096;
    private static final int MIN_PREVIEW_IMAGE_SIZE = 1;

    /**
     * Encapsulates the information used to determine the preview image size. The reason we have
     * different ways here is that both Studio UI and build process need to use this common code
     * path to generate images for vector drawables. When {@code maxDimension} is not zero, use
     * {@code maxDimension} as the maximum dimension value while keeping the aspect ratio.
     * Otherwise, use {@code imageScale} to scale the image based on the XML's size information.
     */
    public static class TargetSize {
        private int imageMaxDimension;
        private double imageScale;

        private TargetSize(int maxDimension, double imageScale) {
            this.imageMaxDimension = maxDimension;
            this.imageScale = imageScale;
        }

        public static TargetSize createFromMaxDimension(int maxDimension) {
            return new TargetSize(maxDimension, 0);
        }

        public static TargetSize createFromScale(double imageScale) {
            return new TargetSize(0, imageScale);
        }
    }

    /**
     * Returns a format object for XML formatting.
     */
    @NonNull
    private static OutputFormat getPrettyPrintFormat() {
        OutputFormat format = new OutputFormat();
        format.setLineWidth(120);
        format.setIndenting(true);
        format.setIndent(4);
        format.setEncoding("UTF-8");
        format.setOmitComments(true);
        format.setOmitXMLDeclaration(true);
        return format;
    }

    /**
     * The UI can override some properties of the Vector drawable. In order to override in
     * an uniform way, we re-parse the XML file and pick the appropriate attributes to override.
     *
     * @param document the parsed document of original VectorDrawable's XML file.
     * @param overrideInfo incoming override information for VectorDrawable.
     * @param errorLog log for the parsing errors and warnings.
     * @return the overridden XML, or null if exception happens or no attributes need to be
     *     overridden.
     */
    @Nullable
    public static String overrideXmlContent(
            @NonNull Document document,
            @NonNull VdOverrideInfo overrideInfo,
            @Nullable StringBuilder errorLog) {
        boolean contentChanged = false;
        Element root = document.getDocumentElement();

        // Update attributes, note that attributes as width and height are required,
        // while others are optional.
        if (overrideInfo.needsOverrideWidth()) {
            if (setDimension(root, ANDROID_WIDTH, overrideInfo.getWidth())) {
                contentChanged = true;
            }
        }
        if (overrideInfo.needsOverrideHeight()) {
            if (setDimension(root, ANDROID_HEIGHT, overrideInfo.getHeight())) {
                contentChanged = true;
            }
        }
        if (overrideInfo.needsOverrideAlpha()) {
            String value = XmlUtils.formatFloatValue(overrideInfo.getAlpha());
            if (setAttributeValue(root, ANDROID_ALPHA, value)) {
                contentChanged = true;
            }
        }

        if (overrideInfo.needsOverrideTint()) {
            String value = String.format("#%06X", overrideInfo.tintRgb());
            if (setAttributeValue(root, ANDROID_TINT, value)) {
                contentChanged = true;
            }
        }

        if (overrideInfo.getAutoMirrored()) {
            if (setAttributeValue(root, ANDROID_AUTO_MIRRORED, "true")) {
                contentChanged = true;
            }
        }

        if (contentChanged) {
            // Pretty-print the XML string from the document.
            StringWriter stringOut = new StringWriter();
            XMLSerializer serial = new XMLSerializer(stringOut, getPrettyPrintFormat());
            try {
                serial.serialize(document);
            }
            catch (IOException e) {
                if (errorLog != null) {
                    errorLog.append("Exception while parsing XML file:\n").append(e.getMessage());
                }
            }
            return stringOut.toString();
        }

        return null;
    }

    /**
     * Sets value of a dimension attribute. The returned value reflects whether the value of
     * the attribute was changed or not.
     */
    private static boolean setDimension(
            @NonNull Element element, @NonNull String attrName, double value) {
        String newValue = XmlUtils.formatFloatValue(value) + "dp";
        return setAttributeValue(element, attrName, newValue);
    }

    /**
     * Sets value of an attribute. The returned value reflects whether the value of the attribute
     * was changed or not.
     */
    private static boolean setAttributeValue(
            @NonNull Element element, @NonNull String attrName, @NonNull String value) {
        String oldValue = element.getAttribute(attrName);
        element.setAttribute(attrName, value);
        return !value.equals(oldValue);
    }

    /**
     * Generates an image according to the VectorDrawable's content {@code xmlFileContent}.
     * At the same time, {@code vdErrorLog} captures all the errors found during parsing.
     * The size of image is determined by the {@code size}.
     *
     * @param targetSize the size of result image.
     * @param xmlFileContent  VectorDrawable's XML file's content.
     * @param errorLog      log for the parsing errors and warnings.
     * @return an preview image according to the VectorDrawable's XML
     */
    @Nullable
    public static BufferedImage getPreviewFromVectorXml(@NonNull TargetSize targetSize,
                                                        @Nullable String xmlFileContent,
                                                        @Nullable StringBuilder errorLog) {
        if (Strings.isNullOrEmpty(xmlFileContent)) {
            return null;
        }

        InputStream inputStream = new ByteArrayInputStream(xmlFileContent.getBytes(UTF_8));
        VdTree vdTree = VdParser.parse(inputStream, errorLog);

        return getPreviewFromVectorTree(targetSize, vdTree, errorLog);
    }

    /**
     * This generates an image from a vector tree.
     * The size of image is determined by the {@code size}.
     *
     * @param targetSize the size of result image.
     * @param xml        The vector drawable XML document
     * @param vdErrorLog log for the errors and warnings.
     * @return an preview image according to the VectorDrawable's XML
     */
    @NonNull
    public static BufferedImage getPreviewFromVectorDocument(@NonNull TargetSize targetSize,
                                                             @NonNull Document xml,
                                                             @Nullable StringBuilder vdErrorLog) {
        VdTree vdTree = new VdTree();
        vdTree.parse(xml);
        return getPreviewFromVectorTree(targetSize, vdTree, vdErrorLog);
    }

    /**
     * Generates an image from a vector tree. The size of image is determined by the {@code size}.
     *
     * @param targetSize the size of result image.
     * @param vdTree     The vector drawable
     * @param errorLog log for the errors and warnings.
     * @return an preview image according to the VectorDrawable's XML
     */
    @NonNull
    public static BufferedImage getPreviewFromVectorTree(@NonNull TargetSize targetSize,
                                                         @NonNull VdTree vdTree,
                                                         @Nullable StringBuilder errorLog) {
        // If the forceImageSize is set (>0), then we honor that.
        // Otherwise, we will ask the vector drawable for the prefer size, then apply the imageScale.
        double vdWidth = vdTree.getBaseWidth();
        double vdHeight = vdTree.getBaseHeight();
        double imageWidth;
        double imageHeight;
        int forceImageSize = targetSize.imageMaxDimension;
        double imageScale = targetSize.imageScale;

        if (forceImageSize > 0) {
            // The goal here is to generate an image within certain size, while preserving
            // the aspect ratio as accurately as we can. If it is scaling too much to fit in,
            // we log an error.
            double maxVdSize = Math.max(vdWidth, vdHeight);
            double ratioToForceImageSize = forceImageSize / maxVdSize;
            double scaledWidth = ratioToForceImageSize * vdWidth;
            double scaledHeight = ratioToForceImageSize * vdHeight;
            imageWidth =
                    limitToInterval(scaledWidth, MIN_PREVIEW_IMAGE_SIZE, MAX_PREVIEW_IMAGE_SIZE);
            imageHeight =
                    limitToInterval(scaledHeight, MIN_PREVIEW_IMAGE_SIZE, MAX_PREVIEW_IMAGE_SIZE);
            if (errorLog != null && (scaledWidth != imageWidth || scaledHeight != imageHeight)) {
                errorLog.append("Invalid image size, can't fit in a square whose size is ")
                        .append(forceImageSize);
            }
        } else {
            imageWidth = vdWidth * imageScale;
            imageHeight = vdHeight * imageScale;
        }

        // Create the image according to the vector drawable's aspect ratio.
        BufferedImage image =
                AssetUtil.newArgbBufferedImage(
                        roundToInt(imageWidth, RoundingMode.HALF_UP),
                        roundToInt(imageHeight, RoundingMode.HALF_UP));
        vdTree.drawIntoImage(image);
        return image;
    }

    private static double limitToInterval(double value, double begin, double end) {
        return Math.max(begin, Math.min(end, value));
    }
}
