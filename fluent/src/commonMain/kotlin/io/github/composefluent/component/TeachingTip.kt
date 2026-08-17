package io.github.composefluent.component

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalTextStyle
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.Dismiss
import kotlin.math.min

/**
 * Displays a teaching tip centered in the window or pointing to [target].
 *
 * A non-null [target] adds a tail whose tip is placed on the teaching tip edge nearest the target.
 * [placement] is treated as a preference: when that placement does not fit in the window, the
 * teaching tip selects an available placement automatically. When [target] is `null`, the teaching
 * tip has no tail and is centered in the window. Its content width is constrained to 320.dp.
 *
 * [target] uses window coordinates in physical pixels, matching the value returned by
 * `LayoutCoordinates.boundsInWindow()`. Use [TeachingTipContainer] when a composable's complete
 * bounds should be the target instead.
 *
 * The optional bottom action area contains at most two equal-width slots and fills them from the
 * end. When both actions are present, [secondaryAction] occupies the start slot and [action]
 * occupies the end slot.
 *
 * @param visible Whether the teaching tip is visible. This overload does not update this value.
 * @param onDismissRequest Called when the teaching tip requests dismissal. The callback should
 * update the state backing [visible].
 * @param title The title shown at the top of the non-hero area. Its default text style is
 * `bodyStrong` from [FluentTheme.typography].
 * @param modifier The modifier applied to the teaching tip surface.
 * @param icon Optional icon shown at the start of the title and content column. The recommended
 * size is [TeachingTipDefaults.IconSize].
 * @param target Optional target bounds in physical-pixel window coordinates.
 * @param placement The preferred placement relative to [target]. Ignored when [target] is `null`.
 * @param hero Optional hero content. It is placed on the side farthest from the resolved tail, or
 * above the body when [target] is `null`.
 * @param action Optional primary action shown in the end slot of the bottom action area.
 * @param secondaryAction Optional secondary action. It occupies the start slot when [action] is
 * also present; a single supplied action always occupies the end slot.
 * @param closeAction Optional close action shown at the top end of the non-hero area.
 * @param focusable Whether the teaching tip receives focus and can dismiss on outside interaction.
 * @param content The main teaching tip content. Its default text style is `body` from
 * [FluentTheme.typography].
 */
@Composable
fun TeachingTip(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)? = null,
    target: Rect? = null,
    placement: FlyoutPlacement = FlyoutPlacement.Auto,
    hero: (@Composable () -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    secondaryAction: (@Composable () -> Unit)? = null,
    closeAction: (@Composable () -> Unit)? = null,
    focusable: Boolean = true,
    content: @Composable () -> Unit,
) {
    TeachingTipPopup(
        visible = visible,
        onDismissRequest = onDismissRequest,
        title = title,
        content = content,
        modifier = modifier,
        icon = icon,
        target = target,
        usesContainerTarget = false,
        placement = placement,
        hero = hero,
        action = action,
        secondaryAction = secondaryAction,
        closeAction = closeAction,
        focusable = focusable,
    )
}

/**
 * Hosts a teaching tip whose target is the measured bounds of [content].
 *
 * Both [teachingTip] and [content] receive the same [TeachingTipContainerScope]. Its
 * [TeachingTipContainerScope.isTeachingTipVisible] state starts as `false` and can be used by the
 * anchor content, actions, and close button without an external state holder. The scoped
 * [TeachingTipContainerScope.TeachingTip] function automatically uses the container bounds as its
 * target.
 *
 * @param teachingTip The teaching tip to display for this container. Call the scoped
 * [TeachingTipContainerScope.TeachingTip] function to target the container.
 * @param modifier The modifier applied to the container that defines the target bounds.
 * @param content The anchor content whose measured bounds are used as the teaching tip target.
 */
@Composable
fun TeachingTipContainer(
    teachingTip: @Composable TeachingTipContainerScope.() -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable TeachingTipContainerScope.() -> Unit,
) {
    val visibleState = remember { mutableStateOf(false) }
    val scope = remember(visibleState) { TeachingTipContainerScopeImpl(visibleState) }
    Box(modifier = modifier) {
        scope.content()
        scope.teachingTip()
    }
}

