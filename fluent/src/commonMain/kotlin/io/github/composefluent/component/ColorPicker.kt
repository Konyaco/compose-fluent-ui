@file:Suppress("unused")

package io.github.composefluent.component

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.boundsInParent
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalContentColor
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.Layer
import kotlinx.coroutines.flow.collectLatest
import kotlin.math.PI
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.sin
import kotlin.math.sqrt

/**
 * A composable function that provides a color picker UI.
 *
 * @param state The [ColorPickerState] object that manages the state of the ColorPicker.
 * @param modifier Modifier for styling and layout of the ColorPicker.
 * @param dot A composable lambda that defines the visual appearance of the color selector dot.
 * Defaults to [ColorPickerDefaults.dot].
 * @param label A composable lambda that defines the label for the color.
 * Defaults to [ColorPickerDefaults.label].
 * @param colorSpectrum The type of color spectrum to display. Defaults to [ColorSpectrum.Square].
 * @param alphaEnabled Whether to enable alpha/opacity selection. Defaults to false.
 * @param moreButtonVisible Whether to show a "More" button to expand advanced color settings.
 * Defaults to false.
 */
@ExperimentalFluentApi
@Composable
fun ColorPicker(
    state: ColorPickerState,
    modifier: Modifier = Modifier,
    dot: @Composable () -> Unit = { ColorPickerDefaults.dot() },
    label: @Composable (color: Color) -> Unit = { ColorPickerDefaults.label(it) },
    colorSpectrum: ColorSpectrum = ColorSpectrum.Square,
    alphaEnabled: Boolean = false,
    moreButtonVisible: Boolean = false
) {
    Column(
        modifier = modifier
            .width(312.dp)
    ) {
        Row {
            colorSpectrum.Content(
                state = state,
                modifier = Modifier
                    .size(256.dp),
                dot = {
                    CompositionLocalProvider(
                        LocalContentColor provides if (state.color.luminance() > 0.5f) {
                            Color.Black
                        } else {
                            Color.White
                        },
                        content = dot
                    )
                },
                label = label
            )
            Layer(
                modifier = Modifier
                    .weight(1f)
                    .wrapContentWidth(Alignment.End)
                    .width(44.dp)
                    .height(256.dp)
                    .alphaBackground(FluentTheme.shapes.control, alphaEnabled),
                backgroundSizing = BackgroundSizing.OuterBorderEdge,
                color = state.color
            ) {}
        }

        Spacer(Modifier.height(22.dp))

        BasicSlider(
            value = state.hsvColor.value,
            onValueChange = {
                state.updateHsvColor(value = it)
            },
            modifier = Modifier
                .width(312.dp),
            onValueChangeFinished = {
                state.onValueChangeFinished?.invoke(state.color)
            },
            rail = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(12.dp)
                        .background(
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color.Black,
                                    Color.hsv(
                                        hue = state.hsvColor.hue,
                                        saturation = state.hsvColor.saturation,
                                        value = 1f
                                    )
                                )
                            ),
                            shape = CircleShape
                        )
                )
            },
            track = {},
            thumb = { state ->
                SliderDefaults.Thumb(
                    state = state,
                    label = {
                        Text("Value ${(state.value * 100).roundToInt()}")
                    },
                    color = FluentTheme.colors.text.text.primary
                )
            }
        )

        if (alphaEnabled) {
            Spacer(Modifier.height(10.dp))
            BasicSlider(
                value = state.hsvColor.alpha,
                onValueChange = {
                    state.updateHsvColor(alpha = it)
                },
                modifier = Modifier
                    .width(312.dp),
                onValueChangeFinished = {
                    state.onValueChangeFinished?.invoke(state.color)
                },
                rail = {
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .requiredHeight(12.dp)
                            .alphaBackground(CircleShape)
                            .background(
                                Brush.horizontalGradient(
                                    0f to state.color.copy(0f),
                                    1f to state.color.copy(1f)
                                )
                            )
                    )
                },
                track = {},
                thumb = { state ->
                    SliderDefaults.Thumb(
                        state = state,
                        label = {
                            Text("${(state.value * 100).roundToInt()}% Opacity")
                        },
                        color = FluentTheme.colors.text.text.primary
                    )
                }
            )
        }

        Spacer(Modifier.height(20.dp))

        var expanded by remember { mutableStateOf(false) }

        if (moreButtonVisible) {
            val defaultColor = ButtonColor(
                fillColor = FluentTheme.colors.subtleFill.transparent,
                contentColor = FluentTheme.colors.text.text.primary,
                borderBrush = SolidColor(Color.Transparent)
            )
            SubtleButton(
                onClick = { expanded = !expanded },
                content = {
                    val text = if (!expanded) "More" else "Less"
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = text)
                        FontIcon(
                            type = if (!expanded) {
                                FontIconPrimitive.ChevronDown
                            } else {
                                FontIconPrimitive.ChevronUp

                            },
                            contentDescription = text,
                            size = FontIconSize.Small
                        )
                    }
                },
                buttonColors = ButtonDefaults.subtleButtonColors(
                    default = defaultColor,
                    hovered = defaultColor.copy(contentColor = FluentTheme.colors.text.text.secondary),
                    pressed = defaultColor.copy(contentColor = FluentTheme.colors.text.text.tertiary)
                ),
                modifier = Modifier.align(Alignment.End)
            )
        }

        if (moreButtonVisible && !expanded) return@Column

        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            var isRgbTextField by remember { mutableStateOf(true) }

            Row(
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                BasicFlyoutContainer(
                    flyout = {
                        MenuFlyout(
                            onDismissRequest = { isFlyoutVisible = false },
                            visible = isFlyoutVisible,
                            modifier = Modifier.width(120.dp),
                            placement = FlyoutPlacement.Bottom,
                            adaptivePlacement = true
                        ) {
                            MenuFlyoutItem(
                                selected = isRgbTextField,
                                onSelectedChanged = {
                                    isRgbTextField = true
                                    isFlyoutVisible = false
                                },
                                text = { Text("RGB") },
                                modifier = Modifier.defaultMinSize(120.dp)
                            )
                            MenuFlyoutItem(
                                selected = !isRgbTextField,
                                onSelectedChanged = {
                                    isRgbTextField = false
                                    isFlyoutVisible = false
                                },
                                text = { Text("HSV") },
                                modifier = Modifier.defaultMinSize(120.dp)
                            )
                        }
                    },
                    modifier = Modifier
                        .width(120.dp)
                ) {
                    DropDownButton(
                        onClick = { isFlyoutVisible = !isFlyoutVisible },
                        content = {
                            Text(
                                text = if (isRgbTextField) "RGB" else "HSV",
                                modifier = Modifier.weight(1f)
                            )
                        },
                        modifier = Modifier
                            .width(120.dp)
                    )
                }
                Spacer(Modifier.weight(1f))
                HexColorTextField(
                    color = state.color,
                    onValueChange = {
                        state.updateColor(it)
                        state.onValueChangeFinished?.invoke(state.color)
                    },
                    alphaEnabled = alphaEnabled,
                    modifier = Modifier
                        .width(132.dp)
                )
            }

            if (isRgbTextField) {
                fun parseRgb(text: String): Float? {
                    if (text.isBlank()) {
                        return 0f
                    }

                    return when (val value = text.toIntOrNull()) {
                        null -> null
                        !in 0..255 -> null
                        else -> value.toFloat() / 255f
                    }
                }

                ValueLabelTextField(
                    value = state.color.red,
                    onValueChange = {
                        state.updateColor(state.color.copy(red = it))
                        state.onValueChangeFinished?.invoke(state.color)
                    },
                    format = { (it * 255).toInt().toString() },
                    parse = { parseRgb(it) },
                    label = "Red",
                    maxTextLength = 3
                )
                ValueLabelTextField(
                    value = state.color.green,
                    onValueChange = {
                        state.updateColor(state.color.copy(green = it))
                        state.onValueChangeFinished?.invoke(state.color)
                    },
                    format = { (it * 255).toInt().toString() },
                    parse = { parseRgb(it) },
                    label = "Green",
                    maxTextLength = 3
                )
                ValueLabelTextField(
                    value = state.color.blue,
                    onValueChange = {
                        state.updateColor(state.color.copy(blue = it))
                        state.onValueChangeFinished?.invoke(state.color)
                    },
                    format = { (it * 255).toInt().toString() },
                    parse = { parseRgb(it) },
                    label = "Blue",
                    maxTextLength = 3
                )
            } else {
                ValueLabelTextField(
                    value = state.hsvColor.hue,
                    onValueChange = {
                        state.updateHsvColor(hue = it)
                        state.onValueChangeFinished?.invoke(state.color)
                    },
                    format = { it.toInt().toString() },
                    parse = {
                        if (it.isBlank()) {
                            0f
                        } else {
                            when (val value = it.toFloatOrNull()) {
                                null -> 0f
                                !in 0f..360f -> 0f
                                else -> value
                            }
                        }
                    },
                    label = "Hue",
                    maxTextLength = 3
                )
                ValueLabelTextField(
                    value = state.hsvColor.saturation,
                    onValueChange = {
                        state.updateHsvColor(saturation = it)
                        state.onValueChangeFinished?.invoke(state.color)
                    },
                    format = { (it * 100).toInt().toString() },
                    parse = {
                        if (it.isBlank()) {
                            0f
                        } else {
                            when (val value = it.toFloatOrNull()) {
                                null -> 0f
                                !in 0f..100f -> 0f
                                else -> value / 100f
                            }
                        }
                    },
                    label = "Saturation",
                    maxTextLength = 3
                )
                ValueLabelTextField(
                    value = state.hsvColor.value,
                    onValueChange = {
                        state.updateHsvColor(value = it)
                        state.onValueChangeFinished?.invoke(state.color)
                    },
                    format = { (it * 100).toInt().toString() },
                    parse = {
                        if (it.isBlank()) {
                            0f
                        } else {
                            when (val value = it.toFloatOrNull()) {
                                null -> 0f
                                !in 0f..100f -> 0f
                                else -> value / 100f
                            }
                        }
                    },
                    label = "Value",
                    maxTextLength = 3
                )
            }

            if (alphaEnabled) {
                AlphaTextField(
                    value = state.hsvColor.alpha,
                    onValueChange = {
                        state.updateHsvColor(alpha = it)
                        state.onValueChangeFinished?.invoke(state.color)
                    }
                )
            }
        }
    }
}

