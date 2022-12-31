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

import static com.android.SdkConstants.TAG_CLIP_PATH;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_CLIP_RULE;
import static com.android.ide.common.vectordrawable.Svg2Vector.SVG_MASK;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.google.common.collect.Iterables;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Element;

/**
 * Represents a SVG group element that contains a clip-path. SvgClipPathNode's mChildren will
 * contain the actual path data of the clip-path. The path of the clip will be constructed in
 * {@link #writeXml} by concatenating mChildren's paths. mAffectedNodes contains any group or leaf
 * nodes that are clipped by the path.
 */
class SvgClipPathNode extends SvgGroupNode {
    private final ArrayList<SvgNode> mAffectedNodes = new ArrayList<>();

    SvgClipPathNode(@NonNull SvgTree svgTree, @NonNull Element element, @Nullable String name) {
        super(svgTree, element, name);
    }

    @Override
    @NonNull
    public SvgClipPathNode deepCopy() {
        SvgClipPathNode newInstance = new SvgClipPathNode(getTree(), mDocumentElement, mName);
        newInstance.copyFrom(this);
        return newInstance;
    }

    protected void copyFrom(@NonNull SvgClipPathNode from) {
        super.copyFrom(from);
        for (SvgNode node : from.mAffectedNodes) {
            addAffectedNode(node);
        }
    }

    @Override
    public void addChild(@NonNull SvgNode child) {
        // Pass the presentation map down to the children, who can override the attributes.
        mChildren.add(child);
        // The child has its own attributes map. But the parents can still fill some attributes
        // if they don't exists
        child.fillEmptyAttributes(mVdAttributesMap);
    }

    public void addAffectedNode(@NonNull SvgNode child) {
        mAffectedNodes.add(child);
        child.fillEmptyAttributes(mVdAttributesMap);
    }

    @Override
    public void flatten(@NonNull AffineTransform transform) {
        for (SvgNode n : mChildren) {
            mStackedTransform.setTransform(transform);
            mStackedTransform.concatenate(mLocalTransform);
            n.flatten(mStackedTransform);
        }

        mStackedTransform.setTransform(transform);
        for (SvgNode n : mAffectedNodes) {
            n.flatten(mStackedTransform); // mLocalTransform does not apply to mAffectedNodes.
        }
        mStackedTransform.concatenate(mLocalTransform);

        if (mVdAttributesMap.containsKey(Svg2Vector.SVG_STROKE_WIDTH)
                && ((mStackedTransform.getType() & AffineTransform.TYPE_MASK_SCALE) != 0)) {
            logWarning("Scaling of the stroke width is ignored");
        }
    }

    @Override
    public void validate() {
        super.validate();
        if (mDocumentElement.getTagName().equals(SVG_MASK) && !isWhiteFill()) {
            // A mask that is not solid white creates a transparency effect that cannot be
            // reproduced by a clip-path.
            logError("Semitransparent mask cannot be represented by a vector drawable");
        }
    }

    private boolean isWhiteFill() {
        String fillColor = mVdAttributesMap.get("fill");
        if (fillColor == null) {
            return false;
        }
        fillColor = colorSvg2Vd(fillColor, "#000");
        if (fillColor == null) {
            return false;
        }
        return VdUtil.parseColorValue(fillColor) == 0xFFFFFFFF;
    }

    @Override
    public void transformIfNeeded(@NonNull AffineTransform rootTransform) {
        for (SvgNode p : Iterables.concat(mChildren, mAffectedNodes)) {
            p.transformIfNeeded(rootTransform);
        }
    }

    @Override
    public void writeXml(@NonNull OutputStreamWriter writer, @NonNull String indent)
            throws IOException {
        writer.write(indent);
        writer.write("<group>");
        writer.write(System.lineSeparator());
        String incrementedIndent = indent + INDENT_UNIT;

        Map<ClipRule, List<String>> clipPaths = new EnumMap<>(ClipRule.class);
        Visitor clipPathCollector = node -> {
            if (node instanceof SvgLeafNode) {
                String pathData = ((SvgLeafNode) node).getPathData();
                if (pathData != null && !pathData.isEmpty()) {
                    ClipRule clipRule =
                            "evenOdd".equals(node.mVdAttributesMap.get(SVG_CLIP_RULE))
                                    ? ClipRule.EVEN_ODD
                                    : ClipRule.NON_ZERO;
                    List<String> paths =
                            clipPaths.computeIfAbsent(clipRule, key -> new ArrayList<>());
                    paths.add(pathData);
                }
            }
            return VisitResult.CONTINUE;
        };
        for (SvgNode node : mChildren) {
            node.accept(clipPathCollector);
        }

        for (Map.Entry<ClipRule, List<String>> entry : clipPaths.entrySet()) {
            ClipRule clipRule = entry.getKey();
            List<String> pathData = entry.getValue();
            writer.write(incrementedIndent);
            writer.write('<');
            writer.write(TAG_CLIP_PATH);
            writer.write(System.lineSeparator());
            writer.write(incrementedIndent);
            writer.write(INDENT_UNIT);
            writer.write(INDENT_UNIT);
            writer.write("android:pathData=\"");
            for (int i = 0; i < pathData.size(); i++) {
                String path = pathData.get(i);
                if (i > 0 && !path.startsWith("M")) {
                    // Reset the current position to the origin of the coordinate system.
                    writer.write("M 0,0");
                }
                writer.write(path);
            }
            writer.write('"');
            if (clipRule == ClipRule.EVEN_ODD) {
                writer.write(System.lineSeparator());
                writer.write(incrementedIndent);
                writer.write(INDENT_UNIT);
                writer.write(INDENT_UNIT);
                writer.write("android:fillType=\"evenOdd\"");
            }
            writer.write("/>");
            writer.write(System.lineSeparator());
        }

        for (SvgNode node : mAffectedNodes) {
            node.writeXml(writer, incrementedIndent);
        }
        writer.write(indent);
        writer.write("</group>");
        writer.write(System.lineSeparator());
    }

    /**
     * Concatenates the affected nodes transformations to the clipPathNode's so it is properly
     * transformed.
     */
    public void setClipPathNodeAttributes() {
        for (SvgNode n : mAffectedNodes) {
            mLocalTransform.concatenate(n.mLocalTransform);
        }
    }
}
