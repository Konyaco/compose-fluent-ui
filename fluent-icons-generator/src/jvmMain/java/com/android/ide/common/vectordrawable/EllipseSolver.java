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

import static java.lang.Math.atan;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.logging.Level;
import java.util.logging.Logger;

class EllipseSolver {
    // Final results:
    private float mMajorAxis;
    private float mMinorAxis;
    private float mRotationDegree;
    private boolean mDirectionChanged;

    /**
     * Constructs the solver with all necessary parameters, and all the output values will
     * be ready after this constructor is called.
     * <p>
     * Note that all the x y values are in absolute coordinates, such that we can apply
     * the transform directly.
     */
    public EllipseSolver(AffineTransform totalTransform, float currentX, float currentY,
            float rx, float ry, float xAxisRotation, float largeArcFlag, float sweepFlag,
            float destX, float destY) {
        if (rx == 0 || ry == 0) {
            // From https://www.w3.org/TR/SVG11/implnote.html#ArcOutOfRangeParameters:
            // "If rx = 0 or ry = 0 then this arc is treated as a straight line segment
            // (a "lineto") joining the endpoints."
            return;
        }
        boolean largeArc = largeArcFlag != 0;
        boolean sweep = sweepFlag != 0;

        // Compute the cx and cy first.
        Point2D.Double originalCenter = computeOriginalCenter(currentX, currentY, rx, ry,
                xAxisRotation, largeArc, sweep, destX, destY);

        // Compute 3 points from original ellipse.
        Point2D.Double majorAxisPoint = new Point2D.Double(rx, 0);
        Point2D.Double minorAxisPoint = new Point2D.Double(0, ry);

        majorAxisPoint = rotatePoint2D(majorAxisPoint, xAxisRotation);
        minorAxisPoint = rotatePoint2D(minorAxisPoint, xAxisRotation);

        majorAxisPoint.x += originalCenter.x;
        majorAxisPoint.y += originalCenter.y;

        minorAxisPoint.x += originalCenter.x;
        minorAxisPoint.y += originalCenter.y;

        double middleRadians = Math.PI / 4; // This number can be anything between 0 and PI/2.
        double middleR = rx * ry / Math.hypot(ry * cos(middleRadians), rx * sin(middleRadians));

        Point2D.Double middlePoint =
            new Point2D.Double(middleR * cos(middleRadians),middleR * sin(middleRadians));
        middlePoint = rotatePoint2D(middlePoint, xAxisRotation);
        middlePoint.x += originalCenter.x;
        middlePoint.y += originalCenter.y;

        // Transform 3 points and center point into destination.
        Point2D.Double mDstMiddlePoint =
            (Point2D.Double) totalTransform.transform(middlePoint, null);
        Point2D.Double mDstMajorAxisPoint =
            (Point2D.Double) totalTransform.transform(majorAxisPoint, null);
        Point2D.Double mDstMinorAxisPoint =
            (Point2D.Double) totalTransform.transform(minorAxisPoint, null);
        Point2D dstCenter = totalTransform.transform(originalCenter, null);
        double dstCenterX = dstCenter.getX();
        double dstCenterY = dstCenter.getY();

        // Compute the relative 3 points:
        double relativeDstMiddleX = mDstMiddlePoint.x - dstCenterX;
        double relativeDstMiddleY = mDstMiddlePoint.y - dstCenterY;
        double relativeDstMajorAxisPointX = mDstMajorAxisPoint.x - dstCenterX;
        double relativeDstMajorAxisPointY = mDstMajorAxisPoint.y - dstCenterY;
        double relativeDstMinorAxisPointX = mDstMinorAxisPoint.x - dstCenterX;
        double relativeDstMinorAxisPointY = mDstMinorAxisPoint.y - dstCenterY;

        // Check if the direction has changed.
        mDirectionChanged = computeDirectionChange(middlePoint, majorAxisPoint, minorAxisPoint,
                mDstMiddlePoint, mDstMajorAxisPoint, mDstMinorAxisPoint);

        // From 3 dest points, recompute the a, b and theta.
        if (computeABThetaFromControlPoints(relativeDstMiddleX, relativeDstMiddleY,
                relativeDstMajorAxisPointX, relativeDstMajorAxisPointY,
                relativeDstMinorAxisPointX, relativeDstMinorAxisPointY)) {
            getLog().log(Level.WARNING, "Early return in the ellipse transformation computation!");
        }
    }

