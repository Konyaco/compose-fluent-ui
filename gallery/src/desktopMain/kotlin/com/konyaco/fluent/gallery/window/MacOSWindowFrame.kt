package com.konyaco.fluent.gallery.window

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowState
import com.konyaco.fluent.component.NavigationDefaults

@Composable
fun FrameWindowScope.MacOSWindowFrame(
    state: WindowState,
    backButtonVisible: Boolean,
    backButtonEnabled: Boolean,
    onBackButtonClick: () -> Unit,
    content: @Composable (windowInset: WindowInsets, captionBarInset: WindowInsets) -> Unit
) {
    val windowInset by remember(state) {
        derivedStateOf {
            //TODO Get real macOS title bar height.
            if (state.placement != WindowPlacement.Fullscreen) {
                WindowInsets(top = 28.dp)
            } else {
                WindowInsets(0)
            }
        }
    }
    //TODO Get real macOS caption bar width.
    Box {
        val contentInset = WindowInsets(left = 64.dp)
        content(windowInset, contentInset)
        if (backButtonVisible) {
            NavigationDefaults.BackButton(
                onClick = onBackButtonClick,
                disabled = !backButtonEnabled,
                modifier = Modifier.windowInsetsPadding(contentInset)
            )
        }
    }

    window.rootPane.apply {
        rootPane.putClientProperty("apple.awt.fullWindowContent", true)
        rootPane.putClientProperty("apple.awt.transparentTitleBar", true)
        rootPane.putClientProperty("apple.awt.windowTitleVisible", false)
    }
}