package io.github.composefluent.component

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.selectAll
import androidx.compose.foundation.text.input.setTextAndPlaceCursorAtEnd
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.layout.positionInParent
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalCompactMode
import io.github.composefluent.ProvideTextStyle
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.ElevationDefaults
import io.github.composefluent.scheme.PentaVisualScheme
import io.github.composefluent.scheme.VisualState
import io.github.composefluent.scheme.VisualStateScheme
import io.github.composefluent.scheme.collectVisualState
import io.github.composefluent.scheme.map
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.roundToInt
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.first

/**
 * Colors used to render a ComboBox in one visual state.
 *
 * Supply instances through [ComboBoxDefaults.colors] or [ComboBoxDefaults.editableColors]
 * to customize the colors for each interaction state.
 *
 * @property headerColor Color of the optional header displayed above the control.
 * @property placeholderColor Color of placeholder content when no value is displayed.
 * @property contentColor Color of the selected value or editable text.
 * @property fillColor Background color of the closed control.
 * @property borderBrush Brush used to draw the control border.
 */
@Stable
data class ComboBoxColors(
    val headerColor: Color,
    val placeholderColor: Color,
    val contentColor: Color,
    val fillColor: Color,
    val borderBrush: Brush,
)

/** Default color schemes for ComboBox components. */
object ComboBoxDefaults {

    /**
     * Creates the color scheme used by [ComboBox] and [LazyComboBox].
     *
     * @param default Colors used when the control has no active interaction.
     * @param hovered Colors used while the pointer is over the control.
     * @param pressed Colors used while the control is pressed.
     * @param disabled Colors used when the control is disabled.
     * @return A visual-state scheme containing the supplied colors.
     */
    @Stable
    @Composable
    fun colors(
        default: ComboBoxColors = ComboBoxColors(
            headerColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.secondary,
            contentColor = FluentTheme.colors.text.text.primary,
            fillColor = FluentTheme.colors.control.default,
            borderBrush = FluentTheme.colors.borders.control,
        ),
        hovered: ComboBoxColors = ComboBoxColors(
            headerColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.secondary,
            contentColor = FluentTheme.colors.text.text.primary,
            fillColor = FluentTheme.colors.control.secondary,
            borderBrush = FluentTheme.colors.borders.control,
        ),
        pressed: ComboBoxColors = ComboBoxColors(
            headerColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary,
            fillColor = FluentTheme.colors.control.tertiary,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default),
        ),
        disabled: ComboBoxColors = ComboBoxColors(
            headerColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.disabled,
            contentColor = FluentTheme.colors.text.text.disabled,
            fillColor = FluentTheme.colors.control.disabled,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default),
        ),
    ) = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled,
    )

    /**
     * Creates the color scheme used by [EditableComboBox] and [LazyEditableComboBox].
     *
     * @param default Colors used when the control has no active interaction.
     * @param hovered Colors used while the pointer is over the control.
     * @param pressed Colors used while the control is pressed.
     * @param disabled Colors used when the control is disabled.
     * @param focused Colors used while the text field has input focus.
     * @return A visual-state scheme containing the supplied colors.
     */
    @Stable
    @Composable
    fun editableColors(
        default: ComboBoxColors = ComboBoxColors(
            headerColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.secondary,
            contentColor = FluentTheme.colors.text.text.primary,
            fillColor = FluentTheme.colors.control.default,
            borderBrush = FluentTheme.colors.borders.control,
        ),
        hovered: ComboBoxColors = ComboBoxColors(
            headerColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.secondary,
            contentColor = FluentTheme.colors.text.text.primary,
            fillColor = FluentTheme.colors.control.secondary,
            borderBrush = FluentTheme.colors.borders.control,
        ),
        pressed: ComboBoxColors = ComboBoxColors(
            headerColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.tertiary,
            contentColor = FluentTheme.colors.text.text.secondary,
            fillColor = FluentTheme.colors.control.tertiary,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default),
        ),
        disabled: ComboBoxColors = ComboBoxColors(
            headerColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.disabled,
            contentColor = FluentTheme.colors.text.text.disabled,
            fillColor = FluentTheme.colors.control.disabled,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default),
        ),
        focused: ComboBoxColors = ComboBoxColors(
            headerColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.primary,
            contentColor = FluentTheme.colors.text.text.primary,
            fillColor = FluentTheme.colors.control.inputActive,
            borderBrush = FluentTheme.colors.borders.control,
        ),
    ) = PentaVisualScheme(
        default = default,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled,
        focused = focused,
    )
}