/**
 * Scope shared by a [TeachingTipContainer]'s anchor content and teaching tip.
 *
 * The scope owns the container's visibility state and provides a [TeachingTip] overload that uses
 * the container bounds as its target.
 */
@Stable
interface TeachingTipContainerScope {

    /**
     * Whether the container's teaching tip is visible.
     *
     * The initial value is `false`. The scoped [TeachingTip] uses this value by default and resets
     * it to `false` when dismissal is requested.
     */
    var isTeachingTipVisible: Boolean

    /**
     * Displays a teaching tip targeted at this container's measured content bounds.
     *
     * [visible] and [onDismissRequest] use [isTeachingTipVisible] by default. When [visible] is
     * backed by different state, provide a matching [onDismissRequest] that updates that state.
     *
     * @param title The title shown at the top of the non-hero area. Its default text style is
     * `bodyStrong` from [FluentTheme.typography].
     * @param modifier The modifier applied to the teaching tip surface.
     * @param visible Whether the teaching tip is visible. Defaults to [isTeachingTipVisible].
     * @param onDismissRequest Called when the teaching tip requests dismissal. By default it sets
     * [isTeachingTipVisible] to `false`.
     * @param icon Optional icon shown at the start of the title and content column. The recommended
     * size is [TeachingTipDefaults.IconSize].
     * @param placement The preferred placement relative to the container target. If it does not fit,
     * an available placement is selected automatically.
     * @param hero Optional hero content placed on the side farthest from the resolved tail.
     * @param action Optional primary action shown in the end slot of the bottom action area.
     * @param secondaryAction Optional secondary action. It occupies the start slot when [action] is
     * also present; a single supplied action always occupies the end slot.
     * @param closeAction Optional close action shown at the top end of the non-hero area.
     * @param focusable Whether the teaching tip receives focus and can dismiss on outside interaction.
     * @param content The main teaching tip content. Its default text style is `body` from
     * [FluentTheme.typography].
     */
    @Composable
    fun TeachingTip(
        title: @Composable () -> Unit,
        modifier: Modifier = Modifier,
        visible: Boolean = isTeachingTipVisible,
        onDismissRequest: () -> Unit = { isTeachingTipVisible = false },
        icon: (@Composable () -> Unit)? = null,
        placement: FlyoutPlacement = FlyoutPlacement.Auto,
        hero: (@Composable () -> Unit)? = null,
        action: (@Composable () -> Unit)? = null,
        secondaryAction: (@Composable () -> Unit)? = null,
        closeAction: (@Composable () -> Unit)? = null,
        focusable: Boolean = true,
        content: @Composable () -> Unit,
    ) {
        TeachingTipPopup(
            visible = visible,
            onDismissRequest = onDismissRequest,
            title = title,
            content = content,
            modifier = modifier,
            icon = icon,
            target = null,
            usesContainerTarget = true,
            placement = placement,
            hero = hero,
            action = action,
            secondaryAction = secondaryAction,
            closeAction = closeAction,
            focusable = focusable,
        )
    }
}

private class TeachingTipContainerScopeImpl(
    visibleState: MutableState<Boolean>,
) : TeachingTipContainerScope {
    override var isTeachingTipVisible: Boolean by visibleState
}

/** Contains standard dimensions and building blocks for [TeachingTip]. */
object TeachingTipDefaults {
    internal val TailLength = 8.dp
    internal val TailWidth = 14.6.dp
    internal val WindowMargin = 8.dp

    /** The recommended size for content supplied to a teaching tip's icon slot. */
    val IconSize: Dp = 24.dp

    /**
     * Displays the standard icon-only close button for a teaching tip.
     *
     * @param onClick Called when the button is clicked.
     * @param modifier The modifier applied to the button.
     * @param enabled Whether the button responds to user interaction.
     * @param contentDescription An accessibility description for the dismiss icon. Provide a
     * localized description when the button is exposed to accessibility services.
     */
    @Composable
    fun CloseButton(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        contentDescription: String? = null,
    ) {
        SubtleButton(
            onClick = onClick,
            modifier = modifier.defaultMinSize(32.dp, 32.dp),
            disabled = !enabled,
            iconOnly = true,
        ) {
            Icon(Icons.Default.Dismiss, contentDescription = contentDescription)
        }
    }
}

