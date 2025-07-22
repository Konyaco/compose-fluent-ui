package io.github.composefluent.component

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.composefluent.LocalContentAlpha
import io.github.composefluent.LocalContentColor
import io.github.composefluent.animation.FluentDuration
import io.github.composefluent.animation.FluentEasing
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.filled.CaretDown
import io.github.composefluent.icons.filled.CaretLeft
import io.github.composefluent.icons.filled.CaretRight
import io.github.composefluent.icons.filled.CaretUp
import io.github.composefluent.icons.filled.Checkmark
import io.github.composefluent.icons.filled.ChevronRight
import io.github.composefluent.icons.filled.MoreHorizontal
import io.github.composefluent.icons.filled.Star
import io.github.composefluent.icons.regular.Add
import io.github.composefluent.icons.regular.ArrowLeft
import io.github.composefluent.icons.regular.ArrowRight
import io.github.composefluent.icons.regular.CalendarLtr
import io.github.composefluent.icons.regular.ChevronDown
import io.github.composefluent.icons.regular.ChevronUp
import io.github.composefluent.icons.regular.ClipboardPaste
import io.github.composefluent.icons.regular.Copy
import io.github.composefluent.icons.regular.Cut
import io.github.composefluent.icons.regular.Dismiss
import io.github.composefluent.icons.regular.Eye
import io.github.composefluent.icons.regular.Navigation
import io.github.composefluent.icons.regular.Search
import io.github.composefluent.icons.regular.Settings
import io.github.composefluent.icons.regular.Star
import io.github.composefluent.icons.regular.Subtract
import kotlin.jvm.JvmInline

//TODO Public
@Composable
internal fun FontIcon(
    glyph: Char,
    modifier: Modifier = Modifier,
    iconSize: TextUnit = FontIconSize.Standard.value.sp,
    fallback: (@Composable () -> Unit)? = null,
    tint: Color = LocalContentColor.current.copy(LocalContentAlpha.current)
) {
    if (LocalFontIconFontFamily.current != null || fallback == null) {
        Text(
            text = glyph.toString(),
            fontFamily = LocalFontIconFontFamily.current,
            fontSize = iconSize,
            color = tint,
            modifier = Modifier.then(modifier)
                .height(with(LocalDensity.current) { iconSize.toDp() }),
            onTextLayout = {
            }
        )
    } else {
        fallback()
    }
}

@Composable
internal fun FontIcon(
    glyph: Char,
    vector: (() -> ImageVector)?,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    iconSize: FontIconSize = FontIconSize.Standard,
    fallbackSize: FontIconSize = iconSize,
    tint: Color = LocalContentColor.current.copy(LocalContentAlpha.current)
) {
    FontIcon(
        glyph = glyph,
        modifier = modifier,
        iconSize = iconSize.value.sp,
        fallback = if (vector == null) {
            null
        } else {
            {
                Icon(
                    imageVector = vector(),
                    contentDescription = contentDescription,
                    tint = tint,
                    modifier = modifier
                        .layout { measurable, constraints ->
                            val size = fallbackSize.value.dp.roundToPx()
                            val fontSize = iconSize.value.sp.roundToPx()
                            val placeable = measurable.measure(Constraints.fixed(size, size))
                            layout(fontSize, fontSize) {
                                val offset = Alignment.Center.align(
                                    IntSize(size, size),
                                    IntSize(fontSize, fontSize),
                                    layoutDirection
                                )
                                placeable.place(offset)
                            }
                        }
                )
            }
        },
        tint = tint
    )
}

/**
 * Font icon set that contains all icon from components.
 *
 * Each [FontIconPrimitive] represents a specific icon. It stores:
 * - `glyph`: The character representing the icon in the font.
 * - `vector`: A lambda function that lazily provides an [ImageVector] as a fallback
 *   when the font is not available or the icon cannot be rendered using the font.
 *
 * Usage:
 *
 * ```kotlin
 * FontIcon(type = FontIconPrimitive.Add, contentDescription = "Add")
 * ```
 *
 *  The Solid8 icons is used for small button action.
 *
 */
