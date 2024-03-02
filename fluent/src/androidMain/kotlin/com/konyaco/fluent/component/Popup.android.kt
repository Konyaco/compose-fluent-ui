package com.konyaco.fluent.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.input.key.KeyEvent
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
) = androidx.compose.ui.window.Popup(popupPositionProvider, onDismissRequest, properties, content)