@Composable
private fun TeachingTipPopup(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    title: @Composable () -> Unit,
    content: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    icon: (@Composable () -> Unit)?,
    target: Rect?,
    usesContainerTarget: Boolean,
    placement: FlyoutPlacement,
    hero: (@Composable () -> Unit)?,
    action: (@Composable () -> Unit)?,
    secondaryAction: (@Composable () -> Unit)?,
    closeAction: (@Composable () -> Unit)?,
    focusable: Boolean,
) {
    val targeted = target != null || usesContainerTarget
    val cornerRadius = FluentTheme.cornerRadius.overlay
    val positionProvider = rememberTeachingTipPositionProvider(
        visible = visible,
        target = target,
        usesContainerTarget = usesContainerTarget,
        preferredPlacement = placement,
        cornerRadius = cornerRadius,
    )
    val shape = TeachingTipShape(
        cornerRadius = cornerRadius,
        tailEdge = positionProvider.tailEdge,
        tailOffsetFraction = positionProvider.tailOffsetFraction,
    )
    val tailPadding = if (targeted) TeachingTipDefaults.TailLength else 0.dp

    BasicFlyout(
        visible = visible,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        enterPlacementAnimation = { teachingTipEnterTransition(positionProvider.transformOrigin) },
        exitTransition = teachingTipExitTransition(positionProvider.transformOrigin),
        shape = shape,
        contentPadding = PaddingValues(tailPadding + TeachingTipDefaults.BorderPadding),
        positionProvider = positionProvider,
        focusable = focusable,
        color = FluentTheme.colors.background.solid.tertiary,
        strokeColor = FluentTheme.colors.stroke.surface.default,
        useAcrylic = false,
    ) {
        TeachingTipLayout(
            tailEdge = positionProvider.tailEdge,
            targeted = targeted,
            placement = placement,
            title = title,
            content = content,
            icon = icon,
            hero = hero,
            action = action,
            secondaryAction = secondaryAction,
            closeAction = closeAction,
        )
    }
}

@Composable
private fun TeachingTipLayout(
    tailEdge: TeachingTipTailEdge,
    targeted: Boolean,
    placement: FlyoutPlacement,
    title: @Composable () -> Unit,
    content: @Composable () -> Unit,
    icon: (@Composable () -> Unit)?,
    hero: (@Composable () -> Unit)?,
    action: (@Composable () -> Unit)?,
    secondaryAction: (@Composable () -> Unit)?,
    closeAction: (@Composable () -> Unit)?,
) {
    val layoutDirection = LocalLayoutDirection.current
    val body = @Composable {
        TeachingTipBody(
            title = title,
            content = content,
            icon = icon,
            action = action,
            secondaryAction = secondaryAction,
            closeAction = closeAction,
        )
    }
    val heroEdge = when {
        !targeted -> TeachingTipTailEdge.Top
        tailEdge != TeachingTipTailEdge.None -> tailEdge.opposite()
        else -> placement.initialTeachingTipTailEdge(layoutDirection).opposite()
    }
    // Keep the tip at its standard width while allowing narrow windows to shrink it.
    // widthIn must wrap fillMaxWidth so the fill operation sees the capped constraints.
    val widthModifier = Modifier
        .widthIn(max = TeachingTipDefaults.BodyWidth)
        .fillMaxWidth()

    when {
        hero == null -> Box(widthModifier) { body() }
        heroEdge == TeachingTipTailEdge.Top -> Column(widthModifier) {
            TeachingTipHero(hero)
            body()
        }

        heroEdge == TeachingTipTailEdge.Bottom -> Column(widthModifier) {
            body()
            TeachingTipHero(hero)
        }

        heroEdge == TeachingTipTailEdge.Left -> TeachingTipHorizontalHero(
            heroOnLeft = true,
            hero = hero,
            body = body,
        )

        else -> TeachingTipHorizontalHero(
            heroOnLeft = false,
            hero = hero,
            body = body,
        )
    }
}

