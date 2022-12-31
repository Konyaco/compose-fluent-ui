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

import static com.android.ide.common.vectordrawable.SvgTree.getStartLine;
import static com.android.utils.XmlUtils.formatFloatValue;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.annotations.concurrency.Slow;
import com.android.utils.Pair;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Converts SVG to VectorDrawable's XML.
 *
 * There are 2 major functions:
 * 1. parse(file)
 *   This include parse the .svg file and build an internal tree. The optimize this tree.
 *
 * 2. writeFile()
 *   This is traversing the whole tree, and write the group / path info into the XML.
 */
public class Svg2Vector {
    private static final Logger logger = Logger.getLogger(Svg2Vector.class.getSimpleName());
    private static final String SVG_DEFS = "defs";
    private static final String SVG_USE = "use";
    private static final String SVG_HREF = "href";
    private static final String SVG_XLINK_HREF = "xlink:href";

    public static final String SVG_POLYGON = "polygon";
    public static final String SVG_POLYLINE = "polyline";
    public static final String SVG_RECT = "rect";
    public static final String SVG_CIRCLE = "circle";
    public static final String SVG_LINE = "line";
    public static final String SVG_PATH = "path";
    public static final String SVG_ELLIPSE = "ellipse";
    public static final String SVG_GROUP = "g";
    public static final String SVG_STYLE = "style";
    public static final String SVG_DISPLAY = "display";
    public static final String SVG_CLIP_PATH_ELEMENT = "clipPath";

    public static final String SVG_D = "d";
    public static final String SVG_STROKE = "stroke";
    public static final String SVG_STROKE_OPACITY = "stroke-opacity";
    public static final String SVG_STROKE_LINEJOIN = "stroke-linejoin";
    public static final String SVG_STROKE_LINECAP = "stroke-linecap";
    public static final String SVG_STROKE_WIDTH = "stroke-width";
    public static final String SVG_FILL = "fill";
    public static final String SVG_FILL_OPACITY = "fill-opacity";
    public static final String SVG_FILL_RULE = "fill-rule";
    public static final String SVG_OPACITY = "opacity";
    public static final String SVG_CLIP = "clip";
    public static final String SVG_CLIP_PATH = "clip-path";
    public static final String SVG_CLIP_RULE = "clip-rule";
    public static final String SVG_MASK = "mask";
    public static final String SVG_POINTS = "points";

    public static final ImmutableMap<String, String> presentationMap =
            ImmutableMap.<String, String>builder()
                    .put(SVG_CLIP, "android:clip")
                    .put(SVG_CLIP_RULE, "") // Treated individually.
                    .put(SVG_FILL, "android:fillColor")
                    .put(SVG_FILL_RULE, "android:fillType")
                    .put(SVG_FILL_OPACITY, "android:fillAlpha")
                    .put(SVG_OPACITY, "") // Treated individually.
                    .put(SVG_STROKE, "android:strokeColor")
                    .put(SVG_STROKE_OPACITY, "android:strokeAlpha")
                    .put(SVG_STROKE_LINEJOIN, "android:strokeLineJoin")
                    .put(SVG_STROKE_LINECAP, "android:strokeLineCap")
                    .put(SVG_STROKE_WIDTH, "android:strokeWidth")
                    .build();

    public static final ImmutableMap<String, String> gradientMap =
            ImmutableMap.<String, String>builder()
                    .put("x1", "android:startX")
                    .put("y1", "android:startY")
                    .put("x2", "android:endX")
                    .put("y2", "android:endY")
                    .put("cx", "android:centerX")
                    .put("cy", "android:centerY")
                    .put("r", "android:gradientRadius")
                    .put("spreadMethod", "android:tileMode")
                    .put("gradientUnits", "")
                    .put("gradientTransform", "")
                    .put("gradientType", "android:type")
                    .build();

    // Set of all SVG nodes that we don't support. Categorized by the types.
    private static final Set<String> unsupportedSvgNodes = ImmutableSet.of(
            // Animation elements.
            "animate",
            "animateColor",
            "animateMotion",
            "animateTransform",
            "mpath",
            "set",
            // Container elements.
            "a",
            "glyph",
            "marker",
            "missing-glyph",
            "pattern",
            "switch",
            "symbol",
            // Filter primitive elements.
            "feBlend",
            "feColorMatrix",
            "feComponentTransfer",
            "feComposite",
            "feConvolveMatrix",
            "feDiffuseLighting",
            "feDisplacementMap",
            "feFlood",
            "feFuncA",
            "feFuncB",
            "feFuncG",
            "feFuncR",
            "feGaussianBlur",
            "feImage",
            "feMerge",
            "feMergeNode",
            "feMorphology",
            "feOffset",
            "feSpecularLighting",
            "feTile",
            "feTurbulence",
            // Font elements.
            "font",
            "font-face",
            "font-face-format",
            "font-face-name",
            "font-face-src",
            "font-face-uri",
            "hkern",
            "vkern",
            // Gradient elements.
            "stop",
            // Graphics elements.
            "ellipse",
            "image",
            "text",
            // Light source elements.
            "feDistantLight",
            "fePointLight",
            "feSpotLight",
            // Structural elements.
            "symbol",
            // Text content elements.
            "altGlyph",
            "altGlyphDef",
            "altGlyphItem",
            "glyph",
            "glyphRef",
            "textPath",
            "text",
            "tref",
            "tspan",
            // Text content child elements.
            "altGlyph",
            "textPath",
            "tref",
            "tspan",
            // Uncategorized elements.
            "color-profile",
            "cursor",
            "filter",
            "foreignObject",
            "script",
            "view");