/**
 * Displays a non-editable drop-down list from which the user can select one item.
 *
 * The closed control displays [placeholder] when [selected] is `null`, or the selected item's
 * [content] otherwise. Opening the control shows all [items] and aligns the selected item with
 * the closed control when the available window space permits it.
 *
 * Use [LazyComboBox] instead when composing every item would be expensive.
 *
 * @param T Type of each item in [items].
 * @param items Items displayed in the popup.
 * @param selected Index of the selected item, or `null` when no item is selected. A non-null
 * value must be a valid index in [items].
 * @param onSelectionChange Called with the selected index and item after an item is clicked.
 * @param modifier Modifier applied to the component, including its optional header.
 * @param header Optional composable displayed above the closed control.
 * @param placeholder Optional composable displayed when [selected] is `null`.
 * @param disabled Whether the control ignores user interaction and uses disabled colors.
 * @param compactItem Whether popup items use compact ListItem sizing.
 * @param colorScheme Colors resolved for the control's current visual state.
 * @param interaction Optional interaction source used by the closed control.
 * @param content Composable representation of an item. It receives the item's index and value
 * and is used by both the closed control and popup.
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
    compactItem: Boolean = false,
    colorScheme: VisualStateScheme<ComboBoxColors> = ComboBoxDefaults.colors(),
    interaction: MutableInteractionSource? = null,
    content: @Composable (index: Int, item: T) -> Unit
) {
    var open by remember { mutableStateOf(false) }
    var size by remember { mutableStateOf<IntSize>(IntSize(0, 0)) }
    var popupMaxHeight by remember { mutableStateOf(Dp.Infinity) }
    ComboBoxLayout(
        modifier = modifier,
        header = header,
        compactItem = compactItem,
        colorScheme = colorScheme,
        popup = {
            ComboBoxPopup(
                minWidth = with(LocalDensity.current) { size.width.toDp() },
                maxHeight = popupMaxHeight,
                expanded = open,
                hasSelectedItem = selected != null,
                onDismissRequest = { open = false }
            ) {
                items.fastForEachIndexed { i, s ->
                    Item(selected = i == selected) {
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
        },
        disabled = disabled,
        focusedFirst = false,
        interaction = interaction,
        field = { colors, interaction ->
            ComboBoxField(
                placeholder = placeholder,
                colors = colors,
                selected = selected,
                content = content,
                disabled = disabled,
                onClick = { open = true },
                onFieldHeightChanged = { popupMaxHeight = it },
                onSizeChanged = { size = it },
                items = items,
                interaction = interaction,
                colorScheme = colorScheme,
                modifier = Modifier,
            )
        }
    )
}

@Composable
private fun <T> ComboBoxField(
    placeholder: (@Composable () -> Unit)?,
    colors: ComboBoxColors,
    colorScheme: VisualStateScheme<ComboBoxColors>,
    selected: Int?,
    content: @Composable (index: Int, item: T) -> Unit,
    disabled: Boolean,
    onClick: () -> Unit,
    onFieldHeightChanged: (height: Dp) -> Unit,
    onSizeChanged: (size: IntSize) -> Unit,
    items: List<T>,
    interaction: MutableInteractionSource,
    modifier: Modifier,
) {

    val density = LocalDensity.current
    val calculatePopupMaxHeight = rememberFlyoutCalculateMaxHeight(flyoutDefaultPadding)
    DropDownButton(
        interaction = interaction,
        buttonColors = colorScheme.map { ButtonColor(fillColor, contentColor, borderBrush) },
        modifier = modifier
            .defaultMinSize(ComboBoxMinWidth)
            .onSizeChanged(onSizeChanged)
            .onGloballyPositioned {
                onFieldHeightChanged(with(density) {
                    calculatePopupMaxHeight(it).toDp()
                })
            },
        onClick = onClick,
        disabled = disabled,
        contentArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (selected != null) {
                content(selected, items[selected])
            } else {
                if (placeholder != null) {
                    ProvideTextStyle(
                        value = FluentTheme.typography.body.merge(colors.placeholderColor),
                        content = placeholder
                    )
                }
            }
        }
    }
}

@Composable
private fun ComboBoxLayout(
    modifier: Modifier,
    header: (@Composable () -> Unit)?,
    disabled: Boolean,
    focusedFirst: Boolean,
    compactItem: Boolean,
    interaction: MutableInteractionSource?,
    colorScheme: VisualStateScheme<ComboBoxColors>,
    popup: @Composable () -> Unit,
    field: @Composable ( colors: ComboBoxColors, interactionSource: MutableInteractionSource) -> Unit,
) {

    val targetInteraction = interaction ?: remember { MutableInteractionSource() }
    val visualState = targetInteraction.collectVisualState(disabled = disabled, focusedFirst)
    val colors = colorScheme.schemeFor(visualState)
    Column(modifier) {
        if (header != null) {
            ProvideTextStyle(
                value = FluentTheme.typography.body.merge(colors.headerColor),
                content = header,
            )
            Spacer(Modifier.height(8.dp))
        }
        Box {
            field(colors, targetInteraction)
            CompositionLocalProvider(
                LocalCompactMode provides compactItem
            ) {
                popup()
            }
        }
    }
}

/**
 * String-based convenience overload retained for source compatibility.
 *
 * @param modifier Modifier applied to the component, including its optional header.
 * @param header Optional text displayed above the closed control.
 * @param placeholder Optional text displayed when [selected] is `null`.
 * @param disabled Whether the control ignores user interaction and uses disabled colors.
 * @param items Strings displayed in the popup.
 * @param selected Index of the selected item, or `null` when no item is selected.
 * @param onSelectionChange Called with the selected index and value after an item is clicked.
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
 *
 * @param selected Whether this item is currently selected.
 * @param onSelectedChanged Called with the requested selection state when the item is clicked.
 * @param text Primary composable content displayed by the item.
 * @param modifier Modifier applied to the item.
 * @param selectionType Visual treatment used to indicate selection.
 * @param icon Optional leading icon.
 * @param trailing Optional content displayed after [text].
 * @param interaction Optional interaction source used by the item.
 * @param enabled Whether the item accepts user interaction.
 * @param colors Colors resolved for the item's current visual state.
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
 *
 * @param selected Whether this item is currently selected.
 * @param label Text displayed by the item.
 * @param onClick Called when the item is clicked.
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
 *
 * @param T Type of the items represented by this scope.
 */
