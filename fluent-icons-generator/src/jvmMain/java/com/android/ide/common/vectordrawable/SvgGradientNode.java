/*
 * Copyright (C) 2017 The Android Open Source Project
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

import static com.android.ide.common.vectordrawable.VdUtil.parseColorValue;
import static com.android.utils.DecimalUtils.trimInsignificantZeros;
import static com.android.utils.XmlUtils.formatFloatValue;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.ide.common.vectordrawable.PathParser.ParseMode;
import com.google.common.collect.ImmutableMap;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;

/** Represents a SVG gradient that is referenced by a SvgLeafNode. */
class SvgGradientNode extends SvgNode {
    private static final Logger logger = Logger.getLogger(SvgGroupNode.class.getSimpleName());

    private final ArrayList<GradientStop> myGradientStops = new ArrayList<>();

    private SvgLeafNode mSvgLeafNode;

    // Bounding box of mSvgLeafNode.
    private Rectangle2D boundingBox;

    private GradientUsage mGradientUsage;

    private static class GradientCoordResult {
        private final double mValue;
        // When the gradientUnits is set to "userSpaceOnUse", we usually use the coordinate values
        // as it is. But if the coordinate value is a percentage, we still need to multiply this
        // percentage with the viewport's bounding box, in a similar way as gradientUnits is set
        // to "objectBoundingBox".
        private final boolean mIsPercentage;

        GradientCoordResult(double value, boolean isPercentage) {
            mValue = value;
            mIsPercentage = isPercentage;
        }

        double getValue() {
            return mValue;
        }

        boolean isPercentage() {
            return mIsPercentage;
        }
    }

    protected enum GradientUsage {
        FILL,
        STROKE
    }

    // Maps the gradient vector's coordinate names to an int for easier array lookup.
    private static final ImmutableMap<String, Integer> vectorCoordinateMap =
            ImmutableMap.<String, Integer>builder()
                    .put("x1", 0)
                    .put("y1", 1)
                    .put("x2", 2)
                    .put("y2", 3)
                    .build();

    SvgGradientNode(@NonNull SvgTree svgTree, @NonNull Element element, @Nullable String nodeName) {
        super(svgTree, element, nodeName);
    }

    @Override
    @NonNull
    public SvgGradientNode deepCopy() {
        SvgGradientNode newInstance = new SvgGradientNode(getTree(), mDocumentElement, getName());
        newInstance.copyFrom(this);
        return newInstance;
    }

    @Override
    public boolean isGroupNode() {
        return false;
    }

    /**
     * We do not copy mSvgLeafNode, boundingBox, or mGradientUsage because they will be set after
     * copying the SvgGradientNode. We always call deepCopy of SvgGradientNodes within a SvgLeafNode
     * and then call setSvgLeafNode for that leaf. We calculate the boundingBox and determine the
     * mGradientUsage based on the leaf node's attributes and reference to the gradient being
     * copied.
     */
    protected void copyFrom(@NonNull SvgGradientNode from) {
        super.copyFrom(from);
        for (GradientStop g : from.myGradientStops) {
            addGradientStop(g.getColor(), g.getOffset(), g.getOpacity());
        }
    }

    @Override
    public void dumpNode(@NonNull String indent) {
        // Print the current node.
        logger.log(Level.FINE, indent + "current gradient is :" + getName());
    }

    @Override
    public void transformIfNeeded(@NonNull AffineTransform rootTransform) {
        AffineTransform finalTransform = new AffineTransform(rootTransform);
        finalTransform.concatenate(mStackedTransform);
    }

    @Override
    public void flatten(@NonNull AffineTransform transform) {
        mStackedTransform.setTransform(transform);
        mStackedTransform.concatenate(mLocalTransform);
    }

    /** Parses the gradient coordinate value given as a percentage or a length. Returns a double. */
    private GradientCoordResult getGradientCoordinate(@NonNull String x, double defaultValue) {
        if (!mVdAttributesMap.containsKey(x)) {
            return new GradientCoordResult(defaultValue, false);
        }
        double val = defaultValue;
        String vdValue = mVdAttributesMap.get(x).trim();
        if (x.equals("r") && vdValue.startsWith("-")) {
            return new GradientCoordResult(defaultValue, false);
        }

        boolean isPercentage = false;
        try {
            if (vdValue.endsWith("%")) {
                val = Double.parseDouble(vdValue.substring(0, vdValue.length() - 1)) / 100;
                isPercentage = true;
            } else {
                val = Double.parseDouble(vdValue);
            }
        } catch (NumberFormatException e) {
            logError("Unsupported coordinate value");
        }
        return new GradientCoordResult(val, isPercentage);
    }

