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

import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_FILL;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_FILL_OPACITY;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_OPACITY;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_STROKE;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_STROKE_OPACITY;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_STROKE_WIDTH;
import static com.android.ide.common.vectordrawable.Svg2Vector.presentationMap;
import static com.android.utils.XmlUtils.formatFloatValue;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.ide.common.vectordrawable.PathParser.ParseMode;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;

/** Represents an SVG file's leaf element. */
class SvgLeafNode extends SvgNode {
    private static final Logger logger = Logger.getLogger(SvgLeafNode.class.getSimpleName());

    @Nullable private String mPathData;
    @Nullable private SvgGradientNode mFillGradientNode;
    @Nullable private SvgGradientNode mStrokeGradientNode;

    SvgLeafNode(@NonNull SvgTree svgTree, @NonNull Element element, @Nullable String nodeName) {
        super(svgTree, element, nodeName);
    }

    @Override
    @NonNull
    public SvgLeafNode deepCopy() {
        SvgLeafNode newNode = new SvgLeafNode(getTree(), mDocumentElement, getName());
        newNode.copyFrom(this);
        return newNode;
    }

    protected void copyFrom(@NonNull SvgLeafNode from) {
        super.copyFrom(from);
        mPathData = from.mPathData;
    }

    /** Writes attributes of this node. */
    private void writeAttributeValues(@NonNull OutputStreamWriter writer,  @NonNull String indent)
            throws IOException {
        // There could be some redundant opacity information in the attributes' map,
        // like opacity vs fill-opacity / stroke-opacity.
        parsePathOpacity();

        for (Map.Entry<String, String> entry : mVdAttributesMap.entrySet()) {
            String name = entry.getKey();
            String attribute = presentationMap.get(name);
            if (attribute.isEmpty()) {
                continue;
            }
            String svgValue = entry.getValue().trim();
            String vdValue = colorSvg2Vd(svgValue, "#000000");

            if (vdValue == null) {
                if (svgValue.endsWith("px")) {
                    vdValue = svgValue.substring(0, svgValue.length() - 2).trim();
                } else if (svgValue.startsWith("url(#") && svgValue.endsWith(")")) {
                    // Copies gradient from tree.
                    vdValue = svgValue.substring(5, svgValue.length() - 1);
                    if (name.equals(SVG_FILL)) {
                        SvgNode node = getTree().getSvgNodeFromId(vdValue);
                        if (node == null) {
                            continue;
                        }
                        mFillGradientNode = (SvgGradientNode)node.deepCopy();
                        mFillGradientNode.setSvgLeafNode(this);
                        mFillGradientNode.setGradientUsage(SvgGradientNode.GradientUsage.FILL);
                    } else if (name.equals(SVG_STROKE)) {
                        SvgNode node = getTree().getSvgNodeFromId(vdValue);
                        if (node == null) {
                            continue;
                        }
                        mStrokeGradientNode = (SvgGradientNode)node.deepCopy();
                        mStrokeGradientNode.setSvgLeafNode(this);
                        mStrokeGradientNode.setGradientUsage(SvgGradientNode.GradientUsage.STROKE);
                    }
                    continue;
                } else {
                    vdValue = svgValue;
                }
            }
            writer.write(System.lineSeparator());
            writer.write(indent);
            writer.write(CONTINUATION_INDENT);
            writer.write(attribute);
            writer.write("=\"");
            writer.write(vdValue);
            writer.write("\"");
        }
    }

    /**
     * Parses the SVG path's opacity attribute into fill and stroke.
     */
    private void parsePathOpacity() {
        double opacity = getOpacityValueFromMap(SVG_OPACITY);
        double fillOpacity = getOpacityValueFromMap(SVG_FILL_OPACITY);
        double strokeOpacity = getOpacityValueFromMap(SVG_STROKE_OPACITY);
        putOpacityValueToMap(SVG_FILL_OPACITY, fillOpacity * opacity);
        putOpacityValueToMap(SVG_STROKE_OPACITY, strokeOpacity * opacity);
        mVdAttributesMap.remove(SVG_OPACITY);
    }

    /**
     * A utility function to get the opacity value as a floating point number.
     *
     * @param attributeName the name of the opacity attribute
     * @return the clamped opacity value, or 1 if not found
     */
    private double getOpacityValueFromMap(@NonNull String attributeName) {
        // Default opacity is 1.
        double result = 1;
        String opacity = mVdAttributesMap.get(attributeName);
        if (opacity != null) {
            try {
                if (opacity.endsWith("%")) {
                    result = Double.parseDouble(opacity.substring(0, opacity.length() - 1)) / 100.;
                } else {
                    result = Double.parseDouble(opacity);
                }
            } catch (NumberFormatException e) {
                // Ignore here, an invalid value is replaced by the default value 1.
            }
        }
        return Math.min(Math.max(result, 0), 1);
    }

    private void putOpacityValueToMap(@NonNull String attributeName, double opacity) {
        String attributeValue = formatFloatValue(opacity);
        if (attributeValue.equals("1")) {
            mVdAttributesMap.remove(attributeName);
        } else {
            mVdAttributesMap.put(attributeName, attributeValue);
        }
    }

