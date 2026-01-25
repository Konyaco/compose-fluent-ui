package io.github.composefluent.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicSecureTextField
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.InputTransformation
import androidx.compose.foundation.text.input.KeyboardActionHandler
import androidx.compose.foundation.text.input.OutputTransformation
import androidx.compose.foundation.text.input.TextFieldBuffer
import androidx.compose.foundation.text.input.TextFieldDecorator
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.TextObfuscationMode
import androidx.compose.foundation.text.input.clearText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.IntrinsicMeasurable
import androidx.compose.ui.layout.IntrinsicMeasureScope
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEach
import androidx.compose.ui.util.fastSumBy
import io.github.composefluent.FluentTheme
import io.github.composefluent.LocalContentAlpha
import io.github.composefluent.LocalContentColor
import io.github.composefluent.LocalTextStyle
import io.github.composefluent.background.BackgroundSizing
import io.github.composefluent.background.Layer
import io.github.composefluent.layout.alignLast
import io.github.composefluent.scheme.PentaVisualScheme
import io.github.composefluent.scheme.collectVisualState

/**
 * A composable function that creates a text field for user input.
 *
 * @param value The current value of the text field.
 * @param onValueChange A callback function that is invoked when the text field's value changes.
 * @param modifier Modifier to apply to the text field.
 * @param enabled Controls the enabled state of the text field. When `false`, the text field will be neither editable nor focusable.
 * @param readOnly Controls the editability of the text field. When `true`, the text field can not be modified, however, a user can copy text from it.
 * @param singleLine When `true`, the text field will be limited to a single line.
 * @param visualTransformation Transforms the visual representation of the input.
 * @param keyboardOptions Software keyboard options that should be provided to the text field.
 * @param keyboardActions When the input service emits an IME action, the corresponding callback is called.
 * @param maxLines The maximum number of lines that the text field can display.
 * @param header An optional composable lambda that will be displayed above the text field as a header.
 * @param leadingIcon An optional composable lambda that will be displayed at the start of the text field.
 * @param trailing An optional composable lambda that will be displayed at the end of the text field.
 * @param placeholder An optional composable lambda that will be displayed when the text field is empty.
 * @param isClearable When true, a clear icon will be displayed when the text field is focused and not empty. Clicking it will clear the content.
 * @param interactionSource The MutableInteractionSource representing the stream of Interactions for this text field.
 * @param colors Color scheme to use for the text field.
 * @param shape The shape of the text field.
 */
@Composable
fun TextField(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    singleLine: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    maxLines: Int = Int.MAX_VALUE,
    header: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailing: (@Composable RowScope.() -> Unit)? = null,
    placeholder: (@Composable () -> Unit)? = null,
    isClearable: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TextFieldColorScheme = TextFieldDefaults.defaultTextFieldColors(),
    shape: Shape = FluentTheme.shapes.control
) {
    val color = colors.schemeFor(interactionSource.collectVisualState(!enabled, focusFirst = true))
    BasicTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        textStyle = LocalTextStyle.current.copy(color = color.contentColor),
        enabled = enabled,
        readOnly = readOnly,
        singleLine = singleLine,
        visualTransformation = visualTransformation,
        maxLines = maxLines,
        keyboardActions = keyboardActions,
        cursorBrush = color.cursorBrush,
        keyboardOptions = keyboardOptions,
        interactionSource = interactionSource,
        decorationBox = { innerTextField ->
            TextFieldDefaults.DecorationBox(
                color = color,
                interactionSource = interactionSource,
                innerTextField = innerTextField,
                value = value.text,
                enabled = enabled,
                placeholder = placeholder,
                leadingIcon = leadingIcon,
                onClearClick = if (isClearable) {
                    { onValueChange(TextFieldValue("")) }
                } else {
                    null
                },
                trailing = trailing,
                header = header,
                shape = shape
            )
        }
    )
}

