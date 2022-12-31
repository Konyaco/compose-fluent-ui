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

import static com.android.ide.common.vectordrawable.VdUtil.parseColorValue;
import static com.android.utils.DecimalUtils.trimInsignificantZeros;
import static com.android.utils.XmlUtils.formatFloatValue;

import com.android.SdkConstants;
import com.android.annotations.NonNull;
import com.android.ide.common.vectordrawable.PathParser.ParseMode;
import com.android.utils.PositionXmlParser;
import com.google.common.collect.ImmutableMap;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

/** Represents one path element of a vector drawable. */
class VdPath extends VdElement {
    private static final String PATH_ID = "android:name";
    private static final String PATH_DESCRIPTION = "android:pathData";
    private static final String PATH_FILL = "android:fillColor";
    private static final String PATH_FILL_OPACITY = "android:fillAlpha";
    private static final String PATH_FILL_TYPE = "android:fillType";
    private static final String PATH_STROKE = "android:strokeColor";
    private static final String PATH_STROKE_OPACITY = "android:strokeAlpha";

    private static final String FILL_TYPE_EVEN_ODD = "evenOdd";

    private static final String PATH_STROKE_WIDTH = "android:strokeWidth";
    private static final String PATH_TRIM_START = "android:trimPathStart";
    private static final String PATH_TRIM_END = "android:trimPathEnd";
    private static final String PATH_TRIM_OFFSET = "android:trimPathOffset";
    private static final String PATH_STROKE_LINE_CAP = "android:strokeLineCap";
    private static final String PATH_STROKE_LINE_JOIN = "android:strokeLineJoin";
    private static final String PATH_STROKE_MITER_LIMIT = "android:strokeMiterLimit";

    private static final String LINE_CAP_BUTT = "butt";
    private static final String LINE_CAP_ROUND = "round";
    private static final String LINE_CAP_SQUARE = "square";
    private static final String LINE_JOIN_MITER = "miter";
    private static final String LINE_JOIN_ROUND = "round";
    private static final String LINE_JOIN_BEVEL = "bevel";
    private static final float EPSILON = 1e-6f;
    private static final char INIT_TYPE = ' ';

    private static final ImmutableMap<Character, Integer> COMMAND_STEP_MAP =
            ImmutableMap.<Character, Integer>builder()
                    .put('z', 2)
                    .put('Z', 2)
                    .put('m', 2)
                    .put('M', 2)
                    .put('l', 2)
                    .put('L', 2)
                    .put('t', 2)
                    .put('T', 2)
                    .put('h', 1)
                    .put('H', 1)
                    .put('v', 1)
                    .put('V', 1)
                    .put('c', 6)
                    .put('C', 6)
                    .put('s', 4)
                    .put('S', 4)
                    .put('q', 4)
                    .put('Q', 4)
                    .put('a', 7)
                    .put('A', 7)
                    .build();


    private VdGradient fillGradient;
    private VdGradient strokeGradient;

    private Node[] mNodeList;
    private int mStrokeColor;
    private int mFillColor;

    private float mStrokeWidth;
    private int mStrokeLineCap;
    private int mStrokeLineJoin;
    private float mStrokeMiterlimit = 4;
    private float mStrokeAlpha = 1.0f;
    private float mFillAlpha = 1.0f;
    private int mFillType = PathIterator.WIND_NON_ZERO;
    // TODO: support trim path.
    private float mTrimPathStart;
    private float mTrimPathEnd = 1;
    private float mTrimPathOffset;

    private void toPath(@NonNull Path2D path) {
        path.reset();
        if (mNodeList != null) {
            VdNodeRender.createPath(mNodeList, path);
        }
    }

    /**
     * Represents one segment of the path data, e.g. "l 0,0 1,1".
     */
    public static class Node {
        private char mType;
        private float[] mParams;

        public char getType() {
            return mType;
        }

        public float[] getParams() {
            return mParams;
        }

        public Node(char type, @NonNull float[] params) {
            this.mType = type;
            this.mParams = params;
        }

        public Node(@NonNull Node n) {
            this.mType = n.mType;
            this.mParams = Arrays.copyOf(n.mParams, n.mParams.length);
        }