@Composable
private fun TeachingTipHorizontalHero(
    heroOnLeft: Boolean,
    hero: @Composable () -> Unit,
    body: @Composable () -> Unit,
) {
    Layout(
        modifier = Modifier
            .widthIn(max = TeachingTipDefaults.HorizontalHeroWidth)
            .fillMaxWidth(),
        content = {
            Box(
                modifier = Modifier.layoutId(TeachingTipHeroLayoutId),
                propagateMinConstraints = true,
            ) {
                hero()
            }
            Box(
                modifier = Modifier.layoutId(TeachingTipBodyLayoutId),
                propagateMinConstraints = true,
            ) {
                body()
            }
        },
    ) { measurables, constraints ->
        val totalWidth = constraints.constrainWidth(TeachingTipDefaults.HorizontalHeroWidth.roundToPx())
        val heroWidth = TeachingTipDefaults.SideHeroWidth.roundToPx().coerceAtMost(totalWidth)
        val bodyWidth = (totalWidth - heroWidth).coerceAtLeast(0)
        val bodyPlaceable = measurables.first { it.layoutId == TeachingTipBodyLayoutId }.measure(
            constraints.copy(
                minWidth = bodyWidth,
                maxWidth = bodyWidth,
                minHeight = 0,
            )
        )
        val height = constraints.constrainHeight(bodyPlaceable.height)
        val heroPlaceable = measurables.first { it.layoutId == TeachingTipHeroLayoutId }.measure(
            Constraints.fixed(heroWidth, height)
        )
        layout(totalWidth, height) {
            if (heroOnLeft) {
                heroPlaceable.place(0, 0)
                bodyPlaceable.place(heroWidth, 0)
            } else {
                bodyPlaceable.place(0, 0)
                heroPlaceable.place(bodyWidth, 0)
            }
        }
    }
}

@Composable
private fun TeachingTipHero(hero: @Composable () -> Unit) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        propagateMinConstraints = true,
    ) {
        hero()
    }
}

@Composable
private fun TeachingTipBody(
    title: @Composable () -> Unit,
    content: @Composable () -> Unit,
    icon: (@Composable () -> Unit)?,
    action: (@Composable () -> Unit)?,
    secondaryAction: (@Composable () -> Unit)?,
    closeAction: (@Composable () -> Unit)?,
) {
    val hasActions = action != null || secondaryAction != null
    val titleTextStyle = FluentTheme.typography.bodyStrong.withUntrimmedLineHeight()
    val contentTextStyle = FluentTheme.typography.body.withUntrimmedLineHeight()
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        val hasCloseAction = closeAction != null
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (icon != null) {
                Box(
                    modifier = Modifier
                        .size(48.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    icon()
                }
            }
            Column(Modifier.weight(1f)) {
                CompositionLocalProvider(LocalTextStyle provides titleTextStyle) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                start = if (icon == null) {
                                    TeachingTipDefaults.TitleHorizontalPadding
                                } else {
                                    0.dp
                                },
                                top = TeachingTipDefaults.TitleTopPadding,
                                end = if (!hasCloseAction) TeachingTipDefaults.TitleHorizontalPadding else 0.dp,
                            ),
                    ) {
                        title()
                    }
                }

                CompositionLocalProvider(LocalTextStyle provides contentTextStyle) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                start = if (icon == null) {
                                    TeachingTipDefaults.ContentHorizontalPadding
                                } else {
                                    0.dp
                                },
                                end = if (!hasCloseAction) TeachingTipDefaults.ContentHorizontalPadding else 0.dp,
                                bottom = TeachingTipDefaults.ContentBottomPadding,
                            ),
                    ) {
                        content()
                    }
                }
            }
            if (hasCloseAction) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .size(40.dp),
                ) {
                    closeAction()
                }
            }
        }
        if (hasActions) {
            TeachingTipActionRow(
                action = action,
                secondaryAction = secondaryAction,
            )
        }
    }
}

