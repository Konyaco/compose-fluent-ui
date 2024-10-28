package com.konyaco.fluent.gallery.screen.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.MutableWindowInsets
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.rememberWindowState
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.SubtleButton
import com.konyaco.fluent.component.TabItem
import com.konyaco.fluent.component.TabRow
import com.konyaco.fluent.component.TabViewDefaults
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TextField
import com.konyaco.fluent.component.TextFieldColor
import com.konyaco.fluent.component.TextFieldColorScheme
import com.konyaco.fluent.component.rememberTabItemEndDividerController
import com.konyaco.fluent.gallery.LocalStore
import com.konyaco.fluent.gallery.component.GalleryPageScope
import com.konyaco.fluent.gallery.jna.windows.ComposeWindowProcedure
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTCAPTION
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTCLIENT
import com.konyaco.fluent.gallery.jna.windows.structure.WinUserConst.HTMAXBUTTON
import com.konyaco.fluent.gallery.window.CaptionButtonRow
import com.konyaco.fluent.gallery.window.contains
import com.konyaco.fluent.gallery.window.rememberLayoutHitTestOwner
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ArrowClockwise
import com.konyaco.fluent.icons.regular.ArrowDownload
import com.konyaco.fluent.icons.regular.ArrowLeft
import com.konyaco.fluent.icons.regular.ArrowRight
import com.konyaco.fluent.icons.regular.History
import com.konyaco.fluent.icons.regular.Home
import com.konyaco.fluent.icons.regular.MoreHorizontal
import com.konyaco.fluent.icons.regular.StarLineHorizontal3
import com.mayakapps.compose.windowstyler.WindowBackdrop
import com.mayakapps.compose.windowstyler.WindowStyle
import com.mayakapps.compose.windowstyler.findSkiaLayer
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.icon
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalLayoutApi::class, ExperimentalFluentApi::class, ExperimentalFoundationApi::class)
@Composable
internal actual fun GalleryPageScope.PlatformTabViewSection() {
    Section(
        title = "TabView Window",
        sourceCode = "",
        content = {
            val windowVisible = remember { mutableStateOf(false) }
            Button(
                onClick = {
                    windowVisible.value = !windowVisible.value
                },
                content = {
                    Text("Open Window")
                }
            )
            val windowState = rememberWindowState(width = 1600.dp, height = 1000.dp)
            val store = LocalStore.current
            Window(
                visible = windowVisible.value,
                onCloseRequest = {
                    windowVisible.value = false
                },
                state = windowState,
                title = "TabView Window",
                icon = painterResource(Res.drawable.icon)
            ) {

                WindowStyle(
                    isDarkTheme = FluentTheme.colors.darkMode,
                    backdropType = WindowBackdrop.Tabbed,
                )
                FluentTheme(
                    useAcrylicPopup = store.enabledAcrylicPopup,
                ) {

                    LaunchedEffect(window) {
                        window.findSkiaLayer()?.transparency = true
                    }

                    val paddingInsets = remember { MutableWindowInsets() }
                    val layoutHitTestOwner = rememberLayoutHitTestOwner()
                    val maxButtonRect = remember { mutableStateOf(Rect.Zero) }
                    val captionBarHeight = 40.dp
                    val captionBarHeightPx = with(LocalDensity.current) { captionBarHeight.toPx() }
                    val windowProcedure = remember {
                        ComposeWindowProcedure(
                            window = window,
                            onWindowInsetUpdate = { paddingInsets.insets = it },
                            onWindowThemeUpdated = {},
                            onWindowAccentColorUpdated = {},
                            hitTest = { x, y ->
                                when {
                                    maxButtonRect.value.contains(x, y) -> HTMAXBUTTON
                                    y <= captionBarHeightPx && !layoutHitTestOwner.hitTest(
                                        x,
                                        y
                                    ) -> HTCAPTION

                                    else -> HTCLIENT
                                }
                            }
                        )
                    }
                    Column(modifier = Modifier.windowInsetsPadding(paddingInsets)) {
                        val selectedIndex = remember { mutableStateOf(1) }
                        val tabItems = remember { mutableStateListOf(*Array(100) { it + 1 }) }
                        val state = rememberLazyListState()
                        val endDividerController = rememberTabItemEndDividerController(
                            selectedKey = { selectedIndex.value },
                            state = state
                        )
                        val coroutineScope = rememberCoroutineScope()
                        TabRow(
                            selectedKey = { selectedIndex.value },
                            state = state,
                            footer = {
                                Row(
                                    modifier = Modifier.heightIn(captionBarHeight)
                                        .wrapContentHeight(Alignment.Top)
                                        .padding(start = 16.dp)
                                ) {
                                    window.CaptionButtonRow(
                                        windowHandle = windowProcedure.windowHandle,
                                        isMaximize = windowState.placement == WindowPlacement.Maximized,
                                        onCloseRequest = { windowVisible.value = false },
                                        onMaximizeButtonRectUpdate = { maxButtonRect.value = it }
                                    )
                                }
                            },
                            borderColor = FluentTheme.colors.stroke.card.default,
                            modifier = Modifier.weight(1f)
                        ) {
                            items(tabItems, key = { it }) { index ->
                                val interactionSource = remember { MutableInteractionSource() }
                                TabItem(
                                    selected = selectedIndex.value == index,
                                    onSelectedChanged = { selectedIndex.value = index },
                                    text = {
                                        Text("Item ${index + 1}")
                                    },
                                    trailing = {
                                        val isHovered = interactionSource.collectIsHoveredAsState()
                                        if (isHovered.value) {
                                            TabViewDefaults.TabCloseButton(
                                                onClick = {
                                                    val isSelected = selectedIndex.value == index
                                                    tabItems.remove(index)
                                                    if (isSelected) {
                                                        selectedIndex.value =
                                                            tabItems.firstOrNull() ?: 0
                                                    }
                                                }
                                            )
                                        }
                                    },
                                    colors = if (selectedIndex.value == index) {
                                        TabViewDefaults.selectedItemTitleBarColors()
                                    } else {
                                        TabViewDefaults.defaultItemTitleBarColors()
                                    },
                                    endDividerVisible = endDividerController.attach(
                                        index,
                                        interactionSource
                                    ),
                                    interactionSource = interactionSource,
                                    modifier = Modifier.animateItemPlacement().widthIn(160.dp)
                                )
                            }
                            item {
                                val bringIntoViewRequester = remember { BringIntoViewRequester() }
                                TabViewDefaults.TabAddButton(
                                    onClick = {
                                        tabItems.add(tabItems.lastOrNull()?.plus(1) ?: 0)
                                        coroutineScope.launch {
                                            delay(500)
                                            bringIntoViewRequester.bringIntoView()
                                        }
                                    },
                                    modifier = Modifier.bringIntoViewRequester(
                                        bringIntoViewRequester
                                    )
                                )
                            }

                        }
                        Layer(
                            border = null,
                            backgroundSizing = BackgroundSizing.OuterBorderEdge,
                            modifier = Modifier.weight(1f).fillMaxWidth(),
                            color = FluentTheme.colors.background.layerOnMicaBaseAlt.default,
                            shape = RectangleShape
                        ) {
                            Column(
                                modifier = Modifier.fillMaxWidth().fillMaxHeight()
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    modifier = Modifier
                                        .heightIn(48.dp)
                                        .padding(horizontal = 8.dp)
                                ) {
                                    val iconSize = 18.dp
                                    SubtleButton(
                                        onClick = {},
                                        iconOnly = true
                                    ) {
                                        Icon(
                                            Icons.Default.ArrowLeft,
                                            contentDescription = null,
                                            modifier = Modifier.size(iconSize)
                                        )
                                    }
                                    SubtleButton(
                                        onClick = {},
                                        iconOnly = true
                                    ) {
                                        Icon(
                                            Icons.Default.ArrowRight,
                                            contentDescription = null,
                                            modifier = Modifier.size(iconSize)
                                        )
                                    }

                                    SubtleButton(
                                        onClick = {},
                                        iconOnly = true
                                    ) {
                                        Icon(
                                            Icons.Default.ArrowClockwise,
                                            contentDescription = null,
                                            modifier = Modifier.size(iconSize)
                                        )
                                    }

                                    SubtleButton(
                                        onClick = {},
                                        iconOnly = true
                                    ) {
                                        Icon(
                                            Icons.Default.Home,
                                            contentDescription = null,
                                            modifier = Modifier.size(iconSize)
                                        )
                                    }

                                    val value = remember { mutableStateOf(TextFieldValue()) }
                                    TextField(
                                        value = value.value,
                                        onValueChange = { value.value = it },
                                        colors = defaultTextFieldColors(),
                                        placeholder = { Text("Enter url or search keyword") },
                                        modifier = Modifier.padding(horizontal = 4.dp).weight(1f)
                                            .fillMaxWidth().height(32.dp)
                                    )
                                    SubtleButton(
                                        onClick = {},
                                        iconOnly = true
                                    ) {
                                        Icon(
                                            Icons.Default.History,
                                            contentDescription = null,
                                            modifier = Modifier.size(iconSize)
                                        )
                                    }

                                    SubtleButton(
                                        onClick = {},
                                        iconOnly = true
                                    ) {
                                        Icon(
                                            Icons.Default.ArrowDownload,
                                            contentDescription = null,
                                            modifier = Modifier.size(iconSize)
                                        )
                                    }
                                    SubtleButton(
                                        onClick = {},
                                        iconOnly = true
                                    ) {
                                        Icon(
                                            Icons.Default.StarLineHorizontal3,
                                            contentDescription = null,
                                            modifier = Modifier.size(iconSize)
                                        )
                                    }
                                    SubtleButton(
                                        onClick = {},
                                        iconOnly = true
                                    ) {
                                        Icon(
                                            Icons.Default.MoreHorizontal,
                                            contentDescription = null,
                                            modifier = Modifier.size(iconSize)
                                        )
                                    }
                                }
                                Box(
                                    modifier = Modifier.fillMaxWidth().height(1.dp)
                                        .background(FluentTheme.colors.stroke.divider.default)
                                )
                            }
                        }
                    }
                }
            }
        }
    )
}