/**
 * A composable function that provides a color picker UI.
 *
 * @param color The initial color selected in the picker. Defaults to [Color.White].
 * @param onSelectedColorChanged A callback function that is invoked when the selected color changes.
 *  It provides the new selected [Color].
 * @param modifier Modifier for styling and layout of the ColorPicker.
 * @param dot A composable lambda that defines the visual appearance of the color selector dot.
 *  Defaults to [ColorPickerDefaults.dot].
 * @param label A composable lambda that defines the label for the color.
 *  Defaults to [ColorPickerDefaults.label].
 * @param colorSpectrum The type of color spectrum to display. Defaults to [ColorSpectrum.Square].
 * @param alphaEnabled Whether to enable alpha/opacity selection. Defaults to false.
 * @param moreButtonVisible Whether to show a "More" button to expand advanced color settings. Defaults to false.
 */
@Deprecated("Use ColorPicker with ColorPickerState instead")
@Suppress("DEPRECATION")
@Composable
fun ColorPicker(
    color: Color = Color.White,
    onSelectedColorChanged: (color: Color) -> Unit,
    modifier: Modifier = Modifier,
    dot: @Composable () -> Unit = { ColorPickerDefaults.dot() },
    label: @Composable (color: Color) -> Unit = { ColorPickerDefaults.label(it) },
    colorSpectrum: ColorSpectrum = ColorSpectrum.Square,
    alphaEnabled: Boolean = false,
    moreButtonVisible: Boolean = false,
) {
    val spectrumColor = remember { mutableStateOf(color) }
    var value by remember { mutableStateOf(color.hsv().third) }
    var alpha by remember { mutableStateOf(color.alpha) }
    var expanded by remember { mutableStateOf(false) }
    Column(modifier = modifier.width(312.dp)) {
        Row {
            colorSpectrum.content(
                label = label,
                dot = {
                    CompositionLocalProvider(
                        LocalContentColor provides if (spectrumColor.value.luminance() > 0.5f) {
                            Color.Black
                        } else {
                            Color.White
                        },
                        content = dot
                    )
                },
                color = spectrumColor.value,
                onSelectedColorChanged = {
                    spectrumColor.value = it
                    onSelectedColorChanged(it.copy(alpha))
                },
                modifier = Modifier.size(256.dp)
            )
            Layer(
                modifier = Modifier
                    .weight(1f)
                    .wrapContentWidth(Alignment.End)
                    .width(44.dp)
                    .height(256.dp)
                    .alphaBackground(FluentTheme.shapes.control, alphaEnabled),
                backgroundSizing = BackgroundSizing.OuterBorderEdge,
                color = color
            ) {}
        }
        val (hug, saturation, _) = spectrumColor.value.hsv()
        BasicSlider(
            modifier = Modifier.padding(top = 21.dp).width(312.dp).height(32.dp),
            value = value,
            onValueChange = {
                onSelectedColorChanged(
                    Color.hsv(
                        hug,
                        saturation,
                        it.coerceIn(0f, 1f)
                    )
                )
                value = it
            },
            rail = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(12.dp)
                        .background(
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color.Black,
                                    Color.hsv(hug, saturation, 1f)
                                )
                            ),
                            shape = CircleShape
                        )
                )
            },
            track = { },
            thumb = { state ->
                SliderDefaults.Thumb(state, color = FluentTheme.colors.text.text.primary, label = {
                    Text("Value ${(state.value * 100).roundToInt()}")
                })
            }
        )
        if (alphaEnabled) {
            BasicSlider(
                modifier = Modifier.width(312.dp),
                value = alpha,
                onValueChange = {
                    onSelectedColorChanged(color.copy(alpha = it))
                    alpha = it
                },
                rail = {
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .requiredHeight(12.dp)
                            .alphaBackground(CircleShape)
                            .background(
                                Brush.horizontalGradient(
                                    0f to color.copy(0f),
                                    1f to color.copy(1f)
                                )
                            )
                    )
                },
                track = {},
                thumb = { state ->
                    SliderDefaults.Thumb(state, color = FluentTheme.colors.text.text.primary, label = {
                        Text("${(state.value * 100).roundToInt()}% Opacity")
                    })
                }
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        if (moreButtonVisible) {
            val defaultColor = ButtonColor(
                fillColor = FluentTheme.colors.subtleFill.transparent,
                contentColor = FluentTheme.colors.text.text.primary,
                borderBrush = SolidColor(Color.Transparent)
            )
            SubtleButton(
                onClick = { expanded = !expanded },
                content = {
                    val text = if (!expanded) "More" else "Less"
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = text)
                        FontIcon(
                            type = if (!expanded) {
                                FontIconPrimitive.ChevronDown
                            } else {
                                FontIconPrimitive.ChevronUp

                            },
                            contentDescription = text,
                            size = FontIconSize.Small
                        )
                    }
                },
                buttonColors = ButtonDefaults.subtleButtonColors(
                    default = defaultColor,
                    hovered = defaultColor.copy(contentColor = FluentTheme.colors.text.text.secondary),
                    pressed = defaultColor.copy(contentColor = FluentTheme.colors.text.text.tertiary)
                ),
                modifier = Modifier.align(Alignment.End)
            )
        }
        if (moreButtonVisible && !expanded) return@Column
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            var isRGBTextField by remember { mutableStateOf(true) }
            Row(horizontalArrangement = Arrangement.SpaceAround) {
                BasicFlyoutContainer(
                    flyout = {
                        MenuFlyout(
                            onDismissRequest = { isFlyoutVisible = false },
                            visible = isFlyoutVisible,
                            modifier = Modifier.width(120.dp),
                            placement = FlyoutPlacement.Bottom,
                            adaptivePlacement = true
                        ) {
                            MenuFlyoutItem(
                                selected = isRGBTextField,
                                onSelectedChanged = {
                                    isRGBTextField = true
                                    isFlyoutVisible = false
                                },
                                text = { Text("RGB") },
                                modifier = Modifier.defaultMinSize(120.dp)
                            )
                            MenuFlyoutItem(
                                selected = !isRGBTextField,
                                onSelectedChanged = {
                                    isRGBTextField = false
                                    isFlyoutVisible = false
                                },
                                text = { Text("HSV") },
                                modifier = Modifier.defaultMinSize(120.dp)
                            )
                        }
                    },
                    modifier = Modifier.width(120.dp)
                ) {
                    DropDownButton(
                        onClick = { isFlyoutVisible = !isFlyoutVisible },
                        content = {
                            Text(
                                text = if (isRGBTextField) "RGB" else "HSV",
                                modifier = Modifier.weight(1f)
                            )
                        },
                        modifier = Modifier.width(120.dp)
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                HexColorTextField(
                    color = color,
                    onValueChange = {
                        onSelectedColorChanged(it)
                        spectrumColor.value = it.copy(1f)
                    },
                    alphaEnabled = alphaEnabled,
                    modifier = Modifier
                        .width(132.dp)
                )
            }
            if (isRGBTextField) {
                ColorTextField(
                    value = (color.red * 255).toInt(),
                    onValueChanged = {
                        onSelectedColorChanged(color.copy(red = (it.toFloat() / 255f)))
                        spectrumColor.value = color
                    },
                    label = "Red"
                )
                ColorTextField(
                    value = (color.green * 255).toInt(),
                    onValueChanged = {
                        onSelectedColorChanged(color.copy(green = (it.toFloat() / 255f)))
                        spectrumColor.value = color
                    },
                    label = "Green"
                )
                ColorTextField(
                    value = (color.blue * 255).toInt(),
                    onValueChanged = {
                        onSelectedColorChanged(color.copy(blue = (it.toFloat() / 255f)))
                        spectrumColor.value = color
                    },
                    label = "Blue"
                )
            } else {
                ColorTextField(
                    value = hug.toInt(),
                    onValueChanged = {
                        val newColor = Color.hsv(it.toFloat(), saturation, value)
                        spectrumColor.value = newColor
                        onSelectedColorChanged(newColor)
                    },
                    range = 0..360,
                    label = "Hug"
                )
                ColorTextField(
                    value = (saturation * 100).toInt(),
                    onValueChanged = {
                        val newColor = Color.hsv(hug, it.toFloat() / 100f, value)
                        spectrumColor.value = newColor
                        onSelectedColorChanged(newColor)
                    },
                    range = 0..100,
                    label = "Saturation"
                )
                ColorTextField(
                    value = (value * 100).toInt(),
                    onValueChanged = {
                        value = it.toFloat() / 100f
                        val newColor = Color.hsv(hug, saturation, value)
                        onSelectedColorChanged(newColor)
                    },
                    range = 0..100,
                    label = "Value"
                )
            }

            if (alphaEnabled) {
                ColorTextField(
                    value = (alpha * 100).toInt(),
                    onValueChanged = {
                        alpha = it.toFloat() / 100f
                        val newColor = color.copy(alpha)
                        onSelectedColorChanged(newColor)
                    },
                    range = 0..100,
                    label = "Opacity",
                    suffix = "%"
                )
            }
        }
    }
}

