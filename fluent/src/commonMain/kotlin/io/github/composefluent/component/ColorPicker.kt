package io.github.composefluent.component

import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
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
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.boundsInParent
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
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
                    onValueChanged = {
                        onSelectedColorChanged(it)
                        spectrumColor.value = it.copy(1f)
                    },
                    alphaEnabled = alphaEnabled,
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
                    label = "Blue"
                )
                ColorTextField(
                    value = (color.blue * 255).toInt(),
                    onValueChanged = {
                        onSelectedColorChanged(color.copy(blue = (it.toFloat() / 255f)))
                        spectrumColor.value = color
                    },
                    label = "Green"
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
            modifier = Modifier.width(120.dp).fillMaxWidth()
        )
        Text(label, color = FluentTheme.colors.text.text.secondary)
    }
}

@OptIn(ExperimentalStdlibApi::class)
@Composable
fun HexColorTextField(
    color: Color,
    onValueChanged: (color: Color) -> Unit,
    alphaEnabled: Boolean,
    modifier: Modifier = Modifier
) {
    //TODO TextField clean button
    val hexFormat = remember {
        HexFormat {
            upperCase = true
            number.removeLeadingZeros = false
        }
    }
    val textFieldValue = remember {
        mutableStateOf(TextFieldValue("#"))
    }

    val isTextFieldInput = remember { mutableStateOf(false) }
    LaunchedEffect(color) {
        if (color.toArgb() != textFieldValue.value.text.removePrefix("#").toIntOrNull(16)) {
            val hexString = color.value.toHexString(hexFormat)
            textFieldValue.value = textFieldValue.value.copy(
                text = "#" + hexString.substring(
                    minOf(
                        if (!alphaEnabled) 2 else 0,
                        color.value.toHexString(hexFormat).lastIndex
                    ),
                    minOf(8, color.value.toHexString(hexFormat).length)
                )
            )
        }
    }
    TextField(
        value = textFieldValue.value,
        onValueChange = {
            isTextFieldInput.value = true
            val updateColor = textFieldValue.value.text != it.text
            textFieldValue.value = it
            if (updateColor) {
                val newValueText = it.text.removePrefix("#")
                val count = 8 - newValueText.length
                val formatNewValueText = if (count > 0) {
                    "FF00000000".substring(0, count) + newValueText
                } else {
                    newValueText
                }
                val newValue = formatNewValueText.toLongOrNull(16)
                if (newValue != null && newValue in 0L..0xFFFFFFFFL) {
                    onValueChanged(Color(newValue))
                }
            }
            isTextFieldInput.value = false
        },
        modifier = modifier
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
                LaunchedEffect(interactionSource) {
                    interactionSource.interactions
                        .collectLatest {
                            if (it is PressInteraction.Release) {
                                val position = it.press.pressPosition
                                onSelectedColorChanged(
                                    getColorFromPosition(
                                        colorPanelRect.value,
                                        position
                                    ) ?: return@collectLatest
                                )
                            }
                        }
                }
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