        public static boolean hasRelMoveAfterClose(@NonNull Node[] nodes) {
            char preType = ' ';
            for (Node n : nodes) {
                if ((preType == 'z' || preType == 'Z') && n.mType == 'm') {
                    return true;
                }
                preType = n.mType;
            }
            return false;
        }

        @NonNull
        public static String nodeListToString(@NonNull Node[] nodes, @NonNull NumberFormat format) {
            StringBuilder result = new StringBuilder();
            for (Node node : nodes) {
                result.append(node.mType);
                int len = node.mParams.length;
                boolean implicitLineTo = false;
                char lineToType = ' ';
                if ((node.mType == 'm' || node.mType == 'M') && len > 2) {
                    implicitLineTo = true;
                    lineToType = node.mType == 'm' ? 'l' : 'L';
                }
                for (int j = 0; j < len; j++) {
                    if (j > 0) {
                        result.append(j % 2 != 0 ? "," : " ");
                    }
                    if (implicitLineTo && j == 2) {
                        result.append(lineToType);
                    }
                    float param = node.mParams[j];
                    if (!Float.isFinite(param)) {
                        throw new IllegalArgumentException("Invalid number: " + param);
                    }
                    String str = trimInsignificantZeros(format.format(param));
                    result.append(str);
                }
            }

            return result.toString();
        }

        public static void transform(
                @NonNull AffineTransform totalTransform, @NonNull Node[] nodes) {
            Point2D.Float currentPoint = new Point2D.Float();
            Point2D.Float currentSegmentStartPoint = new Point2D.Float();
            char previousType = INIT_TYPE;
            for (Node n : nodes) {
                n.transform(totalTransform, currentPoint, currentSegmentStartPoint, previousType);
                previousType = n.mType;
            }
        }

