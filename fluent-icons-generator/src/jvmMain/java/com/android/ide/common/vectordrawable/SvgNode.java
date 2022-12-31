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

import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_CLIP_RULE;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_FILL;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_FILL_RULE;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_STROKE;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_STROKE_WIDTH;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/** Parent class for a SVG file's node, can be either group or leaf element. */
abstract class SvgNode {
    private static final Logger logger = Logger.getLogger(SvgNode.class.getSimpleName());

    protected static final String INDENT_UNIT = "  ";
    protected static final String CONTINUATION_INDENT = INDENT_UNIT + INDENT_UNIT;
    private static final String TRANSFORM_TAG = "transform";

    private static final String MATRIX_ATTRIBUTE = "matrix";
    private static final String TRANSLATE_ATTRIBUTE = "translate";
    private static final String ROTATE_ATTRIBUTE = "rotate";
    private static final String SCALE_ATTRIBUTE = "scale";
    private static final String SKEWX_ATTRIBUTE = "skewX";
    private static final String SKEWY_ATTRIBUTE = "skewY";

    protected final String mName;
    // Keep a reference to the tree in order to dump the error log.
    protected final SvgTree mSvgTree;
    // Use document element to get the line number for error reporting.
    protected final Element mDocumentElement;

    // Key is the attributes for vector drawable, and the value is the converted from SVG.
    protected final Map<String, String> mVdAttributesMap = new HashMap<>();
    // If mLocalTransform is identity, it is the same as not having any transformation.
    protected AffineTransform mLocalTransform = new AffineTransform();

    // During the flatten() operation, we need to merge the transformation from top down.
    // This is the stacked transformation. And this will be used for the path data transform().
    protected AffineTransform mStackedTransform = new AffineTransform();

    /** While parsing the translate() rotate() ..., update the {@code mLocalTransform}. */
    SvgNode(@NonNull SvgTree svgTree, @NonNull Element element, @Nullable String name) {
        mName = name;
        mSvgTree = svgTree;
        mDocumentElement = element;
        // Parse and generate a presentation map.
        NamedNodeMap a = element.getAttributes();
        int len = a.getLength();

        for (int itemIndex = 0; itemIndex < len; itemIndex++) {
            Node n = a.item(itemIndex);
            String nodeName = n.getNodeName();
            String nodeValue = n.getNodeValue();
            // TODO: Handle style here. Refer to Svg2Vector::addStyleToPath().
            if (Svg2Vector.presentationMap.containsKey(nodeName)) {
                fillPresentationAttributesInternal(nodeName, nodeValue);
            }

            if (TRANSFORM_TAG.equals(nodeName)) {
                logger.log(Level.FINE, nodeName + " " + nodeValue);
                parseLocalTransform(nodeValue);
            }
        }
    }

    protected void parseLocalTransform(@NonNull String nodeValue) {
        // We separate the string into multiple parts and look like this:
        // "translate" "30" "rotate" "4.5e1  5e1  50"
        nodeValue = nodeValue.replaceAll(",", " ");
        String[] matrices = nodeValue.split("[()]");
        AffineTransform parsedTransform;
        for (int i = 0; i < matrices.length - 1; i += 2) {
            parsedTransform = parseOneTransform(matrices[i].trim(), matrices[i + 1].trim());
            if (parsedTransform != null) {
                mLocalTransform.concatenate(parsedTransform);
            }
        }
    }