    private static final Pattern SPACE_OR_COMMA = Pattern.compile("[\\s,]+");

    @NonNull
    private static SvgTree parse(@NonNull File f) throws IOException {
        SvgTree svgTree = new SvgTree();
        List<String> parseErrors = new ArrayList<>();
        Document doc = svgTree.parse(f, parseErrors);
        for (String error : parseErrors) {
            svgTree.logError(error, null);
        }

        // Get <svg> elements.
        NodeList svgNodes = doc.getElementsByTagName("svg");
        if (svgNodes.getLength() != 1) {
            throw new IllegalStateException("Not a proper SVG file");
        }
        Element rootElement = (Element) svgNodes.item(0);
        svgTree.parseDimension(rootElement);

        if (svgTree.getViewBox() == null) {
            svgTree.logError("Missing \"viewBox\" in <svg> element", rootElement);
            return svgTree;
        }

        SvgGroupNode root = new SvgGroupNode(svgTree, rootElement, "root");
        svgTree.setRoot(root);

        // Parse all the group and path nodes recursively.
        traverseSvgAndExtract(svgTree, root, rootElement);

        // Fill in all the <use> nodes in the svgTree.
        Set<SvgGroupNode> nodes = svgTree.getPendingUseSet();
        while (!nodes.isEmpty()) {
            if (!nodes.removeIf(node -> extractUseNode(svgTree, node, node.getDocumentElement()))) {
                // Not able to make progress because of cyclic references.
                reportCycles(svgTree, nodes);
                break;
            }
        }

        // TODO: Handle clipPath elements that reference another clipPath
        // Add attributes for all the style elements.
        for (Map.Entry<String, Set<SvgNode>> entry : svgTree.getStyleAffectedNodes()) {
            for (SvgNode n : entry.getValue()) {
                addStyleToPath(n, svgTree.getStyleClassAttr(entry.getKey()));
            }
        }

        // Replaces elements that reference clipPaths and replaces them with clipPathNodes
        // Note that clip path can be embedded within style, so it has to be called after
        // addStyleToPath.
        for (Map.Entry<SvgNode, Pair<SvgGroupNode, String>> entry :
                svgTree.getClipPathAffectedNodesSet()) {
            handleClipPath(
                    svgTree,
                    entry.getKey(),
                    entry.getValue().getFirst(),
                    entry.getValue().getSecond());
        }

        svgTree.flatten();
        svgTree.validate();
        svgTree.dump();

        return svgTree;
    }

    private static void reportCycles(
            @NonNull SvgTree svgTree, @NonNull Set<SvgGroupNode> svgNodes) {
        Map<String, String> edges = new HashMap<>();
        Map<String, Node> nodesById = new HashMap<>();
        for (SvgGroupNode svgNode : svgNodes) {
            Element element = svgNode.getDocumentElement();
            String id = element.getAttribute("id");
            if (!id.isEmpty()) {
                String targetId = element.getAttribute(SVG_HREF);
                if (targetId.isEmpty()) {
                    targetId = element.getAttribute(SVG_XLINK_HREF);
                }
                if (!targetId.isEmpty()) {
                    edges.put(id, getIdFromReference(targetId));
                    nodesById.put(id, element);
                }
            }
        }

        while (!edges.isEmpty()) {
            Set<String> visited = new HashSet<>();
            Map.Entry<String, String> entry = edges.entrySet().iterator().next();
            String id = entry.getKey();
            String targetId = entry.getValue();
            while (targetId != null && visited.add(id)) {
                id = targetId;
                targetId = edges.get(id);
            }

            if (targetId != null) { // Broken links are reported separately. Ignore them here.
                Node node = nodesById.get(id);
                String cycle = getCycleStartingAt(id, edges, nodesById);
                svgTree.logError("Circular dependency of <use> nodes: " + cycle, node);
            }
            edges.keySet().removeAll(visited);
        }
    }

    private static String getCycleStartingAt(
            @NonNull String startId,
            @NonNull Map<String, String> edges,
            @NonNull Map<String, Node> nodesById) {
        StringBuilder buf = new StringBuilder(startId);
        String id = startId;
        while (true) {
            id = edges.get(id);
            buf.append(" -> ").append(id);
            if (id.equals(startId)) {
                break;
            }
            buf.append(" (line ").append(getStartLine(nodesById.get(id))).append(")");
        }

        return buf.toString();
    }