@ExperimentalFluentApi
@Immutable
class ColorPickerState private constructor(
    hsvColor: HsvColor,
    var onValueChangeFinished: ((Color) -> Unit)? = null
) {
    constructor(
        color: Color,
        onValueChangeFinished: ((Color) -> Unit)? = null
    ) : this(
        hsvColor = color.toHsvColor(),
        onValueChangeFinished = onValueChangeFinished
    )

    internal var hsvColor by mutableStateOf(hsvColor)
        private set

    val color by derivedStateOf { this.hsvColor.toColor() }

    fun updateHsvColor(
        hue: Float = hsvColor.hue,
        saturation: Float = hsvColor.saturation,
        value: Float = hsvColor.value,
        alpha: Float = hsvColor.alpha
    ) {
        hsvColor = hsvColor.copy(
            hue = hue,
            saturation = saturation,
            value = value,
            alpha = alpha
        )
    }

    /**
     * A custom ColorSpectrum can update its color via this method.
     *
     * **Note**: Use with caution, it may result in a loss of HSV color accuracy.
     */
    fun updateColor(color: Color) {
        hsvColor = color.toHsvColor()
    }

    companion object {
        fun Saver(
            onValueChangeFinished: ((Color) -> Unit)?
        ): Saver<ColorPickerState, *> = listSaver(
            save = {
                listOf(
                    it.hsvColor.hue,
                    it.hsvColor.saturation,
                    it.hsvColor.value,
                    it.hsvColor.alpha
                )
            },
            restore = {
                ColorPickerState(
                    hsvColor = HsvColor(
                        hue = it[0],
                        saturation = it[1],
                        value = it[2],
                        alpha = it[3]
                    ),
                    onValueChangeFinished = onValueChangeFinished
                )
            }
        )
    }
}