    @Override
    public void writeXml(@NonNull OutputStreamWriter writer, @NonNull String indent)
            throws IOException {
        if (myGradientStops.isEmpty()) {
            logError("Gradient has no stop info");
            return;
        }

        // By default, the dimensions of the gradient is the bounding box of the path.
        setBoundingBox();
        double height = boundingBox.getHeight();
        double width = boundingBox.getWidth();
        double startX = boundingBox.getX();
        double startY = boundingBox.getY();

        String gradientUnit = mVdAttributesMap.get("gradientUnits");
        boolean isUserSpaceOnUse = "userSpaceOnUse".equals(gradientUnit);
        // If gradientUnits is specified to be "userSpaceOnUse", we use the image's dimensions.
        if (isUserSpaceOnUse) {
            startX = 0;
            startY = 0;
            height = getTree().getHeight();
            width = getTree().getWidth();
        }

        if (width == 0 || height == 0) {
            return; // The gradient is not visible because it doesn't occupy any area.
        }

        writer.write(indent);
        if (mGradientUsage == GradientUsage.FILL) {
            writer.write("<aapt:attr name=\"android:fillColor\">");
        } else {
            writer.write("<aapt:attr name=\"android:strokeColor\">");
        }
        writer.write(System.lineSeparator());
        writer.write(indent);
        writer.write(INDENT_UNIT);
        writer.write("<gradient ");

        // TODO: Fix matrix transformations that include skew element and SVGs that define scale before rotate.
        // Additionally skew transformations have not been tested.
        // If there is a gradientTransform, parse and store in mLocalTransform.
        if (mVdAttributesMap.containsKey("gradientTransform")) {
            String transformValue = mVdAttributesMap.get("gradientTransform");
            parseLocalTransform(transformValue);
            if (!isUserSpaceOnUse) {
                AffineTransform tr = new AffineTransform(width, 0, 0, height, 0, 0);
                mLocalTransform.preConcatenate(tr);
                try {
                    tr.invert();
                } catch (NoninvertibleTransformException e) {
                    throw new Error(e); // Not going to happen because width * height != 0;
                }
                mLocalTransform.concatenate(tr);
            }
        }

        // According to the SVG spec, the gradient transformation (mLocalTransform) always needs
        // to be applied to the gradient. However, the geometry transformation (mStackedTransform)
        // will be affecting gradient only when it is using user space because we flatten
        // everything.
        // If we are not using user space, at this moment, the bounding box already contains
        // the geometry transformation, when we apply percentage to the bounding box, we don't
        // need to multiply the geometry transformation the second time.
        if (isUserSpaceOnUse) {
            mLocalTransform.preConcatenate(mSvgLeafNode.mStackedTransform);
        }

        // Source and target arrays to which we apply the local transform.
        double[] gradientBounds;
        double[] transformedBounds;

        String gradientType = "linear";

        if (mVdAttributesMap.containsKey("gradientType")) {
            gradientType = mVdAttributesMap.get("gradientType");
        }

        if (gradientType.equals("linear")) {
            gradientBounds = new double[4];
            transformedBounds = new double[4];
            // Retrieves x1, y1, x2, y2 and calculates their coordinate in the viewport.
            // Stores the coordinates in the gradientBounds and transformedBounds arrays to apply
            // the proper transformation.
            for (Map.Entry<String, Integer> entry : vectorCoordinateMap.entrySet()) {
                // Gets the index corresponding to x1, y1, x2 and y2.
                // x1 and x2 are indexed as 0 and 2
                // y1 and y2 are indexed as 1 and 3
                String s = entry.getKey();
                int index = entry.getValue();

                // According to SVG spec, the default coordinate value for x1, and y1 and y2 is 0.
                // The default for x2 is 1.
                double defaultValue = 0;
                if (index == 2) {
                    defaultValue = 1;
                }
                GradientCoordResult result = getGradientCoordinate(s, defaultValue);

                double coordValue = result.getValue();
                if (!isUserSpaceOnUse || result.isPercentage()) {
                    if (index % 2 == 0) {
                        coordValue = coordValue * width + startX;
                    } else {
                        coordValue = coordValue * height + startY;
                    }
                }
                // In case no transforms are applied, original coordinates are also stored in
                // transformedBounds.
                gradientBounds[index] = coordValue;
                transformedBounds[index] = coordValue;

                // We need mVdAttributesMap to contain all coordinates regardless if they are
                // specified in the SVG in order to write the default value to the VD XML.
                if (!mVdAttributesMap.containsKey(s)) {
                    mVdAttributesMap.put(s, "");
                }
            }
            // transformedBounds will hold the new coordinates of the gradient.
            // This applies it to the linearGradient
            mLocalTransform.transform(gradientBounds, 0, transformedBounds, 0, 2);
        } else {
            gradientBounds = new double[2];
            transformedBounds = new double[2];
            GradientCoordResult cxResult = getGradientCoordinate("cx", .5);
            double cx = cxResult.getValue();
            if (!isUserSpaceOnUse || cxResult.isPercentage()) {
                cx = width * cx + startX;
            }
            GradientCoordResult cyResult = getGradientCoordinate("cy", .5);
            double cy = cyResult.getValue();
            if (!isUserSpaceOnUse || cyResult.isPercentage()) {
                cy = height * cy + startY;
            }
            GradientCoordResult rResult = getGradientCoordinate("r", .5);
            double r = rResult.getValue();
            if (!isUserSpaceOnUse || rResult.isPercentage()) {
                r *= Math.max(height, width);
            }

            gradientBounds[0] = cx;
            transformedBounds[0] = cx;
            gradientBounds[1] = cy;
            transformedBounds[1] = cy;

            // Transform radius, center point here.
            mLocalTransform.transform(gradientBounds, 0, transformedBounds, 0, 1);
            Point2D radius = new Point2D.Double(r, 0);
            Point2D transformedRadius = new Point2D.Double(r, 0);
            mLocalTransform.deltaTransform(radius, transformedRadius);

            mVdAttributesMap.put("cx", formatFloatValue(transformedBounds[0]));
            mVdAttributesMap.put("cy", formatFloatValue(transformedBounds[1]));
            mVdAttributesMap.put("r", formatFloatValue(transformedRadius.distance(0, 0)));
        }

        for (Map.Entry<String, String> entry : mVdAttributesMap.entrySet()) {
            String key = entry.getKey();
            String gradientAttr = Svg2Vector.gradientMap.get(key);
            String svgValue = entry.getValue().trim();
            String vdValue;
            vdValue = colorSvg2Vd(svgValue, "#000000");

            if (vdValue == null) {
                if (vectorCoordinateMap.containsKey(key)) {
                    double x = transformedBounds[vectorCoordinateMap.get(key)];
                    vdValue = formatFloatValue(x);
                } else if (key.equals("spreadMethod")) {
                    if (svgValue.equals("pad")) {
                        vdValue = "clamp";
                    } else if (svgValue.equals("reflect")) {
                        vdValue = "mirror";
                    } else if (svgValue.equals("repeat")) {
                        vdValue = "repeat";
                    } else {
                        logError("Unsupported spreadMethod " + svgValue);
                        vdValue = "clamp";
                    }
                } else if (svgValue.endsWith("%")) {
                    vdValue = formatFloatValue(getGradientCoordinate(key, 0).getValue());
                } else {
                    vdValue = svgValue;
                }
            }

            if (!gradientAttr.isEmpty()) {
                writer.write(System.lineSeparator());
                writer.write(indent);
                writer.write(INDENT_UNIT);
                writer.write(CONTINUATION_INDENT);
                writer.write(gradientAttr);
                writer.write("=\"");
                writer.write(vdValue);
                writer.write("\"");
            }
        }
        writer.write('>');
        writer.write(System.lineSeparator());

        writeGradientStops(writer, indent + INDENT_UNIT + INDENT_UNIT);
        writer.write(indent);
        writer.write(INDENT_UNIT);
        writer.write("</gradient>");
        writer.write(System.lineSeparator());
        writer.write(indent);
        writer.write("</aapt:attr>");
        writer.write(System.lineSeparator());
    }

