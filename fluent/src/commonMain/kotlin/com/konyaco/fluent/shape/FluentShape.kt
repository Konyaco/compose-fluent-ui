/*
 * Note: This is an modified version of the original source code from the Android Open Source Project, in order to solve several bugs.
 * These code should be synchronized with the original source code.
 *
 * Copyright 2020 The Android Open Source Project
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
package com.konyaco.fluent.shape

import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.toRect
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

/**
 * A shape describing the rectangle with rounded corners.
 *
 * This shape will automatically mirror the corner sizes in [LayoutDirection.Rtl], use
 * [AbsoluteRoundedCornerShape] for the layout direction unaware version of this shape.
 *
 * @param topStart a size of the top start corner
 * @param topEnd a size of the top end corner
 * @param bottomEnd a size of the bottom end corner
 * @param bottomStart a size of the bottom start corner
 */
class FluentRoundedCornerShape(
    topStart: FluentCornerSize,
    topEnd: FluentCornerSize,
    bottomEnd: FluentCornerSize,
    bottomStart: FluentCornerSize
) : CornerBasedShape(
    topStart = topStart,
    topEnd = topEnd,
    bottomEnd = bottomEnd,
    bottomStart = bottomStart
) {
    val fluentTopStart = topStart
    val fluentTopEnd = topEnd
    val fluentBottomEnd = bottomEnd
    val fluentBottomStart = bottomStart

    override fun createOutline(
        size: Size,
        topStart: Float,
        topEnd: Float,
        bottomEnd: Float,
        bottomStart: Float,
        layoutDirection: LayoutDirection
    ) = if (topStart + topEnd + bottomEnd + bottomStart == 0.0f) {
        Outline.Rectangle(size.toRect())
    } else {
        Outline.Rounded(
            RoundRect(
                rect = size.toRect(),
                topLeft = CornerRadius(if (layoutDirection == LayoutDirection.Ltr) topStart else topEnd),
                topRight = CornerRadius(if (layoutDirection == LayoutDirection.Ltr) topEnd else topStart),
                bottomRight = CornerRadius(if (layoutDirection == LayoutDirection.Ltr) bottomEnd else bottomStart),
                bottomLeft = CornerRadius(if (layoutDirection == LayoutDirection.Ltr) bottomStart else bottomEnd)
            )
        )
    }

    override fun copy(
        topStart: CornerSize,
        topEnd: CornerSize,
        bottomEnd: CornerSize,
        bottomStart: CornerSize
    ): CornerBasedShape = FluentRoundedCornerShape(
        topStart = topStart as FluentCornerSize,
        topEnd = topEnd as FluentCornerSize,
        bottomEnd = bottomEnd as FluentCornerSize,
        bottomStart = bottomStart as FluentCornerSize
    )

    override fun toString(): String {
        return "FluentRoundedCornerShape(topStart = $topStart, topEnd = $topEnd, bottomEnd = " +
                "$bottomEnd, bottomStart = $bottomStart)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FluentRoundedCornerShape) return false

        if (topStart != other.topStart) return false
        if (topEnd != other.topEnd) return false
        if (bottomEnd != other.bottomEnd) return false
        if (bottomStart != other.bottomStart) return false

        return true
    }

    override fun hashCode(): Int {
        var result = topStart.hashCode()
        result = 31 * result + topEnd.hashCode()
        result = 31 * result + bottomEnd.hashCode()
        result = 31 * result + bottomStart.hashCode()
        return result
    }
}

/**
 * Circular [Shape] with all the corners sized as the 50 percent of the shape size.
 */
val FluentCircleShape = FluentRoundedCornerShape(50)

/**
 * Creates [RoundedCornerShape] with the same size applied for all four corners.
 * @param corner [FluentCornerSize] to apply.
 */
fun FluentRoundedCornerShape(corner: FluentCornerSize) =
    FluentRoundedCornerShape(corner, corner, corner, corner)

/**
 * Creates [RoundedCornerShape] with the same size applied for all four corners.
 * @param size Size in [Dp] to apply.
 */
fun FluentRoundedCornerShape(size: Dp) = FluentRoundedCornerShape(FluentCornerSize(size))

/**
 * Creates [RoundedCornerShape] with the same size applied for all four corners.
 * @param size Size in pixels to apply.
 */
fun FluentRoundedCornerShape(size: Float) = FluentRoundedCornerShape(FluentCornerSize(size))

/**
 * Creates [RoundedCornerShape] with the same size applied for all four corners.
 * @param percent Size in percents to apply.
 */
fun FluentRoundedCornerShape(percent: Int) =
    FluentRoundedCornerShape(FluentCornerSize(percent))

/**
 * Creates [RoundedCornerShape] with sizes defined in [Dp].
 */
fun FluentRoundedCornerShape(
    topStart: Dp = 0.dp,
    topEnd: Dp = 0.dp,
    bottomEnd: Dp = 0.dp,
    bottomStart: Dp = 0.dp
) = FluentRoundedCornerShape(
    topStart = FluentCornerSize(topStart),
    topEnd = FluentCornerSize(topEnd),
    bottomEnd = FluentCornerSize(bottomEnd),
    bottomStart = FluentCornerSize(bottomStart)
)

/**
 * Creates [RoundedCornerShape] with sizes defined in pixels.
 */
fun FluentRoundedCornerShape(
    topStart: Float = 0.0f,
    topEnd: Float = 0.0f,
    bottomEnd: Float = 0.0f,
    bottomStart: Float = 0.0f
) = FluentRoundedCornerShape(
    topStart = FluentCornerSize(topStart),
    topEnd = FluentCornerSize(topEnd),
    bottomEnd = FluentCornerSize(bottomEnd),
    bottomStart = FluentCornerSize(bottomStart)
)

/**
 * Creates [RoundedCornerShape] with sizes defined in percents of the shape's smaller side.
 *
 * @param topStartPercent The top start corner radius as a percentage of the smaller side, with a
 * range of 0 - 100.
 * @param topEndPercent The top end corner radius as a percentage of the smaller side, with a
 * range of 0 - 100.
 * @param bottomEndPercent The bottom end corner radius as a percentage of the smaller side,
 * with a range of 0 - 100.
 * @param bottomStartPercent The bottom start corner radius as a percentage of the smaller side,
 * with a range of 0 - 100.
 */
fun FluentRoundedCornerShape(
    /*@IntRange(from = 0, to = 100)*/
    topStartPercent: Int = 0,
    /*@IntRange(from = 0, to = 100)*/
    topEndPercent: Int = 0,
    /*@IntRange(from = 0, to = 100)*/
    bottomEndPercent: Int = 0,
    /*@IntRange(from = 0, to = 100)*/
    bottomStartPercent: Int = 0
) = FluentRoundedCornerShape(
    topStart = FluentCornerSize(topStartPercent),
    topEnd = FluentCornerSize(topEndPercent),
    bottomEnd = FluentCornerSize(bottomEndPercent),
    bottomStart = FluentCornerSize(bottomStartPercent)
)