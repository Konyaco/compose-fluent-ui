package io.github.composefluent.component

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.Layer
import io.github.composefluent.scheme.VisualStateScheme
import io.github.composefluent.scheme.collectVisualState
import kotlin.math.roundToInt

/**
 * A compact, selectable item for a caller-owned tree or flattened tree list.
 *
 * The nullable [checkbox] slot selects the leading selection presentation. When it is null,
 * the standard [ListItemDefaults.Indicator] is shown. When it is supplied, the slot replaces the
 * indicator and animates into the content row. The checkbox content and its state remain owned by
 * the caller; [selected] always controls the row's selected colors.
 *
 * This overload represents a leaf item. It reserves the chevron slot for alignment, but does not
 * expose an expansion action.
 *
 * @param selected Whether this item is selected.
 * @param onClick Called when the row is clicked.
 * @param text The primary text content of the item.
 * @param modifier Modifier applied to the item.
 * @param level Hierarchy level. Each level adds 16.dp of leading indentation; negative values are
 * coerced to zero.
 * @param checkbox Optional caller-owned checkbox content.
 * @param icon Optional icon displayed after the chevron.
 * @param interactionSource Optional interaction source used by the row.
 * @param enabled Whether the row can be clicked.
 * @param colors Colors used for the row's interaction states.
 */
@Composable
fun TreeViewItem(
    selected: Boolean,
    onClick: () -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    level: Int = 0,
    checkbox: (@Composable () -> Unit)? = null,
    icon: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource? = null,
    enabled: Boolean = true,
    colors: VisualStateScheme<ListItemColor> = if (selected) {
        ListItemDefaults.selectedListItemColors()
    } else {
        ListItemDefaults.defaultListItemColors()
    },
) {
    TreeViewItemImpl(
        selected = selected,
        onClick = onClick,
        text = text,
        modifier = modifier,
        level = level,
        checkbox = checkbox,
        icon = icon,
        interactionSource = interactionSource,
        enabled = enabled,
        colors = colors,
        expanded = null,
        onExpandedChanged = null,
    )
}

/**
 * A compact, selectable and expandable item for a caller-owned tree or flattened tree list.
 *
 * This overload represents an item with children. The chevron has an independent click target
 * and does not invoke the row's [onClick].
 *
 * @param selected Whether this item is selected.
 * @param onClick Called when the row is clicked.
 * @param expanded Whether the child items are currently visible.
 * @param onExpandedChanged Called with the new expanded state when the chevron is clicked.
 * @param text The primary text content of the item.
 * @param modifier Modifier applied to the item.
 * @param level Hierarchy level. Each level adds 16.dp of leading indentation; negative values are
 * coerced to zero.
 * @param checkbox Optional caller-owned checkbox content.
 * @param icon Optional icon displayed after the chevron.
 * @param interactionSource Optional interaction source shared by the row and expansion action.
 * @param enabled Whether the row and chevron can be interacted with.
 * @param colors Colors used for the row's interaction states.
 */
@Composable
fun TreeViewItem(
    selected: Boolean,
    onClick: () -> Unit,
    expanded: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    level: Int = 0,
    checkbox: (@Composable () -> Unit)? = null,
    icon: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource? = null,
    enabled: Boolean = true,
    colors: VisualStateScheme<ListItemColor> = if (selected) {
        ListItemDefaults.selectedListItemColors()
    } else {
        ListItemDefaults.defaultListItemColors()
    },
) {
    TreeViewItemImpl(
        selected = selected,
        onClick = onClick,
        text = text,
        modifier = modifier,
        level = level,
        checkbox = checkbox,
        icon = icon,
        interactionSource = interactionSource,
        enabled = enabled,
        colors = colors,
        expanded = expanded,
        onExpandedChanged = onExpandedChanged,
    )
}