    private static Logger getLog() {
        return Logger.getLogger(EllipseSolver.class.getSimpleName());
    }

    /**
     * After a random transformation, the controls points may change its direction, left handed <->
     * right handed. In this case, we better flip the flag for the ArcTo command.
     *
     * Here, we use the cross product to figure out the direction of the 3 control points for the
     * src and dst ellipse.
     */
    private static boolean computeDirectionChange(Point2D.Double middlePoint,
            Point2D.Double majorAxisPoint, Point2D.Double minorAxisPoint,
            Point2D.Double dstMiddlePoint, Point2D.Double dstMajorAxisPoint,
            Point2D.Double dstMinorAxisPoint) {
        // Compute both cross product, then compare the sign.
        double srcCrossProduct = getCrossProduct(middlePoint, majorAxisPoint, minorAxisPoint);
        double dstCrossProduct = getCrossProduct(dstMiddlePoint, dstMajorAxisPoint,
                dstMinorAxisPoint);

        return srcCrossProduct * dstCrossProduct < 0;
    }

    private static double getCrossProduct(Point2D.Double middlePoint, Point2D.Double majorAxisPoint,
            Point2D.Double minorAxisPoint) {
        double majorMinusMiddleX = majorAxisPoint.x - middlePoint.x;
        double majorMinusMiddleY = majorAxisPoint.y - middlePoint.y;

        double minorMinusMiddleX = minorAxisPoint.x - middlePoint.x;
        double minorMinusMiddleY = minorAxisPoint.y - middlePoint.y;

        return majorMinusMiddleX * minorMinusMiddleY - majorMinusMiddleY * minorMinusMiddleX;
    }

    /**
     * Returns true if there is an error, either due to the ellipse not being specified
     * correctly or some computation error. This error is ignorable, but the output ellipse
     * will not be correct.
     */
    private boolean computeABThetaFromControlPoints(double relMiddleX, double relMiddleY,
            double relativeMajorAxisPointX, double relativeMajorAxisPointY,
            double relativeMinorAxisPointX, double relativeMinorAxisPointY) {
        double m11 = relMiddleX * relMiddleX;
        double m12 = relMiddleX * relMiddleY;
        double m13 = relMiddleY * relMiddleY;

        double m21 = relativeMajorAxisPointX * relativeMajorAxisPointX;
        double m22 = relativeMajorAxisPointX * relativeMajorAxisPointY;
        double m23 = relativeMajorAxisPointY * relativeMajorAxisPointY;

        double m31 = relativeMinorAxisPointX * relativeMinorAxisPointX;
        double m32 = relativeMinorAxisPointX * relativeMinorAxisPointY;
        double m33 = relativeMinorAxisPointY * relativeMinorAxisPointY;

        double det = -(m13 * m22 * m31 - m12 * m23 * m31 - m13 * m21 * m32
                + m11 * m23 * m32 + m12 * m21 * m33 - m11 * m22 * m33);

        if (det == 0) {
            return true;
        }
        double A = (-m13 * m22 + m12 * m23 + m13 * m32 - m23 * m32 - m12 * m33 + m22 * m33)
                / det;
        double B = (m13 * m21 - m11 * m23 - m13 * m31 + m23 * m31 + m11 * m33 - m21 * m33) / det;
        double C = (m12 * m21 - m11 * m22 - m12 * m31 + m22 * m31 + m11 * m32 - m21 * m32)
                / (-det);

        // Now we know A = cos(t)^2 / a^2 + sin(t)^2 / b^2
        // B = -2 cos(t) sin(t) (1/a^2 - 1/b^2)
        // C = sin(t)^2 / a^2 + cos(t)^2 / b^2

        // Solve it, we got
        // 2*t = arctan ( B / (A - C));
        if (A - C == 0) {
            // We know that a == b now.
            mMinorAxis = (float) Math.hypot(relativeMajorAxisPointX, relativeMajorAxisPointY);
            mMajorAxis = mMinorAxis;
            mRotationDegree = 0;
            return false;
        }

        double doubleThetaInRadians = atan(B / (A - C));
        double thetaInRadians = doubleThetaInRadians / 2;
        if (sin(doubleThetaInRadians) == 0) {
            mMinorAxis = (float) sqrt(1 / C);
            mMajorAxis = (float) sqrt(1 / A);
            mRotationDegree = 0;
            // This is a valid answer, so return false.
            return false;
        }

        double bSqInv = (A + C + B / sin(doubleThetaInRadians)) / 2;
        double aSqInv = A + C - bSqInv;

        if (bSqInv == 0 || aSqInv == 0) {
            return true;
        }
        mMinorAxis = (float) sqrt(1 / bSqInv);
        mMajorAxis = (float) sqrt(1 / aSqInv);

        mRotationDegree = (float) Math.toDegrees(Math.PI / 2 + thetaInRadians);
        return false;
    }

