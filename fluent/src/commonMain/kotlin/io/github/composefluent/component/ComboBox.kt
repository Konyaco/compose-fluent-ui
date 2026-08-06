package io.github.composefluent.component

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import io.github.composefluent.LocalCompactMode
import io.github.composefluent.scheme.VisualStateScheme

/**
 * Use a combo box (also known as a drop-down list) to present a list of items that a user can select from.
 * A combo box starts in a compact state, displaying either a selected item or a placeholder, and expands to show a list of selectable items when interacted with.
 *
 * @param modifier Modifier to apply to the component.
 * @param header Optional header content displayed above the combo box.
 * @param placeholder Optional content displayed when no item is selected.
 * @param disabled Whether the combo box is disabled.
 * @param items The list of items to display in the combo box.
 * @param selected The index of the currently selected item, or null if no item is selected.
 * @param onSelectionChange Callback invoked when a new item is selected.
 * @param content Content used to represent an item in both the closed control and popup.
 *
 * TODO: Editable ComboBox
 */
@Composable
fun <T> ComboBox(
    items: List<T>,
    selected: Int?,
    onSelectionChange: (index: Int, item: T) -> Unit,
    modifier: Modifier = Modifier,
    header: (@Composable () -> Unit)? = null,
    placeholder: (@Composable () -> Unit)? = null,
    disabled: Boolean = false,
    content: @Composable (index: Int, item: T) -> Unit
) {
    var open by remember { mutableStateOf(false) }
    var size by remember { mutableStateOf<IntSize>(IntSize(0, 0)) }
    var popupMaxHeight by remember { mutableStateOf(Dp.Infinity) }
    val density = LocalDensity.current
    val calculatePopupMaxHeight = rememberFlyoutCalculateMaxHeight(flyoutDefaultPadding)
    Column(modifier) {
        if (header != null) {
            header()
            Spacer(Modifier.height(8.dp))
        }
        Box {
            DropDownButton(
                modifier = Modifier
                    .defaultMinSize(128.dp)
                    .onSizeChanged { size = it }
                    .onGloballyPositioned {
                        popupMaxHeight = with(density) {
                            calculatePopupMaxHeight(it).toDp()
                        }
                    },
                onClick = { open = true },
                disabled = disabled,
                contentArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    if (selected != null) {
                        content(selected, items[selected])
                    } else {
                        placeholder?.invoke()
                    }
                }
            }

            CompositionLocalProvider(
                LocalCompactMode provides false
            ) {
                ComboBoxPopup(
                    minWidth = with(LocalDensity.current) { size.width.toDp() },
                    maxHeight = popupMaxHeight,
                    expanded = open,
                    onDismissRequest = { open = false }
                ) {
                    items.fastForEachIndexed { i, s ->
                        item(selected = i == selected) {
                            ComboBoxItem(
                                selected = i == selected,
                                onSelectedChanged = {
                                    onSelectionChange(i, s)
                                    open = false
                                },
                                text = { content(i, s) },
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * String-based convenience overload retained for source compatibility.
 */
@Deprecated(
    message = "Use the generic ComboBox overload with composable header, placeholder, and item content."
)
@Composable
fun ComboBox(
    modifier: Modifier = Modifier,
    header: String? = null,
    placeholder: String? = null,
    disabled: Boolean = false,
    items: List<String>,
    selected: Int?,
    onSelectionChange: (index: Int, item: String) -> Unit
) {
    ComboBox(
        items = items,
        selected = selected,
        onSelectionChange = onSelectionChange,
        modifier = modifier,
        header = header?.let { value -> { Text(value) } },
        placeholder = placeholder?.let { value -> { Text(value) } },
        disabled = disabled,
        content = { _, item -> Text(item, overflow = TextOverflow.Ellipsis) }
    )
}

/**
 * Represents the colors used for an item in a ComboBox.
 *
 * @property fillColor The background color of the item.
 * @property contentColor The color of the text or other content within the item.
 */
@Deprecated(
    message = "Use ListItemColor instead.",
    replaceWith = ReplaceWith(
        expression = "ListItemColor",
        imports = ["io.github.composefluent.component.ListItemColor"]
    )
)
data class ItemColor(
    val fillColor: Color,
    val contentColor: Color
)

/**
 * A selectable item used by [ComboBox]. This overload is equivalent to [ListItem].
 */
@Composable
fun ComboBoxItem(
    selected: Boolean,
    onSelectedChanged: (Boolean) -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    selectionType: ListItemSelectionType = ListItemSelectionType.Standard,
    icon: (@Composable () -> Unit)? = null,
    trailing: (@Composable () -> Unit)? = null,
    interaction: MutableInteractionSource? = null,
    enabled: Boolean = true,
    colors: VisualStateScheme<ListItemColor> = if (selected) {
        ListItemDefaults.selectedListItemColors()
    } else {
        ListItemDefaults.defaultListItemColors()
    },
) {
    ListItem(
        selected = selected,
        onSelectedChanged = onSelectedChanged,
        text = text,
        modifier = modifier,
        selectionType = selectionType,
        icon = icon,
        trailing = trailing,
        interaction = interaction,
        enabled = enabled,
        colors = colors
    )
}

/**
 * String-based ComboBox item retained for source compatibility.
 */
@Deprecated(
    message = "Use the ComboBoxItem overload with composable text content."
)
@Composable
fun ComboBoxItem(
    selected: Boolean,
    label: String,
    onClick: () -> Unit
) {
    ComboBoxItem(
        selected = selected,
        onSelectedChanged = { onClick() },
        text = { Text(label) }
    )
}

/**
 * Scope for the content of a ComboBox.
 *
 * This scope provides functions to define the items within a [ComboBox].
 */
interface ComboBoxScope<T> {
    /**
     * Adds an item to the ComboBox.
     *
     * @param key A unique key to identify this item. This is not currently used, but may be used in the future for item management.
     * @param content The composable content to display for this item. It receives the item as a parameter.
     */
    fun Item(key: String, content: @Composable (item: T) -> Unit)
    /**
     * A [ComboBoxScope] item representing a string.
     *
     * @param label The string to display for this item.
     */
    fun StringItem(label: String)
}