        private void transform(
                @NonNull AffineTransform totalTransform,
                @NonNull Point2D.Float currentPoint,
                @NonNull Point2D.Float currentSegmentStartPoint,
                char previousType) {
            // For horizontal and vertical lines, we have to convert to LineTo with 2 parameters.
            // And for arcTo, we also need to isolate the parameters for transformation.
            // Therefore looping will be necessary for such commands.
            //
            // Note that if the matrix is translation only, then we can save many computations.
            int paramsLen = mParams.length;
            float[] tempParams = new float[2 * paramsLen];
            // These has to be pre-transformed value. In other words, the same as it is
            // in the pathData.
            float currentX = currentPoint.x;
            float currentY = currentPoint.y;
            float currentSegmentStartX = currentSegmentStartPoint.x;
            float currentSegmentStartY = currentSegmentStartPoint.y;

            int step = COMMAND_STEP_MAP.get(mType);
            switch (mType) {
                case 'z':
                case 'Z':
                    currentX = currentSegmentStartX;
                    currentY = currentSegmentStartY;
                    break;

                case 'M':
                    currentSegmentStartX = mParams[0];
                    currentSegmentStartY = mParams[1];
                    //noinspection fallthrough
                case 'L':
                case 'T':
                case 'C':
                case 'S':
                case 'Q':
                    currentX = mParams[paramsLen - 2];
                    currentY = mParams[paramsLen - 1];

                    totalTransform.transform(mParams, 0, mParams, 0, paramsLen / 2);
                    break;

                case 'm':
                    if (previousType == 'z' || previousType == 'Z') {
                        // Replace 'm' with 'M' to work around a bug in API 21 that is triggered
                        // when 'm' follows 'z'.
                        mType = 'M';
                        mParams[0] += currentSegmentStartX;
                        mParams[1] += currentSegmentStartY;
                        currentSegmentStartX = mParams[0]; // Start a new segment.
                        currentSegmentStartY = mParams[1];
                        for (int i = step; i < paramsLen; i += step) {
                            mParams[i] += mParams[i - step];
                            mParams[i + 1] += mParams[i + 1 - step];
                        }
                        currentX = mParams[paramsLen - 2];
                        currentY = mParams[paramsLen - 1];

                        totalTransform.transform(mParams, 0, mParams, 0, paramsLen / 2);
                    } else {
                        int headLen = 2;
                        currentX += mParams[0];
                        currentY += mParams[1];
                        currentSegmentStartX = currentX; // Start a new segment.
                        currentSegmentStartY = currentY;

                        if (previousType == INIT_TYPE) {
                            // 'm' at the start of a path is handled similar to 'M'.
                            // The coordinates are transformed as absolute.
                            totalTransform.transform(mParams, 0, mParams, 0, headLen / 2);
                        } else if (!isTranslationOnly(totalTransform)) {
                            deltaTransform(totalTransform, mParams, 0, headLen);
                        }

                        for (int i = headLen; i < paramsLen; i += step) {
                            currentX += mParams[i];
                            currentY += mParams[i + 1];
                        }

                        if (!isTranslationOnly(totalTransform)) {
                            deltaTransform(totalTransform, mParams, headLen, paramsLen - headLen);
                        }
                    }
                    break;

                case 'l':
                case 't':
                case 'c':
                case 's':
                case 'q':
                    for (int i = 0; i < paramsLen - step + 1; i += step) {
                        currentX += mParams[i + step - 2];
                        currentY += mParams[i + step - 1];
                    }
                    if (!isTranslationOnly(totalTransform)) {
                        deltaTransform(totalTransform, mParams, 0, paramsLen);
                    }
                    break;

                case 'H':
                    mType = 'L';
                    for (int i = 0; i < paramsLen; i++) {
                        tempParams[i * 2] = mParams[i];
                        tempParams[i * 2 + 1] = currentY;
                        currentX = mParams[i];
                    }
                    totalTransform.transform(tempParams, 0, tempParams, 0, paramsLen /*points*/);
                    mParams = tempParams;
                    break;

                case 'V':
                    mType = 'L';
                    for (int i = 0; i < paramsLen; i++) {
                        tempParams[i * 2] = currentX;
                        tempParams[i * 2 + 1] = mParams[i];
                        currentY = mParams[i];
                    }
                    totalTransform.transform(tempParams, 0, tempParams, 0, paramsLen /*points*/);
                    mParams = tempParams;
                    break;

                case 'h':
                    for (int i = 0; i < paramsLen; i++) {
                        currentX += mParams[i];
                        // tempParams may not be used but is assigned here to avoid a second loop.
                        tempParams[i * 2] = mParams[i];
                        tempParams[i * 2 + 1] = 0;
                    }
                    if (!isTranslationOnly(totalTransform)) {
                        mType = 'l';
                        deltaTransform(totalTransform, tempParams, 0, 2 * paramsLen);
                        mParams = tempParams;
                    }
                    break;

                case 'v':
                    for (int i = 0; i < paramsLen; i++) {
                        // tempParams may not be used but is assigned here to avoid a second loop.
                        tempParams[i * 2] = 0;
                        tempParams[i * 2 + 1] = mParams[i];
                        currentY += mParams[i];
                    }

                    if (!isTranslationOnly(totalTransform)) {
                        mType = 'l';
                        deltaTransform(totalTransform, tempParams, 0, 2 * paramsLen);
                        mParams = tempParams;
                    }
                    break;

                case 'A':
                    for (int i = 0; i < paramsLen - step + 1; i += step) {
                        // (0:rx 1:ry 2:x-axis-rotation 3:large-arc-flag 4:sweep-flag 5:x 6:y)
                        // [0, 1, 2]
                        if (!isTranslationOnly(totalTransform)) {
                            EllipseSolver ellipseSolver = new EllipseSolver(totalTransform,
                                    currentX, currentY,
                                    mParams[i], mParams[i + 1], mParams[i + 2],
                                    mParams[i + 3], mParams[i + 4],
                                    mParams[i + 5], mParams[i + 6]);
                            mParams[i] = ellipseSolver.getMajorAxis();
                            mParams[i + 1] = ellipseSolver.getMinorAxis();
                            mParams[i + 2] = ellipseSolver.getRotationDegree();
                            if (ellipseSolver.getDirectionChanged()) {
                                mParams[i + 4] = 1 - mParams[i + 4];
                            }
                        }
                        // [5, 6]
                        currentX = mParams[i + 5];
                        currentY = mParams[i + 6];

                        totalTransform.transform(mParams, i + 5, mParams, i + 5, 1 /*1 point only*/);
                    }
                    break;

                case 'a':
                    for (int i = 0; i < paramsLen - step + 1; i += step) {
                        float oldCurrentX = currentX;
                        float oldCurrentY = currentY;

                        currentX += mParams[i + 5];
                        currentY += mParams[i + 6];
                        if (!isTranslationOnly(totalTransform)) {
                            EllipseSolver ellipseSolver = new EllipseSolver(totalTransform,
                                    oldCurrentX, oldCurrentY,
                                    mParams[i], mParams[i + 1], mParams[i + 2],
                                    mParams[i + 3], mParams[i + 4],
                                    oldCurrentX + mParams[i + 5],
                                    oldCurrentY + mParams[i + 6]);
                            // (0:rx 1:ry 2:x-axis-rotation 3:large-arc-flag 4:sweep-flag 5:x 6:y)
                            // [5, 6]
                            deltaTransform(totalTransform, mParams, i + 5, 2);
                            // [0, 1, 2]
                            mParams[i] = ellipseSolver.getMajorAxis();
                            mParams[i + 1] = ellipseSolver.getMinorAxis();
                            mParams[i + 2] = ellipseSolver.getRotationDegree();
                            if (ellipseSolver.getDirectionChanged()) {
                                mParams[i + 4] = 1 - mParams[i + 4];
                            }
                        }
                    }
                    break;

                default:
                    throw new IllegalStateException("Unexpected type " + mType);
            }
            currentPoint.setLocation(currentX, currentY);
            currentSegmentStartPoint.setLocation(currentSegmentStartX, currentSegmentStartY);
        }

