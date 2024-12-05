package com.konyaco.fluent.component

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
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.filled.CaretDown
import com.konyaco.fluent.icons.filled.CaretLeft
import com.konyaco.fluent.icons.filled.CaretRight
import com.konyaco.fluent.icons.filled.CaretUp
import com.konyaco.fluent.icons.filled.Checkmark
import com.konyaco.fluent.icons.filled.ChevronRight
import com.konyaco.fluent.icons.filled.MoreHorizontal
import com.konyaco.fluent.icons.filled.Star
import com.konyaco.fluent.icons.regular.Add
import com.konyaco.fluent.icons.regular.ArrowLeft
import com.konyaco.fluent.icons.regular.ArrowRight
import com.konyaco.fluent.icons.regular.CalendarLtr
import com.konyaco.fluent.icons.regular.ChevronDown
import com.konyaco.fluent.icons.regular.ChevronUp
import com.konyaco.fluent.icons.regular.ClipboardPaste
import com.konyaco.fluent.icons.regular.Copy
import com.konyaco.fluent.icons.regular.Cut
import com.konyaco.fluent.icons.regular.Dismiss
import com.konyaco.fluent.icons.regular.Eye
import com.konyaco.fluent.icons.regular.Navigation
import com.konyaco.fluent.icons.regular.Search
import com.konyaco.fluent.icons.regular.Settings
import com.konyaco.fluent.icons.regular.Star
import com.konyaco.fluent.icons.regular.Subtract
import kotlin.jvm.JvmInline

//TODO Public
@Composable
internal fun FontIcon(
    glyph: Char,
    modifier: Modifier = Modifier,
    iconSize: TextUnit = FontIconSize.Standard.value.sp,
    fallback: (@Composable () -> Unit)? = null,
) {
    if (LocalFontIconFontFamily.current != null || fallback == null) {
        Text(
            text = glyph.toString(),
            fontFamily = LocalFontIconFontFamily.current,
            fontSize = iconSize,
            color = LocalContentColor.current.copy(LocalContentAlpha.current),
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
    fallbackSize: FontIconSize = iconSize
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
        }
    )
}

//Font icon set that contains all icon from components.
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

@Composable
fun FontIcon(
    type: FontIconPrimitive,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    size: FontIconSize = FontIconSize.Standard,
    fallbackSize: FontIconSize = FontIconSize(size.value + 2f)
) {
    FontIcon(
        glyph = type.glyph,
        vector = type.vector,
        contentDescription = contentDescription,
        iconSize = size,
        fallbackSize = fallbackSize,
        modifier = modifier
    )
}


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

object FontIconDefaults {

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