    private void writeGradientStops(@NonNull OutputStreamWriter writer, @NonNull String indent)
            throws IOException {
        for (GradientStop g : myGradientStops) {
            String color = g.getColor();
            float opacity;
            try {
                opacity = Float.parseFloat(g.getOpacity());
            } catch (NumberFormatException e) {
                logWarning("Unsupported opacity value");
                opacity = 1;
            }
            int color1 = VdPath.applyAlpha(parseColorValue(color), opacity);
            color = String.format("#%08X", color1);

            writer.write(indent);
            writer.write("<item android:offset=\"");
            writer.write(trimInsignificantZeros(g.getOffset()));
            writer.write("\"");
            writer.write(" android:color=\"");
            writer.write(color);
            writer.write("\"/>");
            writer.write(System.lineSeparator());

            if (myGradientStops.size() == 1) {
                logWarning("Gradient has only one color stop");
                writer.write(indent);
                writer.write("<item android:offset=\"1\"");
                writer.write(" android:color=\"");
                writer.write(color);
                writer.write("\"/>");
                writer.write(System.lineSeparator());
            }
        }
    }

    public void addGradientStop(
            @NonNull String color, @NonNull String offset, @NonNull String opacity) {
        GradientStop stop = new GradientStop(color, offset);
        stop.setOpacity(opacity);
        myGradientStops.add(stop);
    }

    public void setGradientUsage(@NonNull GradientUsage gradientUsage) {
        mGradientUsage = gradientUsage;
    }

    public void setSvgLeafNode(@NonNull SvgLeafNode svgLeafNode) {
        mSvgLeafNode = svgLeafNode;
    }

    private void setBoundingBox() {
        Path2D svgPath = new Path2D.Double();
        VdPath.Node[] nodes = PathParser.parsePath(mSvgLeafNode.getPathData(), ParseMode.SVG);
        VdNodeRender.createPath(nodes, svgPath);
        boundingBox = svgPath.getBounds2D();
    }
}