    /** Traverse the tree in pre-order. */
    private static void traverseSvgAndExtract(
            @NonNull SvgTree svgTree, @NonNull SvgGroupNode currentGroup, @NonNull Element item) {
        NodeList childNodes = item.getChildNodes();

        for (int i = 0; i < childNodes.getLength(); i++) {
            Node childNode = childNodes.item(i);
            if (childNode.getNodeType() != Node.ELEMENT_NODE
                    || !childNode.hasChildNodes() && !childNode.hasAttributes()) {
                continue; // The node contains no information, just ignore it.
            }

            Element childElement = (Element) childNode;
            String tagName = childElement.getTagName();

            switch (tagName) {
                case SVG_PATH:
                case SVG_RECT:
                case SVG_CIRCLE:
                case SVG_ELLIPSE:
                case SVG_POLYGON:
                case SVG_POLYLINE:
                case SVG_LINE: {
                    SvgLeafNode child = new SvgLeafNode(svgTree, childElement, tagName + i);
                    processIdName(svgTree, child);
                    currentGroup.addChild(child);
                    extractAllItemsAs(svgTree, child, childElement, currentGroup);
                    svgTree.setHasLeafNode(true);
                    break;
                }

                case SVG_GROUP: {
                    SvgGroupNode childGroup = new SvgGroupNode(svgTree, childElement, "child" + i);
                    currentGroup.addChild(childGroup);
                    processIdName(svgTree, childGroup);
                    extractGroupNode(svgTree, childGroup, currentGroup);
                    traverseSvgAndExtract(svgTree, childGroup, childElement);
                    break;
                }

                case SVG_USE: {
                    SvgGroupNode childGroup = new SvgGroupNode(svgTree, childElement, "child" + i);
                    processIdName(svgTree, childGroup);
                    currentGroup.addChild(childGroup);
                    svgTree.addToPendingUseSet(childGroup);
                    break;
                }

                case SVG_DEFS: {
                    SvgGroupNode childGroup = new SvgGroupNode(svgTree, childElement, "child" + i);
                    traverseSvgAndExtract(svgTree, childGroup, childElement);
                    break;
                }

                case SVG_CLIP_PATH_ELEMENT:
                case SVG_MASK: {
                    SvgClipPathNode clipPath =
                            new SvgClipPathNode(svgTree, childElement, tagName + i);
                    processIdName(svgTree, clipPath);
                    traverseSvgAndExtract(svgTree, clipPath, childElement);
                    break;
                }

                case SVG_STYLE:
                    extractStyleNode(svgTree, childElement);
                    break;

                case "linearGradient": {
                    SvgGradientNode gradientNode =
                            new SvgGradientNode(svgTree, childElement, tagName + i);
                    processIdName(svgTree, gradientNode);
                    extractGradientNode(svgTree, gradientNode);
                    gradientNode.fillPresentationAttributes("gradientType", "linear");
                    svgTree.setHasGradient(true);
                    break;
                }

                case "radialGradient": {
                    SvgGradientNode gradientNode =
                            new SvgGradientNode(svgTree, childElement, tagName + i);
                    processIdName(svgTree, gradientNode);
                    extractGradientNode(svgTree, gradientNode);
                    gradientNode.fillPresentationAttributes("gradientType", "radial");
                    svgTree.setHasGradient(true);
                    break;
                }

                default:
                    String id = childElement.getAttribute("id");
                    if (id != null) {
                        svgTree.addIgnoredId(id);
                    }
                    // For other fancy tags, like <switch>, they can contain children too.
                    // Report the unsupported nodes.
                    if (unsupportedSvgNodes.contains(tagName)) {
                        svgTree.logError("<" + tagName + "> is not supported", childElement);
                    }
                    // This is a workaround for the cases using defs to define a full icon size clip
                    // path, which is redundant information anyway.
                    traverseSvgAndExtract(svgTree, currentGroup, childElement);
                    break;
            }
        }
    }

    /**
     * Reads content from a gradient element's documentNode and fills in attributes for the given
     * SVG gradient node.
     */
    private static void extractGradientNode(
            @NonNull SvgTree svg, @NonNull SvgGradientNode gradientNode) {
        Element element = gradientNode.getDocumentElement();
        NamedNodeMap a = element.getAttributes();
        int len = a.getLength();
        for (int j = 0; j < len; j++) {
            Node n = a.item(j);
            String name = n.getNodeName();
            String value = n.getNodeValue();
            if (gradientMap.containsKey(name)) {
                gradientNode.fillPresentationAttributes(name, value);
            }
        }
        NodeList gradientChildren = element.getChildNodes();

        // Default SVG gradient offset is the previous largest offset.
        double greatestOffset = 0;
        for (int i = 0; i < gradientChildren.getLength(); i++) {
            Node node = gradientChildren.item(i);
            String nodeName = node.getNodeName();
            if (nodeName.equals("stop")) {
                NamedNodeMap stopAttr = node.getAttributes();
                // Default SVG gradient stop color is black.
                String color = "rgb(0,0,0)";
                // Default SVG gradient stop opacity is 1.
                String opacity = "1";
                for (int k = 0; k < stopAttr.getLength(); k++) {
                    Node stopItem = stopAttr.item(k);
                    String name = stopItem.getNodeName();
                    String value = stopItem.getNodeValue();
                    try {
                        switch (name) {
                            case "offset":
                                // If a gradient's value is not greater than all previous offset
                                // values, then the offset value is adjusted to be equal to
                                // the largest of all previous offset values.
                                greatestOffset = extractOffset(value, greatestOffset);
                                break;
                            case "stop-color":
                                color = value;
                                break;
                            case "stop-opacity":
                                opacity = value;
                                break;
                            case "style":
                                String[] parts = value.split(";");
                                for (String attr : parts) {
                                    String[] splitAttribute = attr.split(":");
                                    if (splitAttribute.length == 2) {
                                        if (attr.startsWith("stop-color")) {
                                            color = splitAttribute[1];
                                        }
                                        else if (attr.startsWith("stop-opacity")) {
                                            opacity = splitAttribute[1];
                                        }
                                    }
                                }
                                break;
                        }
                    } catch (IllegalArgumentException e) {
                        String msg =
                                String.format("Invalid attribute value: %s=\"%s\"", name, value);
                        svg.logError(msg, node);
                    }
                }
                String offset = formatFloatValue(greatestOffset);
                String vdColor = gradientNode.colorSvg2Vd(color, "#000000");
                if (vdColor != null) {
                    color = vdColor;
                }
                gradientNode.addGradientStop(color, offset, opacity);
            }
        }
    }