interface ComboBoxScope<T> {
    /**
     * Adds an item to the ComboBox.
     *
     * @param key A unique key identifying this item. It is reserved for future item management.
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

private val ComboBoxPopupContentPadding = 4.dp

internal fun comboBoxPopupVerticalRange(
    windowHeight: Int,
    popupHeight: Int,
    preferredPadding: Int
): IntRange {
    val availablePosition = (windowHeight - popupHeight).coerceAtLeast(0)
    val windowPadding = preferredPadding.coerceAtMost(availablePosition / 2)
    return windowPadding..(availablePosition - windowPadding)
}

private enum class ComboBoxPopupReveal {
    Centered,
    Directional
}

@Composable
private fun ComboBoxPopupSurface(
    expanded: Boolean,
    positionProvider: FlyoutPositionProvider,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = FluentTheme.shapes.overlay,
    contentPadding: PaddingValues = PaddingValues(vertical = ComboBoxPopupContentPadding),
    initialElevation: Dp = 1.dp,
    reveal: ComboBoxPopupReveal = ComboBoxPopupReveal.Centered,
    revealOriginY: () -> Int = { 0 },
    opensUpward: () -> Boolean = { false },
    content: @Composable () -> Unit
) {
    if (!expanded) return

    val revealProgress = remember(positionProvider) { Animatable(0f) }
    val shadowElevationProgress = remember(positionProvider) { Animatable(0f) }

    LaunchedEffect(positionProvider.applyAnimation) {
        if (positionProvider.applyAnimation) {
            revealProgress.animateTo(
                targetValue = 1f,
                animationSpec = tween(
                    durationMillis = FluentDuration.ShortDuration,
                    easing = FluentEasing.FastInvokeEasing
                )
            )
            shadowElevationProgress.animateTo(
                targetValue = 1f,
                animationSpec = tween(
                    durationMillis = FluentDuration.LongDuration,
                    easing = FluentEasing.PointToPointEasing
                )
            )
        }
    }

    BasicFlyout(
        visible = true,
        onDismissRequest = onDismissRequest,
        modifier = modifier.drawWithContent {
            val progress = revealProgress.value
            if (progress < 1f) {
                when (reveal) {
                    ComboBoxPopupReveal.Centered -> {
                        val origin = revealOriginY().toFloat().coerceIn(0f, size.height)
                        val offsetFromCenter = abs(origin - size.height / 2f)
                        val initialHalfHeight = max(size.height / 4f, offsetFromCenter)
                        val finalHalfHeight = max(origin, size.height - origin)
                        val halfHeight = initialHalfHeight +
                            (finalHalfHeight - initialHalfHeight) * progress
                        clipRect(
                            left = -size.width,
                            top = (origin - halfHeight).coerceAtLeast(0f),
                            right = size.width * 2f,
                            bottom = (origin + halfHeight).coerceAtMost(size.height)
                        ) {
                            this@drawWithContent.drawContent()
                        }
                    }

                    ComboBoxPopupReveal.Directional -> {
                        val top = if (opensUpward()) size.height * (1f - progress) else 0f
                        val bottom = if (opensUpward()) size.height else size.height * progress
                        clipRect(
                            left = -size.width,
                            top = top,
                            right = size.width * 2f,
                            bottom = bottom
                        ) {
                            this@drawWithContent.drawContent()
                        }
                    }
                }
            } else {
                drawContent()
            }
        },
        enterPlacementAnimation = { EnterTransition.None },
        exitTransition = ExitTransition.None,
        shape = shape,
        contentPadding = contentPadding,
        positionProvider = positionProvider,
        elevation = initialElevation +
            (ElevationDefaults.flyout - initialElevation) * shadowElevationProgress.value
    ) {
        content()
    }
}

@Composable
internal fun ComboBoxPopup(
    expanded: Boolean,
    minWidth: Dp,
    maxHeight: Dp,
    hasSelectedItem: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable ComboBoxPopupScope.() -> Unit
) {
    if (!expanded) return

    val density = LocalDensity.current
    val scrollState = rememberScrollState()
    val positionProvider = remember(density, scrollState, hasSelectedItem) {
        ComboBoxPopupPositionProvider(
            density = density,
            scrollState = scrollState,
            hasSelectedItem = hasSelectedItem
        )
    }
    val scope = remember(positionProvider, scrollState) {
        ComboBoxPopupScopeImpl { top, bottom ->
            if (scrollState.value == 0) {
                positionProvider.selectedItemTop = top
                positionProvider.selectedItemBottom = bottom
            }
        }
    }

    LaunchedEffect(positionProvider) {
        snapshotFlow { positionProvider.requestedScrollDelta }.collect { requestedDelta ->
            if (requestedDelta != 0) {
                val delta = positionProvider.consumeScrollRequest(requestedDelta)
                if (delta != 0) scrollState.scrollBy(delta.toFloat())
            }
        }
    }

    ComboBoxPopupSurface(
        expanded = expanded,
        positionProvider = positionProvider,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        revealOriginY = { positionProvider.revealOriginY }
    ) {
        ScrollbarContainer(
            adapter = rememberScrollbarAdapter(scrollState)
        ) {
            Column(
                modifier = Modifier
                    .width(IntrinsicSize.Max)
                    .widthIn(min = minWidth.coerceAtLeast(0.dp))
                    .heightIn(max = maxHeight)
                    .verticalScroll(scrollState),
                content = { scope.content() }
            )
        }
    }
}

@Stable
internal interface ComboBoxPopupScope {
    @Composable
    fun Item(
        selected: Boolean,
        content: @Composable () -> Unit
    )
}

private class ComboBoxPopupScopeImpl(
    private val onSelectedItemPositioned: (top: Int, bottom: Int) -> Unit
) : ComboBoxPopupScope {
    @Composable
    override fun Item(
        selected: Boolean,
        content: @Composable () -> Unit
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .then(
                    if (selected) {
                        Modifier.onGloballyPositioned { coordinates ->
                            val top = coordinates.positionInParent().y.roundToInt()
                            onSelectedItemPositioned(top, top + coordinates.size.height)
                        }
                    } else {
                        Modifier
                    }
                )
        ) {
            content()
        }
    }
}

@Stable
private class ComboBoxPopupPositionProvider(
    density: Density,
    private val scrollState: ScrollState,
    private val hasSelectedItem: Boolean
) : FlyoutPositionProvider(density) {
    private val contentPadding = with(density) { ComboBoxPopupContentPadding.roundToPx() }
    private val windowPadding = with(density) { flyoutDefaultPadding.roundToPx() }

    var revealOriginY by mutableIntStateOf(0)
        private set

    var requestedScrollDelta by mutableIntStateOf(0)
        private set

    var selectedItemTop by mutableIntStateOf(Int.MIN_VALUE)
    var selectedItemBottom by mutableIntStateOf(Int.MIN_VALUE)

    private var lockedPopupY by mutableIntStateOf(Int.MIN_VALUE)

    fun consumeScrollRequest(requestedDelta: Int): Int {
        if (requestedScrollDelta != requestedDelta) return 0
        requestedScrollDelta = 0
        return requestedDelta
    }

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        val selectedItemMeasured = this.selectedItemTop != Int.MIN_VALUE
        val selectedItemPositioned = !hasSelectedItem || selectedItemMeasured
        val selectedItemTop = if (selectedItemMeasured) {
            this.selectedItemTop
        } else {
            0
        }
        val selectedItemBottom = if (selectedItemMeasured) {
            this.selectedItemBottom
        } else {
            popupContentSize.height
        }
        val selectedItemCenter = if (selectedItemMeasured) {
            (selectedItemTop + selectedItemBottom) / 2 + contentPadding
        } else {
            popupContentSize.height / 2
        }
        val maxScroll = scrollState.maxValue
        val popupVerticalRange = comboBoxPopupVerticalRange(
            windowHeight = windowSize.height,
            popupHeight = popupContentSize.height,
            preferredPadding = windowPadding
        )
        val anchorCenterY = anchorBounds.center.y

        val popupY = if (lockedPopupY != Int.MIN_VALUE) {
            lockedPopupY.coerceIn(popupVerticalRange)
        } else {
            val unscrolledY = anchorCenterY - selectedItemCenter
            val viewportHeight = (popupContentSize.height - contentPadding * 2).coerceAtLeast(0)
            val minScrollForVisibility = if (selectedItemMeasured) {
                (selectedItemBottom - viewportHeight).coerceAtLeast(0)
            } else {
                0
            }
            val maxScrollForVisibility = if (selectedItemMeasured) {
                selectedItemTop.coerceAtMost(maxScroll)
            } else {
                maxScroll
            }
            val minScrollForPosition = popupVerticalRange.first - unscrolledY
            val maxScrollForPosition = popupVerticalRange.last - unscrolledY
            val minScroll = maxOf(0, minScrollForVisibility, minScrollForPosition)
            val maxScrollForConstraints = minOf(maxScroll, maxScrollForVisibility, maxScrollForPosition)
            val desiredScrollOffset = if (minScroll <= maxScrollForConstraints) {
                minScroll
            } else if (minScrollForVisibility > maxScrollForConstraints) {
                minScrollForVisibility.coerceIn(0, maxScroll)
            } else {
                minScrollForPosition.coerceIn(0, maxScroll)
            }
            val initialPopupY = (unscrolledY + desiredScrollOffset).coerceIn(popupVerticalRange)
            val scrollDelta = desiredScrollOffset - scrollState.value

            when {
                !selectedItemPositioned || scrollState.viewportSize == 0 -> {
                    requestedScrollDelta = 0
                    applyAnimation = false
                }

                scrollDelta != 0 -> {
                    if (requestedScrollDelta == 0) requestedScrollDelta = scrollDelta
                    applyAnimation = false
                }

                else -> {
                    requestedScrollDelta = 0
                    lockedPopupY = initialPopupY
                    applyAnimation = true
                }
            }
            initialPopupY
        }

        val popupX = (anchorBounds.center.x - popupContentSize.width / 2).let { idealX ->
            if (popupContentSize.width >= windowSize.width) 0
            else idealX.coerceIn(0, windowSize.width - popupContentSize.width)
        }

        revealOriginY = (anchorCenterY - popupY).coerceIn(0, popupContentSize.height)
        targetPlacement = FlyoutPlacement.Full
        if (lockedPopupY != Int.MIN_VALUE) applyAnimation = true

        return IntOffset(popupX, popupY)
    }
}

/**
 * A lazy variant of [ComboBox] for large data sets.
 *
 * Only visible items are composed. The popup width follows the widest currently visible item,
 * while never becoming narrower than the closed control.
 *
 * @param T Type of each item in [items].
 * @param items Items made available to the lazy popup.
 * @param selected Index of the selected item, or `null` when no item is selected. A non-null
 * value must be a valid index in [items].
 * @param onSelectionChange Called with the selected index and item after an item is clicked.
 * @param modifier Modifier applied to the component, including its optional header.
 * @param header Optional composable displayed above the closed control.
 * @param placeholder Optional composable displayed when [selected] is `null`.
 * @param disabled Whether the control ignores user interaction and uses disabled colors.
 * @param compactItem Whether popup items use compact ListItem sizing.
 * @param interaction Optional interaction source used by the closed control.
 * @param colorScheme Colors resolved for the control's current visual state.
 * @param key Optional stable and unique key factory for lazy items.
 * @param contentType Factory describing the content type of each lazy item so compatible
 * compositions can be reused efficiently.
 * @param content Composable representation of an item. It receives the item's index and value
 * and is used by both the closed control and popup.
 */
@Composable
fun <T> LazyComboBox(
    items: List<T>,
    selected: Int?,
    onSelectionChange: (index: Int, item: T) -> Unit,
    modifier: Modifier = Modifier,
    header: (@Composable () -> Unit)? = null,
    placeholder: (@Composable () -> Unit)? = null,
    disabled: Boolean = false,
    compactItem: Boolean = false,
    interaction: MutableInteractionSource? = null,
    colorScheme: VisualStateScheme<ComboBoxColors> = ComboBoxDefaults.colors(),
    key: ((index: Int, item: T) -> Any)? = null,
    contentType: (index: Int, item: T) -> Any? = { _, _ -> null },
    content: @Composable (index: Int, item: T) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    var controlSize by remember { mutableStateOf(IntSize.Zero) }
    var popupMaxHeight by remember { mutableStateOf(Dp.Infinity) }
    val density = LocalDensity.current
    val selectedIndex = selected?.takeIf(items.indices::contains)

    ComboBoxLayout(
        modifier = modifier,
        header = header,
        compactItem = compactItem,
        colorScheme = colorScheme,
        disabled = disabled,
        focusedFirst = false,
        interaction = interaction,
        popup = {
            LazyComboBoxPopup(
                expanded = expanded,
                minWidth = with(density) { controlSize.width.toDp() },
                maxHeight = popupMaxHeight,
                items = items,
                selectedIndex = selectedIndex,
                key = key,
                contentType = contentType,
                onItemSelected = { index, item ->
                    onSelectionChange(index, item)
                    expanded = false
                },
                onDismissRequest = { expanded = false },
                content = content
            )
        },
        field = { colors, interaction ->
            ComboBoxField(
                placeholder = placeholder,
                colors = colors,
                selected = selected,
                content = content,
                disabled = disabled,
                onClick = { expanded = true },
                onFieldHeightChanged = { popupMaxHeight = it },
                onSizeChanged = { controlSize = it },
                items = items,
                interaction = interaction,
                colorScheme = colorScheme,
                modifier = Modifier,
            )
        }
    )
}

@Composable
internal fun <T> LazyComboBoxPopup(
    expanded: Boolean,
    minWidth: Dp,
    maxHeight: Dp,
    items: List<T>,
    selectedIndex: Int?,
    key: ((index: Int, item: T) -> Any)?,
    contentType: (index: Int, item: T) -> Any?,
    onItemSelected: (index: Int, item: T) -> Unit,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable (index: Int, item: T) -> Unit
) {
    if (!expanded) return

    val density = LocalDensity.current
    val initialIndex = selectedIndex ?: 0
    val listState = rememberLazyListState(initialFirstVisibleItemIndex = initialIndex)
    val minWidthPx = with(density) { minWidth.roundToPx() }
    var popupWidthPx by remember(minWidthPx) { mutableIntStateOf(minWidthPx) }
    val positionProvider = remember(density, listState, selectedIndex) {
        LazyComboBoxPopupPositionProvider(density, listState, selectedIndex)
    }

    LaunchedEffect(selectedIndex, listState) {
        val index = selectedIndex ?: run {
            positionProvider.initialListPositioned = true
            return@LaunchedEffect
        }
        val selectedItem = snapshotFlow {
            listState.layoutInfo.takeIf { it.viewportSize.height > 0 }
                ?.visibleItemsInfo
                ?.firstOrNull { it.index == index }
        }.first { it != null } ?: return@LaunchedEffect
        val viewportHeight = listState.layoutInfo.viewportSize.height
        val targetTop = ((viewportHeight - selectedItem.size) / 2).coerceAtLeast(0)
        listState.scrollToItem(index, scrollOffset = -targetTop)
        positionProvider.initialListPositioned = true
    }

    LaunchedEffect(positionProvider) {
        snapshotFlow { positionProvider.requestedScrollDelta }.collect { requestedDelta ->
            if (requestedDelta != 0) {
                val delta = positionProvider.consumeScrollRequest(requestedDelta)
                if (delta != 0) listState.scrollBy(delta.toFloat())
            }
        }
    }

    ComboBoxPopupSurface(
        expanded = expanded,
        positionProvider = positionProvider,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        revealOriginY = { positionProvider.revealOriginY }
    ) {
        LazyComboBoxItems(
            items = items,
            selectedIndex = selectedIndex,
            listState = listState,
            key = key,
            contentType = contentType,
            onItemSelected = onItemSelected,
            modifier = Modifier
                .width(with(density) { popupWidthPx.toDp() })
                .heightIn(max = maxHeight),
            onIntrinsicWidthChanged = { width ->
                if (width > popupWidthPx) popupWidthPx = width
            },
            content = content
        )
    }
}

@Composable
private fun <T> LazyComboBoxItems(
    items: List<T>,
    selectedIndex: Int?,
    listState: LazyListState,
    key: ((index: Int, item: T) -> Any)?,
    contentType: (index: Int, item: T) -> Any?,
    onItemSelected: (index: Int, item: T) -> Unit,
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    onIntrinsicWidthChanged: ((Int) -> Unit)? = null,
    content: @Composable (index: Int, item: T) -> Unit
) {
    ScrollbarContainer(
        adapter = rememberScrollbarAdapter(listState),
        modifier = modifier
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            state = listState,
            verticalArrangement = verticalArrangement
        ) {
            items(
                count = items.size,
                key = key?.let { itemKey -> { index -> itemKey(index, items[index]) } },
                contentType = { index -> contentType(index, items[index]) }
            ) { index ->
                val item = items[index]
                val itemContent: @Composable () -> Unit = {
                    ComboBoxItem(
                        selected = index == selectedIndex,
                        onSelectedChanged = { onItemSelected(index, item) },
                        text = { content(index, item) }
                    )
                }
                if (onIntrinsicWidthChanged != null) {
                    LazyComboBoxMeasuredItem(
                        onIntrinsicWidthChanged = onIntrinsicWidthChanged,
                        content = itemContent
                    )
                } else {
                    itemContent()
                }
            }
        }
    }
}

