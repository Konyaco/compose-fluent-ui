package com.konyaco.fluent.gallery.window

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ContentTransform
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowState
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.component.NavigationDefaults
import com.konyaco.fluent.component.Text
import com.mayakapps.compose.windowstyler.findSkiaLayer
import org.jetbrains.skiko.disableTitleBar

@Composable
fun FrameWindowScope.MacOSWindowFrame(
    state: WindowState,
    backButtonVisible: Boolean,
    backButtonEnabled: Boolean,
    title: String,
    icon: Painter?,
    captionBarHeight: Dp,
    onBackButtonClick: () -> Unit,
    content: @Composable (windowInset: WindowInsets, captionBarInset: WindowInsets) -> Unit
) {
    val windowInset by remember(state) {
        derivedStateOf {
            if (state.placement != WindowPlacement.Fullscreen) {
                WindowInsets(top = captionBarHeight)
            } else {
                WindowInsets(0)
            }
        }
    }
    LaunchedEffect(window, captionBarHeight) {
        window.findSkiaLayer()?.disableTitleBar(captionBarHeight.value)
    }
    //TODO Get real macOS caption bar width.
    Box {
        val contentInset = WindowInsets(left = 80.dp)
        content(windowInset, contentInset)
        Row(modifier = Modifier.windowInsetsPadding(contentInset)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.height(captionBarHeight)
            ) {
                AnimatedContent(
                    targetState = backButtonVisible,
                    transitionSpec = {
                        ContentTransform(
                            targetContentEnter = expandHorizontally(),
                            initialContentExit = shrinkHorizontally(),
                            sizeTransform = SizeTransform { _, _ ->
                                tween(
                                    FluentDuration.ShortDuration,
                                    easing = FluentEasing.FastInvokeEasing
                                )
                            }
                        )
                    }
                ) {
                    if (it) {
                        NavigationDefaults.BackButton(
                            onClick = onBackButtonClick,
                            disabled = !backButtonEnabled,
                        )
                    } else {
                        Spacer(modifier = Modifier.width(2.dp).height(36.dp))
                    }
                }
                if (icon != null) {
                    Image(
                        painter = icon,
                        contentDescription = null,
                        modifier = Modifier.padding(start = 6.dp).size(16.dp)
                    )
                }
                if (title.isNotEmpty()) {
                    Text(
                        text = title,
                        style = FluentTheme.typography.caption,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
            }
        }

    }

    window.rootPane.apply {
        rootPane.putClientProperty("apple.awt.fullWindowContent", true)
        rootPane.putClientProperty("apple.awt.transparentTitleBar", true)
        rootPane.putClientProperty("apple.awt.windowTitleVisible", false)
    }
}