    /**
     * Finds the gradient offset value given a String containing the value and greatest previous
     * offset value.
     *
     * @param offset an absolute floating point value or a percentage
     * @param greatestOffset is the greatest offset value seen in the gradient so far
     * @return the new greatest offset value
     */
    private static double extractOffset(@NonNull String offset, double greatestOffset) {
        double x;
        if (offset.endsWith("%")) {
            x = Double.parseDouble(offset.substring(0, offset.length() - 1)) / 100;
        } else {
            x = Double.parseDouble(offset);
        }
        // Gradient offset values must be between 0 and 1 or 0% and 100%.
        x = Math.min(1, Math.max(x, 0));
        return Math.max(x, greatestOffset);
    }

    /**
     * Checks to see if the childGroup references any clipPath or style elements. Saves the
     * reference in the svgTree to add the information to an SvgNode later.
     */
    private static void extractGroupNode(
            @NonNull SvgTree svgTree,
            @NonNull SvgGroupNode childGroup,
            @NonNull SvgGroupNode currentGroup) {
        NamedNodeMap a = childGroup.getDocumentElement().getAttributes();
        int len = a.getLength();
        for (int j = 0; j < len; j++) {
            Node n = a.item(j);
            String name = n.getNodeName();
            String value = n.getNodeValue();
            if (name.equals(SVG_CLIP_PATH) || name.equals(SVG_MASK)) {
                if (!value.isEmpty()) {
                    svgTree.addClipPathAffectedNode(childGroup, currentGroup, value);
                }
            } else if (name.equals("class")) {
                if (!value.isEmpty()) {
                    svgTree.addAffectedNodeToStyleClass("." + value, childGroup);
                }
            }
        }
    }

    /**
     * Extracts the attribute information from a style element and adds to the
     * styleClassAttributeMap of the SvgTree. SvgNodes reference style elements using a 'class'
     * attribute. The style attribute will be filled into the tree after the svgTree calls
     * traverseSVGAndExtract().
     */
    private static void extractStyleNode(@NonNull SvgTree svgTree, @NonNull Node currentNode) {
        NodeList a = currentNode.getChildNodes();
        int len = a.getLength();
        String styleData = "";
        for (int j = 0; j < len; j++) {
            Node n = a.item(j);
            if (n.getNodeType() == Node.CDATA_SECTION_NODE || len == 1) {
                styleData = n.getNodeValue();
            }
        }
        if (!styleData.isEmpty()) {
            // Separate each of the classes.
            String[] classData = styleData.split("}");
            for (String aClassData : classData) {
                // Separate the class name from the attribute values.
                String[] splitClassData = aClassData.split("\\{");
                if (splitClassData.length < 2) {
                    // When the class info is empty, then skip.
                    continue;
                }
                String className = splitClassData[0].trim();
                String styleAttr = splitClassData[1].trim();
                // Separate multiple classes if necessary.
                String[] splitClassNames = className.split(",");
                for (String splitClassName : splitClassNames) {
                    String styleAttrTemp = styleAttr;
                    className = splitClassName.trim();
                    // Concatenate the attributes to existing attributes.
                    String existing = svgTree.getStyleClassAttr(className);
                    if (existing != null) {
                        styleAttrTemp += ';' + existing;
                    }
                    svgTree.addStyleClassToTree(className, styleAttrTemp);
                }
            }
        }
    }


    /**
     * Checks if the id of a node exists and adds the id and SvgNode to the svgTree's idMap if it
     * exists.
     */
    private static void processIdName(@NonNull SvgTree svgTree, @NonNull SvgNode node) {
        String id = node.getAttributeValue("id");
        if (!id.isEmpty()) {
            svgTree.addIdToMap(id, node);
        }
    }

    /**
     * Reads the contents of the currentNode and fills them into useGroupNode. Propagates any
     * attributes of the useGroupNode to its children.
     *
     * @return true if the node has been processed, or false if it cannot been processed at this
     *     time due to dependency on an unprocessed {@code <use>} node
     */
    private static boolean extractUseNode(
            @NonNull SvgTree svgTree,
            @NonNull SvgGroupNode useGroupNode,
            @NonNull Node currentNode) {
        NamedNodeMap a = currentNode.getAttributes();
        float x = 0;
        float y = 0;
        String id = null;
        int len = a.getLength();
        for (int j = 0; j < len; j++) {
            Node n = a.item(j);
            String name = n.getNodeName();
            String value = n.getNodeValue();
            if (name.equals(SVG_HREF)) {
                id = getIdFromReference(value);
            } else if (name.equals(SVG_XLINK_HREF) && id == null) {
                id = getIdFromReference(value);
            } else if (name.equals("x")) {
                x = Float.parseFloat(value);
            } else if (name.equals("y")) {
                y = Float.parseFloat(value);
            } else if (presentationMap.containsKey(name)) {
                useGroupNode.fillPresentationAttributes(name, value);
            }
        }
        AffineTransform useTransform = new AffineTransform(1, 0, 0, 1, x, y);
        SvgNode definedNode = id == null ? null : svgTree.getSvgNodeFromId(id);
        if (definedNode == null) {
            if (id == null || !svgTree.isIdIgnored(id)) {
                svgTree.logError("Referenced id not found", currentNode);
            }
        } else {
            //noinspection SuspiciousMethodCalls
            if (svgTree.getPendingUseSet().contains(definedNode)) {
                // Cannot process useGroupNode yet, because definedNode it depends upon hasn't been
                // processed.
                return false;
            }
            SvgNode copiedNode = definedNode.deepCopy();
            useGroupNode.addChild(copiedNode);
            for (Map.Entry<String, String> entry : useGroupNode.mVdAttributesMap.entrySet()) {
                String key = entry.getKey();
                copiedNode.fillPresentationAttributes(key, entry.getValue());
            }
            useGroupNode.fillEmptyAttributes(useGroupNode.mVdAttributesMap);
            useGroupNode.transformIfNeeded(useTransform);
        }
        return true;
    }