enum class FontIconPrimitive(
    internal val glyph: Char,
    //Lazy create fallback icon
    internal val vector: () -> ImageVector
) {
    Accept('\uF78C', { Icons.Filled.Checkmark }),
    Add('\uE710', { Icons.Default.Add }),
    ArrowRight('\uE64D', { Icons.Default.ArrowRight }),
    Cancel('\uE711', { Icons.Default.Dismiss }),
    Calendar('\uE787', { Icons.Default.CalendarLtr }),
    //Solid 8
    CaretDown('\uEDDC', { Icons.Filled.CaretDown }),
    //Solid 8
    CaretLeft('\uEDD9', { Icons.Filled.CaretLeft }),
    //Solid 8
    CaretRight('\uEDDA', { Icons.Filled.CaretRight }),
    //Solid 8
    CaretUp('\uEDDB', { Icons.Filled.CaretUp }),
    ChevronDown('\uE972', { Icons.Default.ChevronDown }),
    ChevronRight('\uE974', { Icons.Filled.ChevronRight }),
    ChevronUp('\uE70E', { Icons.Default.ChevronUp }),
    ChromeBack('\uE830', { Icons.Default.ArrowLeft }),
    Close('\uE624', { Icons.Default.Dismiss }),
    Copy('\uE8C8', { Icons.Default.Copy }),
    Cut('\uE8C6', { Icons.Default.Cut }),
    Dash('\uE629', { Icons.Default.Subtract }),
    FavoriteStarFull('\uE735', { Icons.Filled.Star }),
    GlobalNavigation('\uE700', { Icons.Default.Navigation }),
    More('\uE712', { Icons.Filled.MoreHorizontal }),
    Paste('\uE77F', { Icons.Default.ClipboardPaste }),
    RatingStar('\uE734', { Icons.Default.Star }),
    RevealPassword('\uF78D', { Icons.Default.Eye }),
    Search('\uF78B', { Icons.Default.Search }),
    Settings('\uE713', { Icons.Default.Settings })
}

/**
 * A composable function that displays a font icon based on the specified [FontIconPrimitive].
 *
 * @param type The [FontIconPrimitive] representing the icon to be displayed.
 * @param contentDescription Text used by accessibility services to describe what this icon represents.
 *    This should always be provided unless this icon is used for decorative purposes,
 *    and does not represent a meaningful action that a user can take.
 *    This text should be localized, such as by using [androidx.compose.ui.res.stringResource] or similar.
 * @param modifier The [Modifier] to be applied to the icon.
 * @param size The desired [FontIconSize] of the icon. Defaults to [FontIconSize.Standard].
 * @param fallbackSize The [FontIconSize] to use when displaying the fallback vector icon if the font is not loaded.
 *    Defaults to [FontIconSize] with 2f added to the value of [size].
 */
@Composable
fun FontIcon(
    type: FontIconPrimitive,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    size: FontIconSize = FontIconSize.Standard,
    fallbackSize: FontIconSize = FontIconSize(size.value + 2f),
    tint: Color = LocalContentColor.current.copy(LocalContentAlpha.current)
) {
    FontIcon(
        glyph = type.glyph,
        vector = type.vector,
        contentDescription = contentDescription,
        iconSize = size,
        fallbackSize = fallbackSize,
        modifier = modifier,
        tint = tint
    )
}


/**
 * A composable function that displays a font icon with a fixed size of 8.
 *
 * This function provides a convenient way to display icons with a pre-defined size,
 * suitable for UI elements where consistency in icon size is desired. It uses a size of 8f
 * for the icon by default, but allows you to specify the type, content description,
 * modifier, and a fallback size.
 *
 * @param type The type of the font icon to display, selected from the [FontIconPrimitive] enum.
 * @param contentDescription The content description for accessibility.
 * @param modifier Modifier to apply to the icon.
 * @param size The fixed size of the icon, defaults to 8f.
 * @param fallbackSize The fallback size to use if the font icon cannot be displayed, defaults to size.value + 6f.
 */
@Composable
fun FontIconSolid8(
    type: FontIconPrimitive,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    size: FontIconSize = FontIconSize(8f),
    fallbackSize: FontIconSize = FontIconSize(size.value + 6f)
) {
    FontIcon(
        type = type,
        contentDescription = contentDescription,
        modifier = modifier,
        size = size,
        fallbackSize = fallbackSize
    )
}

/**
 * Contains the default values used for [FontIcon].
 */
object FontIconDefaults {

    /**
     * A composable function that creates a back icon with a press animation.
     *
     * @param interactionSource The [InteractionSource] that represents the stream of [Interaction]s
     * for this component.
     * @param size The size of the icon. Defaults to [FontIconSize.Standard].
     * @param contentDescription The content description for the icon, used for accessibility.
     * Defaults to "Back".
     * @param modifier The [Modifier] to be applied to the icon.
     */
    @Composable
    fun BackIcon(
        interactionSource: InteractionSource,
        size: FontIconSize = FontIconSize.Standard,
        contentDescription: String? = "Back",
        modifier: Modifier = Modifier,
    ) {
        val isPressed by interactionSource.collectIsPressedAsState()
        val scaleX = animateFloatAsState(
            targetValue = if (isPressed) 0.9f else 1f,
            animationSpec = tween(
                durationMillis = FluentDuration.ShortDuration,
                easing = FluentEasing.FastInvokeEasing
            )
        )
        FontIcon(
            type = FontIconPrimitive.ChromeBack,
            size = size,
            contentDescription = contentDescription,
            modifier = modifier.graphicsLayer {
                this.scaleX = scaleX.value
                translationX = (1f - scaleX.value) * 6.dp.toPx()
            }
        )
    }