        private static boolean isTranslationOnly(@NonNull AffineTransform totalTransform) {
            int type = totalTransform.getType();
            return type == AffineTransform.TYPE_IDENTITY
                    || type == AffineTransform.TYPE_TRANSLATION;
        }

        /**
         * Applies delta transform to a set of points represented by a float array.
         *
         * @param totalTransform the transform to apply
         * @param coordinates coordinates of points to apply the transform to
         * @param offset in number of floats, not points
         * @param paramsLen in number of floats, not points
         */
        private static void deltaTransform(
                @NonNull AffineTransform totalTransform,
                @NonNull float[] coordinates,
                int offset,
                int paramsLen) {
            double[] doubleArray = new double[paramsLen];
            for (int i = 0; i < paramsLen; i++) {
                doubleArray[i] = (double) coordinates[i + offset];
            }

            totalTransform.deltaTransform(doubleArray, 0, doubleArray, 0, paramsLen / 2);

            for (int i = 0; i < paramsLen; i++) {
                coordinates[i + offset] = (float) doubleArray[i];
            }
        }

        @Override
        @NonNull
        public String toString() {
            StringBuilder result = new StringBuilder();
            result.append(mType);
            int i = 0;
            for (float param : this.mParams) {
                result.append(i++ % 2 == 0 ? ' ' : ',');
                result.append(formatFloatValue(param));
            }
            return result.toString();
        }
    }

    private void setNameValue(@NonNull String name, @NonNull String value) {
        if (value.startsWith(SdkConstants.PREFIX_RESOURCE_REF) && PATH_FILL.equals(name)) {
            // Ignore the android resource in "android:fillColor" present in the new material icons.
            value = "#000000";
        }

        if (value.startsWith(SdkConstants.PREFIX_RESOURCE_REF)) {
            throw new ResourcesNotSupportedException(name, value);
        }

        if (PATH_DESCRIPTION.equals(name)) {
            mNodeList = PathParser.parsePath(value, ParseMode.ANDROID);
        } else if (PATH_ID.equals(name)) {
            mName = value;
        } else if (PATH_FILL.equals(name)) {
            mFillColor = parseColorValue(value);
        } else if (PATH_FILL_TYPE.equals(name)) {
            mFillType = parseFillType(value);
        } else if (PATH_STROKE.equals(name)) {
            mStrokeColor = parseColorValue(value);
        } else if (PATH_FILL_OPACITY.equals(name)) {
            mFillAlpha = Float.parseFloat(value);
        } else if (PATH_STROKE_OPACITY.equals(name)) {
            mStrokeAlpha = Float.parseFloat(value);
        } else if (PATH_STROKE_WIDTH.equals(name)) {
            mStrokeWidth = Float.parseFloat(value);
        } else if (PATH_TRIM_START.equals(name)) {
            mTrimPathStart = Float.parseFloat(value);
        } else if (PATH_TRIM_END.equals(name)) {
            mTrimPathEnd = Float.parseFloat(value);
        } else if (PATH_TRIM_OFFSET.equals(name)) {
            mTrimPathOffset = Float.parseFloat(value);
        } else if (PATH_STROKE_LINE_CAP.equals(name)) {
            if (LINE_CAP_BUTT.equals(value)) {
                mStrokeLineCap = 0;
            } else if (LINE_CAP_ROUND.equals(value)) {
                mStrokeLineCap = 1;
            } else if (LINE_CAP_SQUARE.equals(value)) {
                mStrokeLineCap = 2;
            }
        } else if (PATH_STROKE_LINE_JOIN.equals(name)) {
            if (LINE_JOIN_MITER.equals(value)) {
                mStrokeLineJoin = 0;
            } else if (LINE_JOIN_ROUND.equals(value)) {
                mStrokeLineJoin = 1;
            } else if (LINE_JOIN_BEVEL.equals(value)) {
                mStrokeLineJoin = 2;
            }
        } else if (PATH_STROKE_MITER_LIMIT.equals(name)) {
            mStrokeMiterlimit = Float.parseFloat(value);
        } else {
            getLogger().log(Level.WARNING, ">>>>>> DID NOT UNDERSTAND ! \"" + name + "\" <<<<");
        }
    }

