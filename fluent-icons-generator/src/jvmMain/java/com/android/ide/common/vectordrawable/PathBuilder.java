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

import static com.android.utils.XmlUtils.formatFloatValue;

/** Builds a string for SVG file's path data. */
public class PathBuilder {
    private StringBuilder mPathData = new StringBuilder();

    private static char encodeBoolean(boolean flag) {
        return flag ? '1' : '0';
    }

    public PathBuilder absoluteMoveTo(double x, double y) {
        mPathData.append('M').append(formatFloatValue(x)).append(',').append(formatFloatValue(y));
        return this;
    }

    public PathBuilder relativeMoveTo(double x, double y) {
        mPathData.append('m').append(formatFloatValue(x)).append(',').append(formatFloatValue(y));
        return this;
    }

    public PathBuilder absoluteLineTo(double x, double y) {
        mPathData.append('L').append(formatFloatValue(x)).append(',').append(formatFloatValue(y));
        return this;
    }

    public PathBuilder relativeLineTo(double x, double y) {
        mPathData.append('l').append(formatFloatValue(x)).append(',').append(formatFloatValue(y));
        return this;
    }

    public PathBuilder absoluteVerticalTo(double v) {
        mPathData.append('V').append(formatFloatValue(v));
        return this;
    }

    public PathBuilder relativeVerticalTo(double v) {
        mPathData.append('v').append(formatFloatValue(v));
        return this;
    }

    public PathBuilder absoluteHorizontalTo(double h) {
        mPathData.append('H').append(formatFloatValue(h));
        return this;
    }

    public PathBuilder relativeHorizontalTo(double h) {
        mPathData.append('h').append(formatFloatValue(h));
        return this;
    }

    public PathBuilder absoluteCurveTo(
            double cp1x, double cp1y, double cp2x, double cp2y, double x, double y) {
        mPathData
                .append('C')
                .append(formatFloatValue(cp1x))
                .append(',')
                .append(formatFloatValue(cp1y))
                .append(',')
                .append(formatFloatValue(cp2x))
                .append(',')
                .append(formatFloatValue(cp2y))
                .append(',')
                .append(formatFloatValue(x))
                .append(',')
                .append(formatFloatValue(y));
        return this;
    }

    public PathBuilder relativeCurveTo(
            double cp1x, double cp1y, double cp2x, double cp2y, double x, double y) {
        mPathData
                .append('c')
                .append(formatFloatValue(cp1x))
                .append(',')
                .append(formatFloatValue(cp1y))
                .append(',')
                .append(formatFloatValue(cp2x))
                .append(',')
                .append(formatFloatValue(cp2y))
                .append(',')
                .append(formatFloatValue(x))
                .append(',')
                .append(formatFloatValue(y));
        return this;
    }

    public PathBuilder absoluteSmoothCurveTo(double cp2x, double cp2y, double x, double y) {
        mPathData
                .append('S')
                .append(formatFloatValue(cp2x))
                .append(',')
                .append(formatFloatValue(cp2y))
                .append(',')
                .append(formatFloatValue(x))
                .append(',')
                .append(formatFloatValue(y));
        return this;
    }

    public PathBuilder relativeSmoothCurveTo(double cp2x, double cp2y, double x, double y) {
        mPathData
                .append('s')
                .append(formatFloatValue(cp2x))
                .append(',')
                .append(formatFloatValue(cp2y))
                .append(',')
                .append(formatFloatValue(x))
                .append(',')
                .append(formatFloatValue(y));
        return this;
    }

    public PathBuilder absoluteQuadraticCurveTo(double cp1x, double cp1y, double x, double y) {
        mPathData
                .append('Q')
                .append(formatFloatValue(cp1x))
                .append(',')
                .append(formatFloatValue(cp1y))
                .append(',')
                .append(formatFloatValue(x))
                .append(',')
                .append(formatFloatValue(y));
        return this;
    }

    public PathBuilder relativeQuadraticCurveTo(double cp1x, double cp1y, double x, double y) {
        mPathData
                .append('q')
                .append(formatFloatValue(cp1x))
                .append(',')
                .append(formatFloatValue(cp1y))
                .append(',')
                .append(formatFloatValue(x))
                .append(',')
                .append(formatFloatValue(y));
        return this;
    }

    public PathBuilder absoluteSmoothQuadraticCurveTo(double x, double y) {
        mPathData.append('T').append(formatFloatValue(x)).append(',').append(formatFloatValue(y));
    return this;
  }

    public PathBuilder relativeSmoothQuadraticCurveTo(double x, double y) {
        mPathData.append('t').append(formatFloatValue(x)).append(',').append(formatFloatValue(y));
        return this;
    }

    public PathBuilder absoluteArcTo(
            double rx,
            double ry,
            boolean rotation,
            boolean largeArc,
            boolean sweep,
            double x,
            double y) {
        mPathData
                .append('A')
                .append(formatFloatValue(rx))
                .append(',')
                .append(formatFloatValue(ry))
                .append(',')
                .append(encodeBoolean(rotation))
                .append(',')
                .append(encodeBoolean(largeArc))
                .append(',')
                .append(encodeBoolean(sweep))
                .append(',')
                .append(formatFloatValue(x))
                .append(',')
                .append(formatFloatValue(y));
        return this;
    }

    public PathBuilder relativeArcTo(
            double rx,
            double ry,
            boolean rotation,
            boolean largeArc,
            boolean sweep,
            double x,
            double y) {
        mPathData
                .append('a')
                .append(formatFloatValue(rx))
                .append(',')
                .append(formatFloatValue(ry))
                .append(',')
                .append(encodeBoolean(rotation))
                .append(',')
                .append(encodeBoolean(largeArc))
                .append(',')
                .append(encodeBoolean(sweep))
                .append(',')
                .append(formatFloatValue(x))
                .append(',')
                .append(formatFloatValue(y));
        return this;
    }

    public PathBuilder absoluteClose() {
        mPathData.append('Z');
        return this;
    }

    public PathBuilder relativeClose() {
        mPathData.append('z');
        return this;
    }

    /** Returns true if the PathBuilder doesn't contain any data. */
    public boolean isEmpty() {
        return mPathData.length() == 0;
    }

    public String toString() {
    return mPathData.toString();
  }
}