    @Nullable
    private static AffineTransform parseOneTransform(String type, String data) {
        float[] numbers = getNumbers(data);
        if (numbers == null) {
            return null;
        }
        int numLength = numbers.length;
        AffineTransform parsedTransform = new AffineTransform();

        if (MATRIX_ATTRIBUTE.equalsIgnoreCase(type)) {
            if (numLength != 6) {
                return null;
            }
            parsedTransform.setTransform(
                    numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5]);
        } else if (TRANSLATE_ATTRIBUTE.equalsIgnoreCase(type)) {
            if (numLength != 1 && numLength != 2) {
                return null;
            }
            // Default translateY is 0
            parsedTransform.translate(numbers[0], numLength == 2 ? numbers[1] : 0);
        } else if (SCALE_ATTRIBUTE.equalsIgnoreCase(type)) {
            if (numLength != 1 && numLength != 2) {
                return null;
            }
            // Default scaleY == scaleX
            parsedTransform.scale(numbers[0], numbers[numLength == 2 ? 1 : 0]);
        } else if (ROTATE_ATTRIBUTE.equalsIgnoreCase(type)) {
            if (numLength != 1 && numLength != 3) {
                return null;
            }
            parsedTransform.rotate(
                    Math.toRadians(numbers[0]),
                    numLength == 3 ? numbers[1] : 0,
                    numLength == 3 ? numbers[2] : 0);
        } else if (SKEWX_ATTRIBUTE.equalsIgnoreCase(type)) {
            if (numLength != 1) {
                return null;
            }
            // Note that Swing is pass the shear value directly to the matrix as m01 or m10,
            // while SVG is using tan(a) in the matrix and a is in radians.
            parsedTransform.shear(Math.tan(Math.toRadians(numbers[0])), 0);
        } else if (SKEWY_ATTRIBUTE.equalsIgnoreCase(type)) {
            if (numLength != 1) {
                return null;
            }
            parsedTransform.shear(0, Math.tan(Math.toRadians(numbers[0])));
        }
        return parsedTransform;
    }

    @Nullable
    private static float[] getNumbers(String data) {
        String[] numbers = data.split("\\s+");
        int len = numbers.length;
        if (len == 0) {
            return null;
        }

        float[] results = new float[len];
        for (int i = 0; i < len; i++) {
            results[i] = Float.parseFloat(numbers[i]);
        }
        return results;
    }

    @NonNull
    protected SvgTree getTree() {
        return mSvgTree;
    }

    @Nullable
    public String getName() {
        return mName;
    }

    @NonNull
    public Element getDocumentElement() {
        return mDocumentElement;
    }

    /** Dumps the current node's debug info. */
    public abstract void dumpNode(@NonNull String indent);

    /**
     * Writes content of the node into the VectorDrawable's XML file.
     *
     * @param writer the writer to write the group XML element to
     * @param indent whitespace used for indenting output XML
     */
    public abstract void writeXml(@NonNull OutputStreamWriter writer, @NonNull String indent)
            throws IOException;

    /**
     * Calls the {@linkplain Visitor#visit(SvgNode)} method for this node and its descendants.
     *
     * @param visitor the visitor to accept
     */
    public VisitResult accept(@NonNull Visitor visitor) {
        return visitor.visit(this);
    }

    /** Returns true the node is a group node. */
    public abstract boolean isGroupNode();

    /** Transforms the current Node with the transformation matrix. */
    public abstract void transformIfNeeded(@NonNull AffineTransform finalTransform);

    private void fillPresentationAttributesInternal(@NonNull String name, @NonNull String value) {
        if (name.equals(SVG_FILL_RULE) || name.equals(SVG_CLIP_RULE)) {
            if (value.equals("nonzero")) {
                value = "nonZero";
            } else if (value.equals("evenodd")) {
                value = "evenOdd";
            }
        }
        logger.log(Level.FINE, ">>>> PROP " + name + " = " + value);
        if (value.startsWith("url(")) {
            if (!name.equals(SVG_FILL) && !name.equals(SVG_STROKE)) {
                logError("Unsupported URL value: " + value);
                return;
            }
        }
        if (name.equals(SVG_STROKE_WIDTH) && value.equals("0")) {
            mVdAttributesMap.remove(SVG_STROKE);
        }
        mVdAttributesMap.put(name, value);
    }

    protected void fillPresentationAttributes(@NonNull String name, @NonNull String value) {
        fillPresentationAttributesInternal(name, value);
    }

    public void fillEmptyAttributes(@NonNull Map<String, String> parentAttributesMap) {
        // Go through the parents' attributes, if the child misses any, then fill it.
        for (Map.Entry<String, String> entry : parentAttributesMap.entrySet()) {
            String name = entry.getKey();
            if (!mVdAttributesMap.containsKey(name)) {
                mVdAttributesMap.put(name, entry.getValue());
            }
        }
    }

    public abstract void flatten(@NonNull AffineTransform transform);

    /**
     * Checks validity of the node and logs any issues associated with it. Subclasses may override.
     */
    public void validate() {}

    /**
     * Returns a string containing the value of the given attribute. Returns an empty string if
     * the attribute does not exist.
     */
    public String getAttributeValue(@NonNull String attribute) {
        return mDocumentElement.getAttribute(attribute);
    }

    @NonNull
    public abstract SvgNode deepCopy();

    protected <T extends SvgNode> void copyFrom(@NonNull T from) {
        fillEmptyAttributes(from.mVdAttributesMap);
        mLocalTransform = (AffineTransform) from.mLocalTransform.clone();
    }

    /**
     * Converts an SVG color value to "#RRGGBB" or "#RGB" format used by vector drawables. The input
     * color value can be "none" and RGB value, e.g. "rgb(255, 0, 0)", or a color name defined in
     * https://www.w3.org/TR/SVG11/types.html#ColorKeywords.
     *
     * @param svgColor the SVG color value to convert
     * @param errorFallbackColor the value returned if the supplied SVG color value has invalid or
     *     unsupported format
     * @return the converted value, or null if the given value cannot be interpreted as color
     */
    @Nullable
    protected String colorSvg2Vd(@NonNull String svgColor, @NonNull String errorFallbackColor) {
        try {
            return SvgColor.colorSvg2Vd(svgColor);
        } catch (IllegalArgumentException e) {
            logError("Unsupported color format \"" + svgColor + "\"");
            return errorFallbackColor;
        }
    }

    protected void logError(@NonNull String s) {
        mSvgTree.logError(s, mDocumentElement);
    }

    protected void logWarning(@NonNull String s) {
        mSvgTree.logWarning(s, mDocumentElement);
    }

    protected interface Visitor {
        /**
         * Called by the {@link SvgNode#accept(Visitor)} method for every visited node.
         *
         * @param node the node being visited
         * @return {@link VisitResult#CONTINUE} to continue visiting children,
         *         {@link VisitResult#SKIP_CHILDREN} to skip children and continue visit with
         *         the next sibling, {@link VisitResult#ABORT} to skip all remaining nodes
         */
        VisitResult visit(@NonNull SvgNode node);
    }

    protected enum VisitResult {
        CONTINUE,
        SKIP_CHILDREN,
        ABORT
    }

    protected enum ClipRule {
        NON_ZERO,
        EVEN_ODD
    }
}