    private static int parseFillType(@NonNull String value) {
        if (FILL_TYPE_EVEN_ODD.equalsIgnoreCase(value)) {
            return PathIterator.WIND_EVEN_ODD;
        }
        return PathIterator.WIND_NON_ZERO;
    }

    /** Multiplies the {@code alpha} value into the alpha channel {@code color}. */
    protected static int applyAlpha(int color, float alpha) {
        int alphaBytes = (color >> 24) & 0xff;
        color &= 0x00FFFFFF;
        color |= ((int) (alphaBytes * alpha)) << 24;
        return color;
    }

    /** Draws the current path. */
    @Override
    public void draw(
            @NonNull Graphics2D g,
            @NonNull AffineTransform currentMatrix,
            float scaleX,
            float scaleY) {
        Path2D path2d = new Path2D.Double(mFillType);
        toPath(path2d);

        // SWing operate the matrix is using pre-concatenate by default.
        // Below is how this is handled in Android framework.
        // pathMatrix.set(groupStackedMatrix);
        // pathMatrix.postScale(scaleX, scaleY);
        g.setTransform(new AffineTransform());
        g.scale(scaleX, scaleY);
        g.transform(currentMatrix);

        if (mFillColor != 0 && fillGradient == null) {
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            @SuppressWarnings("UseJBColor")
            Color fillColor = new Color(applyAlpha(mFillColor, mFillAlpha), true);
            g.setColor(fillColor);
            g.fill(path2d);
        }
        if (mStrokeColor != 0 && mStrokeWidth != 0 && strokeGradient == null) {
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            BasicStroke stroke = new BasicStroke(mStrokeWidth, mStrokeLineCap, mStrokeLineJoin, mStrokeMiterlimit);
            g.setStroke(stroke);
            @SuppressWarnings("UseJBColor")
            Color strokeColor = new Color(applyAlpha(mStrokeColor, mStrokeAlpha), true);
            g.setColor(strokeColor);
            g.draw(path2d);
        }
        if (isClipPath) {
            Shape clip = g.getClip();
            if (clip != null) {
                Area area = new Area(clip);
                area.add(new Area(path2d));
                g.setClip(area);
            } else {
                g.setClip(path2d);
            }
        }
        if (fillGradient != null) {
            fillGradient.drawGradient(g, path2d, true);
        }

        if (strokeGradient != null) {
            strokeGradient.drawGradient(g, path2d, false);
        }
    }

