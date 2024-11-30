package com.konyaco.fluent.gallery.window

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ContentTransform
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.MutableWindowInsets
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.zIndex
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.component.NavigationDefaults
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TooltipBox
import com.konyaco.fluent.gallery.jna.windows.ComposeWindowProcedure
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTCAPTION
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTCLIENT
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTMAXBUTTON
import com.konyaco.fluent.gallery.jna.windows.structure.isWindows11OrLater
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ArrowLeft
import com.konyaco.fluent.icons.regular.Dismiss
import com.konyaco.fluent.icons.regular.Square
import com.konyaco.fluent.icons.regular.SquareMultiple
import com.konyaco.fluent.icons.regular.Subtract
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.scheme.VisualStateScheme
import com.konyaco.fluent.scheme.collectVisualState
import com.mayakapps.compose.windowstyler.WindowBackdrop
import com.mayakapps.compose.windowstyler.WindowStyle
import com.mayakapps.compose.windowstyler.findSkiaLayer
import com.sun.jna.platform.win32.User32
import com.sun.jna.platform.win32.WinDef.HWND
import com.sun.jna.platform.win32.WinUser
import java.awt.Window
import java.awt.event.WindowEvent
import java.awt.event.WindowFocusListener

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FrameWindowScope.WindowsWindowFrame(
    onCloseRequest: () -> Unit,
    icon: Painter? = null,
    title: String = "",
    state: WindowState,
    backButtonVisible: Boolean = true,
    backButtonEnabled: Boolean = false,
    backButtonClick: () -> Unit = {},
    captionBarHeight: Dp = 48.dp,
    content: @Composable (windowInset: WindowInsets, captionBarInset: WindowInsets) -> Unit
) {
    LaunchedEffect(window) {
        window.findSkiaLayer()?.transparency = true
    }
    WindowStyle(
        isDarkTheme = FluentTheme.colors.darkMode,
        backdropType = when {
            isWindows11OrLater() -> WindowBackdrop.Mica
            else -> WindowBackdrop.Solid(FluentTheme.colors.background.mica.baseAlt)
        }
    )

    val paddingInset = remember { MutableWindowInsets() }
    val maxButtonRect = remember { mutableStateOf(Rect.Zero) }
    val captionBarRect = remember { mutableStateOf(Rect.Zero) }
    val layoutHitTestOwner = rememberLayoutHitTestOwner()
    val contentPaddingInset = remember { MutableWindowInsets() }
    val procedure = remember(window) {
        ComposeWindowProcedure(
            window = window,
            hitTest = { x, y ->
                when {
                    maxButtonRect.value.contains(x, y) -> HTMAXBUTTON
                    captionBarRect.value.contains(x, y) && !layoutHitTestOwner.hitTest(x, y) -> HTCAPTION

                    else -> HTCLIENT
                }
            },
            onWindowInsetUpdate = { paddingInset.insets = it }
        )
    }
    Box(
        modifier = Modifier.windowInsetsPadding(paddingInset)
    ) {
        content(WindowInsets(top = captionBarHeight), contentPaddingInset)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.height(captionBarHeight)
                .zIndex(10f)
                .onGloballyPositioned { captionBarRect.value = it.boundsInWindow() }
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
                        onClick = backButtonClick,
                        disabled = !backButtonEnabled,
                        icon = {
                            Text(
                                text = CaptionButtonIcon.Back.glyph.toString(),
                                fontFamily = windowsFontFamily(),
                                fontSize = 10.sp
                            )
                        }
                    )
                } else {
                    Spacer(modifier = Modifier.width(14.dp).height(36.dp))
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
            window.CaptionButtonRow(
                procedure.windowHandle,
                state.placement == WindowPlacement.Maximized,
                onCloseRequest = onCloseRequest,
                onMaximizeButtonRectUpdate = {
                    maxButtonRect.value = it
                },
                modifier = Modifier.align(Alignment.Top).onSizeChanged {
                    contentPaddingInset.insets = WindowInsets(right = it.width, top = it.height)
                }
            )
        }
    }
}

@Composable
fun Window.CaptionButtonRow(
    windowHandle: HWND,
    isMaximize: Boolean,
    onCloseRequest: () -> Unit,
    modifier: Modifier = Modifier,
    onMaximizeButtonRectUpdate: (Rect) -> Unit
) {
    val isActive = remember { mutableStateOf(false) }
    DisposableEffect(this) {
        val listener = object : WindowFocusListener {
            override fun windowGainedFocus(e: WindowEvent?) {
                isActive.value = true
            }

            override fun windowLostFocus(e: WindowEvent?) {
                isActive.value = false
            }
        }
        addWindowFocusListener(listener)
        onDispose {
            removeWindowFocusListener(listener)
        }
    }
    //Draw the caption button
    Row(
        modifier = modifier
            .zIndex(1f)
    ) {
        CaptionButton(
            onClick = {
                User32.INSTANCE.CloseWindow(windowHandle)
            },
            icon = CaptionButtonIcon.Minimize,
            isActive = isActive.value
        )
        CaptionButton(
            onClick = {
                if (isMaximize) {
                    User32.INSTANCE.ShowWindow(
                        windowHandle,
                        WinUser.SW_RESTORE
                    )
                } else {
                    User32.INSTANCE.ShowWindow(
                        windowHandle,
                        WinUser.SW_MAXIMIZE
                    )
                }
            },
            icon = if (isMaximize) {
                CaptionButtonIcon.Restore
            } else {
                CaptionButtonIcon.Maximize
            },
            isActive = isActive.value,
            modifier = Modifier.onGloballyPositioned {
                onMaximizeButtonRectUpdate(it.boundsInWindow())
            }
        )
        CaptionButton(
            icon = CaptionButtonIcon.Close,
            onClick = onCloseRequest,
            isActive = isActive.value,
            colors = CaptionButtonDefaults.closeColors()
        )
    }
}

