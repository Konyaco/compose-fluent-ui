package com.konyaco.fluent.example

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.component.*
import com.konyaco.fluent.example.screen.HomeScreen
import com.konyaco.fluent.example.screen.TodoScreen
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.*

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun App() {

    Row(Modifier.fillMaxSize()) {
        var expanded by remember { mutableStateOf(true) }
        val (selectedItem, setSelectedItem) = remember {
            mutableStateOf(navs.first())
        }
        var selectedItemWithContent by remember {
            mutableStateOf(selectedItem)
        }
        LaunchedEffect(selectedItem) {
            if (selectedItem.content != null) {
                selectedItemWithContent = selectedItem
            }
        }
        var textFieldValue by remember {
            mutableStateOf(TextFieldValue())
        }
        SideNav(
            modifier = Modifier.fillMaxHeight(),
            expanded = expanded,
            onExpandStateChange = { expanded = it },
            title = { Text("Controls") },
            autoSuggestionBox = {
                TextField(
                    value = textFieldValue,
                    onValueChange = { textFieldValue = it },
                    modifier = Modifier.fillMaxWidth().focusHandle()
                )
            },
            footer = {
                NavigationItem(selectedItem, setSelectedItem, settingItem)
            }
        ) {
            navs.forEach { navItem ->

                NavigationItem(selectedItem, setSelectedItem, navItem)
                if (navItem.label == "All samples") {
                    NavigationItemSeparator(modifier = Modifier.padding(vertical = 2.dp))
                }
            }
        }

        AnimatedContent(selectedItemWithContent, Modifier.fillMaxHeight().weight(1f), transitionSpec = {
            fadeIn(tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)) +
                    slideInVertically(
                        tween(
                            FluentDuration.ShortDuration,
                            easing = FluentEasing.FastInvokeEasing
                        )
                    ) { it / 6 } with
                    fadeOut(tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing))
        }) {
            selectedItemWithContent.content?.invoke()
        }
    }
}

@Composable
private fun NavigationItem(
    selectedItem: NavItem,
    onSelectedItemChanged: (NavItem) -> Unit,
    navItem: NavItem
) {
    val expandedItems = remember {
        mutableStateOf(false)
    }
    SideNavItem(
        selectedItem == navItem,
        onClick = {
            onSelectedItemChanged(navItem)
            expandedItems.value = !expandedItems.value
        },
        icon = navItem.icon?.let { { Icon(it, navItem.label) } },
        content = { Text(navItem.label) },
        expandItems = expandedItems.value,
        items = navItem.nestedItems?.let {
            {
                it.forEach { nestedItem ->
                    NavigationItem(
                        selectedItem = selectedItem,
                        onSelectedItemChanged = onSelectedItemChanged,
                        navItem = nestedItem
                    )
                }
            }
        }
    )
}

private data class NavItem(
    val label: String,
    val icon: ImageVector? = null,
    val nestedItems: List<NavItem>? = null,
    val content: (@Composable () -> Unit)? = null,
)

