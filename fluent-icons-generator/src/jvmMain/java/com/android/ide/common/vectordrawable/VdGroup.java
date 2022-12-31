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

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.NamedNodeMap;

/**
 * Used to represent one VectorDrawble's group element.
 */
class VdGroup extends VdElement{
    private static final Logger logger = Logger.getLogger(VdGroup.class.getSimpleName());

    private static final String GROUP_ROTATION = "android:rotation";
    private static final String GROUP_PIVOTX = "android:pivotX";
    private static final String GROUP_PIVOTY = "android:pivotY";
    private static final String GROUP_TRANSLATEX = "android:translateX";
    private static final String GROUP_TRANSLATEY = "android:translateY";
    private static final String GROUP_SCALEX = "android:scaleX";
    private static final String GROUP_SCALEY = "android:scaleY";
    private static final String GROUP_NAME = "android:name";

    private float mRotate = 0;
    private float mPivotX = 0;
    private float mPivotY = 0;
    private float mScaleX = 1;
    private float mScaleY = 1;
    private float mTranslateX = 0;
    private float mTranslateY = 0;

    // Used at draw time, basically accumulative matrix from root to current group.
    private final AffineTransform mTempStackedMatrix = new AffineTransform();

    // The current group's transformation.
    private final AffineTransform mLocalMatrix = new AffineTransform();

    // Children can be either a {@link VdPath} or {@link VdGroup}
    private final ArrayList<VdElement> mChildren = new ArrayList<>();

    public void add(VdElement pathOrGroup) {
        mChildren.add(pathOrGroup);
    }

    public ArrayList<VdElement> getChildren() {
        return mChildren;
    }

    public int size() {
        return mChildren.size();
    }

    // Src = trans * src, this is called preConcatenate() in Swing, but postConcatenate() in Android
    private static void androidPostTransform(AffineTransform src, AffineTransform trans) {
        src.preConcatenate(trans);
    }

    private void updateLocalMatrix() {
        // The order we apply is the same as the
        // RenderNode.cpp::applyViewPropertyTransforms().
        mLocalMatrix.setToIdentity();

        // In Android framework, the transformation is applied in
        // VectorDrawable.java VGroup::updateLocalMatrix()
        AffineTransform tempTrans = new AffineTransform();
        tempTrans.setToIdentity();
        tempTrans.translate(-mPivotX, -mPivotY);
        androidPostTransform(mLocalMatrix, tempTrans);

        tempTrans.setToIdentity();
        tempTrans.scale(mScaleX, mScaleY);
        androidPostTransform(mLocalMatrix, tempTrans);

        tempTrans.setToIdentity();
        tempTrans.rotate(mRotate * 3.1415926 / 180, 0, 0);
        androidPostTransform(mLocalMatrix, tempTrans);

        tempTrans.setToIdentity();
        tempTrans.translate(mTranslateX + mPivotX, mTranslateY + mPivotY);
        androidPostTransform(mLocalMatrix, tempTrans);
    }

    @Override
    public void draw(Graphics2D g, AffineTransform currentMatrix, float scaleX, float scaleY) {
        // SWING default is pre-concatenate
        mTempStackedMatrix.setTransform(currentMatrix);
        mTempStackedMatrix.concatenate(mLocalMatrix);

        for (VdElement m : mChildren) {
            m.draw(g, mTempStackedMatrix, scaleX, scaleY);
        }

        // This only applies to the flattened SVG tree structure.
        // One clip-path applies to a single group.
        g.setClip(null);
    }

    private void setNameValue(String name, String value) {
        if (GROUP_ROTATION.equals(name)) {
            mRotate = Float.parseFloat(value);
        } else if (GROUP_PIVOTX.equals(name)) {
            mPivotX = Float.parseFloat(value);
        } else if (GROUP_PIVOTY.equals(name)) {
            mPivotY = Float.parseFloat(value);
        } else if (GROUP_TRANSLATEX.equals(name)) {
            mTranslateX = Float.parseFloat(value);
        } else if (GROUP_TRANSLATEY.equals(name)) {
            mTranslateY = Float.parseFloat(value);
        } else if (GROUP_SCALEX.equals(name)) {
            mScaleX = Float.parseFloat(value);
        } else if (GROUP_SCALEY.equals(name)) {
            mScaleY = Float.parseFloat(value);
        } else if (GROUP_NAME.equals(name)) {
            mName = value;
        } else {
            logger.log(Level.WARNING, ">>>>>> DID NOT UNDERSTAND ! \"" + name + "\" <<<<");
        }
    }

    @Override
    public void parseAttributes(NamedNodeMap attributes) {
        int len = attributes.getLength();
        for (int i = 0; i < len; i++) {
            String name = attributes.item(i).getNodeName();
            String value = attributes.item(i).getNodeValue();
            setNameValue(name, value);
        }

        updateLocalMatrix();
    }

    @Override
    public boolean isGroup() {
        return true;
    }

    @Override
    public String toString() {
        return "Group:" +
                " Name: " +
                mName +
                " mTranslateX: " +
                mTranslateX +
                " mTranslateY:" +
                mTranslateY +
                " mScaleX:" +
                mScaleX +
                " mScaleY:" +
                mScaleY +
                " mPivotX:" +
                mPivotX +
                " mPivotY:" +
                mPivotY +
                " mRotate:" +
                mRotate;
    }
}