    @Override
    public void dumpNode(@NonNull String indent) {
        logger.log(Level.FINE, indent + (mPathData != null ? mPathData : " null pathData ") +
                               (mName != null ? mName : " null name "));
    }

    public void setPathData(@NonNull String pathData) {
        mPathData = pathData;
    }

    @Nullable
    public String getPathData() {
        return mPathData;
    }

    @Override
    public boolean isGroupNode() {
        return false;
    }

    public boolean hasGradient() {
        return mFillGradientNode != null || mStrokeGradientNode != null;
    }

    @Override
    public void transformIfNeeded(@NonNull AffineTransform rootTransform) {
        if (mPathData == null || mPathData.isEmpty()) {
            // Nothing to draw and transform, early return.
            return;
        }
        VdPath.Node[] nodes = PathParser.parsePath(mPathData, ParseMode.SVG);
        AffineTransform finalTransform = new AffineTransform(rootTransform);
        finalTransform.concatenate(mStackedTransform);
        boolean needsConvertRelativeMoveAfterClose = VdPath.Node.hasRelMoveAfterClose(nodes);
        if (!finalTransform.isIdentity() || needsConvertRelativeMoveAfterClose) {
            VdPath.Node.transform(finalTransform, nodes);
        }
        mPathData = VdPath.Node.nodeListToString(nodes, mSvgTree.getCoordinateFormat());
    }

    @Override
    public void flatten(@NonNull AffineTransform transform) {
        mStackedTransform.setTransform(transform);
        mStackedTransform.concatenate(mLocalTransform);

        if (!"non-scaling-stroke".equals(mVdAttributesMap.get("vector-effect"))
                && (mStackedTransform.getType() & AffineTransform.TYPE_MASK_SCALE) != 0) {
            String strokeWidth = mVdAttributesMap.get(SVG_STROKE_WIDTH);
            if (strokeWidth != null) {
                try {
                    // Unlike SVG, vector drawable is not capable of applying transformations
                    // to stroke outline. To compensate for that we apply scaling transformation
                    // to the stroke width, which produces accurate results for uniform and
                    // approximate results for nonuniform scaling transformation.
                    double width = Double.parseDouble(strokeWidth);
                    double determinant = mStackedTransform.getDeterminant();
                    if (determinant != 0) {
                        width *= sqrt(abs(determinant));
                        mVdAttributesMap.put(SVG_STROKE_WIDTH, formatFloatValue(width));
                    }
                    if ((mStackedTransform.getType() & AffineTransform.TYPE_GENERAL_SCALE) != 0) {
                        logWarning("Scaling of the stroke width is approximate");
                    }
                } catch (NumberFormatException ignore) {
                }
            }
        }
    }

    @Override
    public void writeXml(@NonNull OutputStreamWriter writer, @NonNull String indent)
            throws IOException {
        // First, decide whether or not we can skip this path, since it has no visible effect.
        if (mPathData == null || mPathData.isEmpty()) {
            return; // No path to draw.
        }

        String fillColor = mVdAttributesMap.get(SVG_FILL);
        String strokeColor = mVdAttributesMap.get(SVG_STROKE);
        logger.log(Level.FINE, "fill color " + fillColor);
        boolean emptyFill = "none".equals(fillColor) || "#00000000".equals(fillColor);
        boolean emptyStroke = strokeColor == null || "none".equals(strokeColor);
        if (emptyFill && emptyStroke) {
            return; // Nothing to draw.
        }

        // Second, write the color info handling the default values.
        writer.write(indent);
        writer.write("<path");
        writer.write(System.lineSeparator());
        if (fillColor == null && mFillGradientNode == null) {
            logger.log(Level.FINE, "Adding default fill color");
            writer.write(indent);
            writer.write(CONTINUATION_INDENT);
            writer.write("android:fillColor=\"#FF000000\"");
            writer.write(System.lineSeparator());
        }
        if (!emptyStroke
                && !mVdAttributesMap.containsKey(SVG_STROKE_WIDTH)
                && mStrokeGradientNode == null) {
            logger.log(Level.FINE, "Adding default stroke width");
            writer.write(indent);
            writer.write(CONTINUATION_INDENT);
            writer.write("android:strokeWidth=\"1\"");
            writer.write(System.lineSeparator());
        }

        // Last, write the path data and all associated attributes.
        writer.write(indent);
        writer.write(CONTINUATION_INDENT);
        writer.write("android:pathData=\"" + mPathData + "\"");
        writeAttributeValues(writer, indent);
        if (!hasGradient()) {
            writer.write('/');
        }
        writer.write('>');
        writer.write(System.lineSeparator());

        if (mFillGradientNode != null) {
            mFillGradientNode.writeXml(writer, indent + INDENT_UNIT);
        }
        if (mStrokeGradientNode != null) {
            mStrokeGradientNode.writeXml(writer, indent + INDENT_UNIT);
        }
        if (hasGradient()) {
            writer.write(indent);
            writer.write("</path>");
            writer.write(System.lineSeparator());
        }
    }
}