@ExperimentalFluentApi
@Composable
fun rememberColorPickerState(
    color: Color,
    onValueChangeFinished: ((Color) -> Unit)? = null
): ColorPickerState =
    rememberSaveable(
        saver = ColorPickerState.Saver(onValueChangeFinished)
    ) {
        ColorPickerState(
            color = color,
            onValueChangeFinished = onValueChangeFinished
        )
    }

@Composable
private fun HexColorTextField(
    color: Color,
    onValueChange: (color: Color) -> Unit,
    alphaEnabled: Boolean,
    modifier: Modifier = Modifier
) {
    val hexFormat = remember {
        HexFormat {
            upperCase = true
            number.removeLeadingZeros = false
        }
    }

    ValueTextField(
        value = color,
        onValueChange = onValueChange,
        modifier = modifier,
        format =
            if (alphaEnabled) {
                {
                    it.value.toHexString(hexFormat).take(8)
                }
            } else {
                {
                    it.value.toHexString(hexFormat).substring(2, 8)
                }
            },
        parse = {
            if (it.isBlank()) {
                Color.Black
            } else {
                val value = it
                    .toLongOrNull(16)

                when (value) {
                    null -> null
                    !in 0L..0xFFFFFFFFL -> null
                    else ->
                        if (alphaEnabled) {
                            // Use as is (Input includes Alpha)
                            Color(value)
                        } else {
                            // Make opaque (Input is RGB only)
                            Color(value or 0xFF000000L)
                        }
                }
            }
        },
        maxTextLength = if (alphaEnabled) 8 else 6,
        visualTransformation = HexVisualTransformation
    )
}

private object HexVisualTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val out = "#" + text.text

        val offsetMapping = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                return offset + 1
            }

            override fun transformedToOriginal(offset: Int): Int {
                if (offset <= 0) return 0
                return offset - 1
            }
        }

        return TransformedText(
            text = AnnotatedString(out),
            offsetMapping = offsetMapping
        )
    }
}

@Deprecated("Use ValueLabelTextField instead")
@Composable
private fun ColorTextField(
    value: Int,
    onValueChanged: (Int) -> Unit,
    label: String,
    suffix: String = "",
    range: IntRange = 0..255,
    parse: (Int) -> String = { it.toString() },
    parseBack: (String) -> Int? = { it.toIntOrNull() }
) {
    //TODO TextField clean button
    var colorTextValue by remember {
        mutableStateOf(TextFieldValue(parse(value) + suffix))
    }
    LaunchedEffect(value) {
        colorTextValue = colorTextValue.copy(parse(value) + suffix)
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TextField(
            value = colorTextValue,
            onValueChange = {
                val isNewValue = colorTextValue.text != it.text
                colorTextValue = it
                if (isNewValue) {
                    val newValue = parseBack(it.text.removeSuffix(suffix)) ?: return@TextField
                    val inRange = newValue in range
                    if (newValue != value && inRange) {
                        onValueChanged(newValue)
                    }
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .width(120.dp)
        )
        Text(label, color = FluentTheme.colors.text.text.secondary)
    }
}

@ExperimentalFluentApi
@Composable
private fun AlphaTextField(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    ValueLabelTextField(
        value = value,
        onValueChange = onValueChange,
        format = { (value * 100).toInt().toString() },
        parse = {
            if (it.isBlank()) {
                // Same logic as HexColorTextField clearing to #FF000000
                1f
            } else {
                when (val value = it.toIntOrNull()) {
                    null -> null
                    !in 0..100 -> null
                    else -> value / 100f
                }
            }
        },
        label = "Opacity",
        maxTextLength = 3,
        visualTransformation = AlphaVisualTransformation
    )
}

private object AlphaVisualTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        val out = text.text + "%"

        val offsetMapping = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                return offset
            }

            override fun transformedToOriginal(offset: Int): Int {
                if (offset > text.length) return text.length
                return offset
            }
        }

        return TransformedText(
            text = AnnotatedString(out),
            offsetMapping = offsetMapping
        )
    }
}

