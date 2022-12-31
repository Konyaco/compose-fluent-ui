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

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;

/**
 * Represents an SVG file's group element.
 */
class SvgGroupNode extends SvgNode {
    private static final Logger logger = Logger.getLogger(SvgGroupNode.class.getSimpleName());

    protected final ArrayList<SvgNode> mChildren = new ArrayList<>();

    SvgGroupNode(@NonNull SvgTree svgTree, @NonNull Element docNode, @Nullable String name) {
        super(svgTree, docNode, name);
    }

    @Override
    @NonNull
    public SvgGroupNode deepCopy() {
        SvgGroupNode newInstance = new SvgGroupNode(getTree(), mDocumentElement, getName());
        newInstance.copyFrom(this);
        return newInstance;
    }

    protected <T extends SvgGroupNode> void copyFrom(@NonNull T from) {
        super.copyFrom(from);
        for (SvgNode child : from.mChildren) {
            addChild(child.deepCopy());
        }
    }

    public void addChild(@NonNull SvgNode child) {
        // Pass the presentation map down to the children, who can override the attributes.
        mChildren.add(child);
        // The child has its own attributes map. But the parents can still fill some attributes
        // if they don't exist.
        child.fillEmptyAttributes(mVdAttributesMap);
    }

    /**
     * Replaces an existing child node with a new one.
     *
     * @param oldChild the child node to replace
     * @param newChild the node to replace the existing child node with
     */
    public void replaceChild(@NonNull SvgNode oldChild, @NonNull SvgNode newChild) {
        int index = mChildren.indexOf(oldChild);
        if (index < 0) {
            throw new IllegalArgumentException(
                    "The child being replaced doesn't belong to this group");
        }

        mChildren.set(index, newChild);
    }

    @Override
    public void dumpNode(@NonNull String indent) {
        // Print the current group.
        logger.log(Level.FINE, indent + "group: " + getName());

        // Then print all the children.
        for (SvgNode node : mChildren) {
            node.dumpNode(indent + INDENT_UNIT);
        }
    }

    /**
     * Finds the parent node of the input node.
     *
     * @return the parent node, or null if node is not in the tree.
     */
    @Nullable
    public SvgGroupNode findParent(@NonNull SvgNode node) {
        for (SvgNode n : mChildren) {
            if (n == node) {
                return this;
            }
            if (n.isGroupNode()) {
                SvgGroupNode parent = ((SvgGroupNode) n).findParent(node);
                if (parent != null) {
                    return parent;
                }
            }
        }
        return null;
    }

    @Override
    public boolean isGroupNode() {
        return true;
    }

    @Override
    public void transformIfNeeded(@NonNull AffineTransform rootTransform) {
        for (SvgNode p : mChildren) {
            p.transformIfNeeded(rootTransform);
        }
    }

    @Override
    public void flatten(@NonNull AffineTransform transform) {
        for (SvgNode node : mChildren) {
            mStackedTransform.setTransform(transform);
            mStackedTransform.concatenate(mLocalTransform);
            node.flatten(mStackedTransform);
        }
    }

    @Override
    public void validate() {
        for (SvgNode node : mChildren) {
            node.validate();
        }
    }

    @Override
    public void writeXml(@NonNull OutputStreamWriter writer, @NonNull String indent)
            throws IOException {
        for (SvgNode node : mChildren) {
            node.writeXml(writer, indent);
        }
    }

    @Override
    public VisitResult accept(@NonNull Visitor visitor) {
        VisitResult result = visitor.visit(this);
        if (result == VisitResult.CONTINUE) {
            for (SvgNode node : mChildren) {
                if (node.accept(visitor) == VisitResult.ABORT) {
                    return VisitResult.ABORT;
                }
            }
        }
        return result == VisitResult.SKIP_CHILDREN ? VisitResult.CONTINUE : result;
    }


    @Override
    public void fillPresentationAttributes(@NonNull String name, @NonNull String value) {
        super.fillPresentationAttributes(name, value);
        for (SvgNode n : mChildren) {
            // Group presentation attribute should not override child.
            if (!n.mVdAttributesMap.containsKey(name)) {
                n.fillPresentationAttributes(name, value);
            }
        }
    }
}
