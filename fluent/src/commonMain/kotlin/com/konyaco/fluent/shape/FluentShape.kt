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

import androidx.compose.foundation.shape.*
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
@Deprecated(
    message = "Use RoundedCornerShape instead",
    replaceWith = ReplaceWith(
        expression = "RoundedCornerShape(topStart = topStart, topEnd = topEnd, bottomEnd = bottomEnd, bottomStart = bottomStart)",
        imports = arrayOf("androidx.compose.foundation.shape.RoundedCornerShape")
    )
)
typealias FluentRoundedCornerShape = RoundedCornerShape

/**
 * Circular [Shape] with all the corners sized as the 50 percent of the shape size.
 */
@Deprecated(
    message = "Use CircleShape instead",
    replaceWith = ReplaceWith(
        expression = "CircleShape",
        imports = arrayOf("androidx.compose.foundation.shape.CircleShape")
    )
)
val FluentCircleShape: FluentRoundedCornerShape
    get() = CircleShape

/**
 * Creates [RoundedCornerShape] with the same size applied for all four corners.
 * @param corner [FluentCornerSize] to apply.
 */
@Deprecated(
    message = "Use RoundedCornerShape instead",
    replaceWith = ReplaceWith(
        expression = "RoundedCornerShape(corner = corner)",
        imports = arrayOf("androidx.compose.foundation.shape.RoundedCornerShape")
    )
)
fun FluentRoundedCornerShape(corner: FluentCornerSize) = RoundedCornerShape(corner, corner, corner, corner)

/**
 * Creates [RoundedCornerShape] with the same size applied for all four corners.
 * @param size Size in [Dp] to apply.
 */
@Deprecated(
    message = "Use RoundedCornerShape instead",
    replaceWith = ReplaceWith(
        expression = "RoundedCornerShape(size = size)",
        imports = arrayOf("androidx.compose.foundation.shape.RoundedCornerShape")
    )
)
fun FluentRoundedCornerShape(size: Dp) = RoundedCornerShape(CornerSize(size))

/**
 * Creates [RoundedCornerShape] with the same size applied for all four corners.
 * @param size Size in pixels to apply.
 */
@Deprecated(
    message = "Use RoundedCornerShape instead",
    replaceWith = ReplaceWith(
        expression = "RoundedCornerShape(size = size)",
        imports = arrayOf("androidx.compose.foundation.shape.RoundedCornerShape")
    )
)
fun FluentRoundedCornerShape(size: Float) = RoundedCornerShape(CornerSize(size))

/**
 * Creates [RoundedCornerShape] with the same size applied for all four corners.
 * @param percent Size in percents to apply.
 */
@Deprecated(
    message = "Use RoundedCornerShape instead",
    replaceWith = ReplaceWith(
        expression = "RoundedCornerShape(percent = percent)",
        imports = arrayOf("androidx.compose.foundation.shape.RoundedCornerShape")
    )
)
fun FluentRoundedCornerShape(percent: Int) = RoundedCornerShape(CornerSize(percent))

/**
 * Creates [RoundedCornerShape] with sizes defined in [Dp].
 */
@Deprecated(
    message = "Use RoundedCornerShape instead",
    replaceWith = ReplaceWith(
        expression = "RoundedCornerShape(topStart = topStart, topEnd = topEnd, bottomEnd = bottomEnd, bottomStart = bottomStart)",
        imports = arrayOf("androidx.compose.foundation.shape.RoundedCornerShape")
    )
)
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
@Deprecated(
    message = "Use RoundedCornerShape instead",
    replaceWith = ReplaceWith(
        expression = "RoundedCornerShape(topStart = topStart, topEnd = topEnd, bottomEnd = bottomEnd, bottomStart = bottomStart)",
        imports = arrayOf("androidx.compose.foundation.shape.RoundedCornerShape")
    )
)
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
@Deprecated(
    message = "Use RoundedCornerShape instead",
    replaceWith = ReplaceWith(
        expression = "RoundedCornerShape(topStartPercent = topStartPercent, topEndPercent = topEndPercent, bottomEndPercent = bottomEndPercent, bottomStartPercent = bottomStartPercent)",
        imports = arrayOf("androidx.compose.foundation.shape.RoundedCornerShape")
    )
)
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