@Composable
private fun LazyComboBoxMeasuredItem(
    onIntrinsicWidthChanged: (Int) -> Unit,
    content: @Composable () -> Unit
) {
    Layout(
        modifier = Modifier,
        content = content
    ) { measurables, constraints ->
        val measurable = measurables.single()
        onIntrinsicWidthChanged(measurable.maxIntrinsicWidth(Constraints.Infinity))
        val width = constraints.maxWidth
        val placeable = measurable.measure(
            constraints.copy(minWidth = width, maxWidth = width, minHeight = 0)
        )
        layout(width, placeable.height) {
            placeable.place(0, 0)
        }
    }
}

@Stable
private class LazyComboBoxPopupPositionProvider(
    density: Density,
    private val listState: LazyListState,
    private val selectedIndex: Int?
) : FlyoutPositionProvider(density) {
    private val contentPadding = with(density) { ComboBoxPopupContentPadding.roundToPx() }
    private val windowPadding = with(density) { flyoutDefaultPadding.roundToPx() }

    var revealOriginY by mutableIntStateOf(0)
        private set

    var requestedScrollDelta by mutableIntStateOf(0)
        private set

    var initialListPositioned by mutableStateOf(selectedIndex == null)

    private var lockedPopupY by mutableIntStateOf(Int.MIN_VALUE)

    fun consumeScrollRequest(requestedDelta: Int): Int {
        if (requestedScrollDelta != requestedDelta) return 0
        requestedScrollDelta = 0
        return requestedDelta
    }

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        val selectedItem = selectedIndex?.let { index ->
            listState.layoutInfo.visibleItemsInfo.firstOrNull { it.index == index }
        }
        val selectedCenter = selectedItem?.let { it.offset + it.size / 2 + contentPadding }
            ?: (popupContentSize.height / 2)
        val popupVerticalRange = comboBoxPopupVerticalRange(
            windowHeight = windowSize.height,
            popupHeight = popupContentSize.height,
            preferredPadding = windowPadding
        )
        val anchorCenterY = anchorBounds.center.y
        val popupY = if (lockedPopupY != Int.MIN_VALUE) {
            lockedPopupY.coerceIn(popupVerticalRange)
        } else {
            val initialPopupY = (anchorCenterY - selectedCenter).coerceIn(popupVerticalRange)
            val desiredSelectedCenter = anchorCenterY - initialPopupY
            val scrollDelta = selectedCenter - desiredSelectedCenter
            val canApplyScroll = scrollDelta > 0 && listState.canScrollForward ||
                scrollDelta < 0 && listState.canScrollBackward

            when {
                !initialListPositioned || selectedIndex != null && selectedItem == null -> {
                    applyAnimation = false
                }

                scrollDelta != 0 && canApplyScroll -> {
                    if (requestedScrollDelta == 0) requestedScrollDelta = scrollDelta
                    applyAnimation = false
                }

                else -> {
                    requestedScrollDelta = 0
                    lockedPopupY = initialPopupY
                    applyAnimation = true
                }
            }
            initialPopupY
        }

        val popupX = (anchorBounds.center.x - popupContentSize.width / 2).let { idealX ->
            if (popupContentSize.width >= windowSize.width) 0
            else idealX.coerceIn(0, windowSize.width - popupContentSize.width)
        }

        revealOriginY = (anchorCenterY - popupY).coerceIn(0, popupContentSize.height)
        targetPlacement = FlyoutPlacement.Full
        if (lockedPopupY != Int.MIN_VALUE) applyAnimation = true

        return IntOffset(popupX, popupY)
    }
}

