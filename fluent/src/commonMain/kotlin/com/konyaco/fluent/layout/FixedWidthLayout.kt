package com.konyaco.fluent.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.util.fastMap
import androidx.compose.ui.util.fastMaxOfOrNull
import kotlin.collections.component1
import kotlin.collections.component2
import kotlin.math.roundToInt

@Composable
internal fun FixedWidthLayout(
    header: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    intrinsicSize: IntrinsicSize = IntrinsicSize.Max,
    content: @Composable () -> Unit,
) {
    Layout(
        contents = listOf(
            header,
            content
        ),
        modifier = modifier
    ) { (header, content), constraints ->
        val isMax = intrinsicSize == IntrinsicSize.Max
        val contentMinWidth = content.fastMaxOfOrNull {
            if (isMax) {
                it.maxIntrinsicWidth(constraints.maxHeight)
            } else {
                it.minIntrinsicWidth(constraints.maxHeight)
            }
        } ?: 0
        val headerConstraints = constraints.copy(minWidth = minOf(contentMinWidth, constraints.maxWidth))
        var headerWidth = 0
        var headerHeight = 0
        val headerPlaceables = header.fastMap {
            it.measure(headerConstraints).apply {
                headerWidth = maxOf(headerWidth, width)
                headerHeight = maxOf(headerHeight, height)
            }
        }
        val contentConstraints = Constraints.fixedWidth(headerWidth)
        var sum = 0
        val contentPlaceables = content.fastMap {
            it.measure(contentConstraints).apply {
                sum += height
            }
        }
        val spacing = verticalArrangement.spacing.toPx()
        layout(headerWidth, (headerHeight + sum + contentPlaceables.size * spacing).roundToInt()) {
            headerPlaceables.forEach {
                it.place(0, 0)
            }
            var offset = headerHeight + spacing
            contentPlaceables.forEach {
                it.place(x = 0, y = offset.roundToInt())
                offset += it.height + spacing
            }
        }
    }
}