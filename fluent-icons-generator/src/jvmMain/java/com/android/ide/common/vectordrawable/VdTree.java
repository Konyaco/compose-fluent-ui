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

import static com.android.SdkConstants.TAG_CLIP_PATH;
import static com.android.SdkConstants.TAG_GROUP;
import static com.android.SdkConstants.TAG_PATH;
import static com.android.SdkConstants.TAG_VECTOR;
import static com.android.ide.common.vectordrawable.VdUtil.parseColorValue;

import com.android.annotations.NonNull;
import com.android.ide.common.util.AssetUtil;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Represents the whole VectorDrawable XML file's tree.
 */
class VdTree {
    private static final Pattern ATTRIBUTE_PATTERN =
            Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");

    private final VdGroup mRootGroup = new VdGroup();

    private float mBaseWidth = 1;
    private float mBaseHeight = 1;
    private float mPortWidth = 1;
    private float mPortHeight = 1;
    private float mRootAlpha = 1;
    private int mRootTint;

    private static final boolean DBG_PRINT_TREE = false;

    private static final String INDENT = "  ";

    float getBaseWidth(){
        return mBaseWidth;
    }

    float getBaseHeight(){
        return mBaseHeight;
    }

    float getPortWidth(){
        return mPortWidth;
    }

    float getPortHeight(){
        return mPortHeight;
    }

    private void drawTree(Graphics2D g, int w, int h) {
        float scaleX = w / mPortWidth;
        float scaleY = h / mPortHeight;

        AffineTransform rootMatrix = new AffineTransform(); // identity

        mRootGroup.draw(g, rootMatrix, scaleX, scaleY);
    }

    /** Draws the VdTree into an image. */
    @SuppressWarnings("UseJBColor") // No need to use JBColor here.
    public void drawIntoImage(@NonNull BufferedImage image) {
        Graphics2D gFinal = (Graphics2D) image.getGraphics();
        int width = image.getWidth();
        int height = image.getHeight();
        gFinal.setColor(new Color(255, 255, 255, 0));
        gFinal.fillRect(0, 0, width, height);

        if (mRootAlpha < 1.0) {
            // Draw into a temporary image, then draw into the result image applying alpha blending.
            BufferedImage alphaImage = AssetUtil.newArgbBufferedImage(width, height);
            Graphics2D gTemp = (Graphics2D)alphaImage.getGraphics();
            drawTree(gTemp, width, height);
            gFinal.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, mRootAlpha));
            gFinal.drawImage(alphaImage, 0, 0, null);
            gTemp.dispose();
        } else {
            drawTree(gFinal, width, height);
        }

        if (mRootTint != 0) {
            // Apply tint.
            BufferedImage tintImage = AssetUtil.newArgbBufferedImage(width, height);
            Graphics2D gTemp = (Graphics2D)tintImage.getGraphics();
            gTemp.setPaint(new Color(mRootTint));
            gTemp.fillRect(0, 0, width, height);
            gFinal.setComposite(AlphaComposite.SrcIn);
            try {
                gFinal.drawImage(tintImage, gFinal.getTransform().createInverse(), null);
            } catch (NoninvertibleTransformException ignored) {
            }
            gTemp.dispose();
        }

        gFinal.dispose();
    }

    public void parse(@NonNull Document doc) {
        NodeList rootNodeList = doc.getElementsByTagName(TAG_VECTOR);
        assert rootNodeList.getLength() == 1;
        Node rootNode = rootNodeList.item(0);

        parseRootNode(rootNode);
        parseTree(rootNode, mRootGroup);

        if (DBG_PRINT_TREE) {
            debugPrintTree(0, mRootGroup);
        }
    }

    private static void parseTree(@NonNull Node currentNode, @NonNull VdGroup currentGroup) {
        NodeList childrenNodes = currentNode.getChildNodes();
        int length = childrenNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node child = childrenNodes.item(i);
            if (child.getNodeType() == Node.ELEMENT_NODE) {
                String name = child.getNodeName();
                if (TAG_GROUP.equals(name)) {
                    VdGroup newGroup = parseGroupAttributes(child.getAttributes());
                    currentGroup.add(newGroup);
                    parseTree(child, newGroup);
                } else if (TAG_PATH.equals(name)) {
                    VdPath newPath = parsePathAttributes(child.getAttributes());
                    newPath.addGradientIfExists(child);
                    currentGroup.add(newPath);
                } else if (TAG_CLIP_PATH.equals(name)) {
                    VdPath newClipPath = parsePathAttributes(child.getAttributes());
                    newClipPath.setClipPath(true);
                    currentGroup.add(newClipPath);
                }
            }
        }
    }

    private static void debugPrintTree(int level, @NonNull VdGroup mRootGroup) {
        int len = mRootGroup.size();
        if (len == 0) {
            return;
        }
        StringBuilder prefixBuilder = new StringBuilder();
        for (int i = 0; i < level; i++) {
            prefixBuilder.append(INDENT);
        }
        String prefix = prefixBuilder.toString();
        ArrayList<VdElement> children = mRootGroup.getChildren();
        for (int i = 0; i < len; i++) {
            VdElement child = children.get(i);
            if (child.isGroup()) {
                // TODO: print group info
                debugPrintTree(level + 1, (VdGroup) child);
            }
        }
    }

    private void parseRootNode(@NonNull Node rootNode) {
        if (rootNode.hasAttributes()) {
            parseSize(rootNode.getAttributes());
        }
    }

    private void parseSize(@NonNull NamedNodeMap attributes) {
        int len = attributes.getLength();
        for (int i = 0; i < len; i++) {
            String name = attributes.item(i).getNodeName();
            String value = attributes.item(i).getNodeValue();
            Matcher matcher = ATTRIBUTE_PATTERN.matcher(value);
            float size = 0;
            if (matcher.matches()) {
                size = Float.parseFloat(matcher.group(1));
            }

            // TODO: Extract dimension units like px etc. Right now all are treated as "dp".
            if ("android:width".equals(name)) {
                mBaseWidth = size;
            } else if ("android:height".equals(name)) {
                mBaseHeight = size;
            } else if ("android:viewportWidth".equals(name)) {
                mPortWidth = Float.parseFloat(value);
            } else if ("android:viewportHeight".equals(name)) {
                mPortHeight = Float.parseFloat(value);
            } else if ("android:alpha".equals(name)) {
                mRootAlpha = Float.parseFloat(value);
            } else if ("android:tint".equals(name) && value.startsWith("#")) {
                mRootTint = parseColorValue(value);
            }
        }
    }

    private static VdPath parsePathAttributes(@NonNull NamedNodeMap attributes) {
        VdPath vgPath = new VdPath();
        vgPath.parseAttributes(attributes);
        return vgPath;
    }

    private static VdGroup parseGroupAttributes(@NonNull NamedNodeMap attributes) {
        VdGroup vgGroup = new VdGroup();
        vgGroup.parseAttributes(attributes);
        return vgGroup;
    }
}