@Stable
@Composable
fun defaultTextFieldColors(
    default: TextFieldColor = TextFieldColor(
        fillColor = FluentTheme.colors.control.default,
        contentColor = FluentTheme.colors.text.text.primary,
        placeholderColor = FluentTheme.colors.text.text.secondary,
        bottomLineFillColor = Color.Transparent,
        borderBrush = SolidColor(Color.Transparent),
        cursorBrush = SolidColor(FluentTheme.colors.text.text.primary)
    ),
    focused: TextFieldColor = default.copy(
        fillColor = FluentTheme.colors.control.inputActive,
        bottomLineFillColor = FluentTheme.colors.fillAccent.default,
        borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
    ),
    hovered: TextFieldColor = default.copy(
        fillColor = FluentTheme.colors.control.secondary
    ),
    pressed: TextFieldColor = default.copy(
        fillColor = FluentTheme.colors.control.inputActive,
        borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
    ),
    disabled: TextFieldColor = default.copy(
        contentColor = FluentTheme.colors.text.text.disabled,
        placeholderColor = FluentTheme.colors.text.text.disabled,
        bottomLineFillColor = Color.Transparent,
    )
) = TextFieldColorScheme(
    default = default,
    focused = focused,
    hovered = hovered,
    pressed = pressed,
    disabled = disabled
)