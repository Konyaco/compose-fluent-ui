package com.konyaco.fluent.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme

@Composable
actual fun ColumnWithScrollBar(
    modifier: Modifier,
    scrollState: ScrollState,
    verticalArrangement: Arrangement.Vertical,
    horizontalAlignment: Alignment.Horizontal,
    content: @Composable ColumnScope.() -> Unit
) {
    Box(modifier) {
        Column(
            modifier = Modifier.fillMaxSize().verticalScroll(scrollState),
            verticalArrangement = verticalArrangement,
            horizontalAlignment = horizontalAlignment
        ) {
            content()
        }
        
        // TODO: Fluent scrollbar
        val interactionSource = remember { MutableInteractionSource() }
        val hovered by interactionSource.collectIsHoveredAsState()
        val pressed by interactionSource.collectIsPressedAsState()
        val thickness by animateDpAsState(if (hovered || pressed) 6.dp else 2.dp)

        VerticalScrollbar(
            rememberScrollbarAdapter(scrollState),
            Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
            style = ScrollbarStyle(
                thickness = thickness,
                unhoverColor = FluentTheme.colors.stroke.controlStrong.default,
                hoverColor = FluentTheme.colors.stroke.controlStrong.default,
                shape = CircleShape,
                hoverDurationMillis = 300,
                minimalHeight = 16.dp
            ),
            interactionSource = interactionSource
        )
    }
}
