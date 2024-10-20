package com.konyaco.fluent.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection

internal fun Arrangement.alignLast(
    arrangement: Arrangement.Horizontal,
    alignment: Alignment.Horizontal
): Arrangement.Horizontal = AlignLastArrangement(arrangement, alignment)

@Immutable
private data class AlignLastArrangement(
    private val arrangement: Arrangement.Horizontal,
    private val alignment: Alignment.Horizontal,
) : Arrangement.Horizontal {
    override val spacing: Dp
        get() = arrangement.spacing

    override fun Density.arrange(
        totalSize: Int,
        sizes: IntArray,
        layoutDirection: LayoutDirection,
        outPositions: IntArray
    ) {
        with(arrangement) {
            arrange(totalSize, sizes, layoutDirection, outPositions)
        }
        if (sizes.size < 2) return
        outPositions[outPositions.lastIndex] =
            alignment.align(sizes.last(), totalSize, layoutDirection)

    }
}