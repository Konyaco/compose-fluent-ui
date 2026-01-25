package io.github.composefluent.gallery.screen.test

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalContentColor
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.Layer
import io.github.composefluent.component.AccentButton
import io.github.composefluent.component.Button
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.ContentDialog
import io.github.composefluent.component.DropdownMenu
import io.github.composefluent.component.DropdownMenuItem
import io.github.composefluent.component.FlyoutContainer
import io.github.composefluent.component.FlyoutPlacement
import io.github.composefluent.component.Icon
import io.github.composefluent.component.MenuFlyoutContainer
import io.github.composefluent.component.MenuFlyoutItem
import io.github.composefluent.component.MenuFlyoutSeparator
import io.github.composefluent.component.ProgressBar
import io.github.composefluent.component.ProgressRing
import io.github.composefluent.component.ProgressRingSize
import io.github.composefluent.component.RadioButton
import io.github.composefluent.component.ScrollbarContainer
import io.github.composefluent.component.Slider
import io.github.composefluent.component.SubtleButton
import io.github.composefluent.component.Switcher
import io.github.composefluent.component.TabItem
import io.github.composefluent.component.TabRow
import io.github.composefluent.component.TabViewDefaults
import io.github.composefluent.component.Text
import io.github.composefluent.component.TextField
import io.github.composefluent.component.rememberScrollbarAdapter
import io.github.composefluent.gallery.LocalStore
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.Add
import io.github.composefluent.icons.regular.ArrowLeft
import io.github.composefluent.icons.regular.Checkmark
import io.github.composefluent.icons.regular.ClipboardMore
import io.github.composefluent.icons.regular.Delete
import io.github.composefluent.icons.regular.Dismiss
import io.github.composefluent.icons.regular.List
import io.github.composefluent.icons.regular.Navigation
import io.github.composefluent.surface.Card

@Composable
fun TestComponentScreen() {
    var displayDialog by remember { mutableStateOf(false) }
    val density = LocalDensity.current
    var scale by remember(density) { mutableStateOf(density.density) }
    val store = LocalStore.current

    Column(
        modifier = Modifier.verticalScroll(rememberScrollState()).padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Controller(
            scale = scale,
            onScaleChange = { scale = it },
            darkMode = store.darkMode,
            onDarkModeChange = { store.darkMode = it },
            acrylicPopupEnabled = store.enabledAcrylicPopup,
            onAcrylicPopupChange = { store.enabledAcrylicPopup = it },
            compactModeEnabled = store.compactMode,
            onCompactModeChange = { store.compactMode = it }
        )

        CompositionLocalProvider(LocalDensity provides Density(scale)) {
            Content()
        }

        AccentButton(onClick = {
            displayDialog = true
        }) { Text("Display Dialog") }

        Box {
            var expanded by remember { mutableStateOf(false) }

            Button(onClick = {
                expanded = true
            }) {
                Text("Show DropdownMenu")
            }

            fun close() {
                expanded = false
            }

            DropdownMenu(expanded, ::close) {
                DropdownMenuItem(::close) { Text("Option 1") }
                DropdownMenuItem(::close) { Text("Option 2") }
                DropdownMenuItem(::close) { Text("Option 3") }
            }
        }
        var currentPlacement by remember {
            mutableStateOf(FlyoutPlacement.Auto)
        }
        Row {

            FlyoutContainer(
                flyout = {
                    Text("this is a flyout")
                },
                placement = currentPlacement,
                content = {
                    Button(
                        onClick = { isFlyoutVisible = true }
                    ) {
                        Text("Open Flyout")
                    }
                }
            )
            Spacer(Modifier.width(8.dp))
            Box {
                var isFlyoutPlacementDropdownMenuOpened by remember {
                    mutableStateOf(false)
                }
                Button(onClick = {
                    isFlyoutPlacementDropdownMenuOpened = true
                }) {
                    Text("Flyout placement")
                }
                val item = @Composable { placement: FlyoutPlacement ->
                    DropdownMenuItem({
                        currentPlacement = placement
                        isFlyoutPlacementDropdownMenuOpened = false
                    }) {
                        Icon(
                            Icons.Default.Checkmark,
                            contentDescription = null,
                            modifier = Modifier.padding(end = 8.dp)
                                .alpha(if (placement == currentPlacement) 1f else 0f)
                        )
                        Text(text = placement.toString())
                    }
                }
                DropdownMenu(
                    isFlyoutPlacementDropdownMenuOpened,
                    { isFlyoutPlacementDropdownMenuOpened = false }) {
                    FlyoutPlacement.entries.forEach { item(it) }
                }
            }
        }

        MenuFlyoutContainer(
            placement = currentPlacement,
            flyout = {
                MenuFlyoutItem(
                    onClick = {

                    },
                    icon = {
                        Icon(Icons.Default.Delete, contentDescription = null)
                    },
                    text = {
                        Text("Delete")
                    }
                )
                MenuFlyoutSeparator()
                MenuFlyoutItem(
                    onClick = {

                    },
                    icon = {
                        Icon(Icons.Default.Add, contentDescription = null)
                    },
                    text = {
                        Text("Add")
                    }
                )
                MenuFlyoutSeparator()
                MenuFlyoutItem(
                    onClick = {},
                    icon = {},
                    text = { Text("Test") }
                )
                MenuFlyoutItem(
                    items = {
                        MenuFlyoutItem(
                            onClick = {

                            },
                            icon = {
                                Icon(Icons.Default.Add, contentDescription = null)
                            },
                            text = {
                                Text("Add")
                            }
                        )
                    },
                    icon = {
                        Icon(Icons.Default.ClipboardMore, contentDescription = null)
                    },
                    text = {
                        Text("More")
                    }
                )
            },
            content = {
                Button(
                    onClick = { isFlyoutVisible = !isFlyoutVisible }
                ) {
                    Text("Open MenuFlyout")
                }
            }
        )
    }

    ContentDialog(
        title = "This is an example dialog",
        visible = displayDialog,
        primaryButtonText = "Confirm",
        closeButtonText = "Cancel",
        onButtonClick = { displayDialog = false },
        content = {
            Text(
                "This is body text. Windows 11 marks a visual evolution of the operating system. We have evolved our design language alongside with Fluent to create a design which is human, universal and truly feels like Windows. \n" +
                        "\n" +
                        "The design principles below have guided us throughout the journey of making Windows the best-in-class implementation of Fluent.\n"
            )
        }
    )
}