@Composable
private fun TreeViewItemImpl(
    selected: Boolean,
    onClick: () -> Unit,
    text: @Composable () -> Unit,
    modifier: Modifier,
    level: Int,
    checkbox: (@Composable () -> Unit)?,
    icon: (@Composable () -> Unit)?,
    interactionSource: MutableInteractionSource?,
    enabled: Boolean,
    colors: VisualStateScheme<ListItemColor>,
    expanded: Boolean?,
    onExpandedChanged: ((Boolean) -> Unit)?,
) {
    val actualInteraction = interactionSource ?: remember { MutableInteractionSource() }
    val color = colors.schemeFor(actualInteraction.collectVisualState(!enabled))
    val fillColor by androidx.compose.animation.animateColorAsState(
        targetValue = color.fillColor,
        animationSpec = tween(
            durationMillis = FluentDuration.QuickDuration,
            easing = FluentEasing.FastInvokeEasing
        )
    )
    val contentColor by androidx.compose.animation.animateColorAsState(
        targetValue = color.contentColor,
        animationSpec = tween(
            durationMillis = FluentDuration.QuickDuration,
            easing = FluentEasing.FastInvokeEasing
        )
    )
    val indentation = TreeViewItemDefaults.levelIndent * level.coerceAtLeast(0)

    Layer(
        modifier = modifier
            .defaultMinSize(minWidth = 108.dp, minHeight = TreeViewItemDefaults.compactHeight)
            .padding(horizontal = 5.dp, vertical = 2.dp)
            .fillMaxWidth(),
        shape = FluentTheme.shapes.control,
        color = fillColor,
        contentColor = contentColor,
        border = BorderStroke(1.dp, color.borderBrush),
        backgroundSizing = BackgroundSizing.OuterBorderEdge,
    ) {
        TreeViewItemLayout(
            selected = selected,
            onClick = onClick,
            text = text,
            indentation = indentation,
            checkbox = checkbox,
            icon = icon,
            interactionSource = actualInteraction,
            enabled = enabled,
            expanded = expanded,
            onExpandedChanged = onExpandedChanged,
        )
    }
}

@Composable
private fun TreeViewItemLayout(
    selected: Boolean,
    onClick: () -> Unit,
    text: @Composable () -> Unit,
    indentation: Dp,
    checkbox: (@Composable () -> Unit)?,
    icon: (@Composable () -> Unit)?,
    interactionSource: MutableInteractionSource,
    enabled: Boolean,
    expanded: Boolean?,
    onExpandedChanged: ((Boolean) -> Unit)?,
) {
    val hasCheckbox = checkbox != null
    val hasExpansionTarget = expanded != null && onExpandedChanged != null
    val checkboxTransition = updateTransition(targetState = hasCheckbox)
    val checkboxWidthFraction = checkboxTransition.animateFloat(
        transitionSpec = {
            if (targetState) {
                tween(
                    durationMillis = FluentDuration.ShortDuration,
                    easing = FluentEasing.FastInvokeEasing,
                )
            } else {
                tween(
                    durationMillis = FluentDuration.QuickDuration,
                    easing = FluentEasing.SoftDismissEasing,
                )
            }
        },
        targetValueByState = { visible -> if (visible) 1f else 0f },
    )
    val checkboxAlpha = checkboxTransition.animateFloat(
        transitionSpec = {
            tween(
                durationMillis = FluentDuration.QuickDuration,
                easing = FluentEasing.FadeInFadeOutEasing,
            )
        },
        targetValueByState = { visible -> if (visible) 1f else 0f },
    )
    val contentHolder = remember { CheckboxContentHolder() }
    if (checkbox != null) {
        contentHolder.content = checkbox
    } else if (!checkboxTransition.currentState && !checkboxTransition.targetState) {
        contentHolder.content = null
    }

    Layout(
        modifier = Modifier.selectable(
            selected = selected,
            enabled = enabled,
            interactionSource = interactionSource,
            indication = null,
            onClick = onClick,
        ),
        content = {
            ListItemDefaults.Indicator(
                visible = selected && !hasCheckbox,
                enabled = enabled,
            )
            Box(
                modifier = Modifier
                    .size(TreeViewItemDefaults.checkboxSize)
                    .graphicsLayer {
                        val fraction = checkboxWidthFraction.value
                        val scale = TreeViewItemCheckboxInitialScale +
                            (1f - TreeViewItemCheckboxInitialScale) * fraction
                        scaleX = scale
                        scaleY = scale
                        alpha = checkboxAlpha.value
                    },
                contentAlignment = Alignment.Center,
            ) {
                contentHolder.content?.invoke()
            }
            ExpandChevron(expanded = expanded)
            if (icon != null) {
                Box(
                    modifier = Modifier.size(ListItemDefaults.iconSize),
                    contentAlignment = Alignment.Center,
                ) {
                    icon()
                }
            }
            Box(contentAlignment = Alignment.CenterStart) {
                text()
            }
            if (expanded != null && onExpandedChanged != null) {
                ExpandChevronClickTarget(
                    expanded = expanded,
                    enabled = enabled,
                    onExpandedChanged = onExpandedChanged,
                )
            }
        },
        measurePolicy = remember(
            indentation,
            hasCheckbox,
            icon != null,
            hasExpansionTarget,
            checkboxWidthFraction,
        ) {
            TreeViewItemMeasurePolicy(
                indentation = indentation,
                hasCheckbox = hasCheckbox,
                hasIcon = icon != null,
                hasExpansionTarget = hasExpansionTarget,
                checkboxWidthFraction = checkboxWidthFraction,
            )
        },
    )
}