@Composable
private fun <T> ValueLabelTextField(
    value: T,
    onValueChange: (T) -> Unit,
    format: (T) -> String,
    parse: (String) -> T?,
    label: String,
    modifier: Modifier = Modifier,
    maxTextLength: Int = Int.MAX_VALUE,
    visualTransformation: VisualTransformation = VisualTransformation.None
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ValueTextField(
            value = value,
            onValueChange = onValueChange,
            format = format,
            parse = parse,
            modifier = Modifier
                .width(120.dp),
            maxTextLength = maxTextLength,
            visualTransformation = visualTransformation
        )
        Text(
            text = label,
            color = FluentTheme.colors.text.text.secondary
        )
    }
}

@Composable
private fun <T> ValueTextField(
    value: T,
    onValueChange: (T) -> Unit,
    format: (T) -> String,
    parse: (String) -> T?,
    modifier: Modifier = Modifier,
    maxTextLength: Int = Int.MAX_VALUE,
    visualTransformation: VisualTransformation = VisualTransformation.None
) {
    val currentFormat by rememberUpdatedState(format)
    val currentParse by rememberUpdatedState(parse)

    var textFieldValue by remember {
        mutableStateOf(TextFieldValue(format(value)))
    }

    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()

    LaunchedEffect(value, currentFormat, isFocused) {
        if (!isFocused) {
            textFieldValue = textFieldValue.copy(
                text = currentFormat(value)
            )
        }
    }

    TextField(
        value = textFieldValue,
        onValueChange = {
            if (it.text.length > maxTextLength) {
                return@TextField
            }

            textFieldValue = it

            val newValue = currentParse(it.text)
            if (newValue != null && newValue != value) {
                onValueChange(newValue)
            }
        },
        modifier = modifier,
        singleLine = true,
        visualTransformation = visualTransformation,
        interactionSource = interactionSource
    )
}

private fun Modifier.alphaBackground(shape: Shape = RectangleShape, enabled: Boolean = true) =
    clip(shape).drawWithCache {
        if (!enabled) return@drawWithCache onDrawBehind { }
        val strokeSize = 4.dp.toPx()
        val pointCenter = strokeSize / 2
        val count = (size.width / strokeSize).roundToInt()
        val firstLineCount = (count / 2f).toInt()
        val secondLineCount = ((count + 1) / 2f).toInt()
        val lineCount = (size.height / strokeSize).roundToInt()
        val itemCount = (lineCount * (firstLineCount + secondLineCount) / 2f + 0.5f).toInt()
        val points = List(itemCount) {
            val index = it.mod(firstLineCount + secondLineCount)
            val lineIndex = it / (firstLineCount + secondLineCount)
            when (index) {
                in 0 until firstLineCount -> Offset(
                    x = pointCenter + (index * 2 + 1) * strokeSize,
                    y = pointCenter + 2 * lineIndex * strokeSize
                )

                else -> Offset(
                    x = pointCenter + (index - firstLineCount) * 2 * strokeSize,
                    y = pointCenter + (2 * lineIndex + 1) * strokeSize
                )
            }
        }
        onDrawBehind {
            drawPoints(
                points = points,
                color = Color.Gray.copy(0.2f),
                strokeWidth = strokeSize,
                cap = StrokeCap.Square,
                pointMode = PointMode.Points
            )
        }
    }


/**
 * Contains the default values used by [ColorPicker].
 */
object ColorPickerDefaults {
    /**
     * A composable function that renders a small circular dot, indicating the currently selected color.
     *
     * The dot's size is fixed at 16.dp, and it has a border of 2.dp thickness.
     * The border color is determined by the current [LocalContentColor], which will typically be
     * either black or white, contrasting with the color it's indicating.
     *
     * This is often used as a visual indicator or marker within a UI to show the currently selected
     * color on a color spectrum.
     */
    @Composable
    fun dot() {
        Spacer(
            modifier = Modifier.size(16.dp)
                .border(2.dp, color = LocalContentColor.current, shape = CircleShape)
        )
    }

    /**
     * Creates a tooltip label for a given [color].
     *
     * The tooltip displays the hexadecimal representation of the color.
     *
     * @param color The color for which to display the tooltip label.
     */
    @OptIn(ExperimentalFluentApi::class, ExperimentalStdlibApi::class)
    @Composable
    fun label(color: Color) {
        val hexFormat = remember {
            HexFormat {
                upperCase = true
                number {
                    removeLeadingZeros = false
                }
            }
        }
        TooltipBoxDefaults.Tooltip(
            visibleState = remember { MutableTransitionState(true) },
            content = {
                Text("#${color.value.toHexString(hexFormat).substring(2, 8)}")
            }
        )
    }
}

/**
 * A composable function that displays a square color spectrum.
 *
 * @param color The currently selected color.
 * @param onSelectedColorChanged A callback function that is invoked when the user selects a new color.
 * @param modifier The modifier to apply to this layout.
 * @param dot The composable to draw as the indicator of the selected color. Defaults to [ColorPickerDefaults.dot].
 * @param label The composable to draw as the label of the selected color. Defaults to [ColorPickerDefaults.label].
 */
@Deprecated("Use ColorSpectrum.Square.Content in ColorPicker with ColorPickerState")
@Composable
fun SquareColorSpectrum(
    color: Color,
    onSelectedColorChanged: (color: Color) -> Unit,
    modifier: Modifier = Modifier,
    dot: @Composable () -> Unit = { ColorPickerDefaults.dot() },
    label: @Composable (color: Color) -> Unit = { ColorPickerDefaults.label(it) }
) {
    ColorSpectrum.Square.content(
        modifier = modifier,
        dot = dot,
        label = label,
        color = color,
        onSelectedColorChanged = onSelectedColorChanged
    )
}

/**
 * A composable function that displays a round color spectrum.
 *
 * @param color The currently selected color.
 * @param onSelectedColorChanged A callback function that is invoked when the selected color changes.
 *   It receives the new color as a parameter.
 * @param modifier Modifier for the round color spectrum.
 * @param dot A composable function to display the indicator dot on the color spectrum.
 *   Defaults to [ColorPickerDefaults.dot].
 * @param label A composable function to display the label of the selected color.
 *   Defaults to [ColorPickerDefaults.label].
 */