@Composable
private fun Controller(
    scale: Float,
    onScaleChange: (Float) -> Unit,
    darkMode: Boolean,
    onDarkModeChange: (Boolean) -> Unit,
    acrylicPopupEnabled: Boolean,
    onAcrylicPopupChange: (Boolean) -> Unit,
    compactModeEnabled: Boolean,
    onCompactModeChange: (Boolean) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Scale: ${scale.toString().take(4)}")
        val density = LocalDensity.current
        Button(onClick = { onScaleChange(density.density) }) { Text("Reset") }
        Switcher(darkMode, text = "Dark Mode", onCheckStateChange = { onDarkModeChange(it) })
        Switcher(
            acrylicPopupEnabled,
            text = "Acrylic Popup",
            onCheckStateChange = { onAcrylicPopupChange(it) })
        Switcher(
            compactModeEnabled,
            text = "Compact Mode",
            onCheckStateChange = { onCompactModeChange(it) })
    }
    Slider(
        modifier = Modifier.width(200.dp),
        value = scale,
        onValueChange = { onScaleChange(it) },
        valueRange = 1f..10f
    )
}

@Composable
private fun Content() {

    var sliderValue by remember { mutableStateOf(0.5f) }
    Slider(
        modifier = Modifier.width(200.dp),
        value = sliderValue,
        onValueChange = { sliderValue = it },
    )
    Buttons()

    Controls()

    val layerScrollState = rememberScrollState()
    ScrollbarContainer(
        adapter = rememberScrollbarAdapter(layerScrollState),
        isVertical = false
    ) {
        Row(modifier = Modifier.padding(bottom = 8.dp).horizontalScroll(layerScrollState)) {
            Box {
                Box(Modifier.size(32.dp).background(FluentTheme.colors.fillAccent.default))
            }

            Layer(
                shape = FluentTheme.shapes.control,
                color = FluentTheme.colors.fillAccent.default,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.control.default),
                content = {
                    Box(Modifier.size(32.dp))
                },
                backgroundSizing = BackgroundSizing.InnerBorderEdge
            )
            Layer(
                shape = FluentTheme.shapes.control,
                color = FluentTheme.colors.fillAccent.default,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.control.default),
                content = {
                    Box(Modifier.size(32.dp))
                },
                backgroundSizing = BackgroundSizing.OuterBorderEdge
            )

            Layer(
                shape = CutCornerShape(4.dp),
                color = FluentTheme.colors.fillAccent.default,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.control.default.copy(0.5f)),
                content = {
                    Box(Modifier.size(32.dp))
                },
                backgroundSizing = BackgroundSizing.InnerBorderEdge
            )
            Layer(
                shape = CutCornerShape(4.dp),
                color = FluentTheme.colors.fillAccent.default,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.control.default.copy(0.5f)),
                content = {
                    Box(Modifier.size(32.dp))
                },
                backgroundSizing = BackgroundSizing.OuterBorderEdge
            )

            Layer(
                shape = CircleShape,
                color = FluentTheme.colors.fillAccent.default,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.control.default),
                content = {
                    Box(Modifier.size(32.dp))
                },
                backgroundSizing = BackgroundSizing.InnerBorderEdge
            )
            Layer(
                shape = CircleShape,
                color = FluentTheme.colors.fillAccent.default,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.control.default),
                content = {
                    Box(Modifier.size(32.dp))
                },
                backgroundSizing = BackgroundSizing.OuterBorderEdge
            )

            Card(Modifier) {
                Box(Modifier.size(32.dp))
            }
        }
    }
    var value by remember { mutableStateOf(TextFieldValue("Hello Fluent!")) }
    TextField(value, onValueChange = { value = it })
    TextField(
        value = value, onValueChange = { value = it }, enabled = false,
        header = { Text("With Header") }
    )

    // ProgressRings
    Row(
        horizontalArrangement = Arrangement.spacedBy(32.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        ProgressRing(size = ProgressRingSize.Medium)
        ProgressRing(progress = sliderValue)
        AccentButton(onClick = {}) {
            ProgressRing(size = ProgressRingSize.Small, color = LocalContentColor.current)
            Text("Small")
        }
    }

    ProgressBar(sliderValue)
    ProgressBar()

    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        for (imageVector in icons) {
            Icon(
                modifier = Modifier.size(18.dp),
                imageVector = imageVector, contentDescription = null
            )
        }
    }

    val selectedKey = remember { mutableStateOf(0) }
    val tabItems = remember { mutableStateListOf(0, 1, 2, 3, 4) }
    TabRow(
        selectedKey = { selectedKey.value },
        borderColor = FluentTheme.colors.stroke.card.default,
    ) {
        items(tabItems, key = { it }) { index ->
            TabItem(
                selected = index == selectedKey.value,
                onSelectedChanged = { selectedKey.value = index },
                content = { Text(index.toString()) },
                colors = if (index == selectedKey.value) {
                    TabViewDefaults.selectedItemTitleBarColors()
                } else {
                    TabViewDefaults.defaultItemTitleBarColors()
                },
                endDividerVisible = index != selectedKey.value - 1,
                modifier = Modifier.widthIn(60.dp)
            )
        }
        item {
            TabViewDefaults.TabAddButton(
                onClick = { tabItems.add(tabItems.size) }
            )
        }
    }
}