@Composable
private fun ExpandChevron(expanded: Boolean?) {
    if (expanded == null) {
        Box(modifier = Modifier.size(TreeViewItemDefaults.chevronSize))
        return
    }
    val layoutDirection = LocalLayoutDirection.current
    val rotation by animateFloatAsState(
        targetValue = when {
            expanded -> 90f
            layoutDirection == LayoutDirection.Rtl -> 180f
            else -> 0f
        },
        animationSpec = tween(
            durationMillis = FluentDuration.ShortDuration,
            easing = FluentEasing.FastInvokeEasing,
        ),
    )
    Box(
        modifier = Modifier
            .size(TreeViewItemDefaults.chevronSize)
            .graphicsLayer { rotationZ = rotation },
        contentAlignment = Alignment.Center,
    ) {
        FontIcon(
            type = FontIconPrimitive.ChevronRight,
            contentDescription = null,
            size = FontIconSize.Small,
        )
    }
}

@Composable
private fun ExpandChevronClickTarget(
    expanded: Boolean,
    enabled: Boolean,
    onExpandedChanged: (Boolean) -> Unit,
) {
    val description = if (expanded) "Collapse" else "Expand"

    Box(
        modifier = Modifier
            .semantics {
                contentDescription = description
            }
            .clickable(
                enabled = enabled,
                role = Role.Button,
                interactionSource = null,
                indication = null,
                onClick = { onExpandedChanged(!expanded) },
            ),
    )
}

private class CheckboxContentHolder {
    var content: (@Composable () -> Unit)? = null
}

