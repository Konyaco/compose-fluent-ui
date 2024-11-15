package com.konyaco.fluent.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun HorizontalIndicatorContentLayout(
    modifier: Modifier = Modifier,
    icon: @Composable (() -> Unit)?,
    text: @Composable (() -> Unit)?,
    trailing: @Composable (() -> Unit)?,
    indicator: @Composable () -> Unit,
) {
    Box(
        modifier = modifier.padding(horizontal = 12.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.align(Alignment.Center)
        ) {
            icon?.invoke()
            text?.invoke()
            trailing?.invoke()
        }
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier
                .matchParentSize()
        ) {
            indicator()
        }
    }
}