@Composable
private fun TeachingTipActionRow(
    action: (@Composable () -> Unit)?,
    secondaryAction: (@Composable () -> Unit)?,
) {
    val actions = listOfNotNull(secondaryAction, action)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = TeachingTipDefaults.ActionHorizontalPadding,
                top = TeachingTipDefaults.ActionTopPadding,
                end = TeachingTipDefaults.ActionHorizontalPadding,
                bottom = TeachingTipDefaults.ActionBottomPadding,
            ),
        horizontalArrangement = Arrangement.spacedBy(TeachingTipDefaults.ActionSpacing),
    ) {
        repeat(2 - actions.size) {
            Spacer(Modifier.weight(1f))
        }
        actions.forEach { actionContent ->
            Box(
                modifier = Modifier.weight(1f),
                propagateMinConstraints = true,
            ) {
                actionContent()
            }
        }
    }
}

@Immutable
private class TeachingTipShape(
    private val cornerRadius: Dp,
    private val tailEdge: TeachingTipTailEdge,
    private val tailOffsetFraction: Float,
) : Shape {

    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density,
    ): Outline = with(density) {
        val tailLength = if (tailEdge == TeachingTipTailEdge.None) {
            0f
        } else {
            TeachingTipDefaults.TailLength.toPx()
        }
        val tailHalfWidth = TeachingTipDefaults.TailWidth.toPx() / 2f
        val left = tailLength
        val top = tailLength
        val right = size.width - tailLength
        val bottom = size.height - tailLength
        val radius = min(
            cornerRadius.toPx(),
            min((right - left).coerceAtLeast(0f), (bottom - top).coerceAtLeast(0f)) / 2f,
        )

        if (tailEdge == TeachingTipTailEdge.None) {
            return@with Outline.Rounded(
                RoundRect(
                    left = 0f,
                    top = 0f,
                    right = size.width,
                    bottom = size.height,
                    cornerRadius = CornerRadius(radius, radius),
                )
            )
        }

        val horizontalTail = constrainTailCenter(
            value = left + (right - left) * tailOffsetFraction,
            min = left + radius + tailHalfWidth,
            max = right - radius - tailHalfWidth,
        )
        val verticalTail = constrainTailCenter(
            value = top + (bottom - top) * tailOffsetFraction,
            min = top + radius + tailHalfWidth,
            max = bottom - radius - tailHalfWidth,
        )
        val curve = radius * CornerCurveControl
        Outline.Generic(Path().apply {
            moveTo(left + radius, top)
            if (tailEdge == TeachingTipTailEdge.Top) {
                lineTo(horizontalTail - tailHalfWidth, top)
                lineTo(horizontalTail, 0f)
                lineTo(horizontalTail + tailHalfWidth, top)
            }
            lineTo(right - radius, top)
            cubicTo(right - radius + curve, top, right, top + radius - curve, right, top + radius)

            if (tailEdge == TeachingTipTailEdge.Right) {
                lineTo(right, verticalTail - tailHalfWidth)
                lineTo(size.width, verticalTail)
                lineTo(right, verticalTail + tailHalfWidth)
            }
            lineTo(right, bottom - radius)
            cubicTo(right, bottom - radius + curve, right - radius + curve, bottom, right - radius, bottom)

            if (tailEdge == TeachingTipTailEdge.Bottom) {
                lineTo(horizontalTail + tailHalfWidth, bottom)
                lineTo(horizontalTail, size.height)
                lineTo(horizontalTail - tailHalfWidth, bottom)
            }
            lineTo(left + radius, bottom)
            cubicTo(left + radius - curve, bottom, left, bottom - radius + curve, left, bottom - radius)

            if (tailEdge == TeachingTipTailEdge.Left) {
                lineTo(left, verticalTail + tailHalfWidth)
                lineTo(0f, verticalTail)
                lineTo(left, verticalTail - tailHalfWidth)
            }
            lineTo(left, top + radius)
            cubicTo(left, top + radius - curve, left + radius - curve, top, left + radius, top)
            close()
        })
    }
}