@Deprecated("Use ColorSpectrum.Round.Content in ColorPicker with ColorPickerState")
@Composable
fun RoundColorSpectrum(
    color: Color,
    onSelectedColorChanged: (color: Color) -> Unit,
    modifier: Modifier = Modifier,
    dot: @Composable () -> Unit = { ColorPickerDefaults.dot() },
    label: @Composable (color: Color) -> Unit = { ColorPickerDefaults.label(it) }
) {
    ColorSpectrum.Round.content(
        modifier = modifier,
        dot = dot,
        label = label,
        color = color,
        onSelectedColorChanged = onSelectedColorChanged
    )
}

sealed class ColorSpectrum {
    @ExperimentalFluentApi
    @Composable
    internal abstract fun Content(
        state: ColorPickerState,
        modifier: Modifier,
        dot: @Composable () -> Unit,
        label: @Composable (color: Color) -> Unit
    )

    @Deprecated("Use content with ColorPickerState instead")
    @Suppress("ComposableNaming")
    @Composable
    internal abstract fun content(
        modifier: Modifier,
        dot: @Composable () -> Unit,
        label: @Composable (color: Color) -> Unit,
        color: Color,
        onSelectedColorChanged: (color: Color) -> Unit
    )

    companion object {
        val Default: ColorSpectrum get() = Square

        @Composable
        internal fun LabelPopup(
            offsetState: State<IntOffset?>,
            label: @Composable () -> Unit
        ) {
            if (offsetState.value != null) {
                val padding = with(LocalDensity.current) { 24.dp.toPx() }
                Popup(
                    properties = PopupProperties(focusable = false),
                    popupPositionProvider = remember(offsetState) {
                        object : PopupPositionProvider {
                            override fun calculatePosition(
                                anchorBounds: IntRect,
                                windowSize: IntSize,
                                layoutDirection: LayoutDirection,
                                popupContentSize: IntSize
                            ): IntOffset {
                                var (offsetX, offsetY) = anchorBounds.topCenter
                                offsetX += - popupContentSize.width / 2
                                offsetY += - popupContentSize.height
                                return IntOffset(
                                    x = offsetX.coerceIn(0, windowSize.width - popupContentSize.width),
                                    y = offsetY.minus(padding).roundToInt().coerceIn(0, windowSize.height - popupContentSize.height)
                                )
                            }
                        }
                    },
                    content = label
                )
            }
        }
    }

    data object Round : ColorSpectrum() {
        @ExperimentalFluentApi
        @Composable
        override fun Content(
            state: ColorPickerState,
            modifier: Modifier,
            dot: @Composable (() -> Unit),
            label: @Composable ((color: Color) -> Unit)
        ) {
            val colorPanelRect = remember {
                mutableStateOf(RoundRect.Zero)
            }

            Layer(
                modifier = modifier,
                shape = CircleShape,
                backgroundSizing = BackgroundSizing.OuterBorderEdge
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .onGloballyPositioned {
                            val rect = it.boundsInParent()
                            colorPanelRect.value = RoundRect(
                                rect = rect,
                                cornerRadius = CornerRadius(rect.width, rect.height)
                            )
                        }
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            onClick = {},
                            indication = null
                        )
                        .pointerInput(Unit) {
                            detectDragGestures(
                                onDragEnd = {
                                    state.onValueChangeFinished?.invoke(state.color)
                                }
                            ) { change, _ ->
                                getColorFromPosition(
                                    rect = colorPanelRect.value,
                                    position = change.position,
                                    excludeRadius = false
                                )
                                    ?.let { color ->
                                        state.updateColor(color.copy(alpha = state.color.alpha))
                                    }
                            }
                        }
                        .background(
                            brush = Brush.sweepGradient(
                                colors = listOf(
                                    Color.Red,
                                    Color.Yellow,
                                    Color.Green,
                                    Color.Cyan,
                                    Color.Blue,
                                    Color.Magenta,
                                    Color.Red
                                )
                            ),
                            shape = CircleShape
                        )
                        .background(
                            Brush.radialGradient(
                                colors = listOf(Color.White, Color.Transparent)
                            )
                        )
                )