    @Override
    public void parseAttributes(@NonNull NamedNodeMap attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            org.w3c.dom.Node attribute = attributes.item(i);

            // See https://issuetracker.google.com/62052258 for why this check exists.
            if (Objects.equals(attribute.getNamespaceURI(), SdkConstants.TOOLS_URI)) {
                continue;
            }

            String name = attribute.getNodeName();
            String value = attribute.getNodeValue();
            setNameValue(name, value);
        }
    }

    @Override
    public boolean isGroup() {
        return false;
    }

    @Override
    @NonNull
    public String toString() {
        return "Path:" +
                " Name: " + mName +
                " Node: " + Arrays.toString(mNodeList) +
                " mFillColor: " + Integer.toHexString(mFillColor) +
                " mFillAlpha:" + mFillAlpha +
                " mFillType:" + mFillType +
                " mStrokeColor:" + Integer.toHexString(mStrokeColor) +
                " mStrokeWidth:" + mStrokeWidth +
                " mStrokeAlpha:" + mStrokeAlpha;
    }

    /**
     * We parse the given node for the gradient information if it exists. If it contains a gradient,
     * depending on what type, we set the fillGradient or strokeGradient of the current VdPath to a
     * new VdGradient and add the gradient information.
     */
    protected void addGradientIfExists(@NonNull org.w3c.dom.Node current) {
        // This should be guaranteed to be the gradient given the way we are writing the VD XMLs.
        org.w3c.dom.Node gradientNode = current.getFirstChild();
        VdGradient newGradient = new VdGradient();
        if (gradientNode != null) {
            gradientNode = gradientNode.getNextSibling();
            if (gradientNode != null) {
                // This should also be guaranteed given the way we write the VD XMLs.
                String attrValue = gradientNode.getAttributes().getNamedItem("name").getNodeValue();
                if (attrValue.equals("android:fillColor")) {
                    fillGradient = newGradient;
                } else if (attrValue.equals("android:strokeColor")) {
                    strokeGradient = newGradient;
                }
                gradientNode = gradientNode.getFirstChild();
                if (gradientNode != null) {
                    gradientNode = gradientNode.getNextSibling();
                }
            }
        }

        if (gradientNode != null && gradientNode.getNodeName().equals("gradient")) {
            NamedNodeMap gradientAttributes = gradientNode.getAttributes();
            for (int i = 0; i < gradientAttributes.getLength(); i++) {
                String name = gradientAttributes.item(i).getNodeName();
                String value = gradientAttributes.item(i).getNodeValue();
                newGradient.setGradientValue(name, value);
            }

            // Adding stop information to gradient.
            NodeList items = gradientNode.getChildNodes();
            for (int i = 0; i < items.getLength(); i++) {
                org.w3c.dom.Node stop = items.item(i);
                if (stop.getNodeName().equals("item")) {
                    NamedNodeMap stopAttr = stop.getAttributes();
                    String color = null;
                    String offset = null;
                    for (int j = 0; j < stopAttr.getLength(); j++) {
                        org.w3c.dom.Node currentItem = stopAttr.item(j);
                        if (currentItem.getNodeName().equals("android:color")) {
                            color = currentItem.getNodeValue();
                            if (color != null &&
                                    (color.charAt(0) == '@' || color.charAt(0) == '?')) {
                                throw new IllegalVectorDrawableResourceRefException(
                                        color, PositionXmlParser.getPosition(currentItem), null);
                            }
                        } else if (currentItem.getNodeName().equals("android:offset")) {
                            offset = currentItem.getNodeValue();
                        }
                    }
                    if (color == null) {
                        color = "#000000";
                        getLogger().log(Level.WARNING, ">>>>>> No color for gradient found >>>>>>");
                    }
                    if (offset == null) {
                        offset = "0";
                        getLogger().log(Level.WARNING, ">>>>>> No offset for gradient found>>>>>>");
                    }
                    GradientStop gradientStop = new GradientStop(color, offset);
                    newGradient.mGradientStops.add(gradientStop);
                }
            }
        }
    }

    /**
     * Contains gradient information in order to draw the fill or stroke of a path with a gradient.
     */
    class VdGradient {
        // Gradient attributes.
        private float mStartX;
        private float mStartY;
        private float mEndX;
        private float mEndY;
        private float mCenterX;
        private float mCenterY;
        private float mGradientRadius;
        private String mTileMode = "NO_CYCLE";
        private String mGradientType = "linear";

        private final ArrayList<GradientStop> mGradientStops = new ArrayList<>();

        VdGradient() {}

        private void setGradientValue(@NonNull String name, @NonNull String value) {
            switch (name) {
                case "android:type":
                    mGradientType = value;
                    break;
                case "android:tileMode":
                    mTileMode = value;
                    break;
                case "android:startX":
                    mStartX = Float.parseFloat(value);
                    break;
                case "android:startY":
                    mStartY = Float.parseFloat(value);
                    break;
                case "android:endX":
                    mEndX = Float.parseFloat(value);
                    break;
                case "android:endY":
                    mEndY = Float.parseFloat(value);
                    break;
                case "android:centerX":
                    mCenterX = Float.parseFloat(value);
                    break;
                case "android:centerY":
                    mCenterY = Float.parseFloat(value);
                    break;
                case "android:gradientRadius":
                    mGradientRadius = Float.parseFloat(value);
                    break;
            }
        }

        private void drawGradient(@NonNull Graphics2D g, @NonNull Path2D path2d, boolean fill) {
            if (mGradientStops.isEmpty()) {
                return;
            }

            float[] mFractions = new float[mGradientStops.size()];
            Color[] mGradientColors = new Color[mGradientStops.size()];

            for (int j = 0; j < mGradientStops.size(); j++) {
                GradientStop stop = mGradientStops.get(j);
                float fraction = Float.parseFloat(stop.getOffset());
                int colorInt = parseColorValue(stop.getColor());
                //TODO: If opacity for android gradient items becomes supported, use mOpacity to modify colors.
                @SuppressWarnings("UseJBColor")
                Color color = new Color(colorInt, true);

                mFractions[j] = fraction;
                mGradientColors[j] = color;
            }

            // Gradient stop fractions must be strictly increasing in Java Swing. Increment the
            // second of two equal fraction floats by a small amount to get the effect of two
            // overlapping stops. When the fraction is the 1.0, then decrement accordingly.
            // See LinearGradientPaint constructor:
            // https://docs.oracle.com/javase/7/docs/api/java/awt/LinearGradientPaint.html
            for (int i = 0; i < mGradientStops.size() - 1; i++) {
                if (mFractions[i] >= mFractions[i + 1]) {
                    if (mFractions[i] + EPSILON <= 1.0f) {
                        mFractions[i + 1] = mFractions[i] + EPSILON;
                    }
                }
            }

            for (int i = mGradientStops.size() - 2; i >= 0; i--) {
                if (mFractions[i] >= mFractions[i + 1] && mFractions[i] >= 1.0f) {
                    mFractions[i] = mFractions[i + 1] - EPSILON;
                } else {
                    break;
                }
            }

            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            // Create stroke in case the gradient applies to a stroke.
            BasicStroke stroke =
                    new BasicStroke(
                            mStrokeWidth, mStrokeLineCap, mStrokeLineJoin, mStrokeMiterlimit);

            // If there is only one stop, fill should be a solid color of the one stop.
            if (mGradientStops.size() == 1) {
                g.setColor(mGradientColors[0]);
                if (!fill) {
                    g.setStroke(stroke);
                }
                g.draw(path2d);
            } else {
                MultipleGradientPaint.CycleMethod tile = MultipleGradientPaint.CycleMethod.NO_CYCLE;
                if (mTileMode.equals("mirror")) {
                    tile = MultipleGradientPaint.CycleMethod.REFLECT;
                } else if (mTileMode.equals("repeat")) {
                    tile = MultipleGradientPaint.CycleMethod.REPEAT;
                }

                if (mGradientType.equals("linear")) {
                    LinearGradientPaint gradient =
                            new LinearGradientPaint(
                                    mStartX,
                                    mStartY,
                                    mEndX,
                                    mEndY,
                                    mFractions,
                                    mGradientColors,
                                    tile);
                    g.setPaint(gradient);
                } else if (mGradientType.equals("radial")) {
                    RadialGradientPaint paint =
                            new RadialGradientPaint(
                                    mCenterX,
                                    mCenterY,
                                    mGradientRadius,
                                    mFractions,
                                    mGradientColors,
                                    tile);
                    g.setPaint(paint);
                } else if (mGradientType.equals("sweep")) {
                    // AWT doesn't support sweep gradients but Android does.
                    getLogger().log(Level.WARNING,
                                    ">>>>>> Unable to render a sweep gradient."
                                    + " Using a solid color instead. >>>>>>");
                    g.setPaint(mGradientColors[0]);
                } else {
                    getLogger().log(Level.WARNING,
                            ">>>>>> Unsupported gradient type: \"" + mGradientType + "\">>>>>>");
                }

                if (fill) {
                    g.fill(path2d);
                } else {
                    g.setStroke(stroke);
                    g.draw(path2d);
                }
            }
        }
    }

    @NonNull
    private static Logger getLogger() {
        return Logger.getLogger(VdPath.class.getSimpleName());
    }
}
