package io.github.composefluent.gallery.screen.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.Layer
import io.github.composefluent.component.Icon
import io.github.composefluent.component.SubtleButton
import io.github.composefluent.component.TabRow
import io.github.composefluent.component.TabItem
import io.github.composefluent.component.TabViewDefaults
import io.github.composefluent.component.Text
import io.github.composefluent.component.TextField
import io.github.composefluent.component.TextFieldColor
import io.github.composefluent.component.TextFieldColorScheme
import io.github.composefluent.component.rememberTabItemEndDividerController
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.gallery.component.GalleryPageScope
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.ArrowClockwise
import io.github.composefluent.icons.regular.ArrowDownload
import io.github.composefluent.icons.regular.ArrowLeft
import io.github.composefluent.icons.regular.ArrowRight
import io.github.composefluent.icons.regular.History
import io.github.composefluent.icons.regular.Home
import io.github.composefluent.icons.regular.MoreHorizontal
import io.github.composefluent.icons.regular.StarLineHorizontal3
import io.github.composefluent.source.generated.FluentSourceFile
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Component(index = 1, description = "A control that displays a collection of tabs that can be used to display several documents.")
@Composable
fun TabViewScreen() {
    GalleryPage(
        title = "TabView",
        description = "TabView provides the user with a collection of tabs that can be used to display several documents.",
        componentPath = FluentSourceFile.TabView,
        galleryPath = ComponentPagePath.TabViewScreen
    ) {
        Section(
            title = "Basic TabView",
            sourceCode = sourceCodeOfTabViewSample,
            content = { TabViewSample() }
        )
        PlatformTabViewSection()
    }
}

@Sample
@OptIn(ExperimentalFluentApi::class)
@Composable
private fun TabViewSample() {
    val selectedKey = remember { mutableIntStateOf(0) }
    val items = remember { mutableStateListOf(*Array(10) { it }) }
    val state = rememberLazyListState()
    val endDividerController = rememberTabItemEndDividerController(
        selectedKey = { selectedKey.value },
        state = state
    )
    TabRow(
        state = state,
        selectedKey = { selectedKey.value },
        modifier = Modifier.fillMaxWidth()
    ) {

        itemsIndexed(items, key = { _, item -> item }) { index, item ->
            val interactionSource = remember { MutableInteractionSource() }
            TabItem(
                selected = item == selectedKey.value,
                onSelectedChanged = { selectedKey.value = item },
                endDividerVisible = endDividerController.attach(item, interactionSource),
                interactionSource = interactionSource,
                text = {Text("Item ${item + 1}")},
                trailing = {
                    val isHovered = interactionSource.collectIsHoveredAsState()
                    if (isHovered.value) {
                        TabViewDefaults.TabCloseButton(
                            onClick = {
                                val isSelected = selectedKey.value == item
                                items.remove(item)
                                if (isSelected) {
                                    selectedKey.value = items.getOrNull(index) ?: items.getOrNull(index - 1) ?: 0
                                }
                            }
                        )
                    }
                },
                modifier = Modifier.widthIn(160.dp).animateItem(),
            )
        }

        item {
            TabViewDefaults.TabAddButton(
                onClick = {
                    items.add(items.lastOrNull()?.plus(1) ?: 0)
                }
            )
        }
    }
}

@Composable
internal expect fun GalleryPageScope.PlatformTabViewSection()

@OptIn(ExperimentalFluentApi::class, ExperimentalFoundationApi::class)
@Composable
internal fun TabViewWindowContent(
    paddingInsets: WindowInsets = WindowInsets(0),
    header: @Composable () -> Unit = {},
    footer: @Composable () -> Unit = {}
) {
    Column(modifier = Modifier.windowInsetsPadding(paddingInsets)) {
        val selectedIndex = remember { mutableStateOf(1) }
        val tabItems = remember { mutableStateListOf(*Array(6) { it + 1 }) }
        val state = rememberLazyListState()
        val endDividerController = rememberTabItemEndDividerController(
            selectedKey = { selectedIndex.value },
            state = state
        )
        val coroutineScope = rememberCoroutineScope()
        TabRow(
            selectedKey = { selectedIndex.value },
            state = state,
            header = header,
            footer = footer,
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
                    modifier = Modifier.animateItem().widthIn(160.dp)
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