@Composable
private fun Controls() {
    var checked by remember { mutableStateOf(false) }
    Switcher(checked, text = null, onCheckStateChange = { checked = it })

    var checked2 by remember { mutableStateOf(true) }
    Switcher(checked2, text = "With Label", onCheckStateChange = { checked2 = it })

    var checked3 by remember { mutableStateOf(true) }
    Switcher(
        checked3,
        text = "Before Label",
        textBefore = true,
        onCheckStateChange = { checked3 = it }
    )

    var checked4 by remember { mutableStateOf(false) }
    CheckBox(checked4) { checked4 = it }

    var checked5 by remember { mutableStateOf(true) }
    CheckBox(checked5, label = "With Label") { checked5 = it }

    var selectedRadio by remember { mutableStateOf(0) }
    RadioButton(selectedRadio == 0, onClick = { selectedRadio = 0 })
    RadioButton(selectedRadio == 1, onClick = { selectedRadio = 1 }, label = "With Label")
}

@Composable
private fun Buttons() {
    var text by remember { mutableStateOf("Hello World") }
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        val onClick = { text = "Hello, Fluent Design!" }
        Button(onClick) { Text(text) }

        AccentButton(onClick) {
            Icon(Icons.Default.Checkmark, contentDescription = null)
            Text(text)
        }

        SubtleButton(onClick) {
            Text("Text Button")
        }
    }
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        AccentButton({}, iconOnly = true) {
            Icon(Icons.Default.Navigation, contentDescription = null)
        }
        Button({}, iconOnly = true) {
            Icon(Icons.Default.Navigation, contentDescription = null)
        }
        SubtleButton({}, iconOnly = true) {
            Icon(Icons.Default.Navigation, contentDescription = null)
        }
    }
}

private val icons = arrayOf(
    Icons.Default.Add,
    Icons.Default.Delete,
    Icons.Default.Dismiss,
    Icons.Default.ArrowLeft,
    Icons.Default.Navigation,
    Icons.Default.List
)