                if (state.color != Color.Unspecified) {
                    val dotSize = remember { mutableStateOf(IntSize.Zero) }
                    val offset = remember {
                        derivedStateOf {
                            val (offsetX, offsetY) = getPositionFromHsvColor(
                                state.hsvColor,
                                colorPanelRect.value
                            )
                            IntOffset(offsetX.toInt(), offsetY.toInt()) - IntOffset(
                                dotSize.value.width / 2,
                                dotSize.value.height / 2
                            )
                        }
                    }

                    Box {
                        Box(
                            modifier = Modifier
                                .offset { offset.value }
                                .onSizeChanged {
                                    dotSize.value = it
                                }
                        ) {
                            dot()
                            LabelPopup(
                                offsetState = offset,
                                label = {
                                    label(state.color)
                                }
                            )
                        }
                    }

                }
            }
        }

        @Composable
        override fun content(
            modifier: Modifier,
            dot: @Composable () -> Unit,
            label: @Composable (color: Color) -> Unit,
            color: Color,
            onSelectedColorChanged: (color: Color) -> Unit
        ) {

            val colorPanelRect = remember {
                mutableStateOf(RoundRect.Zero)
            }

            Layer(
                modifier = modifier,
                shape = CircleShape,
                backgroundSizing = BackgroundSizing.OuterBorderEdge
            ) {
                val interactionSource = remember { MutableInteractionSource() }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .onGloballyPositioned {
                            val rect = it.boundsInParent()
                            colorPanelRect.value = RoundRect(
                                rect = rect,
                                cornerRadius = CornerRadius(rect.width, rect.height)
                            )
                        }
                        .clickable(
                            interactionSource = interactionSource,
                            onClick = {},
                            indication = null
                        )
                        .pointerInput(Unit) {
                            detectDragGestures { change, _ ->
                                onSelectedColorChanged(
                                    getColorFromPosition(
                                        colorPanelRect.value,
                                        change.position,
                                        false
                                    ) ?: return@detectDragGestures
                                )
                            }
                        }
                        .background(
                            Brush.sweepGradient(
                                colors = listOf(
                                    Color.Red,
                                    Color.Yellow,
                                    Color.Green,
                                    Color.Cyan,
                                    Color.Blue,
                                    Color.Magenta,
                                    Color.Red
                                )
                            ), CircleShape
                        )
                        .background(
                            Brush.radialGradient(
                                colors = listOf(Color.White, Color.Transparent)
                            )
                        )
                )

                if (color != Color.Unspecified) {

                    val colorState = rememberUpdatedState(color)
                    val dotSize = remember { mutableStateOf(IntSize.Zero) }
                    val offset = remember {
                        derivedStateOf {
                            val (offsetX, offsetY) = getPositionFromColor(
                                colorState.value,
                                colorPanelRect.value
                            )
                            IntOffset(offsetX.toInt(), offsetY.toInt()) - IntOffset(
                                dotSize.value.width / 2,
                                dotSize.value.height / 2
                            )
                        }
                    }

                    Box {
                        Box(
                            modifier = Modifier
                                .offset { offset.value }
                                .onSizeChanged {
                                    dotSize.value = it
                                }
                        ) {
                            dot()
                            LabelPopup(
                                offsetState = offset,
                                label = {
                                    label(color)
                                }
                            )
                        }
                    }

                }
            }
        }

        private fun getColorFromPosition(
            rect: RoundRect,
            position: Offset,
            excludeRadius: Boolean = true
        ): Color? {
            if (!excludeRadius || rect.contains(position)) {
                val center = rect.center
                val offsetX = position.x - center.x
                val offsetY = position.y - center.y
                // calculates the angle in degrees
                val angle = (atan2(x = offsetX, y = offsetY) / (2 * PI) + 1f) * 360
                val distance = sqrt(offsetX * offsetX + offsetY * offsetY)
                val radius = rect.width / 2
                val result = Color.hsv(
                    hue = angle.toFloat().mod(360f),
                    saturation = (distance / radius).coerceAtMost(1f),
                    value = 1f
                )
                return result
            }
            return null
        }

        @ExperimentalFluentApi
        private fun getPositionFromHsvColor(
            hsvColor: HsvColor,
            rect: RoundRect
        ): Offset {
            val radius = rect.width / 2
            val (hue, saturation, _) = hsvColor
            val angle = (hue / 360) * 2 * PI
            val offsetX = cos(angle) * saturation * radius + radius
            val offsetY = sin(angle) * saturation * radius + radius
            return Offset(offsetX.toFloat(), offsetY.toFloat())
        }

        @Deprecated("Use getPositionFromHsvColor instead")
        private fun getPositionFromColor(color: Color, rect: RoundRect): Offset {
            if (color == Color.Unspecified) return Offset.Zero
            val radius = rect.width / 2
            val (hue, saturation, _) = color.hsv()
            val angle = (hue / 360) * 2 * PI
            val offsetX = cos(angle) * saturation * radius + radius
            val offsetY = sin(angle) * saturation * radius + radius
            return Offset(offsetX.toFloat(), offsetY.toFloat())
        }
    }

    data object Square : ColorSpectrum() {
        @ExperimentalFluentApi
        @Composable
        override fun Content(
            state: ColorPickerState,
            modifier: Modifier,
            dot: @Composable (() -> Unit),
            label: @Composable ((color: Color) -> Unit)
        ) {
            Layer(
                modifier = modifier,
                backgroundSizing = BackgroundSizing.OuterBorderEdge
            ) {
                val latestPressPosition = remember { mutableStateOf<Offset?>(null) }
                val colorPanelRect = remember { mutableStateOf(Rect.Zero) }

                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .onGloballyPositioned {
                            colorPanelRect.value = it.boundsInParent()
                        }
                        .background(
                            Brush.horizontalGradient(
                                colors = listOf(
                                    Color.Red,
                                    Color.Yellow,
                                    Color.Green,
                                    Color.Cyan,
                                    Color.Blue,
                                    Color.Magenta,
                                    Color.Red
                                )
                            )
                        )
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color.Transparent, Color.White)
                            )
                        )
                        .clickable(
                            onClick = {},
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null
                        )
                        .pointerInput(Unit) {
                            detectDragGestures(
                                onDragEnd = {
                                    state.onValueChangeFinished?.invoke(state.color)
                                }
                            ) { change, _ ->
                                latestPressPosition.value = change.position
                                getColorFromPosition(
                                    rect = colorPanelRect.value,
                                    position = change.position,
                                    excludeRadius = false
                                )
                                    ?.let { color ->
                                        state.updateColor(color.copy(alpha = state.color.alpha))
                                    }
                            }
                        }
                )

                if (state.color != Color.Unspecified) {
                    val dotSize = remember { mutableStateOf(IntSize.Zero) }
                    val offset = remember {
                        derivedStateOf {
                            val currentLatestPressPosition = latestPressPosition.value
                            val (offsetX, offsetY) = when {
                                (state.color == Color.White || state.color.red == 1f) &&
                                    currentLatestPressPosition != null -> {
                                    Offset(
                                        x = currentLatestPressPosition.x.coerceIn(
                                            0f,
                                            colorPanelRect.value.width
                                        ),
                                        y = currentLatestPressPosition.y.coerceIn(
                                            0f,
                                            colorPanelRect.value.height
                                        )
                                    )
                                }

                                else ->
                                    getPositionFromHsvColor(
                                        hsvColor = state.hsvColor,
                                        rect = colorPanelRect.value
                                    )
                            }
                            IntOffset(offsetX.toInt(), offsetY.toInt()) - IntOffset(
                                dotSize.value.width / 2,
                                dotSize.value.height / 2
                            )
                        }
                    }


                    Box {
                        Box(
                            modifier = Modifier
                                .offset { offset.value }
                                .wrapContentSize()
                                .onSizeChanged {
                                    dotSize.value = it
                                }
                        ) {
                            dot()
                            LabelPopup(
                                offsetState = offset,
                                label = { label(state.color) }
                            )
                        }
                    }
                }
            }
        }

        @OptIn(ExperimentalFluentApi::class)
        @Composable
        override fun content(
            modifier: Modifier,
            dot: @Composable () -> Unit,
            label: @Composable (color: Color) -> Unit,
            color: Color,
            onSelectedColorChanged: (color: Color) -> Unit
        ) {

            Layer(
                modifier = modifier,
                backgroundSizing = BackgroundSizing.OuterBorderEdge
            ) {
                val latestPressPosition = remember { mutableStateOf<Offset?>(null) }
                val colorPanelRect = remember { mutableStateOf(Rect.Zero) }
                val interactionSource = remember { MutableInteractionSource() }
                LaunchedEffect(interactionSource) {
                    interactionSource.interactions.collectLatest {
                        if (it is PressInteraction.Release) {
                            latestPressPosition.value = it.press.pressPosition
                            onSelectedColorChanged(
                                getColorFromPosition(
                                    colorPanelRect.value,
                                    it.press.pressPosition
                                ) ?: return@collectLatest
                            )
                        }
                    }
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .onGloballyPositioned {
                            colorPanelRect.value = it.boundsInParent()
                        }
                        .background(
                            Brush.horizontalGradient(
                                colors = listOf(
                                    Color.Red,
                                    Color.Yellow,
                                    Color.Green,
                                    Color.Cyan,
                                    Color.Blue,
                                    Color.Magenta,
                                    Color.Red
                                )
                            )
                        )
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color.Transparent, Color.White)
                            )
                        )
                        .clickable(
                            onClick = {},
                            interactionSource = interactionSource,
                            indication = null
                        )
                        .pointerInput(Unit) {
                            detectDragGestures { change, _ ->
                                latestPressPosition.value = change.position
                                onSelectedColorChanged(
                                    getColorFromPosition(
                                        colorPanelRect.value,
                                        change.position,
                                        false
                                    ) ?: return@detectDragGestures
                                )
                            }
                        }
                )
                if (color != Color.Unspecified) {
                    val colorState = rememberUpdatedState(color)
                    val dotSize = remember { mutableStateOf(IntSize.Zero) }
                    val offset = remember {
                        derivedStateOf {
                            val currentLatestPressPosition = latestPressPosition.value
                            val (offsetX, offsetY) = when {
                                (colorState.value == Color.White || colorState.value.red == 1f) && currentLatestPressPosition != null -> {
                                    Offset(
                                        x = currentLatestPressPosition.x.coerceIn(
                                            0f,
                                            colorPanelRect.value.width
                                        ),
                                        y = currentLatestPressPosition.y.coerceIn(
                                            0f,
                                            colorPanelRect.value.height
                                        )
                                    )
                                }

                                else -> {
                                    @Suppress("DEPRECATION")
                                    getPositionFromColor(
                                        colorState.value,
                                        colorPanelRect.value
                                    )
                                }
                            }
                            IntOffset(offsetX.toInt(), offsetY.toInt()) - IntOffset(
                                dotSize.value.width / 2,
                                dotSize.value.height / 2
                            )
                        }
                    }


                    Box {
                        Box(
                            modifier = Modifier
                                .offset { offset.value }
                                .wrapContentSize()
                                .onSizeChanged {
                                    dotSize.value = it
                                }
                        ) {
                            dot()
                            LabelPopup(offsetState = offset, label = { label(color) })
                        }
                    }
                }
            }
        }

        private fun getColorFromPosition(
            rect: Rect,
            position: Offset,
            excludeRadius: Boolean = true
        ): Color? {
            if (!excludeRadius || rect.contains(position)) {

                val result = Color.hsv(
                    hue = (position.x / rect.width).coerceIn(0f, 1f) * 360,
                    saturation = (1 - position.y / rect.height).coerceIn(0f, 1f),
                    value = 1f
                )
                return result
            }
            return null
        }

        @ExperimentalFluentApi
        private fun getPositionFromHsvColor(
            hsvColor: HsvColor,
            rect: Rect
        ): Offset {
            val (hue, saturation, _) = hsvColor
            return Offset(hue / 360 * rect.width, (1 - saturation) * rect.height)
        }

        @Deprecated("Use getPositionFromHsvColor instead")
        private fun getPositionFromColor(color: Color, rect: Rect): Offset {
            if (color == Color.Unspecified) return Offset.Zero
            val (hue, saturation, _) = color.hsv()
            return Offset(hue / 360 * rect.width, (1 - saturation) * rect.height)
        }
    }
}