@OptIn(ExperimentalFluentApi::class)
@Composable
private fun EditableComboBoxField(
    state: TextFieldState,
    modifier: Modifier,
    disabled: Boolean,
    interaction: MutableInteractionSource,
    flyoutAnchorScope: FlyoutAnchorScope,
    popupPositionProvider: FlyoutPositionProvider,
    colorScheme: VisualStateScheme<ComboBoxColors>,
    bottomLineColor: Color,
    cursorColor: Color,
    isFocused: Boolean,
    placeholder: @Composable (() -> Unit)?,
    onFocusedChanged: (Boolean) -> Unit,
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
    onValueConfirmed: (value: String) -> Unit,
) {
    val colors = colorScheme.map {
            TextFieldColor(
                fillColor = fillColor,
                contentColor = contentColor,
                placeholderColor = placeholderColor,
                borderBrush = borderBrush,
                backgroundSizing = BackgroundSizing.InnerBorderEdge,
                cursorBrush = if (it != VisualState.Focused) {
                    SolidColor(Color.Transparent)
                } else {
                    SolidColor(cursorColor)
                },
                bottomLineFillColor = if (it != VisualState.Focused) {
                    Color.Transparent
                } else {
                    bottomLineColor
                }
            )
        }
    val iconInteraction = remember { MutableInteractionSource() }
    val focusRequester = remember { FocusRequester() }

    fun confirmValue() {
        onValueConfirmed(state.text.toString())
        onExpandedChanged(false)
    }
    TextField(
        state = state,
        modifier = with(flyoutAnchorScope) {
            modifier
                .defaultMinSize(minWidth = ComboBoxMinWidth)
                .height(buttonMinHeight)
                .flyoutAnchor()
                .focusRequester(focusRequester)
                .onFocusChanged { focusState ->
                    onFocusedChanged(focusState.isFocused)
                    if (!focusState.isFocused) {
                        onExpandedChanged(false)
                    }
                }
                .hoverable(interaction, enabled = !disabled)
                .then(
                    if (isFocused) Modifier
                    else Modifier.pointerHoverIcon(
                        icon = PointerIcon.Default,
                        overrideDescendants = true
                    )
                )
        },
        enabled = !disabled,
        lineLimits = TextFieldLineLimits.SingleLine,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
        onKeyboardAction = { confirmValue() },
        interactionSource = interaction,
        colors = colors,
        isClearable = false,
        placeholder = placeholder,
        shape = AutoSuggestBoxDefaults.textFieldShape(
            expanded = expanded,
            placement = popupPositionProvider.targetPlacement
        ),
        trailing = {
            EditableComboBoxDropDownIcon(
                iconInteraction = iconInteraction,
                enabled = !disabled,
                onClick = {
                    focusRequester.requestFocus()
                    state.edit { selectAll() }
                    onExpandedChanged(true)
                }
            )
        }
    )
}

