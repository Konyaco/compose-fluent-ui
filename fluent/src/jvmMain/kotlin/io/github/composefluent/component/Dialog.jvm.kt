package io.github.composefluent.component

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupPositionProviderAtPosition

@OptIn(ExperimentalComposeUiApi::class)
internal actual val DialogPopupPositionProvider: PopupPositionProvider
    get() = PopupPositionProviderAtPosition(Offset.Zero, false, Offset.Zero, windowMarginPx = 0)