private class TreeViewItemMeasurePolicy(
    private val indentation: Dp,
    private val hasCheckbox: Boolean,
    private val hasIcon: Boolean,
    private val hasExpansionTarget: Boolean,
    private val checkboxWidthFraction: State<Float>,
) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        var index = 0
        val indicator = measurables[index++].measure(looseConstraints)
        val checkbox = measurables[index++].measure(looseConstraints)
        val chevron = measurables[index++].measure(looseConstraints)
        val icon = if (hasIcon) {
            measurables[index++].measure(looseConstraints)
        } else {
            null
        }
        val textMeasurable = measurables[index++]
        val expansionTargetMeasurable = if (hasExpansionTarget) {
            measurables[index]
        } else {
            null
        }

        val indentationPx = indentation.roundToPx().coerceAtLeast(0)
        val rowStartPaddingPx = TreeViewItemRowStartPadding.roundToPx()
        val checkboxAnimationFraction = checkboxWidthFraction.value.coerceIn(0f, 1f)
        val animatedCheckboxWidth = (checkbox.width * checkboxAnimationFraction).roundToInt()
        val checkboxSpacingPx =
            (TreeViewItemCheckboxSpacing.toPx() * checkboxAnimationFraction).roundToInt()
        val chevronStartPaddingPx = TreeViewItemChevronStartPadding.roundToPx()
        val chevronEndPaddingPx = TreeViewItemChevronEndPadding.roundToPx()
        val iconEndPaddingPx = TreeViewItemIconEndPadding.roundToPx()
        val rowEndPaddingPx = TreeViewItemRowEndPadding.roundToPx()

        var position = addWidths(indentationPx, rowStartPaddingPx)
        val checkboxPosition = position
        position = addWidths(position, animatedCheckboxWidth)
        val expansionStart = if (hasCheckbox) {
            addWidths(checkboxPosition, checkbox.width)
        } else {
            indentationPx
        }
        position = addWidths(position, checkboxSpacingPx)
        position = addWidths(position, chevronStartPaddingPx)
        val chevronPosition = position
        position = addWidths(position, chevron.width)
        position = addWidths(position, chevronEndPaddingPx)
        val expansionEnd = position
        val iconPosition = position
        if (icon != null) {
            position = addWidths(position, icon.width)
            position = addWidths(position, iconEndPaddingPx)
        }
        val textPosition = position

        val text = if (constraints.hasBoundedWidth) {
            val availableWidth = (
                constraints.maxWidth - textPosition.coerceAtMost(constraints.maxWidth) -
                    rowEndPaddingPx.coerceAtMost(constraints.maxWidth)
                ).coerceAtLeast(0)
            textMeasurable.measure(
                looseConstraints.copy(
                    minWidth = availableWidth,
                    maxWidth = availableWidth,
                )
            )
        } else {
            textMeasurable.measure(looseConstraints)
        }
        val desiredWidth = addWidths(
            addWidths(textPosition, text.width),
            rowEndPaddingPx,
        )
        val layoutWidth = if (constraints.hasBoundedWidth) {
            constraints.maxWidth
        } else {
            constraints.constrainWidth(desiredWidth)
        }
        val layoutHeight = constraints.constrainHeight(
            maxOf(
                indicator.height,
                checkbox.height,
                chevron.height,
                icon?.height ?: 0,
                text.height,
            )
        )
        val targetStart = expansionStart.coerceIn(0, layoutWidth)
        val targetEnd = expansionEnd.coerceIn(targetStart, layoutWidth)
        val expansionTarget = expansionTargetMeasurable?.measure(
            Constraints.fixed(
                width = targetEnd - targetStart,
                height = layoutHeight,
            )
        )

        return layout(layoutWidth, layoutHeight) {
            indicator.placeRelative(
                x = 0,
                y = Alignment.CenterVertically.align(indicator.height, layoutHeight),
            )
            checkbox.placeRelative(
                x = checkboxPosition,
                y = Alignment.CenterVertically.align(checkbox.height, layoutHeight),
            )
            chevron.placeRelative(
                x = chevronPosition,
                y = Alignment.CenterVertically.align(chevron.height, layoutHeight),
            )
            icon?.placeRelative(
                x = iconPosition,
                y = Alignment.CenterVertically.align(icon.height, layoutHeight),
            )
            text.placeRelative(
                x = textPosition,
                y = Alignment.CenterVertically.align(text.height, layoutHeight),
            )
            expansionTarget?.placeRelative(targetStart, 0)
        }
    }
}

private fun addWidths(first: Int, second: Int): Int =
    if (first > Int.MAX_VALUE - second) Int.MAX_VALUE else first + second

private val TreeViewItemCheckboxSpacing = 4.dp
private val TreeViewItemRowStartPadding = 10.dp
private val TreeViewItemRowEndPadding = 10.dp
private val TreeViewItemChevronStartPadding = 8.dp
private val TreeViewItemChevronEndPadding = 14.dp
private val TreeViewItemIconEndPadding = 12.dp
private const val TreeViewItemCheckboxInitialScale = 0.8f

/** Default dimensions used by [TreeViewItem]. */
object TreeViewItemDefaults {
    val levelIndent = 16.dp
    val compactHeight = 32.dp
    val checkboxSize = 20.dp
    val chevronSize = 16.dp
}
