package io.github.composefluent.component

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
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.window.PopupProperties
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalContentColor
import io.github.composefluent.LocalTextStyle
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.Layer
import io.github.composefluent.background.Mica
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.coroutines.resume

internal expect val DialogPopupPositionProvider: PopupPositionProvider

/**
 * Represents the size constraints for a dialog.
 *
 * @property min The minimum width of the dialog.
 * @property max The maximum width of the dialog.
 *
 * @constructor Creates a [DialogSize] with the specified minimum and maximum widths.
 *
 * @sample io.github.composefluent.component.DialogSize.Max
 * @sample io.github.composefluent.component.DialogSize.Standard
 * @sample io.github.composefluent.component.DialogSize.Min
 */
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

/**
 * A dialog composable that displays content in a popup.
 *
 * @param visible Controls the visibility of the dialog. When `true`, the dialog is shown; otherwise, it's hidden.
 * @param size The size of the dialog, defining its minimum and maximum width. Defaults to [DialogSize.Standard].
 * @param properties Additional properties for the dialog's popup, such as focusability.
 * @param content The composable content to display within the dialog.
 */
@Composable
fun FluentDialog(
    visible: Boolean,
    size: DialogSize = DialogSize.Standard,
    properties: PopupProperties = PopupProperties(focusable = true),
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val visibleState = remember { MutableTransitionState(false) }

    LaunchedEffect(visible) {
        visibleState.targetState = visible
    }

    if (visibleState.currentState || visibleState.targetState) Popup(
        properties = properties,
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
            modifier.fillMaxSize()
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

/**
 * Represents the possible buttons in a [ContentDialog].
 *
 * - **Primary:** The primary action button, usually represents the main or positive action.
 * - **Secondary:** An optional secondary action button, often represents a less important or alternative action.
 * - **Close:** An optional button to simply dismiss or close the dialog.
 */
enum class ContentDialogButton {
    Primary, Secondary, Close
}

/**
 * A dialog that displays content and provides buttons for user interaction.
 *
 * @param title The title of the dialog.
 * @param visible Whether the dialog is currently visible.
 * @param content The composable content to display within the dialog.
 * @param primaryButtonText The text for the primary button.
 * @param secondaryButtonText The text for the secondary button, or null if no secondary button is needed.
 * @param closeButtonText The text for the close button, or null if no close button is needed.
 * @param onButtonClick A callback invoked when any of the buttons is clicked, providing the [ContentDialogButton] that was pressed.
 * @param size The [DialogSize] to determine the size constraints of the dialog.
 */
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
            Column(Modifier.fillMaxWidth().background(FluentTheme.colors.background.layer.alt).padding(24.dp)) {
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

/**
 * A composable function that hosts a [ContentDialog] based on the state provided by [ContentDialogHostState].
 *
 * It observes the [ContentDialogHostState] and displays a [ContentDialog] when the `currentData` is not null.
 * The dialog's visibility, content, buttons, and actions are managed through the `data` provided by the state.
 *
 * @param state The [ContentDialogHostState] that holds the data for the current dialog to be displayed.
 *
 * @see ContentDialogHostState
 * @see ContentDialog
 */
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

/**
 * A state holder for managing the display of content dialogs.
 *
 * This class provides a mechanism to show and manage a content dialog with a title, content text,
 * and optional primary, secondary, and close buttons. It ensures that only one dialog is displayed
 * at a time using a mutex, and provides a suspending function to await the user's interaction with the dialog.
 *
 * The [show] function returns a [ContentDialogButton] representing which button was pressed by the user.
 */
class ContentDialogHostState {
    private val mutex = Mutex()

    internal var currentData by mutableStateOf<DialogData?>(null)
        private set

    /**
     * Shows a content dialog with the specified parameters.
     *
     * This function suspends until the dialog is dismissed and returns the button that was clicked.
     *
     * @param title The title of the dialog.
     * @param contentText The main content text of the dialog.
     * @param primaryButtonText The text of the primary action button.
     * @param secondaryButtonText The text of the secondary action button, or null if no secondary button is needed.
     * @param closeButtonText The text of the close button, or null if no close button is needed.
     * @param size The size of the dialog. Defaults to [DialogSize.Standard].
     * @return The [ContentDialogButton] that was clicked to dismiss the dialog.
     */
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