    @NonNull
    private static String getIdFromReference(@NonNull String value) {
        return value.isEmpty() ? "" : value.substring(1);
    }

    /**
     * Replaces an SvgNode in the SvgTree that references a clipPath element with the
     * SvgClipPathNode that corresponds to the referenced clip-path id. Adds the SvgNode as an
     * affected node of the SvgClipPathNode.
     */
    private static void handleClipPath(
            @NonNull SvgTree svg,
            @NonNull SvgNode child,
            @Nullable SvgGroupNode currentGroup,
            @Nullable String value) {
        if (currentGroup == null || value == null) {
            return;
        }
        String clipName = getClipPathName(value);
        if (clipName == null) {
            return;
        }
        SvgNode clipNode = svg.getSvgNodeFromId(clipName);
        if (clipNode == null) {
            return;
        }
        SvgClipPathNode clipCopy = ((SvgClipPathNode) clipNode).deepCopy();

        currentGroup.replaceChild(child, clipCopy);

        clipCopy.addAffectedNode(child);
        clipCopy.setClipPathNodeAttributes();
    }

    /**
     * Normally, clip path is referred as "url(#clip-path)", this function can help to extract the
     * name, which is "clip-path" here.
     *
     * @return the name of the clip path or null if the given string does not contain a proper clip
     *     path name.
     */
    @Nullable
    private static String getClipPathName(@Nullable String s) {
        if (s == null) {
            return null;
        }
        int startPos = s.indexOf('#');
        int endPos = s.indexOf(')', startPos + 1);
        if (endPos < 0) {
            endPos = s.length();
        }
        return s.substring(startPos + 1, endPos).trim();
    }

    /** Reads the content from currentItem and fills into the SvgLeafNode "child". */
    private static void extractAllItemsAs(
            @NonNull SvgTree svg,
            @NonNull SvgLeafNode child,
            @NonNull Node currentItem,
            @NonNull SvgGroupNode currentGroup) {
        Node parentNode = currentItem.getParentNode();

        boolean hasNodeAttr = false;
        String styleContent = "";
        StringBuilder styleContentBuilder = new StringBuilder();
        boolean nothingToDisplay = false;

        while (parentNode != null && parentNode.getNodeName().equals("g")) {
            // Parse the group's attributes.
            logger.log(Level.FINE, "Printing current parent");
            printlnCommon(parentNode);

            NamedNodeMap attr = parentNode.getAttributes();
            Node nodeAttr = attr.getNamedItem(SVG_STYLE);
            // Search for the "display:none", if existed, then skip this item.
            if (nodeAttr != null) {
                styleContentBuilder.append(nodeAttr.getTextContent());
                styleContentBuilder.append(';');
                styleContent = styleContentBuilder.toString();
                logger.log(Level.FINE, "styleContent is :" + styleContent + "at number group ");
                if (styleContent.contains("display:none")) {
                    logger.log(Level.FINE, "Found none style, skip the whole group");
                    nothingToDisplay = true;
                    break;
                } else {
                    hasNodeAttr = true;
                }
            }

            Node displayAttr = attr.getNamedItem(SVG_DISPLAY);
            if (displayAttr != null && "none".equals(displayAttr.getNodeValue())) {
                logger.log(Level.FINE, "Found display:none style, skip the whole group");
                nothingToDisplay = true;
                break;
            }
            parentNode = parentNode.getParentNode();
        }

        if (nothingToDisplay) {
            // Skip this current whole item.
            return;
        }

        logger.log(Level.FINE, "Print current item");
        printlnCommon(currentItem);

        if (hasNodeAttr && !styleContent.isEmpty()) {
            addStyleToPath(child, styleContent);
        }

        if (SVG_PATH.equals(currentItem.getNodeName())) {
            extractPathItem(svg, child, currentItem, currentGroup);
        }

        if (SVG_RECT.equals(currentItem.getNodeName())) {
            extractRectItem(svg, child, currentItem, currentGroup);
        }

        if (SVG_CIRCLE.equals(currentItem.getNodeName())) {
            extractCircleItem(svg, child, currentItem, currentGroup);
        }

        if (SVG_POLYGON.equals(currentItem.getNodeName())
                || SVG_POLYLINE.equals(currentItem.getNodeName())) {
            extractPolyItem(svg, child, currentItem, currentGroup);
        }

        if (SVG_LINE.equals(currentItem.getNodeName())) {
            extractLineItem(svg, child, currentItem, currentGroup);
        }

        if (SVG_ELLIPSE.equals(currentItem.getNodeName())) {
            extractEllipseItem(svg, child, currentItem, currentGroup);
        }

        // Add the type of node as a style class name for child.
        svg.addAffectedNodeToStyleClass(currentItem.getNodeName(), child);
    }

    private static void printlnCommon(@NonNull Node n) {
        logger.log(Level.FINE, " nodeName=\"" + n.getNodeName() + "\"");

        String val = n.getNamespaceURI();
        if (val != null) {
            logger.log(Level.FINE, " uri=\"" + val + "\"");
        }

        val = n.getPrefix();

        if (val != null) {
            logger.log(Level.FINE, " pre=\"" + val + "\"");
        }

        val = n.getLocalName();
        if (val != null) {
            logger.log(Level.FINE, " local=\"" + val + "\"");
        }

        val = n.getNodeValue();
        if (val != null) {
            logger.log(Level.FINE, " nodeValue=");
            if (val.trim().isEmpty()) {
                // Whitespace
                logger.log(Level.FINE, "[WS]");
            } else {
                logger.log(Level.FINE, "\"" + n.getNodeValue() + "\"");
            }
        }
    }