/**
 * An editable combo box that keeps text editing separate from explicitly opening its item popup.
 *
 * Clicking the text field gives it focus and selects its text without opening the popup. Clicking
 * the drop-down button focuses the field, selects its text, and opens the popup. The first item
 * whose [itemText] exactly equals the current text is shown as selected.
 *
 * @param T Type of each item in [items].
 * @param state State that owns the editable text and selection.
 * @param items Items displayed in the popup.
 * @param itemText Converts an item to the text written to [state] and used for exact matching.
 * @param onSelectionChange Called with the selected index and item after a popup item is clicked.
 * @param onValueConfirmed Called with the current text when the user performs the Done keyboard
 * action. The popup is closed after the callback.
 * @param modifier Modifier applied to the component, including its optional header.
 * @param header Optional composable displayed above the text field.
 * @param placeholder Optional composable displayed while the text field is empty.
 * @param disabled Whether the control ignores user interaction and uses disabled colors.
 * @param compactItem Whether popup items use compact ListItem sizing.
 * @param interaction Optional interaction source used by the text field.
 * @param colorScheme Colors resolved for the control's current visual state.
 * @param bottomLineColor Color of the focused text field's bottom line.
 * @param cursorColor Color of the text cursor while the field is focused.
 * @param content Composable representation of a popup item. It receives the item's index and value.
 */
@OptIn(ExperimentalFluentApi::class)
@Composable
fun <T> EditableComboBox(
    state: TextFieldState,
    items: List<T>,
    itemText: (index: Int, item: T) -> String,
    onSelectionChange: (index: Int, item: T) -> Unit,
    onValueConfirmed: (value: String) -> Unit,
    modifier: Modifier = Modifier,
    header: (@Composable () -> Unit)? = null,
    placeholder: (@Composable () -> Unit)? = null,
    disabled: Boolean = false,
    compactItem: Boolean = false,
    interaction: MutableInteractionSource? = null,
    colorScheme: VisualStateScheme<ComboBoxColors> = ComboBoxDefaults.editableColors(),
    bottomLineColor: Color = FluentTheme.colors.fillAccent.default,
    cursorColor: Color = FluentTheme.colors.text.text.primary,
    content: @Composable (index: Int, item: T) -> Unit
) {
    val currentText = state.text.toString()
    val selectedIndex = items.indices.firstOrNull { index ->
        itemText(index, items[index]) == currentText
    }

    EditableComboBoxHost(
        state = state,
        items = items,
        itemText = itemText,
        selectedIndex = selectedIndex,
        onSelectionChange = onSelectionChange,
        onValueConfirmed = onValueConfirmed,
        modifier = modifier,
        header = header,
        placeholder = placeholder,
        disabled = disabled,
        compactItem = compactItem,
        interaction = interaction,
        colorScheme = colorScheme,
        bottomLineColor = bottomLineColor,
        cursorColor = cursorColor,
    ) { popupSelectedIndex, onItemSelected ->
        EditableComboBoxItems(
            items = items,
            selectedIndex = popupSelectedIndex,
            onItemSelected = onItemSelected,
            content = content
        )
    }
}

