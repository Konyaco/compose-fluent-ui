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

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.ZeroCornerSize

import androidx.compose.runtime.Stable
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.platform.InspectableValue
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp

/**
 * Defines size of a corner in pixels. For example for rounded shape it can be a corner radius.
 */
@Deprecated(
    message = "Use CornerSize instead",
    replaceWith = ReplaceWith(
        expression = "CornerSize",
        imports = arrayOf("androidx.compose.foundation.shape.CornerSize")
    )
)
typealias FluentCornerSize = CornerSize

/**
 * Creates [CornerSize] with provided size.
 * @param size the corner size defined in [Dp].
 */
@Deprecated(
    message = "Use CornerSize instead",
    replaceWith = ReplaceWith(
        expression = "CornerSize(size = size)",
        imports = arrayOf("androidx.compose.foundation.shape.CornerSize")
    )
)
@Stable
fun FluentCornerSize(size: Dp): FluentCornerSize = CornerSize(size)

@Deprecated(
    message = "Use CornerSize instead",
    replaceWith = ReplaceWith(
        expression = "CornerSize(size = size)",
        imports = arrayOf("androidx.compose.foundation.shape.CornerSize")
    )
)
data class FluentDpCornerSize(val size: Dp) : FluentCornerSize, InspectableValue {
    override fun toPx(shapeSize: Size, density: Density) =
        with(density) { size.toPx() }

    override fun toString(): String = "CornerSize(size = ${size.value}.dp)"

    override val valueOverride: Dp
        get() = size
}

/**
 * Creates [CornerSize] with provided size.
 * @param size the corner size defined in pixels.
 */
@Deprecated(
    message = "Use CornerSize instead",
    replaceWith = ReplaceWith(
        expression = "CornerSize(size = size)",
        imports = arrayOf("androidx.compose.foundation.shape.CornerSize")
    )
)
@Stable
fun FluentCornerSize(size: Float): FluentCornerSize = CornerSize(size)

@Deprecated(
    message = "Use CornerSize instead",
    replaceWith = ReplaceWith(
        expression = "CornerSize(size = size)",
        imports = arrayOf("androidx.compose.foundation.shape.CornerSize")
    )
)
data class FluentPxCornerSize(val size: Float) : FluentCornerSize, InspectableValue {
    override fun toPx(shapeSize: Size, density: Density) = size

    override fun toString(): String = "CornerSize(size = $size.px)"

    override val valueOverride: String
        get() = "${size}px"
}

/**
 * Creates [CornerSize] with provided size.
 * @param percent the corner size defined in percents of the shape's smaller side.
 * Can't be negative or larger then 100 percents.
 */
@Deprecated(
    message = "Use CornerSize instead",
    replaceWith = ReplaceWith(
        expression = "CornerSize(percent = percent)",
        imports = arrayOf("androidx.compose.foundation.shape.CornerSize")
    )
)
@Stable
fun FluentCornerSize(/*@IntRange(from = 0, to = 100)*/ percent: Int): FluentCornerSize = CornerSize(percent)

/**
 * Creates [CornerSize] with provided size.
 * @param percent the corner size defined in float percents of the shape's smaller side.
 * Can't be negative or larger then 100 percents.
 */
@Deprecated(
    message = "Use CornerSize instead",
    replaceWith = ReplaceWith(
        expression = "CornerSize(percent = percent)",
        imports = arrayOf("androidx.compose.foundation.shape.CornerSize")
    )
)
data class FluentPercentCornerSize(
    /*@FloatRange(from = 0.0, to = 100.0)*/
    val percent: Float
) : FluentCornerSize, InspectableValue {
    init {
        if (percent < 0 || percent > 100) {
            throw IllegalArgumentException("The percent should be in the range of [0, 100]")
        }
    }

    override fun toPx(shapeSize: Size, density: Density) =
        shapeSize.minDimension * (percent / 100f)

    override fun toString(): String = "CornerSize(size = $percent%)"

    override val valueOverride: String
        get() = "$percent%"
}

/**
 * [CornerSize] always equals to zero.
 */
@Deprecated(
    message = "Use ZeroCornerSize instead",
    replaceWith = ReplaceWith(
        expression = "ZeroCornerSize",
        imports = arrayOf("androidx.compose.foundation.shape.ZeroCornerSize")
    )
)
@Stable
val FluentZeroCornerSize: FluentCornerSize
    get() = ZeroCornerSize
