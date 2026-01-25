package io.github.composefluent.gallery.window

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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
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
import androidx.compose.ui.platform.LocalFontFamilyResolver
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.platform.FontLoadResult
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.zIndex
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.Layer
import io.github.composefluent.component.FontIconDefaults
import io.github.composefluent.component.FontIconSize
import io.github.composefluent.component.Icon
import io.github.composefluent.component.NavigationDefaults
import io.github.composefluent.component.Text
import io.github.composefluent.component.TooltipBox
import io.github.composefluent.gallery.jna.windows.ComposeWindowProcedure
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTCAPTION
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTCLIENT
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTCLOSE
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTMAXBUTTON
import io.github.composefluent.gallery.jna.windows.structure.WinUserConst.HTMINBUTTON
import io.github.composefluent.gallery.jna.windows.structure.isWindows11OrLater
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.Dismiss
import io.github.composefluent.icons.regular.Square
import io.github.composefluent.icons.regular.SquareMultiple
import io.github.composefluent.icons.regular.Subtract
import io.github.composefluent.scheme.PentaVisualScheme
import io.github.composefluent.scheme.VisualStateScheme
import io.github.composefluent.scheme.collectVisualState
import com.mayakapps.compose.windowstyler.WindowBackdrop
import com.mayakapps.compose.windowstyler.WindowStyle
import com.sun.jna.platform.win32.User32
import com.sun.jna.platform.win32.WinDef.HWND
import com.sun.jna.platform.win32.WinUser
import java.awt.Window

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
    val minButtonRect = remember { mutableStateOf(Rect.Zero) }
    val closeButtonRect = remember { mutableStateOf(Rect.Zero) }
    val captionBarRect = remember { mutableStateOf(Rect.Zero) }
    val layoutHitTestOwner = rememberLayoutHitTestOwner()
    val contentPaddingInset = remember { MutableWindowInsets() }
    val procedure = remember(window) {
        ComposeWindowProcedure(
            window = window,
            hitTest = { x, y ->
                when {
                    maxButtonRect.value.contains(x, y) -> HTMAXBUTTON
                    minButtonRect.value.contains(x, y) -> HTMINBUTTON
                    closeButtonRect.value.contains(x, y) -> HTCLOSE
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
                    val interactionSource = remember { MutableInteractionSource() }
                    NavigationDefaults.BackButton(
                        onClick = backButtonClick,
                        disabled = !backButtonEnabled,
                        interaction = interactionSource,
                        icon = { FontIconDefaults.BackIcon(interactionSource, size = FontIconSize(10f)) }
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
                windowHandle = procedure.windowHandle,
                isMaximize = state.placement == WindowPlacement.Maximized,
                onCloseRequest = onCloseRequest,
                onMaximizeButtonRectUpdate = {
                    maxButtonRect.value = it
                },
                onMinimizeButtonRectUpdate = {
                    minButtonRect.value = it
                },
                onCloseButtonRectUpdate = {
                    closeButtonRect.value = it
                },
                accentColor = procedure.windowFrameColor,
                frameColorEnabled = procedure.isWindowFrameAccentColorEnabled,
                isActive = procedure.isWindowActive,
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
    isActive: Boolean,
    accentColor: Color,
    frameColorEnabled: Boolean,
    onCloseRequest: () -> Unit,
    modifier: Modifier = Modifier,
    onMaximizeButtonRectUpdate: (Rect) -> Unit,
    onMinimizeButtonRectUpdate: (Rect) -> Unit = {},
    onCloseButtonRectUpdate: (Rect) -> Unit = {}
) {
    //Draw the caption button
    Row(
        modifier = modifier
            .zIndex(1f)
    ) {
        val colors = if (frameColorEnabled && accentColor != Color.Unspecified) {
            CaptionButtonDefaults.accentColors(accentColor)
        } else {
            CaptionButtonDefaults.defaultColors()
        }
        CaptionButton(
            onClick = {
                User32.INSTANCE.ShowWindow(windowHandle, WinUser.SW_MINIMIZE)
            },
            icon = CaptionButtonIcon.Minimize,
            isActive = isActive,
            colors = colors,
            modifier = Modifier.onGloballyPositioned {
                onMinimizeButtonRectUpdate(it.boundsInWindow())
            }
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
            isActive = isActive,
            colors = colors,
            modifier = Modifier.onGloballyPositioned {
                onMaximizeButtonRectUpdate(it.boundsInWindow())
            }
        )
        CaptionButton(
            icon = CaptionButtonIcon.Close,
            onClick = onCloseRequest,
            isActive = isActive,
            colors = CaptionButtonDefaults.closeColors(),
            modifier = Modifier.onGloballyPositioned {
                onCloseButtonRectUpdate(it.boundsInWindow())
            }
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
            val fontFamily by rememberFontIconFamily()
            if (fontFamily != null) {
                Text(
                    text = icon.glyph.toString(),
                    fontFamily = fontFamily,
                    textAlign = TextAlign.Center,
                    fontSize = 10.sp,
                    modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center),
                )
            } else {
                Icon(
                    imageVector = icon.imageVector,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center).size(13.dp),
                )
            }
        }
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
private fun rememberFontIconFamily(): State<FontFamily?> {
    val fontIconFamily = remember { mutableStateOf<FontFamily?>(null) }
    // Get windows system font icon, if get failed fall back to fluent svg icon.
    val fontFamilyResolver = LocalFontFamilyResolver.current
    LaunchedEffect(fontFamilyResolver) {
        fontIconFamily.value = sequenceOf("Segoe Fluent Icons", "Segoe MDL2 Assets")
            .mapNotNull {
                val fontFamily = FontFamily(it)
                runCatching {
                    val result = fontFamilyResolver.resolve(fontFamily).value as FontLoadResult
                    if (result.typeface == null || result.typeface?.familyName != it) {
                        null
                    } else {
                        fontFamily
                    }
                }.getOrNull()
            }
            .firstOrNull()
    }
    return fontIconFamily
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
    fun accentColors(
        accentColor: Color,
        default: CaptionButtonColor = CaptionButtonColor(
            background = FluentTheme.colors.subtleFill.transparent,
            foreground = FluentTheme.colors.text.text.primary,
            inactiveBackground = FluentTheme.colors.subtleFill.transparent,
            inactiveForeground = FluentTheme.colors.text.text.disabled
        ),
        hovered: CaptionButtonColor = default.copy(
            background = accentColor,
            foreground = Color.White,
            inactiveBackground = accentColor,
            inactiveForeground = Color.White
        ),
        pressed: CaptionButtonColor = default.copy(
            background = accentColor.copy(0.9f),
            foreground = Color.White.copy(0.7f),
            inactiveBackground = accentColor.copy(0.9f),
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

    @Composable
    @Stable
    fun closeColors() = accentColors(Color(0xFFC42B1C))
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
    )
}

fun Rect.contains(x: Float, y: Float): Boolean {
    return x >= left && x < right && y >= top && y < bottom
}