/**
 * A lazy [EditableComboBox] for large data sets.
 *
 * Matching begins after [matchDebounceMillis] without text changes. New input cancels the
 * previous suspending lookup. When [itemIndex] is omitted, the list is searched from the
 * beginning and only the first exact match is selected. A custom lookup must return the first
 * exact matching index as well. If the popup is open when matching completes, the matching item
 * is scrolled into view.
 *
 * @param T Type of each item in [items].
 * @param state State that owns the editable text and selection.
 * @param items Items made available to the lazy popup and fallback matcher.
 * @param itemText Converts an item to the text written to [state] and used to validate exact matches.
 * @param onSelectionChange Called with the selected index and item after a popup item is clicked.
 * @param onValueConfirmed Called with the current text when the user performs the Done keyboard
 * action. The popup is closed after the callback.
 * @param modifier Modifier applied to the component, including its optional header.
 * @param header Optional composable displayed above the text field.
 * @param placeholder Optional composable displayed while the text field is empty.
 * @param disabled Whether the control ignores user interaction and uses disabled colors.
 * @param compactItem Whether popup items use compact ListItem sizing.
 * @param interaction Optional interaction source used by the text field.
 * @param colorScheme Colors resolved for the control's current visual state.
 * @param bottomLineColor Color of the focused text field's bottom line.
 * @param cursorColor Color of the text cursor while the field is focused.
 * @param matchDebounceMillis Time without text changes before matching begins. It must be
 * non-negative; use `0` to match immediately.
 * @param itemIndex Optional suspending lookup for large or externally indexed data sets. It must
 * return the first index whose [itemText] exactly matches the supplied text, or `null` when no item
 * matches. A new text change cancels the previous lookup.
 * @param key Optional stable and unique key factory for lazy items.
 * @param contentType Factory describing the content type of each lazy item so compatible
 * compositions can be reused efficiently.
 * @param content Composable representation of a popup item. It receives the item's index and value.
 */
@OptIn(ExperimentalFluentApi::class)
@Composable
fun <T> LazyEditableComboBox(
    state: TextFieldState,
    items: List<T>,
    itemText: (index: Int, item: T) -> String,
    onSelectionChange: (index: Int, item: T) -> Unit,
    onValueConfirmed: (value: String) -> Unit,
    modifier: Modifier = Modifier,
    header: (@Composable () -> Unit)? = null,
    placeholder: (@Composable () -> Unit)? = null,
    disabled: Boolean = false,
    compactItem: Boolean = false,
    interaction: MutableInteractionSource? = null,
    colorScheme: VisualStateScheme<ComboBoxColors> = ComboBoxDefaults.editableColors(),
    bottomLineColor: Color = FluentTheme.colors.fillAccent.default,
    cursorColor: Color = FluentTheme.colors.text.text.primary,
    matchDebounceMillis: Long = 1_200L,
    itemIndex: (suspend (text: String) -> Int?)? = null,
    key: ((index: Int, item: T) -> Any)? = null,
    contentType: (index: Int, item: T) -> Any? = { _, _ -> null },
    content: @Composable (index: Int, item: T) -> Unit
) {
    val selectedIndex = rememberLazyEditableSelectedIndex(
        state = state,
        items = items,
        itemText = itemText,
        itemIndex = itemIndex,
        matchDebounceMillis = matchDebounceMillis
    )

    EditableComboBoxHost(
        state = state,
        items = items,
        itemText = itemText,
        selectedIndex = selectedIndex,
        onSelectionChange = onSelectionChange,
        onValueConfirmed = onValueConfirmed,
        modifier = modifier,
        header = header,
        placeholder = placeholder,
        disabled = disabled,
        compactItem = compactItem,
        interaction = interaction,
        colorScheme = colorScheme,
        bottomLineColor = bottomLineColor,
        cursorColor = cursorColor,
    ) { popupSelectedIndex, onItemSelected ->
        LazyEditableComboBoxItems(
            items = items,
            selectedIndex = popupSelectedIndex,
            key = key,
            contentType = contentType,
            onItemSelected = onItemSelected,
            content = content
        )
    }
}

@Composable
private fun <T> rememberLazyEditableSelectedIndex(
    state: TextFieldState,
    items: List<T>,
    itemText: (index: Int, item: T) -> String,
    itemIndex: (suspend (text: String) -> Int?)?,
    matchDebounceMillis: Long
): Int? {
    require(matchDebounceMillis >= 0) { "matchDebounceMillis must not be negative." }

    var selectedIndex by remember(state, items) { mutableStateOf<Int?>(null) }
    val currentItemText by rememberUpdatedState(itemText)
    val currentItemIndex by rememberUpdatedState(itemIndex)

    LaunchedEffect(state, items, matchDebounceMillis) {
        snapshotFlow { state.text.toString() }.collectLatest { text ->
            selectedIndex = null
            if (matchDebounceMillis > 0) delay(matchDebounceMillis)

            val textOf = currentItemText
            val lookup = currentItemIndex
            val candidate = if (lookup != null) {
                lookup(text)
            } else {
                items.indices.firstOrNull { index -> textOf(index, items[index]) == text }
            }
            selectedIndex = candidate?.takeIf { index ->
                index in items.indices && textOf(index, items[index]) == text
            }
        }
    }

    return selectedIndex
}