/**
 * A composable function that creates a text field for user input.
 *
 * @param value The current text value of the text field.
 * @param onValueChange The callback that is triggered when the input text changes.
 * @param modifier The [Modifier] to be applied to the text field.
 * @param enabled Controls the enabled state of the text field. When `false`, the text field is not interactive.
 * @param readOnly Controls the read-only state of the text field. When `true`, the user cannot edit the text.
 * @param singleLine When `true`, the text field will be limited to a single line.
 * @param visualTransformation The visual transformation that is applied to the text field.
 * @param keyboardOptions The keyboard options to configure the type of keyboard that is shown.
 * @param keyboardActions The keyboard actions that define the behavior of the keyboard actions.
 * @param maxLines The maximum number of lines the text field can occupy.
 * @param header An optional composable lambda that is placed above the text field.
 * @param leadingIcon An optional composable lambda for a leading icon within the text field.
 * @param trailing An optional composable lambda for trailing content within the text field.
 * @param placeholder An optional composable lambda that is displayed when the text field is empty.
 * @param isClearable When `true`, a clear button is shown when the text field is focused and has content.
 * @param interactionSource The [MutableInteractionSource] for observing interactions with the text field.
 * @param colors The [TextFieldColorScheme] that defines the colors of the text field.
 * @param shape The [Shape] of the text field's background.
 */
@Composable
fun TextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    singleLine: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions(),
    maxLines: Int = Int.MAX_VALUE,
    header: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailing: (@Composable RowScope.() -> Unit)? = null,
    placeholder: (@Composable () -> Unit)? = null,
    isClearable: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TextFieldColorScheme = TextFieldDefaults.defaultTextFieldColors(),
    shape: Shape = FluentTheme.shapes.control
) {
    val color = colors.schemeFor(interactionSource.collectVisualState(!enabled, focusFirst = true))

    BasicTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        textStyle = LocalTextStyle.current.copy(color = color.contentColor),
        enabled = enabled,
        readOnly = readOnly,
        singleLine = singleLine,
        visualTransformation = visualTransformation,
        maxLines = maxLines,
        keyboardActions = keyboardActions,
        cursorBrush = color.cursorBrush,
        keyboardOptions = keyboardOptions,
        interactionSource = interactionSource,
        decorationBox = { innerTextField ->
            TextFieldDefaults.DecorationBox(
                color = color,
                interactionSource = interactionSource,
                innerTextField = innerTextField,
                value = value,
                enabled = enabled,
                placeholder = placeholder,
                leadingIcon = leadingIcon,
                onClearClick = if (isClearable) {
                    { onValueChange("") }
                } else {
                    null
                },
                header = header,
                trailing = trailing,
                shape = shape
            )
        }
    )
}

@Composable
fun TextField(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    onKeyboardAction: KeyboardActionHandler? = null,
    inputTransformation: InputTransformation? = null,
    outputTransformation: OutputTransformation? = null,
    lineLimits: TextFieldLineLimits = TextFieldLineLimits.Default,
    header: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailing: (@Composable RowScope.() -> Unit)? = null,
    placeholder: (@Composable () -> Unit)? = null,
    isClearable: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TextFieldColorScheme = TextFieldDefaults.defaultTextFieldColors(),
    onTextLayout: (Density.(getResult: () -> TextLayoutResult?) -> Unit)? = null,
    scrollState: ScrollState = rememberScrollState(),
    shape: Shape = FluentTheme.shapes.control
) {
    val color = colors.schemeFor(interactionSource.collectVisualState(!enabled, focusFirst = true))
    BasicTextField(
        modifier = modifier,
        state = state,
        textStyle = LocalTextStyle.current.copy(color = color.contentColor),
        enabled = enabled,
        readOnly = readOnly,
        onTextLayout = onTextLayout,
        lineLimits = lineLimits,
        onKeyboardAction = onKeyboardAction,
        inputTransformation = inputTransformation,
        outputTransformation = outputTransformation,
        scrollState = scrollState,
        cursorBrush = color.cursorBrush,
        keyboardOptions = keyboardOptions,
        interactionSource = interactionSource,
        decorator = decorationBoxWorkaround { innerTextField ->
            TextFieldDefaults.DecorationBox(
                state = state,
                color = color,
                interactionSource = interactionSource,
                innerTextField = innerTextField,
                enabled = enabled,
                placeholder = placeholder,
                leadingIcon = leadingIcon,
                isClearable = isClearable,
                outputTransformation = outputTransformation,
                trailing = trailing,
                shape = shape,
                header = header
            )
        }
    )
}