// TODO Remove unnecessary pages
private val navs = listOf(
    NavItem(
        label = "Home",
        icon = Icons.Default.Home
    ) { HomeScreen() },
    NavItem(
        label = "Design guidance",
        icon = Icons.Default.Ruler,
        nestedItems = listOf(
            NavItem("Typography", Icons.Default.TextFont) {
                TodoScreen()
            },
            NavItem("Icons", Icons.Default.Diversity) {
                TodoScreen()
            },
            NavItem("Colors", Icons.Default.Color) {
                TodoScreen()
            },
            NavItem(
                label = "Accessibility",
                icon = Icons.Default.Accessibility,
                nestedItems = listOf(
                    NavItem("Screen reader support") { TodoScreen() },
                    NavItem("Keyboard support") { TodoScreen() },
                    NavItem("Color contrast") { TodoScreen() }
                )
            )
        )
    ),
    NavItem("All samples", Icons.Default.AppsList) { TodoScreen() },
    NavItem(
        label = "Basic input",
        icon = Icons.Default.CheckboxChecked,
        nestedItems = listOf(
            NavItem("InputValidation") { TodoScreen() },
            NavItem("Button") { TodoScreen() },
            NavItem("DropDownButton") { TodoScreen() },
            NavItem("HyperlinkButton") { TodoScreen() },
            NavItem("RepeatButton") { TodoScreen() },
            NavItem("ToggleButton") { TodoScreen() },
            NavItem("SplitButton") { TodoScreen() },
            NavItem("CheckBox") { TodoScreen() },
            NavItem("ColorPicker") { TodoScreen() },
            NavItem("ComboBox") { TodoScreen() },
            NavItem("RadioButton") { TodoScreen() },
            NavItem("RatingControl") { TodoScreen() },
            NavItem("Slider") { TodoScreen() },
            NavItem("ToggleSwitch") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Collections",
        icon = Icons.Default.Table,
        nestedItems = listOf(
            NavItem("FlipView") { TodoScreen() },
            NavItem("GridView") { TodoScreen() },
            NavItem("ListBox") { TodoScreen() },
            NavItem("ListView") { TodoScreen() },
            NavItem("PullToRefresh") { TodoScreen() },
            NavItem("TreeView") { TodoScreen() },
            NavItem("DataGrid") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Date & time",
        icon = Icons.Default.CalendarClock,
        nestedItems = listOf(
            NavItem("CalendarDatePicker") { TodoScreen() },
            NavItem("CalendarView") { TodoScreen() },
            NavItem("DatePicker") { TodoScreen() },
            NavItem("TimePicker") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Dialogs & flyouts",
        icon = Icons.Default.Chat,
        nestedItems = listOf(
            NavItem("ContentDialog") { TodoScreen() },
            NavItem("Flyout") { TodoScreen() },
            NavItem("TeachingTip") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Layout",
        icon = Icons.Default.SlideLayout,
        nestedItems = listOf(
            NavItem("Border") { TodoScreen() },
            NavItem("Canvas") { TodoScreen() },
            NavItem("Expander") { TodoScreen() },
            NavItem("ItemRepeater") { TodoScreen() },
            NavItem("Grid") { TodoScreen() },
            NavItem("RadioButtons") { TodoScreen() },
            NavItem("RelativePanel") { TodoScreen() },
            NavItem("SpiltView") { TodoScreen() },
            NavItem("StackPanel") { TodoScreen() },
            NavItem("VariableSizedWrapGrid") { TodoScreen() },
            NavItem("Viewbox") { TodoScreen() },
        )
    ) { TodoScreen() },
    NavItem(
        label = "Media",
        icon = Icons.Default.VideoClip,
        nestedItems = listOf(
            NavItem("AnimatedVisualPlayer") { TodoScreen() },
            NavItem("Image") { TodoScreen() },
            NavItem("MediaPlayerElement") { TodoScreen() },
            NavItem("PersonPicture") { TodoScreen() },
            NavItem("Sound") { TodoScreen() },
            NavItem("Webview") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Menus & toolbars",
        icon = Icons.Default.Save,
        nestedItems = listOf(
            NavItem("BasicUICommand") { TodoScreen() },
            NavItem("StandardUICommand") { TodoScreen() },
            NavItem("AppBarButton") { TodoScreen() },
            NavItem("AppBarSeparator") { TodoScreen() },
            NavItem("AppBarToggleButton") { TodoScreen() },
            NavItem("CommandBar") { TodoScreen() },
            NavItem("MenuBar") { TodoScreen() },
            NavItem("CommandBarFlyout") { TodoScreen() },
            NavItem("MenuFlyout") { TodoScreen() },
            NavItem("SwipeControl") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Motion",
        icon = Icons.Default.Flash,
        nestedItems = listOf(
            NavItem("Connected Animation") { TodoScreen() },
            NavItem("Easing Functions") { TodoScreen() },
            NavItem("Page Transitions") { TodoScreen() },
            NavItem("Theme Transitions") { TodoScreen() },
            NavItem("Animation interop") { TodoScreen() },
            NavItem("Implicit Transitions") { TodoScreen() },
            NavItem("ParallaxView") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Navigation",
        icon = Icons.Default.Navigation,
        nestedItems = listOf(
            NavItem("BreadcrumbBar") { TodoScreen() },
            NavItem("NavigationViw") { TodoScreen() },
            NavItem("Pivot") { TodoScreen() },
            NavItem("TabView") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Scrolling",
        icon = Icons.Default.ArrowSort,
        nestedItems = listOf(
            NavItem("PipsPager") { TodoScreen() },
            NavItem("ScrollViewer") { TodoScreen() },
            NavItem("SemanticZoom") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Status & info",
        icon = Icons.Default.ChatMultiple,
        nestedItems = listOf(
            NavItem("InfoBadge") { TodoScreen() },
            NavItem("InfoBar") { TodoScreen() },
            NavItem("ProgressBar") { TodoScreen() },
            NavItem("ProgressRing") { TodoScreen() },
            NavItem("Tooltip") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Styles",
        icon = Icons.Default.Color,
        nestedItems = listOf(
            NavItem("AcrylicBrush") { TodoScreen() },
            NavItem("AnimatedIcon") { TodoScreen() },
            NavItem("ColorPaletteResources") { TodoScreen() },
            NavItem("Compact Sizing") { TodoScreen() },
            NavItem("IconElement") { TodoScreen() },
            NavItem("RadialGradientBrush") { TodoScreen() },
            NavItem("Reveal Focus") { TodoScreen() },
            NavItem("Shape") { TodoScreen() },
            NavItem("Line") { TodoScreen() },
            NavItem("System Backdrops(Mica/Acrylic)") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "System",
        icon = Icons.Default.System,
        nestedItems = listOf(
            NavItem("Clipboard") { TodoScreen() },
            NavItem("FilePicker") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Text",
        icon = Icons.Default.TextFont,
        nestedItems = listOf(
            NavItem("AutoSuggestBox") { TodoScreen() },
            NavItem("NumberBox") { TodoScreen() },
            NavItem("PasswordBox") { TodoScreen() },
            NavItem("RichEditBox") { TodoScreen() },
            NavItem("RichTextBlock") { TodoScreen() },
            NavItem("TextBlock") { TodoScreen() },
            NavItem("TextBox") { TodoScreen() }
        )
    ) { TodoScreen() },
    NavItem(
        label = "Windowing",
        icon = Icons.Default.Window,
        nestedItems = listOf(
            NavItem("Multiple windows") { TodoScreen() },
            NavItem("TitleBar") { TodoScreen() }
        )
    ) { TodoScreen() },
)

private val settingItem = NavItem("Settings", Icons.Default.Settings) { TodoScreen() }