    private static Point2D.Double computeOriginalCenter(float x1, float y1, float rx, float ry,
            float phi, boolean largeArc, boolean sweep, float x2, float y2) {
        double cosPhi = cos(phi);
        double sinPhi = sin(phi);
        double xDelta = (x1 - x2) / 2;
        double yDelta = (y1 - y2) / 2;
        double tempX1 = cosPhi * xDelta + sinPhi * yDelta;
        double tempY1 = -sinPhi * xDelta + cosPhi * yDelta;

        double rxSq = rx * rx;
        double rySq = ry * ry;
        double tempX1Sq = tempX1 * tempX1;
        double tempY1Sq = tempY1 * tempY1;

        double tempCenterFactor = rxSq * rySq - rxSq * tempY1Sq - rySq * tempX1Sq;
        tempCenterFactor /= rxSq * tempY1Sq + rySq * tempX1Sq;
        if (tempCenterFactor < 0) {
            tempCenterFactor = 0;
        }
        tempCenterFactor = sqrt(tempCenterFactor);
        if (largeArc == sweep) {
            tempCenterFactor = -tempCenterFactor;
        }
        double tempCx = tempCenterFactor * rx * tempY1 / ry;
        double tempCy = -tempCenterFactor * ry * tempX1 / rx;

        double xCenter = (x1 + x2) / 2;
        double yCenter = (y1 + y2) / 2;

        return new Point2D.Double(cosPhi * tempCx - sinPhi * tempCy + xCenter,
                sinPhi * tempCx + cosPhi * tempCy + yCenter);
    }

    public float getMajorAxis() {
        return mMajorAxis;
    }

    public float getMinorAxis() {
        return mMinorAxis;
    }

    public float getRotationDegree() {
        return mRotationDegree;
    }

    public boolean getDirectionChanged() {
        return mDirectionChanged;
    }

    /**
     * Rotates a point by the given angle.
     *
     * @param inPoint the point to rotate
     * @param radians the rotation angle in radians
     * @return the rotated point
     */
    private static Point2D.Double rotatePoint2D(Point2D.Double inPoint, double radians) {
        double cos = cos(radians);
        double sin = sin(radians);
        return new Point2D.Double(inPoint.x * cos - inPoint.y * sin,
                inPoint.x * sin + inPoint.y * cos);
    }
}
