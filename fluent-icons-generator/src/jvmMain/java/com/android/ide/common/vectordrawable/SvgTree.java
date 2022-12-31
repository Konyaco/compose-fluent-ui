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

import static com.android.ide.common.vectordrawable.SvgNode.CONTINUATION_INDENT;
import static com.android.ide.common.vectordrawable.SvgNode.INDENT_UNIT;
import static com.android.utils.PositionXmlParser.getPosition;
import static com.android.utils.XmlUtils.formatFloatValue;
import static java.nio.charset.StandardCharsets.UTF_8;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.utils.Pair;
import com.android.utils.PositionXmlParser;
import com.google.common.base.Preconditions;
import java.awt.geom.AffineTransform;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/**
 * Represents the SVG file in an internal data structure as a tree.
 */
class SvgTree {
    private static final Logger logger = Logger.getLogger(SvgTree.class.getSimpleName());

    private static final String HEAD =
        "<vector xmlns:android=\"http://schemas.android.com/apk/res/android\"";
    private static final String AAPT_BOUND = "xmlns:aapt=\"http://schemas.android.com/aapt\"";

    public static final String SVG_WIDTH = "width";
    public static final String SVG_HEIGHT = "height";
    public static final String SVG_VIEW_BOX = "viewBox";

    private float w = -1;
    private float h = -1;
    private final AffineTransform mRootTransform = new AffineTransform();
    private float[] viewBox;
    private float mScaleFactor = 1;

    private SvgGroupNode mRoot;
    private String mFileName;

    private final List<LogMessage> mLogMessages = new ArrayList<>();

    private boolean mHasLeafNode;

    private boolean mHasGradient;

    /** Map of SvgNode's id to the SvgNode. */
    private final Map<String, SvgNode> mIdMap = new HashMap<>();

    /** IDs of ignored SVG nodes. */
    private final Set<String> mIgnoredIds = new HashSet<>();

    /** Set of SvgGroupNodes that contain use elements. */
    private final Set<SvgGroupNode> mPendingUseGroupSet = new HashSet<>();

    /**
     * Key is SvgNode that references a clipPath. Value is SvgGroupNode that is the parent of that
     * SvgNode.
     */
    private final Map<SvgNode, Pair<SvgGroupNode, String>> mClipPathAffectedNodes =
            new LinkedHashMap<>();

    /**
     * Key is String that is the id of a style class. Value is set of SvgNodes referencing that
     * class.
     */
    private final Map<String, Set<SvgNode>> mStyleAffectedNodes = new HashMap<>();

    /**
     * Key is String that is the id of a style class. Value is a String that contains attribute
     * information of that style class.
     */
    private final Map<String, String> mStyleClassAttributeMap = new HashMap<>();

    enum SvgLogLevel {
        ERROR,
        WARNING
    }

    private static class LogMessage implements Comparable<LogMessage> {
        final SvgLogLevel level;
        final int line;
        final String message;

        /**
         * Initializes a log message.
         *
         * @param level the severity level
         * @param line the line number of the SVG file the message applies to,
         *     or zero if the message applies to the whole file
         * @param message the text of the message
         */
        LogMessage(@NonNull SvgLogLevel level, int line, @NonNull String message) {
            this.level = level;
            this.line = line;
            this.message = message;
        }

        @NonNull
        String getFormattedMessage() {
            return level.name() + (line == 0 ? "" : " @ line " + line) + ": " + message;
        }

        @Override
        public int compareTo(@NonNull LogMessage other) {
            int cmp = level.compareTo(other.level);
            if (cmp != 0) {
                return cmp;
            }
            cmp = Integer.compare(line, other.line);
            if (cmp != 0) {
                return cmp;
            }
            return message.compareTo(other.message);
        }
    }

    public float getWidth() {
        return w;
    }

    public float getHeight() {
        return h;
    }

    public float getScaleFactor() {
        return mScaleFactor;
    }

    public void setHasLeafNode(boolean hasLeafNode) {
        mHasLeafNode = hasLeafNode;
    }

    public void setHasGradient(boolean hasGradient) {
        mHasGradient = hasGradient;
    }

    public float[] getViewBox() {
        return viewBox;
    }

    /** From the root, top down, pass the transformation (TODO: attributes) down the children. */
    public void flatten() {
        mRoot.flatten(new AffineTransform());
    }

    /** Validates all nodes and logs any encountered issues. */
    public void validate() {
        mRoot.validate();
        if (mLogMessages.isEmpty() && !getHasLeafNode()) {
            logError("No vector content found", null);
        }
    }

