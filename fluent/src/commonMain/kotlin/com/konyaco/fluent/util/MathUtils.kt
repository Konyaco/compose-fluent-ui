package com.konyaco.fluent.util

import kotlin.math.round


internal object MathUtils {
    fun degreesToRadians(degrees: Double): Double {
        return degrees * (Math.PI / 180.0)
    }

    fun clampToUnit(c: Double): Double {
        if (c.isNaN()) {
            return 0.0
        } else if (c == Double.POSITIVE_INFINITY) {
            return 1.0
        } else if (c == Double.NEGATIVE_INFINITY) {
            return 0.0
        }
        if (c <= 0) {
            return 0.0
        } else if (c >= 1) {
            return 1.0
        } else {
            return c;
        }
    }

    fun radiansToDegrees(radians: Double): Double {
        return radians * (180.0 / Math.PI)
    }

    fun lerp(left: Double, right: Double, scale: Double): Double {
        if (scale <= 0) {
            return left
        } else if (scale >= 1) {
            return right
        }
        return left + scale * (right - left)
    }

    fun lerp(left: Int, right: Int, scale: Double): Int {
        if (scale <= 0) {
            return left
        } else if (scale >= 1) {
            return right
        }
        val l = left.toDouble()
        val r = right.toDouble()
        return round(l + scale * (r - l)).toInt()
    }

    fun clampToByte(c: Double): Int {
        if (c.isNaN()) {
            return 0
        } else if (c == Double.POSITIVE_INFINITY) {
            return 255;
        } else if (c == Double.NEGATIVE_INFINITY) {
            return 0;
        }
        val c = kotlin.math.round(c)
        if (c <= 0) {
            return 0;
        } else if (c >= 255) {
            return 255;
        } else {
            return c.toInt()
        }
    }
}