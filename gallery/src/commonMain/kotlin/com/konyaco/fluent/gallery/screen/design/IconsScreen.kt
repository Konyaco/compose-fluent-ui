package com.konyaco.fluent.gallery.screen.design

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.FluentThemeConfiguration
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.component.GridViewItem
import com.konyaco.fluent.component.GridViewItemColor
import com.konyaco.fluent.component.GridViewItemDefaults
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.RadioButton
import com.konyaco.fluent.component.ScrollbarContainer
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TextField
import com.konyaco.fluent.component.rememberScrollbarAdapter
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.CopyButton
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.source.generated.FluentSourceFile
import com.konyaco.fluent.source.generated.fluentIconCoreItems
import com.konyaco.fluent.source.generated.fluentIconExtendedItems
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.debounce

@OptIn(FlowPreview::class, ExperimentalFluentApi::class, ExperimentalFoundationApi::class)
@Component(index = 1, name = "Icons", icon = "Diversity")
@Composable
fun IconsScreen() {
    GalleryPage(
        title = "Icons",
        description = "With the release of Windows 11, Segoe Fluent Icons is the recommended icon font.",
        componentPath = FluentSourceFile.Icon,
        galleryPath = ComponentPagePath.IconsScreen
    ) {
        val icons = remember { mutableStateOf(emptyList<Pair<String, ImageVector>>()) }
        val iconType = remember { mutableStateOf<Any>(Icons.Default) }
        val iconCoreSet = remember { mutableStateOf(emptyList<Pair<String, ImageVector>>()) }
        LaunchedEffect(iconType.value) {
            val set = when (iconType.value) {
                Icons.Regular -> {
                    iconCoreSet.value = Icons.Regular.fluentIconCoreItems()
                    iconCoreSet.value + Icons.Regular.fluentIconExtendedItems()
                }

                Icons.Filled -> {
                    iconCoreSet.value = Icons.Filled.fluentIconCoreItems()
                    iconCoreSet.value + Icons.Filled.fluentIconExtendedItems()
                }

                else -> {
                    emptyList()
                }
            }
            icons.value = set.sortedBy { it.first }
        }
        val keywordState = remember { mutableStateOf(TextFieldValue()) }
        val selectedItem = remember { mutableStateOf<Pair<String, ImageVector>?>(null) }
        val filterList = remember {
            combine(
                snapshotFlow { icons.value },
                snapshotFlow { keywordState.value.text }
                    .debounce(500)
            ) { icons, keyword ->
                selectedItem.value = null
                icons.filter { it.first.contains(keyword, ignoreCase = true) }
            }
        }.collectAsState(emptyList())
        Section {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Fluent Icons Library", style = FluentTheme.typography.bodyStrong)
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextField(
                        value = keywordState.value,
                        onValueChange = { keywordState.value = it },
                        placeholder = { Text("Search icons") },
                        modifier = Modifier.defaultMinSize(240.dp)
                    )
                    RadioButton(
                        selected = iconType.value == Icons.Regular,
                        label = "Regular",
                        onClick = { iconType.value = Icons.Regular }
                    )
                    RadioButton(
                        selected = iconType.value == Icons.Filled,
                        label = "Filled",
                        onClick = { iconType.value = Icons.Filled }
                    )
                }
                FluentThemeConfiguration(colors = it) {
                    Layer(
                        backgroundSizing = BackgroundSizing.OuterBorderEdge,
                        color = FluentTheme.colors.background.solid.base
                    ) {
                        val listState = rememberLazyGridState()
                        val adapter = rememberScrollbarAdapter(listState)
                        Row(modifier = Modifier.height(650.dp)) {
                            ScrollbarContainer(
                                adapter = adapter,
                                modifier = Modifier.weight(1f).fillMaxHeight()
                            ) {

                                val selectedColors = GridViewItemDefaults.selectedColors(
                                    default = GridViewItemColor(
                                        borderColor = FluentTheme.colors.fillAccent.default,
                                        backgroundColor = FluentTheme.colors.subtleFill.transparent
                                    )
                                )
                                val defaultColors = GridViewItemDefaults.defaultColors(
                                    hovered= GridViewItemColor(
                                        borderColor = Color.Transparent,
                                        backgroundColor = FluentTheme.colors.subtleFill.secondary
                                    ),
                                )

                                LazyVerticalGrid(
                                    state = listState,
                                    columns = GridCells.Adaptive(96.dp),
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    verticalArrangement = Arrangement.spacedBy(8.dp),
                                    contentPadding = PaddingValues(12.dp),
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    items(
                                        items = filterList.value,
                                        contentType = { "icon" },
                                        key = { (name, _) -> name }
                                    ) { item ->
                                        val (name, icon) = item
                                        val interactionSource = remember { MutableInteractionSource() }
                                        GridViewItem(
                                            selected = selectedItem.value == item,
                                            onSelectedChange = { selectedItem.value = item },
                                            interactionSource = interactionSource,
                                            colors = if (selectedItem.value == item) {
                                                selectedColors
                                            } else {
                                                defaultColors
                                            },
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .aspectRatio(1f)
                                                .background(
                                                    color = FluentTheme.colors.background.card.default,
                                                    shape = FluentTheme.shapes.control
                                                )
                                        ) {
                                            val isHovered by interactionSource.collectIsHoveredAsState()
                                            Box(
                                                modifier = Modifier.fillMaxSize()
                                            ) {
                                                Icon(
                                                    imageVector = icon,
                                                    contentDescription = name,
                                                    modifier = Modifier.padding(bottom = 8.dp)
                                                        .size(28.dp).align(Alignment.Center)
                                                )
                                                Text(
                                                    text = name,
                                                    style = FluentTheme.typography.caption,
                                                    color = FluentTheme.colors.text.text.secondary,
                                                    maxLines = 1,
                                                    overflow = TextOverflow.Ellipsis,
                                                    modifier = Modifier
                                                        .align(Alignment.BottomCenter)
                                                        .padding(8.dp)
                                                        .then(
                                                            if (isHovered) {
                                                                Modifier.basicMarquee()
                                                            } else {
                                                                Modifier
                                                            }
                                                        )
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                            Spacer(
                                modifier = Modifier.fillMaxHeight()
                                    .padding(vertical = 1.dp)
                                    .width(1.dp)
                                    .background(FluentTheme.colors.stroke.card.default)
                            )
                            Layer(
                                shape = RectangleShape,
                                color = FluentTheme.colors.background.card.default,
                                backgroundSizing = BackgroundSizing.OuterBorderEdge,
                                border = null,
                                modifier = Modifier.fillMaxHeight()
                                    .width(400.dp)
                            ) board@{
                                val item = selectedItem.value ?: return@board
                                val isCore = iconCoreSet.value.contains(item)
                                val packageName = if (isCore) {
                                    "com.konyaco:fluent-icons-core"
                                } else {
                                    "com.konyaco:fluent-icons-extended"
                                }
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(12.dp),
                                    modifier = Modifier.padding(16.dp)
                                ) {
                                    Text(item.first, style = FluentTheme.typography.subtitle)
                                    Icon(
                                        imageVector = item.second,
                                        contentDescription = item.first,
                                        modifier = Modifier.size(64.dp)
                                    )
                                    IconIntroSection(
                                        header = "package",
                                        content = packageName
                                    )
                                    val iconCode = "Icons.${if (iconType.value == Icons.Filled) "Filled" else "Regular"}.${item.first}"
                                    IconIntroSection(
                                        header = "Kotlin",
                                        content = """
                                            Icon(
                                                imageVector = $iconCode, 
                                                contentDescription = "${item.first}"
                                            )
                                        """.trimIndent()
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun IconIntroSection(
    header: String,
    content: String,
) {
    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
        Text(text = header, style = FluentTheme.typography.body)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = content,
                style = FluentTheme.typography.body, color = FluentTheme.colors.text.text.secondary,
                modifier = Modifier.weight(1f)
            )
            CopyButton(content)
        }
    }
}