    public Document parse(@NonNull File f, @NonNull List<String> parseErrors) throws IOException {
        mFileName = f.getName();
        try {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(f));
            return PositionXmlParser.parse(inputStream, false, parseErrors);
        } catch (ParserConfigurationException e) {
            throw new Error("Internal error", e); // Should not happen unless there is a bug.
        }
    }

    public void normalize() {
        // mRootTransform is always setup, now just need to apply the viewbox info into.
        mRootTransform.preConcatenate(new AffineTransform(1, 0, 0, 1, -viewBox[0], -viewBox[1]));
        transform(mRootTransform);

        logger.log(Level.FINE, "matrix=" + mRootTransform);
    }

    private void transform(@NonNull AffineTransform rootTransform) {
        mRoot.transformIfNeeded(rootTransform);
    }

    public void dump() {
        logger.log(Level.FINE, "file: " + mFileName);
        mRoot.dumpNode("");
    }

    public void setRoot(@NonNull SvgGroupNode root) {
        mRoot = root;
    }

    @Nullable
    public SvgGroupNode getRoot() {
        return mRoot;
    }

    public void logError(@NonNull String s, @Nullable Node node) {
        logErrorLine(s, node, SvgLogLevel.ERROR);
    }

    public void logWarning(@NonNull String s, @Nullable Node node) {
        logErrorLine(s, node, SvgLogLevel.WARNING);
    }

    void logErrorLine(@NonNull String s, @Nullable Node node, @NonNull SvgLogLevel level) {
        Preconditions.checkArgument(!s.isEmpty());
        int line = node == null ? 0 : getStartLine(node);
        mLogMessages.add(new LogMessage(level, line, s));
    }

    /**
     * Returns the error message that combines all logged errors and warnings. If there were no
     * errors, returns an empty string.
     */
    @NonNull
    public String getErrorMessage() {
        if (mLogMessages.isEmpty()) {
            return "";
        }
        Collections.sort(mLogMessages); // Sort by severity and line number.
        StringBuilder result = new StringBuilder();
        for (LogMessage message : mLogMessages) {
            if (result.length() != 0) {
                result.append('\n');
            }
            result.append(message.getFormattedMessage());
        }
        return result.toString();
    }

    /** Returns true when there is at least one valid child. */
    public boolean getHasLeafNode() {
        return mHasLeafNode;
    }

    public boolean getHasGradient() {
        return mHasGradient;
    }

    /** Returns the 1-based start line number of the given node. */
    public static int getStartLine(@NonNull Node node) {
        return getPosition(node).getStartLine() + 1;
    }

    public float getViewportWidth() {
        return (viewBox == null) ? -1 : viewBox[2];
    }

    public float getViewportHeight() { return (viewBox == null) ? -1 : viewBox[3]; }

    private enum SizeType {
        PIXEL,
        PERCENTAGE
    }

    public void parseDimension(@NonNull Node nNode) {
        NamedNodeMap a = nNode.getAttributes();
        int len = a.getLength();
        SizeType widthType = SizeType.PIXEL;
        SizeType heightType = SizeType.PIXEL;
        for (int i = 0; i < len; i++) {
            Node n = a.item(i);
            String name = n.getNodeName().trim();
            String value = n.getNodeValue().trim();
            int subStringSize = value.length();
            SizeType currentType = SizeType.PIXEL;
            String unit = value.substring(Math.max(value.length() - 2, 0));
            if (unit.matches("em|ex|px|in|cm|mm|pt|pc")) {
                subStringSize -= 2;
            } else if (value.endsWith("%")) {
                subStringSize -= 1;
                currentType = SizeType.PERCENTAGE;
            }

            if (SVG_WIDTH.equals(name)) {
                w = Float.parseFloat(value.substring(0, subStringSize));
                widthType = currentType;
            } else if (SVG_HEIGHT.equals(name)) {
                h = Float.parseFloat(value.substring(0, subStringSize));
                heightType = currentType;
            } else if (SVG_VIEW_BOX.equals(name)) {
                viewBox = new float[4];
                String[] strbox = value.split(" ");
                for (int j = 0; j < viewBox.length; j++) {
                    viewBox[j] = Float.parseFloat(strbox[j]);
                }
            }
        }
        // If there is no viewbox, then set it up according to w, h.
        // From now on, viewport should be read from viewBox, and size should be from w and h.
        // w and h can be set to percentage too, in this case, set it to the viewbox size.
        if (viewBox == null && w > 0 && h > 0) {
            viewBox = new float[4];
            viewBox[2] = w;
            viewBox[3] = h;
        } else if ((w < 0 || h < 0) && viewBox != null) {
            w = viewBox[2];
            h = viewBox[3];
        }

        if (widthType == SizeType.PERCENTAGE && w > 0) {
            w = viewBox[2] * w / 100;
        }
        if (heightType == SizeType.PERCENTAGE && h > 0) {
            h = viewBox[3] * h / 100;
        }
    }

    /**
     * Parses an X coordinate of a width value that can be an absolute number or percentage of
     * the viewport size.
     *
     * @param value the value to parse
     * @return the parsed value
     * @throws IllegalArgumentException if the value is not a valid floating point number or
     *     percentage
     */
    public double parseXValue(@NonNull String value) {
        return parseCoordinateOrLength(value, getViewportWidth());
    }

    /**
     * Parses an Y coordinate of a height value that can be an absolute number or percentage of
     * the viewport size.
     *
     * @param value the value to parse
     * @return the parsed value
     * @throws IllegalArgumentException if the value is not a valid floating point number or
     *     percentage
     */
    public double parseYValue(@NonNull String value) {
        return parseCoordinateOrLength(value, getViewportHeight());
    }

    private static double parseCoordinateOrLength(@NonNull String value, double percentageBase) {
        if (value.endsWith("%")) {
            return Double.parseDouble(value.substring(0, value.length() - 1)) / 100
                   * percentageBase;
        } else {
            return Double.parseDouble(value);
        }
    }

    public void addIdToMap(@NonNull String id, @NonNull SvgNode svgNode) {
        mIdMap.put(id, svgNode);
    }

    @Nullable
    public SvgNode getSvgNodeFromId(@NonNull String id) {
        return mIdMap.get(id);
    }

    public void addToPendingUseSet(@NonNull SvgGroupNode useGroup) {
        mPendingUseGroupSet.add(useGroup);
    }

    @NonNull
    public Set<SvgGroupNode> getPendingUseSet() {
        return mPendingUseGroupSet;
    }

    public void addIgnoredId(@NonNull String id) {
        mIgnoredIds.add(id);
    }

    public boolean isIdIgnored(@NonNull String id) {
        return mIgnoredIds.contains(id);
    }

    public void addClipPathAffectedNode(
            @NonNull SvgNode child,
            @NonNull SvgGroupNode currentGroup,
            @NonNull String clipPathName) {
        mClipPathAffectedNodes.put(child, Pair.of(currentGroup, clipPathName));
    }

    @NonNull
    public Set<Map.Entry<SvgNode, Pair<SvgGroupNode, String>>> getClipPathAffectedNodesSet() {
        return mClipPathAffectedNodes.entrySet();
    }

    /** Adds child to set of SvgNodes that reference the style class with id className. */
    public void addAffectedNodeToStyleClass(@NonNull String className, @NonNull SvgNode child) {
        if (mStyleAffectedNodes.containsKey(className)) {
            mStyleAffectedNodes.get(className).add(child);
        } else {
            Set<SvgNode> styleNodesSet = new HashSet<>();
            styleNodesSet.add(child);
            mStyleAffectedNodes.put(className, styleNodesSet);
        }
    }

    public void addStyleClassToTree(@NonNull String className, @NonNull String attributes) {
        mStyleClassAttributeMap.put(className, attributes);
    }

    @Nullable
    public String getStyleClassAttr(@NonNull String classname) {
        return mStyleClassAttributeMap.get(classname);
    }

    @NonNull
    public Set<Map.Entry<String, Set<SvgNode>>> getStyleAffectedNodes() {
        return mStyleAffectedNodes.entrySet();
    }

    /**
     * Finds the parent node of the input node.
     *
     * @return the parent node, or null if node is not in the tree.
     */
    @Nullable
    public SvgGroupNode findParent(@NonNull SvgNode node) {
        return mRoot.findParent(node);
    }

    /**
     * Returns a {@link NumberFormat] of sufficient precision to use for formatting coordinate
     * values within the viewport.
     */
    @NonNull
    public NumberFormat getCoordinateFormat() {
        float viewportWidth = getViewportWidth();
        float viewportHeight = getViewportHeight();
        return VdUtil.getCoordinateFormat(Math.max(viewportHeight, viewportWidth));
    }

    public void writeXml(@NonNull OutputStream stream) throws IOException {
        if (mRoot == null) {
            throw new IllegalStateException("SvgTree is not fully initialized");
        }

        OutputStreamWriter writer = new OutputStreamWriter(stream, UTF_8);
        writer.write(HEAD);
        writer.write(System.lineSeparator());
        if (getHasGradient()) {
            writer.write(CONTINUATION_INDENT);
            writer.write(AAPT_BOUND);
            writer.write(System.lineSeparator());
        }
        float viewportWidth = getViewportWidth();
        float viewportHeight = getViewportHeight();

        writer.write(CONTINUATION_INDENT);
        writer.write("android:width=\"");
        writer.write(formatFloatValue(getWidth() * getScaleFactor()));
        writer.write("dp\"");
        writer.write(System.lineSeparator());
        writer.write(CONTINUATION_INDENT);
        writer.write("android:height=\"");
        writer.write(formatFloatValue(getHeight() * getScaleFactor()));
        writer.write("dp\"");
        writer.write(System.lineSeparator());

        writer.write(CONTINUATION_INDENT);
        writer.write("android:viewportWidth=\"");
        writer.write(formatFloatValue(viewportWidth));
        writer.write("\"");
        writer.write(System.lineSeparator());
        writer.write(CONTINUATION_INDENT);
        writer.write("android:viewportHeight=\"");
        writer.write(formatFloatValue(viewportHeight));
        writer.write("\">");
        writer.write(System.lineSeparator());

        normalize();
        mRoot.writeXml(writer, INDENT_UNIT);
        writer.write("</vector>");
        writer.write(System.lineSeparator());

        writer.close();
    }
}
