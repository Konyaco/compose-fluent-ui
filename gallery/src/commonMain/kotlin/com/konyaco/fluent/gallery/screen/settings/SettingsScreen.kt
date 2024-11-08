package com.konyaco.fluent.gallery.screen.settings

import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.build.BuildKonfig
import com.konyaco.fluent.component.CardExpanderItem
import com.konyaco.fluent.component.Expander
import com.konyaco.fluent.component.ExpanderItem
import com.konyaco.fluent.component.ExpanderItemSeparator
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.ScrollbarContainer
import com.konyaco.fluent.component.Switcher
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.rememberScrollbarAdapter
import com.konyaco.fluent.gallery.LocalStore
import com.konyaco.fluent.gallery.ProjectUrl
import com.konyaco.fluent.gallery.component.ComponentItem
import com.konyaco.fluent.gallery.component.ComponentNavigator
import com.konyaco.fluent.gallery.screen.test.TestComponentScreen
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Blur
import com.konyaco.fluent.icons.regular.Bug
import com.konyaco.fluent.icons.regular.Color
import com.konyaco.fluent.icons.regular.List
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun SettingsScreen(componentNavigator: ComponentNavigator) {
    val scrollState = rememberScrollState()
    Column {
        Text(
            text = "Settings",
            style = FluentTheme.typography.titleLarge,
            modifier = Modifier.alignHorizontalSpace()
                .padding(top = 36.dp)
        )
        ScrollbarContainer(
            adapter = rememberScrollbarAdapter(scrollState)
        ) {
            val store = LocalStore.current
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp),
                modifier = Modifier
                    .verticalScroll(scrollState)
                    .alignHorizontalSpace()
                    .padding(top = 8.dp)
                    .padding(bottom = 24.dp)
            ) {
                Header("Appearance & behavior")
                CardExpanderItem(
                    heading = {
                        Text("App Theme")
                    },
                    icon = {
                        Icon(Icons.Regular.Color, contentDescription = null)
                    },
                    caption = {
                        Text("Select which app theme to display")
                    },
                    trailing = {
                        Switcher(
                            checked = store.darkMode,
                            text = if (store.darkMode) "Dark" else "Light",
                            textBefore = true,
                            onCheckStateChange = { store.darkMode = it }
                        )
                    }
                )
                CardExpanderItem(
                    heading = {
                        Text("Acrylic Flyout")
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Regular.Blur,
                            contentDescription = "Blur"
                        )
                    },
                    caption = {
                        Text("Enable Acrylic effect on Flyout")
                    },
                    trailing = {
                        Switcher(
                            checked = store.enabledAcrylicPopup,
                            text = if (store.enabledAcrylicPopup) "On" else "Off",
                            textBefore = true,
                            onCheckStateChange = { store.enabledAcrylicPopup = it }
                        )
                    }
                )
                CardExpanderItem(
                    heading = {
                        Text("Compact Mode")
                    },
                    icon = {
                        Icon(
                            imageVector = Icons.Regular.List,
                            contentDescription = "List"
                        )
                    },
                    caption = {
                        Text("Adjust ListItem height")
                    },
                    trailing = {
                        Switcher(
                            checked = store.compactMode,
                            text = if (store.compactMode) "Compact" else "Standard",
                            textBefore = true,
                            onCheckStateChange = { store.compactMode = it }
                        )
                    }
                )
                // Hide this test component if gallery is release version.
                if (!BuildKonfig.CURRENT_BRANCH.equals("master", false)) {
                    Header("Test")
                    CardExpanderItem(
                        heading = {
                            Text("Test Component")
                        },
                        caption = {
                            Text("Test Component with some settings like scale fraction and dark theme")
                        },
                        onClick = {
                            componentNavigator.navigate(testComponent)
                        },
                        icon = {
                            Icon(Icons.Regular.Bug, contentDescription = null)
                        }
                    )
                }
                Header("About")
                Expander(
                    heading = {
                        Text("Compose Fluent Design Gallery")
                    },
                    icon = {
                        Image(
                            painter = painterResource(Res.drawable.icon),
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                    },
                    caption = {},
                    trailing = {
                        Text(BuildKonfig.GALLERY_VERSION)
                    },
                    expandContent = {

                        ExpanderItem(
                            icon = {},
                            heading = {
                                Text("To clone this repository")
                            },
                            trailing = {
                                SelectionContainer {
                                    Text("git clone ${ProjectUrl.ROOT}.git")
                                }
                            }
                        )

                        ExpanderItemSeparator()

                        ExpanderItem(
                            heading = {
                                Text("Compose Fluent Design")
                            },
                            trailing = {
                                Text(BuildKonfig.LIBRARY_VERSION)
                            }
                        )
                        ExpanderItemSeparator()
                        ExpanderItem(
                            heading = {
                                Text("Kotlin")
                            },
                            trailing = {
                                Text(BuildKonfig.KOTLIN_VERSION)
                            }
                        )
                        ExpanderItemSeparator()
                        ExpanderItem(
                            heading = {
                                Text("Compose Multiplatform")
                            },
                            trailing = {
                                Text(BuildKonfig.COMPOSE_VERSION)
                            }
                        )
                        ExpanderItemSeparator()
                        ExpanderItem(
                            heading = {
                                Text("Haze")
                            },
                            trailing = {
                                Text(BuildKonfig.HAZE_VERSION)
                            },
                        )
                    }
                )
            }
        }
    }
}

fun Modifier.alignHorizontalSpace() = then(
    Modifier
        .fillMaxWidth()
        .wrapContentWidth(align = Alignment.CenterHorizontally)
        .padding(horizontal = 32.dp)
        .widthIn(max = 1000.dp)
        .fillMaxWidth()
)

@Composable
private fun Header(text: String) {
    Text(
        text = text,
        style = FluentTheme.typography.bodyStrong,
        modifier = Modifier.padding(top = 16.dp, bottom = 4.dp)
    )
}

@Composable
private fun Expander(
    heading: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource? = null,
    shape: Shape = FluentTheme.shapes.control,
    icon: (@Composable () -> Unit)? = {},
    caption: @Composable () -> Unit = {},
    trailing: @Composable () -> Unit = {},
    expandContent: (@Composable ColumnScope.() -> Unit) = {},
) {
    var expanded by rememberSaveable { mutableStateOf(false) }
    Expander(
        expanded = expanded,
        onExpandedChanged = { expanded = it },
        heading = heading,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        shape = shape,
        icon = icon,
        caption = caption,
        trailing = trailing,
        expandContent = expandContent
    )
}

private val testComponent = ComponentItem(
    name = "Test Component",
    description = "Test Component with some settings like scale fraction and dark theme",
    group = "settings",
    content = { TestComponentScreen() }
)