    /** Convert polygon element into a path. */
    private static void extractPolyItem(
            @NonNull SvgTree svgTree,
            @NonNull SvgLeafNode child,
            @NonNull Node currentGroupNode,
            @NonNull SvgGroupNode currentGroup) {
        logger.log(Level.FINE, "Polyline or Polygon found" + currentGroupNode.getTextContent());
        if (currentGroupNode.getNodeType() == Node.ELEMENT_NODE) {
            NamedNodeMap attributes = currentGroupNode.getAttributes();
            int len = attributes.getLength();

            for (int itemIndex = 0; itemIndex < len; itemIndex++) {
                Node n = attributes.item(itemIndex);
                String name = n.getNodeName();
                String value = n.getNodeValue();
                try {
                    if (name.equals(SVG_STYLE)) {
                        addStyleToPath(child, value);
                    } else if (presentationMap.containsKey(name)) {
                        child.fillPresentationAttributes(name, value);
                    } else if (name.equals(SVG_CLIP_PATH) || name.equals(SVG_MASK)) {
                        svgTree.addClipPathAffectedNode(child, currentGroup, value);
                    } else if (name.equals(SVG_POINTS)) {
                        PathBuilder builder = new PathBuilder();
                        String[] split = SPACE_OR_COMMA.split(value);
                        float baseX = Float.parseFloat(split[0]);
                        float baseY = Float.parseFloat(split[1]);
                        builder.absoluteMoveTo(baseX, baseY);
                        for (int j = 2; j < split.length; j += 2) {
                            float x = Float.parseFloat(split[j]);
                            float y = Float.parseFloat(split[j + 1]);
                            builder.relativeLineTo(x - baseX, y - baseY);
                            baseX = x;
                            baseY = y;
                        }
                        if (SVG_POLYGON.equals(currentGroupNode.getNodeName())) {
                            builder.relativeClose();
                        }
                        child.setPathData(builder.toString());
                    } else if (name.equals("class")) {
                        svgTree.addAffectedNodeToStyleClass("." + value, child);
                        svgTree.addAffectedNodeToStyleClass(
                                currentGroupNode.getNodeName() + "." + value, child);
                    }
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    svgTree.logError("Invalid value of \"" + name + "\" attribute", n);
                }
            }
        }
    }

    /** Convert rectangle element into a path. */
    private static void extractRectItem(
            @NonNull SvgTree svg,
            @NonNull SvgLeafNode child,
            @NonNull Node currentGroupNode,
            @NonNull SvgGroupNode currentGroup) {
        logger.log(Level.FINE, "Rect found" + currentGroupNode.getTextContent());

        if (currentGroupNode.getNodeType() == Node.ELEMENT_NODE) {
            double x = 0;
            double y = 0;
            double width = Double.NaN;
            double height = Double.NaN;
            double rx = 0;
            double ry = 0;

            NamedNodeMap a = currentGroupNode.getAttributes();
            int len = a.getLength();
            boolean pureTransparent = false;
            for (int j = 0; j < len; j++) {
                Node n = a.item(j);
                String name = n.getNodeName();
                String value = n.getNodeValue();
                try {
                    if (name.equals(SVG_STYLE)) {
                        addStyleToPath(child, value);
                        if (value.contains("opacity:0;")) {
                            pureTransparent = true;
                        }
                    } else if (presentationMap.containsKey(name)) {
                        child.fillPresentationAttributes(name, value);
                    } else if (name.equals(SVG_CLIP_PATH) || name.equals(SVG_MASK)) {
                        svg.addClipPathAffectedNode(child, currentGroup, value);
                    } else if (name.equals("x")) {
                        x = svg.parseXValue(value);
                    } else if (name.equals("y")) {
                        y = svg.parseYValue(value);
                    } else if (name.equals("rx")) {
                        rx = svg.parseXValue(value);
                    } else if (name.equals("ry")) {
                        ry = svg.parseYValue(value);
                    } else if (name.equals("width")) {
                        width = svg.parseXValue(value);
                    } else if (name.equals("height")) {
                        height = svg.parseYValue(value);
                    } else if (name.equals("class")) {
                        svg.addAffectedNodeToStyleClass("rect." + value, child);
                        svg.addAffectedNodeToStyleClass("." + value, child);
                    }
                } catch (IllegalArgumentException e) {
                    String msg = String.format("Invalid attribute value: %s=\"%s\"", name, value);
                    svg.logError(msg, currentGroupNode);
                }
            }

            if (!pureTransparent
                    && !Double.isNaN(x)
                    && !Double.isNaN(y)
                    && !Double.isNaN(width)
                    && !Double.isNaN(height)) {
                PathBuilder builder = new PathBuilder();
                if (rx <= 0 && ry <= 0) {
                    // "M x, y h width v height h -width z"
                    builder.absoluteMoveTo(x, y);
                    builder.relativeHorizontalTo(width);
                    builder.relativeVerticalTo(height);
                    builder.relativeHorizontalTo(-width);
                } else {
                    // Refer to http://www.w3.org/TR/SVG/shapes.html#RectElement
                    assert rx > 0 || ry > 0;
                    if (ry == 0) {
                        ry = rx;
                    } else if (rx == 0) {
                        rx = ry;
                    }
                    if (rx > width / 2) rx = width / 2;
                    if (ry > height / 2) ry = height / 2;

                    builder.absoluteMoveTo(x + rx, y);
                    builder.absoluteLineTo(x + width - rx, y);
                    builder.absoluteArcTo(rx, ry, false, false, true, x + width, y + ry);
                    builder.absoluteLineTo(x + width, y + height - ry);

                    builder.absoluteArcTo(rx, ry, false, false, true, x + width - rx, y + height);
                    builder.absoluteLineTo(x + rx,  y + height);

                    builder.absoluteArcTo(rx, ry, false, false, true, x, y + height - ry);
                    builder.absoluteLineTo(x,  y + ry);
                    builder.absoluteArcTo(rx, ry, false, false, true, x + rx, y);
                }
                builder.relativeClose();
                child.setPathData(builder.toString());
            }
        }
    }