@Composable
fun SecureTextField(
    state: TextFieldState,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    keyboardOptions: KeyboardOptions = SecureTextFieldKeyboardOptions,
    onKeyboardAction: KeyboardActionHandler? = null,
    inputTransformation: InputTransformation? = null,
    textObfuscationMode: TextObfuscationMode = TextObfuscationMode.RevealLastTyped,
    textObfuscationCharacter: Char = DefaultObfuscationCharacter,
    header: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = null,
    trailing: (@Composable RowScope.() -> Unit)? = null,
    placeholder: (@Composable () -> Unit)? = null,
    isClearable: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TextFieldColorScheme = TextFieldDefaults.defaultTextFieldColors(),
    onTextLayout: (Density.(getResult: () -> TextLayoutResult?) -> Unit)? = null,
    shape: Shape = FluentTheme.shapes.control
) {
    val color = colors.schemeFor(interactionSource.collectVisualState(!enabled, focusFirst = true))
    BasicSecureTextField(
        modifier = modifier,
        state = state,
        textStyle = LocalTextStyle.current.copy(color = color.contentColor),
        enabled = enabled,
        onTextLayout = onTextLayout,
        onKeyboardAction = onKeyboardAction,
        inputTransformation = inputTransformation,
        textObfuscationMode = textObfuscationMode,
        textObfuscationCharacter = textObfuscationCharacter,
        cursorBrush = color.cursorBrush,
        keyboardOptions = keyboardOptions,
        interactionSource = interactionSource,
        decorator = decorationBoxWorkaround { innerTextField ->
            TextFieldDefaults.DecorationBox(
                state = state,
                color = color,
                interactionSource = interactionSource,
                innerTextField = innerTextField,
                enabled = enabled,
                placeholder = placeholder,
                leadingIcon = leadingIcon,
                isClearable = isClearable,
                outputTransformation = null,
                trailing = trailing,
                shape = shape,
                header = header
            )
        }
    )
}

/**
 * Contains the default values used for [TextField].
 */
object TextFieldDefaults {

    /**
     * Creates a [TextFieldColorScheme] with the default colors for a text field.
     *
     * @param default The colors used when the text field is in its default state.
     * @param focused The colors used when the text field is focused.
     * @param hovered The colors used when the text field is hovered over.
     * @param pressed The colors used when the text field is pressed.
     * @param disabled The colors used when the text field is disabled.
     *
     * @return A [TextFieldColorScheme] with the specified colors.
     */
    @Stable
    @Composable
    fun defaultTextFieldColors(
        default: TextFieldColor = TextFieldColor(
            fillColor = FluentTheme.colors.control.default,
            contentColor = FluentTheme.colors.text.text.primary,
            placeholderColor = FluentTheme.colors.text.text.secondary,
            bottomLineFillColor = FluentTheme.colors.stroke.controlStrong.default,
            borderBrush = FluentTheme.colors.borders.textControl,
            cursorBrush = SolidColor(FluentTheme.colors.text.text.primary)
        ),
        focused: TextFieldColor = default.copy(
            fillColor = FluentTheme.colors.control.inputActive,
            bottomLineFillColor = FluentTheme.colors.fillAccent.default,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
        ),
        hovered: TextFieldColor = default.copy(
            fillColor = FluentTheme.colors.control.secondary
        ),
        pressed: TextFieldColor = default.copy(
            fillColor = FluentTheme.colors.control.inputActive,
            borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
        ),
        disabled: TextFieldColor = default.copy(
            contentColor = FluentTheme.colors.text.text.disabled,
            placeholderColor = FluentTheme.colors.text.text.disabled,
            bottomLineFillColor = Color.Transparent,
        )
    ) = TextFieldColorScheme(
        default = default,
        focused = focused,
        hovered = hovered,
        pressed = pressed,
        disabled = disabled
    )

    @Deprecated(
        "Use DecorationBox instead", ReplaceWith(
            "DecorationBox(" +
                    "value = value," +
                    "interactionSource = interactionSource," +
                    "enabled = enabled," +
                    "color = color," +
                    "modifier = modifier," +
                    "placeholder = placeholder," +
                    "innerTextField = innerTextField," +
                    "leadingIcon = null" +
                    ")"
        )
    )
    @Composable
    fun DecorationBox(
        value: String,
        interactionSource: MutableInteractionSource,
        enabled: Boolean,
        color: TextFieldColor,
        modifier: Modifier = Modifier,
        placeholder: (@Composable () -> Unit)?,
        innerTextField: @Composable () -> Unit,
    ) = DecorationBox(
        value = value,
        interactionSource = interactionSource,
        enabled = enabled,
        color = color,
        modifier = modifier,
        placeholder = placeholder,
        innerTextField = innerTextField,
        leadingIcon = null,
        onClearClick = null,
        trailing = null,
        container = {},
        shape = FluentTheme.shapes.control,
        header = null
    )

