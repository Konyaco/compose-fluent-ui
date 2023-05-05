package com.konyaco.fluent

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.LocalContextMenuRepresentation
import androidx.compose.foundation.text.LocalTextContextMenu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.konyaco.fluent.component.FluentContextMenuRepresentation
import com.konyaco.fluent.component.FluentTextContextMenu

@OptIn(ExperimentalFoundationApi::class)
@Composable
actual fun PlatformCompositionLocalProvider(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalTextContextMenu provides FluentTextContextMenu,
        LocalContextMenuRepresentation provides FluentContextMenuRepresentation
    ) {
        content()
    }
}