    /**
     * A composable function that displays a navigation icon.
     *
     * This function provides a visual representation of a navigation icon, typically used to
     * indicate a menu or navigation drawer. It includes an interaction effect where the icon
     * scales down slightly when pressed.
     *
     * @param interactionSource The [InteractionSource] to observe for user interactions.
     * @param size The size of the icon, defaulting to [FontIconSize.Standard].
     * @param contentDescription The content description for the icon, used for accessibility.
     *  Defaults to "Navigation".
     * @param modifier The modifier to apply to the icon.
     */
    @Composable
    fun NavigationIcon(
        interactionSource: InteractionSource,
        size: FontIconSize = FontIconSize.Standard,
        contentDescription: String? = "Navigation",
        modifier: Modifier = Modifier,
    ) {
        val isPressed by interactionSource.collectIsPressedAsState()
        val scaleX = animateFloatAsState(
            targetValue = if (isPressed) 0.6f else 1f,
            animationSpec = tween(
                durationMillis = FluentDuration.ShortDuration,
                easing = FluentEasing.FastInvokeEasing
            )
        )
        FontIcon(
            type = FontIconPrimitive.GlobalNavigation,
            size = size,
            contentDescription = contentDescription,
            modifier = modifier.graphicsLayer {
                this.scaleX = scaleX.value
            }
        )
    }

    /**
     * A composable function that displays a settings icon with a rotation animation on press.
     *
     * The icon rotates slightly (-30 degrees) when pressed and then performs a full rotation (360 degrees)
     * upon release or cancellation of the press. The animation durations and easing are defined using
     * `FluentDuration` and `FluentEasing`.
     *
     * @param interactionSource The [InteractionSource] that will be used to detect press interactions.
     * @param size The size of the icon, defaulting to [FontIconSize.Standard].
     * @param contentDescription The content description for accessibility, defaulting to "Settings".
     * @param modifier The modifier to be applied to the icon.
     */
    @Composable
    fun SettingIcon(
        interactionSource: InteractionSource,
        size: FontIconSize = FontIconSize.Standard,
        contentDescription: String? = "Settings",
        modifier: Modifier = Modifier,
    ) {
        var latestPress by remember { mutableStateOf<PressInteraction?>(null) }
        LaunchedEffect(interactionSource) {
            interactionSource.interactions.collect { value ->
                when (value) {
                    is PressInteraction.Press -> latestPress = value
                    is PressInteraction.Release -> latestPress = value
                    is PressInteraction.Cancel -> latestPress = value
                }
            }
        }
        val transition = updateTransition(latestPress)
        val rotation = transition.animateFloat(
            transitionSpec = {
                when {
                    initialState == null && targetState is PressInteraction.Press ->
                        tween(durationMillis = FluentDuration.ShortDuration, easing = FluentEasing.FastInvokeEasing)

                    (initialState is PressInteraction.Press && targetState is PressInteraction.Release) ||
                            (initialState is PressInteraction.Press && targetState is PressInteraction.Cancel) ->
                        tween(durationMillis = FluentDuration.LongDuration, easing = FluentEasing.FastInvokeEasing)

                    else -> snap()
                }
            }
        ){
            when(it) {
                null -> 0f
                is PressInteraction.Press -> -30f
                else -> 360f
            }
        }
        LaunchedEffect(transition.currentState, transition.isRunning) {
            if (!transition.isRunning) {
                if (transition.currentState is PressInteraction.Release || transition.currentState is PressInteraction.Cancel) {
                    latestPress = null
                }
            }
        }
        FontIcon(
            type = FontIconPrimitive.Settings,
            size = size,
            contentDescription = contentDescription,
            modifier = modifier.graphicsLayer {
                rotationZ = rotation.value
            }
        )

    }
}

/**
 * Represents the size of a font icon.
 *
 * This class is a value class that wraps a [Float] representing the size.
 * It provides a convenient way to define and manage icon sizes, ensuring type safety.
 *
 * @property value The size value of the font icon.
 */
@Immutable
@JvmInline
value class FontIconSize(val value: Float) {
    companion object {
        val Standard = FontIconSize(16f)
        val Small = FontIconSize(12f)
    }
}

@Composable
internal expect fun ProvideFontIcon(
    content: @Composable () -> Unit
)

internal val LocalFontIconFontFamily = staticCompositionLocalOf<FontFamily?> { null }