@Stable
private fun Color.hsv(): Triple<Float, Float, Float> {

    // Calculate the maximum and minimum RGB values.
    val red = red
    val green = green
    val blue = blue
    val max = maxOf(red, green, blue)
    val min = minOf(red, green, blue)

    // Calculate the hue.
    val hue = (when {
        max == min -> 0f
        red == max -> 60f * ((green - blue) / (max - min))
        green == max -> 60f * (2f + (blue - red) / (max - min))
        else -> 60f * (4f + (red - green) / (max - min))
    } + 360).mod(360f)

    // Calculate the saturation.
    val saturation = if (max == 0f) 0f else (max - min) / max

    // Calculate the value.
    val value = max

    // Return the HSV color.
    return Triple(hue, saturation, value)
}

/**
 * HSV Color
 *
 * @property hue 0f - 360f
 * @property saturation 0f - 1f
 * @property value 0f - 1f
 * @property alpha 0f - 1f
 */
@ExperimentalFluentApi
internal data class HsvColor(
    val hue: Float,
    val saturation: Float,
    val value: Float,
    val alpha: Float
) {
    fun toColor(): Color =
        Color.hsv(
            hue = hue,
            saturation = saturation,
            value = value,
            alpha = alpha
        )
}

@ExperimentalFluentApi
private fun Color.toHsvColor(): HsvColor {
    // Calculate the maximum and minimum RGB values
    val red = red
    val green = green
    val blue = blue
    val alpha = alpha

    val max = maxOf(red, green, blue)
    val min = minOf(red, green, blue)

    // Calculate the hue
    val delta = max - min
    val rawHue = when {
        delta == 0f -> 0f
        max == red -> (green - blue) / delta
        max == green -> (blue - red) / delta + 2f
        else -> (red - green) / delta + 4f
    }
    val hue = (rawHue * 60f).mod(360f)

    // Calculate the saturation
    val saturation = if (max == 0f) 0f else (max - min) / max

    // Calculate the value
    val value = max

    // Return the HSV color
    return HsvColor(
        hue = hue,
        saturation = saturation,
        value = value,
        alpha = alpha
    )
}
