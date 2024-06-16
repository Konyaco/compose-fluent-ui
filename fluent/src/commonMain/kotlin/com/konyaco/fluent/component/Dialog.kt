package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.Mica
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.coroutines.resume

internal expect val DialogPopupPositionProvider: PopupPositionProvider

@Stable
class DialogSize(
    val min: Dp,
    val max: Dp
) {
    companion object {
        val Max = DialogSize(540.dp, 540.dp)
        val Standard = DialogSize(448.dp, 448.dp)
        val Min = DialogSize(320.dp, 320.dp)
    }
}

@Composable
fun FluentDialog(
    visible: Boolean,
    size: DialogSize = DialogSize.Standard,
    content: @Composable () -> Unit
) {
    val visibleState = remember { MutableTransitionState(false) }

    LaunchedEffect(visible) {
        visibleState.targetState = visible
    }

    if (visibleState.currentState || visibleState.targetState) Popup(
        popupPositionProvider = DialogPopupPositionProvider
    ) {
        val scrim by animateColorAsState(
            if (visible) Color.Black.copy(0.3f) else Color.Transparent, animationSpec = tween(
                easing = FluentEasing.FastInvokeEasing,
                durationMillis = FluentDuration.ShortDuration
            )
        )
        val tween = tween<Float>(
            easing = FluentEasing.FastInvokeEasing,
            durationMillis = FluentDuration.ShortDuration
        )
        Box(
            Modifier.fillMaxSize()
                .background(scrim)
                .pointerInput(Unit) {},
            Alignment.Center
        ) {
            AnimatedVisibility(
                visibleState = visibleState,
                enter = fadeIn(tween) + scaleIn(tween, initialScale = 1.05f),
                exit = fadeOut(tween) + scaleOut(tween, targetScale = 1.05f)
            ) {
                Mica(Modifier.wrapContentSize().clip(FluentTheme.shapes.overlay)) {
                    Layer(
                        Modifier.wrapContentSize().widthIn(size.min, size.max),
                        shape = FluentTheme.shapes.overlay,
                        border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.default),
                        backgroundSizing = BackgroundSizing.InnerBorderEdge,
                        color = FluentTheme.colors.background.solid.base,
                        contentColor = FluentTheme.colors.text.text.primary,
                        content = content
                    )
                }
            }
        }
    }
}

enum class ContentDialogButton {
    Primary, Secondary, Close
}

@Composable
fun ContentDialog(
    title: String,
    visible: Boolean,
    content: @Composable () -> Unit,
    primaryButtonText: String,
    secondaryButtonText: String? = null,
    closeButtonText: String? = null,
    onButtonClick: (ContentDialogButton) -> Unit,
    size: DialogSize = DialogSize.Standard
) {
    FluentDialog(visible, size) {
        Column {
            Column(Modifier.background(FluentTheme.colors.background.layer.alt).padding(24.dp)) {
                Text(
                    style = FluentTheme.typography.subtitle,
                    text = title,
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
            Box(Modifier.height(80.dp).padding(horizontal = 25.dp), Alignment.CenterEnd) {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    AccentButton(
                        modifier = Modifier.weight(1f),
                        onClick = { onButtonClick(ContentDialogButton.Primary) }
                    ) {
                        Text(primaryButtonText)
                    }
                    if (secondaryButtonText != null) Button(
                        modifier = Modifier.weight(1f),
                        onClick = { onButtonClick(ContentDialogButton.Secondary) }
                    ) {
                        Text(secondaryButtonText)
                    }
                    if (closeButtonText != null) Button(
                        modifier = Modifier.weight(1f),
                        onClick = { onButtonClick(ContentDialogButton.Close) }
                    ) {
                        Text(closeButtonText)
                    }
                }
            }
        }
    }
}

@Composable
fun ContentDialogHost(state: ContentDialogHostState) {
    val data = state.currentData

    if (data != null) {
        var visible by remember(data) { mutableStateOf(true) }

        ContentDialog(
            title = data.title,
            visible = visible,
            size = data.size,
            content = { Text(data.contentText) },
            primaryButtonText = data.primaryButtonText,
            secondaryButtonText = data.secondaryButtonText,
            closeButtonText = data.closeButtonText,
            onButtonClick = {
                visible = false
                if (data.continuation.isActive) {
                    data.continuation.resume(it)
                }
            }
        )
    }
}

val LocalContentDialog = staticCompositionLocalOf<ContentDialogHostState> { error("Not provided") }

class ContentDialogHostState {
    private val mutex = Mutex()

    internal var currentData by mutableStateOf<DialogData?>(null)
        private set

    suspend fun show(
        title: String,
        contentText: String,
        primaryButtonText: String,
        secondaryButtonText: String? = null,
        closeButtonText: String? = null,
        size: DialogSize = DialogSize.Standard,
    ): ContentDialogButton {
        mutex.withLock {
            try {
                return suspendCancellableCoroutine<ContentDialogButton> { cont ->
                    currentData = DialogData(
                        title,
                        contentText,
                        primaryButtonText,
                        secondaryButtonText,
                        closeButtonText,
                        size,
                        cont
                    )
                }
            } finally {
                // FIXME: If set null instantly, exit animation will be terminated
//                currentData = null
            }
        }
    }

    internal class DialogData(
        val title: String,
        val contentText: String,
        val primaryButtonText: String,
        val secondaryButtonText: String? = null,
        val closeButtonText: String? = null,
        val size: DialogSize = DialogSize.Standard,
        val continuation: CancellableContinuation<ContentDialogButton>
    )
}