@OptIn(ExperimentalFluentApi::class)
@Composable
private fun <T> EditableComboBoxHost(
    state: TextFieldState,
    items: List<T>,
    itemText: (index: Int, item: T) -> String,
    selectedIndex: Int?,
    onSelectionChange: (index: Int, item: T) -> Unit,
    onValueConfirmed: (value: String) -> Unit,
    modifier: Modifier,
    header: (@Composable () -> Unit)?,
    placeholder: (@Composable () -> Unit)?,
    disabled: Boolean,
    compactItem: Boolean,
    interaction: MutableInteractionSource?,
    colorScheme: VisualStateScheme<ComboBoxColors>,
    bottomLineColor: Color,
    cursorColor: Color,
    popupContent: @Composable (
        selectedIndex: Int?,
        onItemSelected: (index: Int, item: T) -> Unit
    ) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    var isFocused by remember { mutableStateOf(false) }

    val flyoutAnchorScope = rememberFlyoutAnchorScope(
        flyoutDefaultPadding + ComboBoxPopupContentPadding * 2
    )
    val density = LocalDensity.current
    val popupPositionProvider = remember(density) {
        EditableComboBoxPopupPositionProvider(density)
    }
    val popupSelectedIndex = selectedIndex?.takeIf(items.indices::contains)

    ComboBoxLayout(
        modifier = modifier,
        header = header,
        compactItem = compactItem,
        colorScheme = colorScheme,
        disabled = disabled,
        focusedFirst = true,
        interaction = interaction,
        popup = {
            EditableComboBoxPopup(
                expanded = expanded,
                positionProvider = popupPositionProvider,
                modifier = with(flyoutAnchorScope) { Modifier.flyoutSize(matchAnchorWidth = true) },
                onDismissRequest = { expanded = false },
            ) {
                popupContent(popupSelectedIndex) { index, item ->
                    state.setTextAndPlaceCursorAtEnd(itemText(index, item))
                    onSelectionChange(index, item)
                    expanded = false
                }
            }
        },
        field = { _, interaction ->
            EditableComboBoxField(
                interaction = interaction,
                state = state,
                modifier = Modifier,
                disabled = disabled,
                flyoutAnchorScope = flyoutAnchorScope,
                onValueConfirmed = onValueConfirmed,
                isFocused = isFocused,
                onFocusedChanged = { isFocused = it },
                expanded = expanded,
                onExpandedChanged = { expanded = it },
                popupPositionProvider = popupPositionProvider,
                placeholder = placeholder,
                colorScheme = colorScheme,
                bottomLineColor = bottomLineColor,
                cursorColor = cursorColor,
            )
        }
    )

    LaunchedEffect(isFocused) {
        if (isFocused) {
            withFrameNanos { }
            state.edit { selectAll() }
        }
    }
}

@Composable
private fun <T> EditableComboBoxItems(
    items: List<T>,
    selectedIndex: Int?,
    onItemSelected: (index: Int, item: T) -> Unit,
    content: @Composable (index: Int, item: T) -> Unit
) {
    val scrollState = rememberScrollState()
    ScrollbarContainer(
        adapter = rememberScrollbarAdapter(scrollState)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(scrollState)
        ) {
            items.fastForEachIndexed { index, item ->
                ComboBoxItem(
                    selected = index == selectedIndex,
                    onSelectedChanged = { onItemSelected(index, item) },
                    text = { content(index, item) }
                )
            }
        }
    }
}

@Composable
private fun <T> LazyEditableComboBoxItems(
    items: List<T>,
    selectedIndex: Int?,
    key: ((index: Int, item: T) -> Any)?,
    contentType: (index: Int, item: T) -> Any?,
    onItemSelected: (index: Int, item: T) -> Unit,
    content: @Composable (index: Int, item: T) -> Unit
) {
    val initialIndex = selectedIndex ?: 0
    val listState = rememberLazyListState(initialFirstVisibleItemIndex = initialIndex)

    LaunchedEffect(selectedIndex, listState) {
        val index = selectedIndex ?: return@LaunchedEffect
        val layoutInfo = listState.layoutInfo
        val itemInfo = layoutInfo.visibleItemsInfo.firstOrNull { it.index == index }
        val isFullyVisible = itemInfo != null &&
            itemInfo.offset >= layoutInfo.viewportStartOffset &&
            itemInfo.offset + itemInfo.size <= layoutInfo.viewportEndOffset
        if (!isFullyVisible) listState.animateScrollToItem(index)
    }

    LazyComboBoxItems(
        items = items,
        selectedIndex = selectedIndex,
        listState = listState,
        key = key,
        contentType = contentType,
        onItemSelected = onItemSelected,
        modifier = Modifier.fillMaxWidth(),
        content = content
    )
}

@Composable
private fun EditableComboBoxDropDownIcon(
    iconInteraction: MutableInteractionSource,
    enabled: Boolean,
    onClick: () -> Unit
) {
    TextBoxButton(
        enabled = enabled,
        onClick = onClick,
        interactionSource = iconInteraction
    ) {
        AnimatedDropDownIcon(
            interaction = iconInteraction
        )
    }
}

@Composable
internal fun EditableComboBoxPopup(
    expanded: Boolean,
    positionProvider: EditableComboBoxPopupPositionProvider,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    ComboBoxPopupSurface(
        expanded = expanded,
        positionProvider = positionProvider,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        shape = AutoSuggestBoxDefaults.suggestFlyoutShape(positionProvider.targetPlacement),
        initialElevation = 0.dp,
        reveal = ComboBoxPopupReveal.Directional,
        opensUpward = { positionProvider.opensUpward }
    ) { content() }
}

@Stable
internal class EditableComboBoxPopupPositionProvider(
    density: Density
) : FlyoutPositionProvider(density) {
    private val windowPadding = with(density) { flyoutDefaultPadding.roundToPx() }

    val opensUpward: Boolean
        get() = targetPlacement == FlyoutPlacement.TopAlignedStart

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        val availableAbove = (anchorBounds.top - windowPadding).coerceAtLeast(0)
        val availableBelow = (windowSize.height - windowPadding - anchorBounds.bottom).coerceAtLeast(0)
        val placeBelow = popupContentSize.height <= availableBelow || availableBelow >= availableAbove

        val minX = windowPadding.coerceAtMost((windowSize.width - popupContentSize.width).coerceAtLeast(0))
        val maxX = (windowSize.width - windowPadding - popupContentSize.width).coerceAtLeast(minX)
        val popupX = anchorBounds.left.coerceIn(minX, maxX)
        val minY = windowPadding.coerceAtMost((windowSize.height - popupContentSize.height).coerceAtLeast(0))
        val maxY = (windowSize.height - windowPadding - popupContentSize.height).coerceAtLeast(minY)
        val idealY = if (placeBelow) anchorBounds.bottom else anchorBounds.top - popupContentSize.height
        val popupY = idealY.coerceIn(minY, maxY)

        targetPlacement = if (placeBelow) {
            FlyoutPlacement.BottomAlignedStart
        } else {
            FlyoutPlacement.TopAlignedStart
        }
        applyAnimation = true
        return IntOffset(popupX, popupY)
    }
}

private val ComboBoxMinWidth = 128.dp