@OptIn(ExperimentalFoundationApi::class, ExperimentalFluentApi::class)
@Composable
fun CaptionButton(
    onClick: () -> Unit,
    icon: CaptionButtonIcon,
    isActive: Boolean,
    modifier: Modifier = Modifier,
    colors: VisualStateScheme<CaptionButtonColor> = CaptionButtonDefaults.defaultColors(),
    interaction: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val color = colors.schemeFor(interaction.collectVisualState(false))
    TooltipBox(
        tooltip = { Text(icon.name) }
    ) {
        Layer(
            backgroundSizing = BackgroundSizing.OuterBorderEdge,
            border = null,
            color = if (isActive) {
                color.background
            } else {
                color.inactiveBackground
            },
            contentColor = if (isActive) {
                color.foreground
            } else {
                color.inactiveForeground
            },
            modifier = modifier.size(46.dp, 32.dp).clickable(
                onClick = onClick,
                interactionSource = interaction,
                indication = null
            ),
            shape = RectangleShape
        ) {
            Text(
                text = icon.glyph.toString(),
                fontFamily = windowsFontFamily(),
                textAlign = TextAlign.Center,
                fontSize = 10.sp,
                modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center)
            )
        }
    }
}

@OptIn(ExperimentalTextApi::class)
private fun windowsFontFamily(): FontFamily {
    return if (!isWindows11OrLater()) {
        FontFamily("Segoe MDL2 Assets")
    } else {
        FontFamily("Segoe Fluent Icons")
    }
}

object CaptionButtonDefaults {
    @Composable
    @Stable
    fun defaultColors(
        default: CaptionButtonColor = CaptionButtonColor(
            background = FluentTheme.colors.subtleFill.transparent,
            foreground = FluentTheme.colors.text.text.primary,
            inactiveBackground = FluentTheme.colors.subtleFill.transparent,
            inactiveForeground = FluentTheme.colors.text.text.disabled
        ),
        hovered: CaptionButtonColor = default.copy(
            background = FluentTheme.colors.subtleFill.secondary,
            inactiveBackground = FluentTheme.colors.subtleFill.secondary,
            inactiveForeground = FluentTheme.colors.text.text.primary
        ),
        pressed: CaptionButtonColor = default.copy(
            background = FluentTheme.colors.subtleFill.tertiary,
            foreground = FluentTheme.colors.text.text.secondary,
            inactiveBackground = FluentTheme.colors.subtleFill.tertiary,
            inactiveForeground = FluentTheme.colors.text.text.tertiary
        ),
        disabled: CaptionButtonColor = default.copy(
            foreground = FluentTheme.colors.text.text.disabled,
        ),
    ) = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Composable
    @Stable
    fun closeColors(
        default: CaptionButtonColor = CaptionButtonColor(
            background = FluentTheme.colors.subtleFill.transparent,
            foreground = FluentTheme.colors.text.text.primary,
            inactiveBackground = FluentTheme.colors.subtleFill.transparent,
            inactiveForeground = FluentTheme.colors.text.text.disabled
        ),
        hovered: CaptionButtonColor = default.copy(
            background = Color(0xFFC42B1C),
            foreground = Color.White,
            inactiveBackground = Color(0xFFC42B1C),
            inactiveForeground = Color.White
        ),
        pressed: CaptionButtonColor = default.copy(
            background = Color(0xFFC42B1C).copy(0.9f),
            foreground = Color.White.copy(0.7f),
            inactiveBackground = Color(0xFFC42B1C).copy(0.9f),
            inactiveForeground = Color.White.copy(0.7f)
        ),
        disabled: CaptionButtonColor = default.copy(
            foreground = FluentTheme.colors.text.text.disabled,
        ),
    ) = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )
}

@Stable
data class CaptionButtonColor(
    val background: Color,
    val foreground: Color,
    val inactiveBackground: Color,
    val inactiveForeground: Color
)

enum class CaptionButtonIcon(
    val glyph: Char,
    val imageVector: ImageVector
) {
    Minimize(
        glyph = '\uE921',
        imageVector = Icons.Default.Subtract
    ),
    Maximize(
        glyph = '\uE922',
        imageVector = Icons.Default.Square
    ),
    Restore(
        glyph = '\uE923',
        imageVector = Icons.Default.SquareMultiple
    ),
    Close(
        glyph = '\uE8BB',
        imageVector = Icons.Default.Dismiss
    ),
    Back(
        glyph = '\uE830',
        imageVector = Icons.Default.ArrowLeft
    )
}

fun Rect.contains(x: Float, y: Float): Boolean {
    return x >= left && x < right && y >= top && y < bottom
}