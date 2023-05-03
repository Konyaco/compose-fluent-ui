package com.konyaco.fluent.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.*
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ChevronDown
import com.konyaco.fluent.icons.regular.Navigation
import com.konyaco.fluent.icons.regular.Search
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

private val LocalExpand = compositionLocalOf { false }
private val LocalNavigationLevel = compositionLocalOf { 0 }
private val LocalSelectedItemPosition = compositionLocalOf<MutableTransitionState<Float>?> { null }

@Composable
fun SideNav(
    modifier: Modifier,
    expanded: Boolean,
    onExpandStateChange: (Boolean) -> Unit,
    title: @Composable (() -> Unit) = {},
    autoSuggestionBox: (@Composable AutoSuggestionBoxScope.() -> Unit)? = null,
    footer: @Composable (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    val width by animateDpAsState(
        if (expanded) 320.dp else 48.dp,
        tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
    )

    Column(modifier.width(width)) {
        Spacer(Modifier.height(8.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 4.dp).height(42.dp)
        ) {
            SubtleButton(
                modifier = Modifier.padding(vertical = 4.dp).size(38.dp, 34.dp),
                onClick = { onExpandStateChange(!expanded) },
                iconOnly = true
            ) {
                Icon(Icons.Default.Navigation, "Expand")
            }
            if (expanded) {
                CompositionLocalProvider(
                    LocalTextStyle provides FluentTheme.typography.bodyStrong
                ) {
                    title()
                }
            }
        }
        val positionState = remember {
            MutableTransitionState(0f)
        }
        CompositionLocalProvider(
            LocalExpand provides expanded,
            LocalNavigationLevel provides 0,
            LocalSelectedItemPosition provides positionState,
        ) {
            autoSuggestionBox?.let {
                val focusRequester = remember {
                    FocusRequester()
                }
                val autoSuggestionBoxScope = remember(focusRequester) {
                    AutoSuggestionBoxScopeImpl(focusRequester)
                }
                Box(
                    contentAlignment = Alignment.TopStart,
                    modifier = Modifier.height(48.dp)
                ) {
                    val expandedScope = rememberCoroutineScope()
                    if (expanded) {
                        Box(modifier = Modifier.padding(horizontal = 16.dp).padding(top = 2.dp)) {
                            autoSuggestionBoxScope.it()
                        }
                    } else {
                        SideNavItem(
                            selected = false,
                            onClick = {
                                onExpandStateChange(true)
                                expandedScope.launch {
                                    delay(FluentDuration.ShortDuration.toLong())
                                    focusRequester.requestFocus()
                                }

                            },
                            icon = {
                                Icon(Icons.Default.Search, null)
                            },
                            content = {}
                        )
                    }
                }
            }
            val scrollState = rememberScrollState()
            ScrollbarContainer(
                adapter = rememberScrollbarAdapter(scrollState),
                modifier = Modifier.weight(1f)
            ) {
                Column(
                    modifier = Modifier.fillMaxHeight().verticalScroll(scrollState).padding(
                        bottom = 8.dp
                    )
                ) {
                    content()
                }
            }
            footer?.let {
                // Divider
                NavigationItemSeparator(modifier = Modifier.padding(bottom = 4.dp))
                it()
                Spacer(Modifier.height(4.dp))
            }
        }
    }
}

@Composable
fun SideNavItem(
    selected: Boolean,
    expand: Boolean = LocalExpand.current,
    onClick: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    expandItems: Boolean = false,
    icon: @Composable (() -> Unit)? = null,
    items: @Composable (ColumnScope.() -> Unit)? = null,
    content: @Composable RowScope.() -> Unit
) {
    val interaction = remember { MutableInteractionSource() }
    val hovered by interaction.collectIsHoveredAsState()
    val pressed by interaction.collectIsPressedAsState()

    val color = when {
        selected && hovered -> FluentTheme.colors.subtleFill.tertiary
        selected -> FluentTheme.colors.subtleFill.secondary
        pressed -> FluentTheme.colors.subtleFill.tertiary
        hovered -> FluentTheme.colors.subtleFill.secondary
        else -> FluentTheme.colors.subtleFill.transparent
    }
    var currentPosition by remember {
        mutableStateOf(0f)
    }
    val selectedState = LocalSelectedItemPosition.current
    LaunchedEffect(selected, currentPosition) {
        if (selected) {
            selectedState?.targetState = currentPosition
        }
    }
    Column(
        modifier = modifier.onGloballyPositioned {
            currentPosition = it.positionInRoot().y
        }
    ) {
        Box(Modifier.height(40.dp).fillMaxWidth().padding(4.dp, 2.dp)) {
            val navigationLevelPadding = 28.dp * LocalNavigationLevel.current
            Layer(
                modifier = Modifier.fillMaxWidth().height(36.dp),
                shape = RoundedCornerShape(4.dp),
                color = animateColorAsState(
                    color, tween(FluentDuration.QuickDuration, easing = FluentEasing.FastInvokeEasing)
                ).value,
                contentColor = FluentTheme.colors.text.text.primary,
                outsideBorder = false,
                cornerRadius = 4.dp,
                border = null
            ) {
                Box(
                    Modifier.clickable(
                        onClick = { onClick(!selected) },
                        interactionSource = interaction,
                        indication = null
                    ).padding(start = navigationLevelPadding),
                    Alignment.CenterStart
                ) {
                    if (icon != null) Box(Modifier.padding(start = 12.dp).size(18.dp), Alignment.Center) {
                        icon()
                    }
                    val fraction by animateFloatAsState(
                        targetValue = if (expand) 1f else 0f,
                        tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
                    )
                    if (expand) {
                        Row(
                            modifier = Modifier.padding(
                                start = if (icon != null) 44.dp else 16.dp,
                                end = if (items != null) 44.dp else 0.dp
                            ),
                            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            content()
                        }
                        if (items != null) {
                            val rotation by animateFloatAsState(
                                if (expandItems) {
                                    180f
                                } else {
                                    00f
                                }
                            )
                            Icon(
                                Icons.Default.ChevronDown,
                                null,
                                modifier = Modifier.width(36.dp)
                                    .align(Alignment.CenterEnd)
                                    .wrapContentWidth(Alignment.CenterHorizontally).size(12.dp)
                                    .graphicsLayer {
                                        rotationZ = rotation
                                        alpha = if (fraction == 1f) {
                                            1f
                                        } else {
                                            0f
                                        }
                                    }
                            )
                        }
                    }
                }
            }
            Indicator(Modifier.align(Alignment.CenterStart).padding(start = navigationLevelPadding), selected)
        }

        if (items != null) {
            AnimatedVisibility(
                visible = expandItems && expand,
                enter = fadeIn(
                    animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
                ) + expandVertically(
                    animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
                ),
                exit = fadeOut(
                    animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
                ) + shrinkVertically(
                    animationSpec = tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                CompositionLocalProvider(
                    LocalNavigationLevel provides LocalNavigationLevel.current + 1
                ) {
                    Column {
                        items()
                    }
                }
            }
        }
    }
}

interface AutoSuggestionBoxScope {
    fun Modifier.focusHandle(): Modifier
}

internal class AutoSuggestionBoxScopeImpl(
    private val focusRequest: FocusRequester
) : AutoSuggestionBoxScope {
    override fun Modifier.focusHandle() = focusRequester(focusRequest)
}

@Composable
fun NavigationItemSeparator(
    isVertical: Boolean = false,
    modifier: Modifier = Modifier
) {
    val sizeModifier = if (!isVertical) {
        Modifier.fillMaxWidth().height(1.dp)
    } else {
        Modifier.fillMaxHeight().width(1.dp)
    }
    Box(
        Modifier
            .then(modifier)
            .then(sizeModifier)
            .background(FluentTheme.colors.stroke.surface.default.copy(0.2f))
    )
}

@Composable
private fun Indicator(modifier: Modifier, display: Boolean) {
    val selectionState = LocalSelectedItemPosition.current
    val indicatorState = remember {
        MutableTransitionState(display)
    }
    indicatorState.targetState = display
    val animationModifier = if (selectionState != null) {
        Modifier.indicatorOffsetAnimation(16.dp, indicatorState, selectionState)
    } else {
        val height by updateTransition(display).animateDp(transitionSpec = {
            if (targetState) tween(FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)
            else tween(FluentDuration.QuickDuration, easing = FluentEasing.SoftDismissEasing)
        }, targetValueByState = { if (it) 16.dp else 0.dp })
        Modifier.height(height)
    }
    Box(modifier.width(3.dp).then(animationModifier).background(FluentTheme.colors.fillAccent.default, CircleShape))
}

private fun Modifier.indicatorOffsetAnimation(
    size: Dp,
    indicatorState: MutableTransitionState<Boolean>,
    selectedPosition: MutableTransitionState<Float>,
    isVertical: Boolean = true
) = composed {
    val fraction by updateTransition(indicatorState).animateFloat(
        transitionSpec = {
            tween(FluentDuration.VeryLongDuration , easing = FluentEasing.PointToPointEasing)
        },
        targetValueByState = { if (it) 1f else 0f }
    )
    //Delay set selected position
    if (indicatorState.isIdle && indicatorState.targetState) {
        updateTransition(selectedPosition).animateFloat(transitionSpec = {
            tween(
                FluentDuration.QuickDuration,
                easing = FluentEasing.FastInvokeEasing
            )
        }) { it }
    }
    layout { measurable, constraints ->
        val stickSize = size.toPx()
        val containerSize = if (isVertical) {
            constraints.maxHeight
        } else {
            constraints.maxWidth
        }
        val goBackward = selectedPosition.currentState > selectedPosition.targetState
        val contentPadding = ((containerSize - stickSize) / 2).coerceAtLeast(0f)
        val extendSize = containerSize - contentPadding
        val currentFraction = if (indicatorState.targetState) {
            fraction
        } else {
            1 - fraction
        }
        val segmentFraction = when {
            currentFraction > 0.75 -> (currentFraction - 0.75f) * 4
            currentFraction > 0.5 -> (currentFraction - 0.5f) * 4
            currentFraction > 0.25 -> (currentFraction - 0.25f) * 4
            else -> currentFraction * 4
        }
        val currentSize = if (!indicatorState.targetState) {
            when {
                currentFraction <= 0.25 -> androidx.compose.ui.util.lerp(stickSize, extendSize, segmentFraction)
                currentFraction <= 0.5f -> androidx.compose.ui.util.lerp(extendSize, 0f, segmentFraction)
                else -> 0f
            }
        } else {
            when {
                currentFraction > 0.75f -> androidx.compose.ui.util.lerp(
                    extendSize,
                    stickSize,
                    segmentFraction
                )
                currentFraction > 0.5f -> androidx.compose.ui.util.lerp(0f, extendSize, segmentFraction)
                else -> 0f
            }
        }
        val placeable = if (isVertical) {
            measurable.measure(Constraints.fixed(constraints.maxWidth, currentSize.roundToInt().coerceAtLeast(0)))
        } else {
            measurable.measure(Constraints.fixed(currentSize.roundToInt().coerceAtLeast(0), constraints.maxHeight))
        }

        layout(
            width = if (isVertical) placeable.width else constraints.maxWidth,
            height = if (isVertical) constraints.maxHeight else placeable.height
        ) {
            val offset = when {
                goBackward && !indicatorState.targetState && currentFraction <= 0.25f -> extendSize - currentSize
                goBackward && !indicatorState.targetState -> 0f
                !goBackward && !indicatorState.targetState && currentFraction <= 0.25f -> contentPadding
                !goBackward && !indicatorState.targetState -> containerSize - currentSize
                goBackward && currentFraction > 0.75f -> contentPadding
                goBackward && currentFraction > 0.5f -> containerSize - currentSize
                !goBackward && currentFraction > 0.75f -> extendSize - currentSize
                !goBackward && currentFraction > 0.5f -> 0f
                else -> 0f
            }
            if (isVertical) {
                placeable.place(0, offset.roundToInt())
            } else {
                placeable.place(offset.roundToInt(), 0)
            }
        }
    }
}