package com.konyaco.fluent.component

import androidx.compose.animation.*
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.Mica

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Dialog(
    title: String,
    visible: Boolean,
    cancelButtonText: String,
    onCancel: () -> Unit,
    confirmButtonText: String,
    onConfirm: () -> Unit
) {
    val visibleState = remember { MutableTransitionState(false) }

    LaunchedEffect(visible) {
        visibleState.targetState = visible
    }

    if (!(!visibleState.currentState && !visibleState.targetState)) Popup {
        Box(
            Modifier.fillMaxSize()
                .background(Color.Black.copy(0.12f))
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
                        shape = RoundedCornerShape(8.dp),
                        cornerRadius = 8.dp
                    ) {
                        Column(Modifier.padding(16.dp)) {
                            Text(title)
                            Spacer(Modifier.height(32.dp))
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