    /**
     * Composable function that provides the visual decoration for a text field.
     *
     * This function wraps the inner text field with a styled layer, including optional
     * leading and trailing icons, a clear button, and placeholder text. It also handles
     * the visual states of the text field, such as hover, focus, and enabled/disabled.
     * This overload is specifically for use with [TextFieldState].
     *
     * @param state The [TextFieldState] managing the text and selection of the text field.
     * @param isClearable Determines if a clear button should be shown when the text field is focused and not empty.
     * @param outputTransformation An optional [OutputTransformation] to modify the visual representation of the text.
     * @param interactionSource The [MutableInteractionSource] representing the stream of
     *   interactions for this text field. You can create and pass in your own remembered
     *   [MutableInteractionSource] if you want to observe interactions and customize the
     *   decoration based on them.
     * @param enabled Controls the enabled state of the text field. When `false`, the text field
     *   will be visually disabled and will not respond to input.
     * @param color The color scheme for the text field, including colors for the background, text,
     *   placeholder, and border.
     * @param modifier Optional [Modifier] to be applied to the outer layer of the text field.
     * @param shape The [Shape] of the text field's background layer.
     * @param header Optional composable that will be displayed above the text field.
     * @param placeholder Optional composable that will be displayed when the text field is empty
     *   and not focused.
     * @param leadingIcon Optional composable that will be displayed at the start of the text field.
     * @param trailing Optional composable that will be displayed at the end of the text field, such as an action button.
     * @param container The [TextFieldDecorator] that defines the container for the text field.
     *  By default, it uses a [Container] with the provided shape, interaction source, color, and enabled state.
     * @param innerTextField The composable that renders the actual text field content.
     */
    @Composable
    fun DecorationBox(
        state: TextFieldState,
        isClearable: Boolean,
        outputTransformation: OutputTransformation?,
        interactionSource: MutableInteractionSource,
        enabled: Boolean,
        color: TextFieldColor,
        modifier: Modifier = Modifier,
        shape: Shape,
        header: (@Composable () -> Unit)?,
        placeholder: (@Composable () -> Unit)?,
        leadingIcon: (@Composable () -> Unit)?,
        trailing: (@Composable RowScope.() -> Unit)?,
        container: TextFieldDecorator = decorationBoxWorkaround {
            Container(
                shape = shape,
                interactionSource = interactionSource,
                color = color,
                enabled = enabled,
                content = it
            )
        },
        innerTextField: @Composable () -> Unit,
    ) {
        val visualText = if (outputTransformation == null) state.text
        else {
            lateinit var buffer: TextFieldBuffer
            state.edit { buffer = this }
            with(outputTransformation) { buffer.transformOutput() }
            buffer.asCharSequence()
        }
        DecorationBox(
            color = color,
            interactionSource = interactionSource,
            innerTextField = innerTextField,
            value = visualText,
            enabled = enabled,
            header = header,
            placeholder = placeholder,
            leadingIcon = leadingIcon,
            onClearClick = if (isClearable) {
                { state.clearText() }
            } else {
                null
            },
            container = container,
            trailing = trailing,
            shape = shape,
            modifier = modifier
        )
    }