private fun constrainTailCenter(value: Float, min: Float, max: Float): Float {
    return if (max >= min) value.coerceIn(min, max) else (min + max) / 2f
}

private fun teachingTipEnterTransition(transformOrigin: TransformOrigin): EnterTransition {
    return scaleIn(
        animationSpec = flyoutEnterSpec(),
        initialScale = 0f,
        transformOrigin = transformOrigin,
    )
}

private fun teachingTipExitTransition(transformOrigin: TransformOrigin): ExitTransition {
    return scaleOut(
        animationSpec = flyoutExitSpec(),
        targetScale = 0f,
        transformOrigin = transformOrigin,
    )
}

private val TeachingTipDefaults.BodyWidth: Dp
    get() = 320.dp

private val TeachingTipDefaults.HorizontalHeroWidth: Dp
    get() = BodyWidth

private val TeachingTipDefaults.SideHeroWidth: Dp
    get() = 96.dp

private val TeachingTipDefaults.TitleHorizontalPadding: Dp
    get() = 12.dp

private val TeachingTipDefaults.TitleTopPadding: Dp
    get() = 9.dp

private val TeachingTipDefaults.ContentHorizontalPadding: Dp
    get() = 12.dp

private val TeachingTipDefaults.ContentBottomPadding: Dp
    get() = 11.dp

private val TeachingTipDefaults.IconHorizontalPadding: Dp
    get() = 16.dp

private val TeachingTipDefaults.BorderPadding: Dp
    get() = 1.dp

private val TeachingTipDefaults.ActionTopPadding: Dp
    get() = 2.dp

private val TeachingTipDefaults.ActionHorizontalPadding: Dp
    get() = 12.dp

private val TeachingTipDefaults.ActionBottomPadding: Dp
    get() = 12.dp

private val TeachingTipDefaults.ActionSpacing: Dp
    get() = 8.dp

private const val CornerCurveControl = 0.5522848f
private const val TeachingTipHeroLayoutId = "hero"
private const val TeachingTipBodyLayoutId = "body"

private fun TextStyle.withUntrimmedLineHeight(): TextStyle {
    val currentLineHeightStyle = lineHeightStyle ?: LineHeightStyle.Default
    return copy(
        lineHeightStyle = currentLineHeightStyle.copy(trim = LineHeightStyle.Trim.None),
    )
}

private fun FlyoutPlacement.initialTeachingTipTailEdge(
    layoutDirection: LayoutDirection,
): TeachingTipTailEdge {
    return when (this) {
        FlyoutPlacement.Top,
        FlyoutPlacement.TopAlignedStart,
        FlyoutPlacement.TopAlignedEnd,
        FlyoutPlacement.Auto -> TeachingTipTailEdge.Bottom

        FlyoutPlacement.Bottom,
        FlyoutPlacement.BottomAlignedStart,
        FlyoutPlacement.BottomAlignedEnd -> TeachingTipTailEdge.Top

        FlyoutPlacement.Start,
        FlyoutPlacement.StartAlignedTop,
        FlyoutPlacement.StartAlignedBottom -> {
            if (layoutDirection == LayoutDirection.Ltr) TeachingTipTailEdge.Right else TeachingTipTailEdge.Left
        }

        FlyoutPlacement.End,
        FlyoutPlacement.EndAlignedTop,
        FlyoutPlacement.EndAlignedBottom -> {
            if (layoutDirection == LayoutDirection.Ltr) TeachingTipTailEdge.Left else TeachingTipTailEdge.Right
        }

        FlyoutPlacement.Full -> TeachingTipTailEdge.Top
    }
}

private fun TeachingTipTailEdge.opposite(): TeachingTipTailEdge {
    return when (this) {
        TeachingTipTailEdge.None -> TeachingTipTailEdge.None
        TeachingTipTailEdge.Top -> TeachingTipTailEdge.Bottom
        TeachingTipTailEdge.Bottom -> TeachingTipTailEdge.Top
        TeachingTipTailEdge.Left -> TeachingTipTailEdge.Right
        TeachingTipTailEdge.Right -> TeachingTipTailEdge.Left
    }
}
