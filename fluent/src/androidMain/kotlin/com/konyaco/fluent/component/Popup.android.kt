package com.konyaco.fluent.component

import androidx.compose.runtime.*
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties

@Composable
internal actual fun Popup(
    popupPositionProvider: PopupPositionProvider,
    onDismissRequest: (() -> Unit)?,
    properties: PopupProperties,
    onPreviewKeyEvent: ((KeyEvent) -> Boolean)?,
    onKeyEvent: ((KeyEvent) -> Boolean)?,
    content: @Composable () -> Unit
) {
    val offset = LocalPopupOffset.current
    val delegatePopupPositionProvider = remember(popupPositionProvider) {
        DelegatePopupPositionProvider({ offset }, popupPositionProvider)
    }
    androidx.compose.ui.window.Popup(delegatePopupPositionProvider, onDismissRequest, properties) {
        CompositionLocalProvider(
            LocalPopupOffset provides delegatePopupPositionProvider.currentOffset,
            content = content
        )
    }
}

// Workaround for android nested popup position calculate
private val LocalPopupOffset = staticCompositionLocalOf { IntOffset.Zero }

private class DelegatePopupPositionProvider(
    val offset: () -> IntOffset,
    val positionProvider: PopupPositionProvider
): PopupPositionProvider {

    var currentOffset by mutableStateOf(IntOffset.Zero)

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        return positionProvider.calculatePosition(
            anchorBounds.translate(offset()),
            windowSize,
            layoutDirection,
            popupContentSize
        ).apply {
            currentOffset = this
        }
    }
}