    /** Converts circle element into a path. */
    private static void extractCircleItem(
            @NonNull SvgTree svg,
            @NonNull SvgLeafNode child,
            @NonNull Node currentGroupNode,
            @NonNull SvgGroupNode currentGroup) {
        logger.log(Level.FINE, "circle found" + currentGroupNode.getTextContent());

        if (currentGroupNode.getNodeType() == Node.ELEMENT_NODE) {
            float cx = 0;
            float cy = 0;
            float radius = 0;

            NamedNodeMap a = currentGroupNode.getAttributes();
            int len = a.getLength();
            boolean pureTransparent = false;
            for (int j = 0; j < len; j++) {
                Node n = a.item(j);
                String name = n.getNodeName();
                String value = n.getNodeValue();
                if (name.equals(SVG_STYLE)) {
                    addStyleToPath(child, value);
                    if (value.contains("opacity:0;")) {
                        pureTransparent = true;
                    }
                } else if (presentationMap.containsKey(name)) {
                    child.fillPresentationAttributes(name, value);
                } else if (name.equals(SVG_CLIP_PATH) || name.equals(SVG_MASK)) {
                    svg.addClipPathAffectedNode(child, currentGroup, value);
                } else if (name.equals("cx")) {
                    cx = Float.parseFloat(value);
                } else if (name.equals("cy")) {
                    cy = Float.parseFloat(value);
                } else if (name.equals("r")) {
                    radius = Float.parseFloat(value);
                } else if (name.equals("class")) {
                    svg.addAffectedNodeToStyleClass("circle." + value, child);
                    svg.addAffectedNodeToStyleClass("." + value, child);
                }
            }

            if (!pureTransparent && !Float.isNaN(cx) && !Float.isNaN(cy)) {
                // "M cx cy m -r, 0 a r,r 0 1,1 (r * 2),0 a r,r 0 1,1 -(r * 2),0"
                PathBuilder builder = new PathBuilder();
                builder.absoluteMoveTo(cx, cy);
                builder.relativeMoveTo(-radius, 0);
                builder.relativeArcTo(radius, radius, false, true, true, 2 * radius, 0);
                builder.relativeArcTo(radius, radius, false, true, true, -2 * radius, 0);
                child.setPathData(builder.toString());
            }
        }
    }

    /** Convert ellipse element into a path. */
    private static void extractEllipseItem(
            @NonNull SvgTree svg,
            @NonNull SvgLeafNode child,
            @NonNull Node currentGroupNode,
            @NonNull SvgGroupNode currentGroup) {
        logger.log(Level.FINE, "ellipse found" + currentGroupNode.getTextContent());

        if (currentGroupNode.getNodeType() == Node.ELEMENT_NODE) {
            float cx = 0;
            float cy = 0;
            float rx = 0;
            float ry = 0;

            NamedNodeMap a = currentGroupNode.getAttributes();
            int len = a.getLength();
            boolean pureTransparent = false;
            for (int j = 0; j < len; j++) {
                Node n = a.item(j);
                String name = n.getNodeName();
                String value = n.getNodeValue();
                if (name.equals(SVG_STYLE)) {
                    addStyleToPath(child, value);
                    if (value.contains("opacity:0;")) {
                        pureTransparent = true;
                    }
                } else if (presentationMap.containsKey(name)) {
                    child.fillPresentationAttributes(name, value);
                } else if (name.equals(SVG_CLIP_PATH) || name.equals(SVG_MASK)) {
                    svg.addClipPathAffectedNode(child, currentGroup, value);
                } else if (name.equals("cx")) {
                    cx = Float.parseFloat(value);
                } else if (name.equals("cy")) {
                    cy = Float.parseFloat(value);
                } else if (name.equals("rx")) {
                    rx = Float.parseFloat(value);
                } else if (name.equals("ry")) {
                    ry = Float.parseFloat(value);
                } else if (name.equals("class")) {
                    svg.addAffectedNodeToStyleClass("ellipse." + value, child);
                    svg.addAffectedNodeToStyleClass("." + value, child);
                }
            }

            if (!pureTransparent && !Float.isNaN(cx) && !Float.isNaN(cy) && rx > 0 && ry > 0) {
                // "M cx -rx, cy a rx,ry 0 1,0 (rx * 2),0 a rx,ry 0 1,0 -(rx * 2),0"
                PathBuilder builder = new PathBuilder();
                builder.absoluteMoveTo(cx - rx, cy);
                builder.relativeArcTo(rx, ry, false, true, false, 2 * rx, 0);
                builder.relativeArcTo(rx, ry, false, true, false, -2 * rx, 0);
                builder.relativeClose();
                child.setPathData(builder.toString());
            }
        }
    }