    /**
     * Composable function that provides the visual decoration for a text field.
     *
     * This function wraps the inner text field with a styled layer, including optional
     * leading and trailing icons, a clear button, and placeholder text. It also handles
     * the visual states of the text field, such as hover, focus, and enabled/disabled.
     *
     * @param value The current text value of the text field. This could be the direct input or
     *  the result of an [OutputTransformation].
     * @param interactionSource The [MutableInteractionSource] representing the stream of
     *   interactions for this text field. You can create and pass in your own remembered
     *   [MutableInteractionSource] if you want to observe interactions and customize the
     *   decoration based on them.
     * @param enabled Controls the enabled state of the text field. When `false`, the text field
     *   will be visually disabled and will not respond to input.
     * @param color The color scheme for the text field, including colors for the background, text,
     *   placeholder, and border.
     * @param modifier Optional [Modifier] to be applied to the outer layer of the text field.
     * @param shape The [Shape] of the text field's background layer.
     * @param onClearClick Optional callback that will be invoked when the clear button is clicked.
     *   If null, no clear button will be shown.
     * @param header Optional composable that will be displayed above the text field.
     * @param placeholder Optional composable that will be displayed when the text field is empty
     *   and not focused.
     * @param leadingIcon Optional composable that will be displayed at the start of the text field.
     * @param trailing Optional composable that will be displayed at the end of the text field, such as an action button.
     * @param container The [TextFieldDecorator] that defines the container for the text field.
     *  By default, it uses a [Container] with the specified shape, interaction source, color, and enabled state.
     * @param innerTextField The composable that renders the actual text field content.
     */
    @Composable
    fun DecorationBox(
        value: CharSequence,
        interactionSource: MutableInteractionSource,
        enabled: Boolean,
        color: TextFieldColor,
        modifier: Modifier = Modifier,
        shape: Shape,
        onClearClick: (() -> Unit)? = null,
        header: (@Composable () -> Unit)?,
        placeholder: (@Composable () -> Unit)?,
        leadingIcon: (@Composable () -> Unit)?,
        trailing: (@Composable RowScope.() -> Unit)?,
        container: TextFieldDecorator = decorationBoxWorkaround {
            Container(
                shape = shape,
                interactionSource = interactionSource,
                color = color,
                enabled = enabled,
                content = it
            )
        },
        innerTextField: @Composable () -> Unit,
    ) {
        HeaderContainer(header = header, modifier = modifier) {
            Box(
                modifier = Modifier.textFieldModifier(shape).hoverable(interactionSource),
                propagateMinConstraints = true
            ) {
                container.Decoration {
                    Row(
                        horizontalArrangement = TextFieldContentArrangement,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
                    ) {
                        if (leadingIcon != null) {
                            Box(modifier = Modifier.padding(start = 16.dp)) {
                                leadingIcon()
                            }
                        }
                        Box(
                            modifier = Modifier.weight(1f, fill = false)
                                .padding(horizontal = 12.dp),
                            Alignment.CenterStart
                        ) {
                            innerTextField()
                            if (value.isEmpty() && placeholder != null) {
                                CompositionLocalProvider(
                                    LocalContentColor provides color.placeholderColor,
                                    LocalTextStyle provides LocalTextStyle.current.copy(color = color.placeholderColor)
                                ) {
                                    placeholder()
                                }
                            }
                        }
                        val isFocused = interactionSource.collectIsFocusedAsState()
                        val hasClearButton =
                            onClearClick != null && isFocused.value && value.isNotEmpty()
                        if (trailing != null || hasClearButton) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp),
                                modifier = Modifier.padding(end = 4.dp)
                            ) {
                                if (hasClearButton) {
                                    TextBoxButton(
                                        enabled = enabled,
                                        onClick = onClearClick
                                    ) { TextBoxButtonDefaults.ClearIcon() }
                                }
                                trailing?.invoke(this)
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * A container composable function used within the TextField.
     * It applies a [Layer] with specific styling for the text field,
     * including a bottom line that changes based on focus and enabled state.
     *
     * @param modifier The modifier to be applied to the container.
     * @param shape The shape of the container.
     * @param interactionSource The interaction source to track focus state.
     * @param color The color scheme for the text field.
     * @param enabled A boolean indicating whether the text field is enabled.
     * @param content The content to be displayed within the container.
     */
    @Composable
    fun Container(
        modifier: Modifier = Modifier,
        shape: Shape,
        interactionSource: MutableInteractionSource,
        color: TextFieldColor,
        enabled: Boolean,
        content: @Composable () -> Unit
    ) {
        Layer(
            modifier = modifier.drawBottomLine(
                color = color,
                interactionSource = interactionSource,
                enabled = enabled
            ),
            shape = shape,
            color = color.fillColor,
            border = BorderStroke(1.dp, color.borderBrush),
            backgroundSizing = BackgroundSizing.OuterBorderEdge,
            content = content
        )
    }
}

typealias TextFieldColorScheme = PentaVisualScheme<TextFieldColor>

/**
 * Represents the color scheme for a TextField.
 *
 * @property fillColor The background fill color of the text field.
 * @property contentColor The color of the text content within the text field.
 * @property placeholderColor The color of the placeholder text when the text field is empty.
 * @property bottomLineFillColor The color of the bottom line of the text field.
 * @property borderBrush The brush used to draw the border around the text field.
 * @property cursorBrush The brush used to draw the cursor within the text field.
 */
@Immutable
data class TextFieldColor(
    val fillColor: Color,
    val contentColor: Color,
    val placeholderColor: Color,
    val bottomLineFillColor: Color,
    val borderBrush: Brush,
    val cursorBrush: Brush
)

@Composable
private fun HeaderContainer(
    header: (@Composable () -> Unit)?,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Layout(
        content = {
            if (header != null) {
                Box(modifier = Modifier.layoutId("header").padding(bottom = 8.dp)) {
                    CompositionLocalProvider(
                        LocalTextStyle provides FluentTheme.typography.body,
                        LocalContentColor provides FluentTheme.colors.text.text.primary,
                        LocalContentAlpha provides FluentTheme.colors.text.text.primary.alpha
                    ) {
                        header()
                    }
                }
            }
            Box(modifier = Modifier.layoutId("content"), propagateMinConstraints = true) {
                content()
            }
        },
        modifier = modifier,
        measurePolicy = remember { HeaderMeasurePolicy() }
    )
}

private class HeaderMeasurePolicy() : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints
    ): MeasureResult {
        var titleMeasurable: Measurable? = null
        var contentMeasurable: Measurable? = null
        measurables.fastForEach {
            when (it.layoutId) {
                "header" -> titleMeasurable = it
                "content" -> contentMeasurable = it
            }
        }
        val headerPlaceable = titleMeasurable?.measure(constraints.copy(minHeight = 0))
        val contentPlaceable = contentMeasurable?.measure(
            constraints.copy(
                minWidth = maxOf(
                    constraints.minWidth,
                    headerPlaceable?.width ?: 0
                ), minHeight = 0
            )
        )
        val layoutWidth =
            maxOf(constraints.minWidth, headerPlaceable?.width ?: 0, contentPlaceable?.width ?: 0)
        val headerHeight = headerPlaceable?.height ?: 0
        val contentHeight = contentPlaceable?.height ?: 0
        val layoutHeight = maxOf(constraints.minHeight, headerHeight + contentHeight)
        return layout(layoutWidth, layoutHeight) {
            headerPlaceable?.placeRelative(0, 0)
            contentPlaceable?.placeRelative(0, headerHeight)
        }
    }

    override fun IntrinsicMeasureScope.maxIntrinsicHeight(
        measurables: List<IntrinsicMeasurable>,
        width: Int
    ): Int {
        return measurables.fastSumBy { it.maxIntrinsicHeight(width) }
    }

    override fun IntrinsicMeasureScope.minIntrinsicHeight(
        measurables: List<IntrinsicMeasurable>,
        width: Int
    ): Int {
        return measurables.fastSumBy { it.minIntrinsicHeight(width) }
    }
}

@Composable
private fun Modifier.drawBottomLine(
    enabled: Boolean,
    color: TextFieldColor,
    interactionSource: MutableInteractionSource
): Modifier {
    val isFocused by interactionSource.collectIsFocusedAsState()
    return if (enabled) {
        val height by rememberUpdatedState(with(LocalDensity.current) {
            (if (isFocused) 2.dp else 1.dp).toPx()
        })
        val fillColor by rememberUpdatedState(color.bottomLineFillColor)
        drawWithContent {
            drawContent()
            drawRect(
                color = fillColor,
                topLeft = Offset(0f, size.height - height),
                size = Size(size.width, height)
            )
        }
    } else this
}

@Stable
internal fun Modifier.textFieldModifier(shape: Shape) =
    defaultMinSize(64.dp, 32.dp).clip(shape)

private val TextFieldContentArrangement = Arrangement.alignLast(Arrangement.Start, Alignment.End)

private val SecureTextFieldKeyboardOptions =
    KeyboardOptions(autoCorrectEnabled = false, keyboardType = KeyboardType.Password)

private const val DefaultObfuscationCharacter: Char = '\u2022'

//TODO Remove, https://youtrack.jetbrains.com/issue/CMP-9456
@Composable
internal inline fun decorationBoxWorkaround(crossinline content: @Composable (innerTextField: @Composable () -> Unit) -> Unit): TextFieldDecorator {
    return object : TextFieldDecorator {
        @Composable
        override fun Decoration(innerTextField: @Composable () -> Unit) {
            content(innerTextField)
        }
    }
}

