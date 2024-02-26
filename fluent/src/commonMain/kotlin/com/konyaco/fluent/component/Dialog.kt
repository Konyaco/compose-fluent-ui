package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.Mica
import com.konyaco.fluent.shape.FluentRoundedCornerShape

internal expect val DialogPopupPositionProvider : PopupPositionProvider

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Dialog(
    title: String,
    visible: Boolean,
    content: @Composable () -> Unit,
    cancelButtonText: String,
    onCancel: () -> Unit,
    confirmButtonText: String,
    onConfirm: () -> Unit
) {
    val visibleState = remember { MutableTransitionState(false) }

    LaunchedEffect(visible) {
        visibleState.targetState = visible
    }

    if (visibleState.currentState || visibleState.targetState) Popup(
        popupPositionProvider = DialogPopupPositionProvider
    ) {
        Box(
            Modifier.fillMaxSize()
                .background(Color.Black.copy(0.3f))
                .pointerInput(Unit) {},
            Alignment.Center
        ) {

            val tween = tween<Float>(
                easing = FluentEasing.FastInvokeEasing,
                durationMillis = FluentDuration.QuickDuration
            )

            AnimatedVisibility(
                visibleState = visibleState,
                enter = fadeIn(tween) + scaleIn(tween, initialScale = 1.1f),
                exit = fadeOut(tween) + scaleOut(tween, targetScale = 1.1f)
            ) {
                Mica(Modifier.wrapContentSize().clip(RoundedCornerShape(8.dp))) {
                    Layer(
                        Modifier.wrapContentSize().widthIn(200.dp, 600.dp),
                        shape = FluentRoundedCornerShape(8.dp),
                        border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.default),
                        outsideBorder = true,
                        contentColor = FluentTheme.colors.text.text.primary,
                    ) {
                        Column(Modifier.background(FluentTheme.colors.background.solid.base)) {
                            Column(Modifier.background(FluentTheme.colors.background.layer.alt).padding(24.dp)) {
                                Text(
                                    style = FluentTheme.typography.subtitle,
                                    text = title,
//                                    color = FluentTheme.colors.text.text.primary
                                )
                                Spacer(Modifier.height(12.dp))
                                CompositionLocalProvider(
                                    LocalTextStyle provides FluentTheme.typography.body,
                                    LocalContentColor provides FluentTheme.colors.text.text.primary
                                ) {
                                    content()
                                }
                            }
                            // Divider
                            Box(Modifier.height(1.dp).background(FluentTheme.colors.stroke.surface.default))
                            // Button Grid
                            Box(Modifier.height(80.dp).padding(horizontal = 25.dp), Alignment.Center) {
                                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    AccentButton(modifier = Modifier.weight(1f), onClick = onConfirm) {
                                        Text(confirmButtonText)
                                    }
                                    Button(modifier = Modifier.weight(1f), onClick = onCancel) {
                                        Text(cancelButtonText)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}