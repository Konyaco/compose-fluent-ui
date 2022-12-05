package com.konyaco.fluent.component

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Dialog(
    title: String,
    cancelButtonText: String,
    onCancel: () -> Unit,
    confirmButtonText: String,
    onConfirm: () -> Unit
) {
    Popup(Alignment.Center) {
        var visibility by remember { mutableStateOf(false) }
        LaunchedEffect(Unit) {
            visibility = true
        }
        Layer(Modifier.wrapContentSize().widthIn(200.dp, 600.dp), shape = RoundedCornerShape(8.dp), elevation = 32.dp) {
            val tween = tween<Float>(
                easing = FluentEasing.FastInvokeEasing,
                durationMillis = FluentDuration.ShortDuration
            )
            AnimatedVisibility(
                visible = visibility,
                enter = fadeIn(tween) + scaleIn(tween),
                exit = fadeOut(tween) + scaleOut(tween)
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