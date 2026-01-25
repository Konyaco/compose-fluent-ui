package io.github.composefluent

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.LocalContextMenuRepresentation
import androidx.compose.foundation.text.LocalTextContextMenu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import io.github.composefluent.component.FluentContextMenuRepresentation
import io.github.composefluent.component.FluentTextContextMenu

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