    /** Convert line element into a path. */
    private static void extractLineItem(
            @NonNull SvgTree svg,
            @NonNull SvgLeafNode child,
            @NonNull Node currentGroupNode,
            @NonNull SvgGroupNode currentGroup) {
        logger.log(Level.FINE, "line found" + currentGroupNode.getTextContent());

        if (currentGroupNode.getNodeType() == Node.ELEMENT_NODE) {
            float x1 = 0;
            float y1 = 0;
            float x2 = 0;
            float y2 = 0;

            NamedNodeMap a = currentGroupNode.getAttributes();
            int len = a.getLength();
            boolean pureTransparent = false;
            for (int j = 0; j < len; j++) {
                Node n = a.item(j);
                String name = n.getNodeName();
                String value = n.getNodeValue();
                if (name.equals(SVG_STYLE)) {
                    addStyleToPath(child, value);
                    if (value.contains("opacity:0;")) {
                        pureTransparent = true;
                    }
                } else if (presentationMap.containsKey(name)) {
                    child.fillPresentationAttributes(name, value);
                } else if (name.equals(SVG_CLIP_PATH) || name.equals(SVG_MASK)) {
                    svg.addClipPathAffectedNode(child, currentGroup, value);
                } else if (name.equals("x1")) {
                    x1 = Float.parseFloat(value);
                } else if (name.equals("y1")) {
                    y1 = Float.parseFloat(value);
                } else if (name.equals("x2")) {
                    x2 = Float.parseFloat(value);
                } else if (name.equals("y2")) {
                    y2 = Float.parseFloat(value);
                } else if (name.equals("class")) {
                    svg.addAffectedNodeToStyleClass("line." + value, child);
                    svg.addAffectedNodeToStyleClass("." + value, child);
                }
            }

            if (!pureTransparent
                    && !Float.isNaN(x1)
                    && !Float.isNaN(y1)
                    && !Float.isNaN(x2)
                    && !Float.isNaN(y2)) {
                // "M x1, y1 L x2, y2"
                PathBuilder builder = new PathBuilder();
                builder.absoluteMoveTo(x1, y1);
                builder.absoluteLineTo(x2, y2);
                child.setPathData(builder.toString());
            }
        }
    }

    private static void extractPathItem(
            @NonNull SvgTree svg,
            @NonNull SvgLeafNode child,
            @NonNull Node currentGroupNode,
            @NonNull SvgGroupNode currentGroup) {
        logger.log(Level.FINE, "Path found " + currentGroupNode.getTextContent());

        if (currentGroupNode.getNodeType() == Node.ELEMENT_NODE) {
            NamedNodeMap a = currentGroupNode.getAttributes();
            int len = a.getLength();

            for (int j = 0; j < len; j++) {
                Node n = a.item(j);
                String name = n.getNodeName();
                String value = n.getNodeValue();
                if (name.equals(SVG_STYLE)) {
                    addStyleToPath(child, value);
                } else if (presentationMap.containsKey(name)) {
                    child.fillPresentationAttributes(name, value);
                } else if (name.equals(SVG_CLIP_PATH) || name.equals(SVG_MASK)) {
                    svg.addClipPathAffectedNode(child, currentGroup, value);
                } else if (name.equals(SVG_D)) {
                    String pathData = Pattern.compile("(\\d)-").matcher(value).replaceAll("$1,-");
                    child.setPathData(pathData);
                } else if (name.equals("class")) {
                    svg.addAffectedNodeToStyleClass("path." + value, child);
                    svg.addAffectedNodeToStyleClass("." + value, child);
                }
            }
        }
    }

    private static void addStyleToPath(@NonNull SvgNode path, @Nullable String value) {
        logger.log(Level.FINE, "Style found is " + value);
        if (value != null) {
            String[] parts = value.split(";");
            for (int k = parts.length; --k >= 0; ) {
                String subStyle = parts[k];
                String[] nameValue = subStyle.split(":");
                if (nameValue.length == 2 && nameValue[0] != null && nameValue[1] != null) {
                    String attr = nameValue[0].trim();
                    String val = nameValue[1].trim();
                    if (presentationMap.containsKey(attr)) {
                        path.fillPresentationAttributes(attr, val);
                    } else if (attr.equals(SVG_OPACITY)) {
                        // TODO: This is hacky, since we don't have a group level android:opacity.
                        //       This only works when the paths don't overlap.
                        path.fillPresentationAttributes(SVG_FILL_OPACITY, nameValue[1]);
                    }

                    // We need to handle a clip-path or a mask within the style in a different way
                    // than other styles. We treat it as an attribute clip-path = "#url(name)".
                    if (attr.equals(SVG_CLIP_PATH) || attr.equals(SVG_MASK)) {
                        SvgGroupNode parentNode = path.getTree().findParent(path);
                        if (parentNode != null) {
                            path.getTree().addClipPathAffectedNode(path, parentNode, val);
                        }
                    }
                }
            }
        }
    }

    private static void writeFile(@NonNull OutputStream outStream, @NonNull SvgTree svgTree)
            throws IOException {
        svgTree.writeXml(outStream);
    }

    /**
     * Converts a SVG file into VectorDrawable's XML content, if no error is found.
     *
     * @param inputSvg the input SVG file
     * @param outStream the converted VectorDrawable's content. This can be empty if there is any
     *     error found during parsing
     * @return the error message that combines all logged errors and warnings, or an empty string if
     *     there were no errors
     */
    @Slow
    @NonNull
    public static String parseSvgToXml(@NonNull File inputSvg, @NonNull OutputStream outStream)
            throws IOException {
        SvgTree svgTree = parse(inputSvg);
        if (svgTree.getHasLeafNode()) {
            writeFile(outStream, svgTree);
        }
        return svgTree.getErrorMessage();
    }
}
