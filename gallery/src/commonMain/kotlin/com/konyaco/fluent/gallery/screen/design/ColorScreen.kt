package com.konyaco.fluent.gallery.screen.design

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.ExperimentalFluentApi
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.FluentThemeConfiguration
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.ElevationDefaults
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.component.AccentButton
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.ButtonColor
import com.konyaco.fluent.component.ButtonColorScheme
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.Scrollbar
import com.konyaco.fluent.component.ScrollbarContainer
import com.konyaco.fluent.component.Slider
import com.konyaco.fluent.component.Switcher
import com.konyaco.fluent.component.TabItem
import com.konyaco.fluent.component.TabViewDefaults
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.TopNav
import com.konyaco.fluent.component.TopNavItem
import com.konyaco.fluent.component.rememberScrollbarAdapter
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.CopyButton
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Dismiss
import com.konyaco.fluent.scheme.PentaVisualScheme
import com.konyaco.fluent.source.generated.FluentSourceFile
import com.konyaco.fluent.surface.Card
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.banner
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalFluentApi::class)
@Component(icon = "Color")
@Composable
fun ColorScreen() {
    GalleryPage(
        title = "Color",
        description = "The colors below are part of Compose Fluent Design. " +
                "You can reference them in your app",
        galleryPath = ComponentPagePath.ColorScreen,
        componentPath = FluentSourceFile.Colors
    ) {
        Section {
            Column {
                var selectedItem by remember { mutableStateOf(ColorPage.Text) }
                var expanded by remember { mutableStateOf(false) }
                TopNav(
                    expanded = expanded,
                    onExpandedChanged = { expanded = it }
                ) {
                    items(ColorPage.entries.size) { index ->
                        val colorPage = ColorPage.entries[index]
                        TopNavItem(
                            selected = selectedItem == colorPage,
                            onClick = { selectedItem = colorPage },
                            text = {
                                Text(colorPage.name)
                            }
                        )
                    }
                }
                FluentThemeConfiguration(colors = it) {
                    AnimatedContent(
                        targetState = selectedItem,
                        transitionSpec = {
                            val isForward = targetState.ordinal > initialState.ordinal

                            (fadeIn(
                                tween(
                                    durationMillis = FluentDuration.QuickDuration,
                                    easing = FluentEasing.FadeInFadeOutEasing,
                                    delayMillis = FluentDuration.QuickDuration
                                )
                            ) + slideInHorizontally(
                                tween(
                                    durationMillis = FluentDuration.ShortDuration,
                                    easing = FluentEasing.FastInvokeEasing,
                                    delayMillis = FluentDuration.QuickDuration
                                )
                            ) {
                                if (isForward) {
                                    it / 5
                                } else {
                                    -it / 5
                                }
                            }) togetherWith fadeOut(
                                tween(
                                    durationMillis = FluentDuration.QuickDuration,
                                    easing = FluentEasing.FadeInFadeOutEasing,
                                    delayMillis = FluentDuration.QuickDuration
                                )
                            )
                        }
                    ) { page ->
                        ColorPage {
                            when (page) {
                                ColorPage.Text -> TextColorPage()
                                ColorPage.Fill -> FillColorPage()
                                ColorPage.Stroke -> StrokeColorPage()
                                ColorPage.Background -> BackgroundColorPage()
                                ColorPage.Signal -> SignalColorPage()
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun TextColorPage() {
    ColorSection(
        section = "Text",
        sample = {
            Text(
                text = "Aa",
                style = FluentTheme.typography.titleLarge,
                color = FluentTheme.colors.text.text.primary
            )
        },
        description = "For UI labels and static text",
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.text.text.primary,
                contentColor = FluentTheme.colors.text.onAccent.primary,
                name = "Primary",
                explanation = "Rest or Hover",
                usage = "text.text.primary",
                showSeparator = false
            ),
            ColorInfo(
                color = FluentTheme.colors.text.text.secondary,
                contentColor = FluentTheme.colors.text.onAccent.primary,
                name = "Secondary",
                explanation = "Rest or Hover",
                usage = "text.text.secondary",
                showSeparator = false
            ),
            ColorInfo(
                color = FluentTheme.colors.text.text.tertiary,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Tertiary",
                explanation = "Pressed only (not accessible)",
                usage = "text.text.tertiary",
                showSeparator = false
            ),
            ColorInfo(
                color = FluentTheme.colors.text.text.disabled,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Disabled",
                explanation = "Disabled only (not accessible)",
                usage = "text.text.disabled",
                showSeparator = false
            )
        )
    )
    ColorSection(
        section = "Accent Text",
        sample = {
            Text(
                text = "Aa",
                style = FluentTheme.typography.titleLarge,
                color = FluentTheme.colors.text.accent.primary
            )
        },
        description = "Recommended for links",
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.text.accent.primary,
                contentColor = FluentTheme.colors.text.onAccent.primary,
                name = "Primary",
                explanation = "Rest or Hover",
                usage = "text.accent.primary",
                showSeparator = false
            ),
            ColorInfo(
                color = FluentTheme.colors.text.accent.secondary,
                contentColor = FluentTheme.colors.text.onAccent.primary,
                name = "Secondary",
                explanation = "Rest or Hover",
                usage = "text.accent.secondary",
                showSeparator = false
            ),
            ColorInfo(
                color = FluentTheme.colors.text.accent.tertiary,
                contentColor = FluentTheme.colors.text.onAccent.primary,
                name = "Tertiary",
                explanation = "Pressed only (not accessible)",
                usage = "text.accent.tertiary",
                showSeparator = false
            ),
            ColorInfo(
                color = FluentTheme.colors.text.accent.disabled,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Disabled",
                explanation = "Disabled only (not accessible)",
                usage = "text.accent.disabled",
                showSeparator = false
            )
        )
    )
    ColorSection(
        section = "Text on accent",
        color = FluentTheme.colors.fillAccent.default,
        contentColor = FluentTheme.colors.text.onAccent.primary,
        sample = {
            Text(
                text = "Aa",
                style = FluentTheme.typography.titleLarge,
                color = FluentTheme.colors.text.onAccent.primary
            )
        },
        description = "Used for text on accent colored controls or fills",
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.text.onAccent.primary,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Primary",
                explanation = "Rest or Hover",
                usage = "text.onAccent.primary"
            ),
            ColorInfo(
                color = FluentTheme.colors.text.onAccent.secondary,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Secondary",
                explanation = "Pressed only (not accessible)",
                usage = "text.onAccent.secondary"
            ),
            ColorInfo(
                color = FluentTheme.colors.text.onAccent.disabled,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Disabled",
                explanation = "Disabled only (not accessible)",
                usage = "text.onAccent.disabled"
            ),
            ColorInfo(
                color = FluentTheme.colors.text.onAccent.selectedText,
                contentColor = Color.Black,
                name = "Selected Text",
                explanation = "For highlighted text in text entry experiences",
                usage = "text.onAccent.selectedText"
            )
        )
    )
}

@Composable
private fun FillColorPage() {
    ColorSection(
        section = "Control Fill",
        header = "Control",
        description = "Fill used for standard controls",
        sample = {
            Button(
                onClick = {},
                content = { Text("Text") }
            )
        },
        groups = arrayOf(
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.control.default,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Default",
                    explanation = "Rest",
                    usage = "control.default"
                ),
                ColorInfo(
                    color = FluentTheme.colors.control.secondary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Secondary",
                    explanation = "Hover",
                    usage = "control.secondary"
                ),
                ColorInfo(
                    color = FluentTheme.colors.control.tertiary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Tertiary",
                    explanation = "Pressed",
                    usage = "control.tertiary"
                ),
                ColorInfo(
                    color = FluentTheme.colors.control.quaternary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Quaternary",
                    explanation = "Rest (Pill Button control)",
                    usage = "control.quaternary"
                )
            ),
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.control.disabled,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Disabled",
                    explanation = "Disabled",
                    usage = "control.disabled"
                ),
                ColorInfo(
                    color = FluentTheme.colors.control.transparent,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Transparent",
                    explanation = "Rest",
                    usage = "control.transparent"
                ),
                ColorInfo(
                    color = FluentTheme.colors.control.inputActive,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Input Active",
                    explanation = "Active/focused text input fields",
                    usage = "control.inputActive"
                )
            )
        )
    )

    ColorSection(
        section = "Control Alt Fill",
        header = "Control Alt",
        description = "Fill used for the 'off' states of toggle controls",
        sample = {
            var checked by remember { mutableStateOf(false) }
            Switcher(checked = checked, onCheckStateChange = { checked = it })
        },
        groups = arrayOf(
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.controlAlt.transparent,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Transparent",
                    explanation = "Rest",
                    usage = "controlAlt.transparent",
                    showSeparator = true
                ),
                ColorInfo(
                    color = FluentTheme.colors.controlAlt.secondary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Secondary",
                    explanation = "Hover",
                    usage = "controlAlt.secondary",
                    showSeparator = true
                ),
                ColorInfo(
                    color = FluentTheme.colors.controlAlt.tertiary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Tertiary",
                    explanation = "Pressed",
                    usage = "controlAlt.tertiary",
                    showSeparator = true
                )
            ),
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.controlAlt.quaternary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Quaternary",
                    explanation = "Pressed",
                    usage = "controlAlt.quaternary",
                    showSeparator = true
                ),
                ColorInfo(
                    color = FluentTheme.colors.controlAlt.disabled,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Disabled",
                    explanation = "Disabled",
                    usage = "controlAlt.disabled",
                    showSeparator = true
                ),
            )
        )
    )

    ColorSection(
        section = "Control Solid",
        description = "Fills used for Sliders thumb control to cover the track beneath it.",
        sample = {
            var value by remember { mutableStateOf(0.5f) }
            Slider(
                value = value,
                onValueChange = { value = it },
                modifier = Modifier.height(32.dp).width(100.dp)
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.controlSolid.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Rest",
                usage = "controlSolid.default"
            )
        )
    )

    ColorSection(
        section = "Control Strong",
        description = "Used for controls that must meet contrast ratio requirements of 3:1.",
        sample = {

            val scrollState = rememberScrollState()
            ScrollbarContainer(
                isVertical = false,
                scrollbar = {
                    Scrollbar(
                        isVertical = false,
                        adapter = rememberScrollbarAdapter(scrollState),
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                modifier = Modifier.width(160.dp)
            ) {
                Box(
                    modifier = Modifier.fillMaxWidth().horizontalScroll(scrollState).height(28.dp)
                ) {
                    Spacer(modifier = Modifier.height(1.dp).width(700.dp))
                }
            }
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.controlStrong.default,
                contentColor = FluentTheme.colors.text.onAccent.primary,
                name = "Default",
                explanation = "Rest or hover",
                usage = "controlStrong.default",
                showSeparator = false
            ),
            ColorInfo(
                color = FluentTheme.colors.controlStrong.disabled,
                contentColor = FluentTheme.colors.text.onAccent.primary,
                name = "Disabled only (not accessible)",
                explanation = "Disabled",
                usage = "controlStrong.disabled"
            )
        )
    )
    ColorSection(
        section = "Subtle Fill",
        header = "Subtle",
        description = "Used for list items and fills that are transparent at rest and appear upon interaction.",
        sample = {
            Column {
                Text(
                    text = "Rest",
                    modifier = Modifier.padding(8.dp)
                )
                Layer(
                    color = FluentTheme.colors.subtleFill.secondary,
                    shape = FluentTheme.shapes.control,
                    contentColor = LocalContentColor.current,
                    border = null,
                    modifier = Modifier.widthIn(120.dp)
                ) {
                    Text("Hover", modifier = Modifier.padding(12.dp))
                }
            }
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.subtleFill.transparent,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Transparent",
                explanation = "Rest",
                usage = "subtleFill.transparent"
            ),
            ColorInfo(
                color = FluentTheme.colors.subtleFill.secondary,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Secondary",
                explanation = "Hover",
                usage = "subtleFill.secondary"
            ),
            ColorInfo(
                color = FluentTheme.colors.subtleFill.tertiary,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Tertiary",
                explanation = "Pressed",
                usage = "subtleFill.tertiary"
            ),
            ColorInfo(
                color = FluentTheme.colors.subtleFill.disabled,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Disabled",
                explanation = "Disabled only (not accessible)",
                usage = "subtleFill.disabled"
            )
        )
    )

    ColorSection(
        section = "Color On Image Fill",
        description = "Used for controls living on top of imagery.",
        header = "Color On Image",
        sample = {
            Box(
                modifier = Modifier.clip(FluentTheme.shapes.control)
            ) {
                Image(
                    painter = painterResource(Res.drawable.banner),
                    contentDescription = null,
                    modifier = Modifier
                        .background(FluentTheme.colors.background.mica.base)
                        .size(112.dp)
                )

                Layer(
                    content = {},
                    border = BorderStroke(1.dp, FluentTheme.colors.controlStrong.default),
                    color = FluentTheme.colors.controlOnImage.default,
                    backgroundSizing = BackgroundSizing.InnerBorderEdge,
                    clipContent = true,
                    modifier = Modifier.align(Alignment.TopEnd)
                        .padding(4.dp)
                        .size(20.dp)
                )
            }
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.controlOnImage.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Rest",
                usage = "controlOnImage.default"
            ),
            ColorInfo(
                color = FluentTheme.colors.controlOnImage.secondary,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Secondary",
                explanation = "Hover",
                usage = "controlOnImage.secondary"
            ),
            ColorInfo(
                color = FluentTheme.colors.controlOnImage.tertiary,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Tertiary",
                explanation = "Pressed",
                usage = "controlOnImage.tertiary"
            ),
            ColorInfo(
                color = FluentTheme.colors.controlOnImage.disabled,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Disabled only (not accessible)",
                explanation = "Disabled",
                usage = "controlOnImage.disabled"
            )
        )
    )

    ColorSection(
        section = "Accent Fill",
        header = "Accent",
        description = "Used for accent fills on controls",
        sample = {
            AccentButton(
                onClick = {},
                content = {
                    Text("Text")
                }
            )
        },
        groups = arrayOf(
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.fillAccent.default,
                    contentColor = FluentTheme.colors.text.onAccent.primary,
                    name = "Default",
                    explanation = "Rest",
                    usage = "fillAccent.default",
                    showSeparator = false
                ),
                ColorInfo(
                    color = FluentTheme.colors.fillAccent.secondary,
                    contentColor = FluentTheme.colors.text.onAccent.primary,
                    name = "Secondary",
                    explanation = "Hover",
                    usage = "fillAccent.secondary",
                    showSeparator = false
                ),
                ColorInfo(
                    color = FluentTheme.colors.fillAccent.tertiary,
                    contentColor = FluentTheme.colors.text.onAccent.primary,
                    name = "Tertiary",
                    explanation = "Pressed",
                    usage = "fillAccent.tertiary",
                    showSeparator = false
                )
            ),
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.fillAccent.disabled,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Disabled",
                    explanation = "Disabled",
                    usage = "fillAccent.disabled",
                    showSeparator = false
                ),
                ColorInfo(
                    color = FluentTheme.colors.fillAccent.selectedTextBackground,
                    contentColor = FluentTheme.colors.text.onAccent.primary,
                    name = "Selected Text Background",
                    explanation = "Highlighted/selected text background",
                    usage = "fillAccent.selectedTextBackground",
                    showSeparator = false
                )
            )
        )
    )
}

@Composable
private fun StrokeColorPage() {
    ColorSection(
        section = "Card Stroke",
        description = "Used for card and layer colors.",
        sample = {
            Card(
                content = {},
                modifier = Modifier.size(60.dp, 48.dp)
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.stroke.card.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Card layer and strokes",
                usage = "stroke.card.default"
            ),
            ColorInfo(
                color = FluentTheme.colors.stroke.card.defaultSolid,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default Solid",
                explanation = "Solid equivalent of Card Stroke / Default.\n" +
                        "Used in command bar for expanded states",
                usage = "stroke.card.defaultSolid"
            )
        )
    )

    ColorSection(
        section = "Control Elevation (gradient strokes)",
        description = "Used for standard control strokes and stroke states.",
        sample = {
            Button(
                onClick = {},
                content = {
                    Text("Text")
                }
            )
        },
        groups = arrayOf(
            arrayOf(
                ColorInfo(
                    color = Color.Transparent,
                    contentColor = FluentTheme.colors.text.text.primary,
                    backgroundBrush = FluentTheme.colors.borders.control,
                    name = "Border",
                    header = "Control",
                    explanation = "Rest",
                    usage = "borders.control",
                    colorValue = "Stop 1: Stroke/Control/Default\n" +
                            "Stop 2: Stroke/Control/Secondary"
                ),
                ColorInfo(
                    color = Color.Transparent,
                    contentColor = FluentTheme.colors.text.text.primary,
                    backgroundBrush = FluentTheme.colors.borders.circle,
                    name = "Border",
                    header = "Circle",
                    explanation = "Rest",
                    usage = "borders.circle",
                    colorValue = "Stop 1: Stroke/Control/Default\n" +
                            "Stop 2: Stroke/Control/Secondary"
                ),
                ColorInfo(
                    color = Color.Transparent,
                    contentColor = FluentTheme.colors.text.text.primary,
                    backgroundBrush = FluentTheme.colors.borders.textControl,
                    name = "Border",
                    header = "Text Control",
                    explanation = "Rest",
                    usage = "borders.textControl",
                    colorValue = "Stop 1: Stroke/Control/Default\n" +
                            "Stop 2: Stroke/Control Strong/Default"
                )
            ),
            arrayOf(
                ColorInfo(
                    color = Color.Transparent,
                    contentColor = FluentTheme.colors.text.text.primary,
                    backgroundBrush = FluentTheme.colors.borders.textControlFocused,
                    name = "Border Focused",
                    header = "Text Control",
                    explanation = "Active text fields",
                    usage = "borders.textControlFocused",
                    colorValue = "Stop 1: Stroke/Control/Default\n" +
                            "Stop 2: Fill/Accent/Default"
                ),
                ColorInfo(
                    color = Color.Transparent,
                    contentColor = FluentTheme.colors.text.text.primary,
                    backgroundBrush = FluentTheme.colors.borders.accentControl,
                    name = "Border",
                    header = "Accent Control",
                    explanation = "Rest",
                    usage = "borders.accentControl",
                    colorValue = "Stop 1: Stroke/Control/On Accent Default\n" +
                            "Stop 2: Stroke/Control/On Accent Secondary"
                )
            )
        )
    )

    ColorSection(
        section = "Control Stroke",
        description = "Used for gradient stops in elevation borders, and for control states.",
        sample = {
            Button(
                onClick = {},
                content = {
                    Text("Text")
                }
            )
        },
        groups = arrayOf(
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.stroke.control.default,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Default",
                    explanation = "Used in Control Elevation Brushes.\n" +
                            "Pressed or Disabled",
                    usage = "stroke.control.default"
                ),
                ColorInfo(
                    color = FluentTheme.colors.stroke.control.secondary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Secondary",
                    explanation = "Used in Control Elevation Brushes",
                    usage = "stroke.control.secondary"
                ),
                ColorInfo(
                    color = FluentTheme.colors.stroke.control.onAccentDefault,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "On Accent Default",
                    explanation = "Used in Control Elevation Brushes. Pressed or Disabled",
                    usage = "stroke.control.onAccentDefault"
                ),
                ColorInfo(
                    color = FluentTheme.colors.stroke.control.onAccentSecondary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "On Accent Secondary",
                    explanation = "Used in Control Elevation Brushes",
                    usage = "stroke.control.onAccentSecondary"
                )
            ),
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.stroke.control.onAccentTertiary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "On Accent Tertiary",
                    explanation = "Linework on Accent controls, ie: dividers",
                    usage = "stroke.control.onAccentTertiary",
                ),
                ColorInfo(
                    color = FluentTheme.colors.stroke.control.onAccentDisabled,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "On Accent Disabled",
                    explanation = "Disabled",
                    usage = "stroke.control.onAccentDisabled"
                ),
                ColorInfo(
                    color = FluentTheme.colors.stroke.control.forStrongFillWhenOnImage,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "For Strong Fill When On Image",
                    explanation = "When used with a 'strong' fill color, ensures a 3:1 contrast on any background",
                    usage = "stroke.control.forStrongFillWhenOnImage"
                )
            )
        )
    )

    ColorSection(
        section = "Control Strong Stroke",
        description = "Used for controls that must meet contrast ratio requirements of 3:1.",
        sample = {
            var checked by remember { mutableStateOf(false) }
            Switcher(
                checked = checked,
                onCheckStateChange = { checked = it }
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.stroke.controlStrong.default,
                contentColor = FluentTheme.colors.text.onAccent.primary,
                name = "Default",
                explanation = "3:1 control border",
                usage = "stroke.controlStrong.default",
                showSeparator = false
            ),
            ColorInfo(
                color = FluentTheme.colors.stroke.controlStrong.disabled,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Disabled",
                explanation = "Disabled",
                usage = "stroke.controlStrong.disabled",
                showSeparator = false
            )
        )
    )

    ColorSection(
        section = "Surface Stroke",
        description = "Used for strokes on background surfaces, ie: flyouts, windows, dialogs.",
        sample = {
            Layer(
                content = {},
                color = FluentTheme.colors.background.acrylic.base,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.default),
                shape = FluentTheme.shapes.overlay,
                modifier = Modifier.sizeIn(
                    minWidth = 120.dp,
                    minHeight = 40.dp
                )
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.stroke.surface.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Window and dialog borders, theme inverse",
                usage = "stroke.surface.default",
                showSeparator = false
            ),
            ColorInfo(
                color = FluentTheme.colors.stroke.surface.flyout,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Flyout",
                explanation = "Control flyouts, always dark",
                usage = "stroke.surface.flyout",
                showSeparator = false
            )
        )
    )

    ColorSection(
        section = "Divider Stroke",
        description = "Used for divider and graphic lines. Theme inverse; dark in light theme and light in dark theme.",
        sample = {
            Layer(
                content = {
                    Spacer(
                        modifier = Modifier.fillMaxSize()
                            .wrapContentWidth(Alignment.CenterHorizontally)
                            .width(1.dp)
                            .padding(vertical = 1.dp)
                            .background(FluentTheme.colors.stroke.divider.default)
                    )
                },
                color = FluentTheme.colors.background.acrylic.base,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.default),
                shape = FluentTheme.shapes.overlay,
                modifier = Modifier.size(
                    width = 120.dp,
                    height = 40.dp
                )
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.stroke.divider.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Content dividers",
                usage = "stroke.divider.default",
                showSeparator = false
            )
        )
    )

    ColorSection(
        section = "Focus Stroke",
        description = "Used for divider and graphic lines. Theme inverse; dark in light theme and light in dark theme..",
        sample = {
            //TODO Components Focus Border
            Button(
                onClick = {},
                content = { Text("Text") },
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = FluentTheme.colors.stroke.focus.outer,
                        shape = RoundedCornerShape(FluentTheme.cornerRadius.control + 2.dp)
                    )
                    .padding(2.dp)
                    .border(
                        width = 2.dp,
                        color = FluentTheme.colors.stroke.focus.inner,
                        shape = RoundedCornerShape(FluentTheme.cornerRadius.control + 1.dp)
                    )
                    .padding(2.dp)
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.stroke.focus.outer,
                contentColor = FluentTheme.colors.text.onAccent.primary,
                name = "Outer",
                explanation = "Outer stroke color",
                usage = "stroke.focus.outer",
                showSeparator = false
            ),
            ColorInfo(
                color = FluentTheme.colors.stroke.focus.inner,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Inner",
                explanation = "Inner stroke color",
                usage = "stroke.focus.inner",
                showSeparator = false
            )
        )
    )

}

@Composable
private fun BackgroundColorPage() {
    ColorSection(
        section = "Card Background",
        description = "Used to create 'cards' - content blocks that live on page and layer backgrounds",
        sample = {
            Layer(
                content = {},
                color = FluentTheme.colors.background.card.default,
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.card.default),
                shape = FluentTheme.shapes.overlay,
                elevation = ElevationDefaults.cardRest,
                modifier = Modifier.size(60.dp, 30.dp)
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.background.card.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Default card color",
                usage = "background.card.default"
            ),
            ColorInfo(
                color = FluentTheme.colors.background.card.secondary,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Secondary",
                explanation = "Alternate card color: slightly darker",
                usage = "background.card.secondary"
            ),
            ColorInfo(
                color = FluentTheme.colors.background.card.tertiary,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Tertiary",
                explanation = "Default card hover and pressed color",
                usage = "background.card.tertiary"
            )
        )
    )

    ColorSection(
        section = "Smoke Background",
        color = FluentTheme.colors.background.smoke.default,
        description = "Used over windows and desktop to block them out as inaccessible.",
        sample = {
            WindowLayer(
                color = FluentTheme.colors.background.smoke.default
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.background.smoke.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Dims backgrounds behind dialogs",
                usage = "background.smoke.default"
            )
        )
    )

    ColorSection(
        section = "Layer",
        description = "Used on background colors of any material to create layering",
        sample = {
            WindowLayer(
                color = FluentTheme.colors.background.acrylic.base,
                content = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.End)
                            .fillMaxWidth(0.75f)
                    ) {
                        Spacer(
                            modifier = Modifier
                                .padding(vertical = 1.dp)
                                .fillMaxHeight()
                                .width(1.dp)
                                .background(FluentTheme.colors.stroke.card.default)
                        )
                        Layer(
                            color = FluentTheme.colors.background.layer.default,
                            shape = FluentTheme.shapes.intersectionEdge,
                            border = null,
                            content = {},
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                        )
                    }
                }
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.background.layer.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Content layer color",
                usage = "background.layer.default"
            ),
            ColorInfo(
                color = FluentTheme.colors.background.layer.alt,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Alt",
                explanation = "Alternate content layer color",
                usage = "background.layer.alt"
            )
        )
    )

    ColorSection(
        section = "Layer on Acrylic",
        description = "Used on background colors of any material to create layering",
        sample = {
            WindowLayer(
                color = FluentTheme.colors.background.acrylic.base,
                content = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.End)
                            .fillMaxWidth(0.75f)
                    ) {
                        Spacer(
                            modifier = Modifier
                                .padding(vertical = 1.dp)
                                .fillMaxHeight()
                                .width(1.dp)
                                .background(FluentTheme.colors.stroke.card.default)
                        )
                        Layer(
                            color = FluentTheme.colors.background.layerOnAcrylic.default,
                            shape = FluentTheme.shapes.intersectionEdge,
                            border = null,
                            content = {},
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight()
                        )
                    }
                }
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.background.layerOnAcrylic.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Content layer color on acrylic surfaces",
                usage = "background.layerOnAcrylic.default"
            )
        )
    )

    ColorSection(
        section = "Layer on Mica Base Alt",
        description = "",
        sample = {
            var selected by remember { mutableStateOf(false) }
            TabItem(
                endDividerVisible = false,
                selected = selected,
                onSelectedChanged = { selected = it },
                text = { Text("Text") },
                trailing = { TabViewDefaults.TabCloseButton(onClick = {}) },
                colors = if (selected) {
                    TabViewDefaults.selectedItemTitleBarColors()
                } else {
                    TabViewDefaults.defaultItemTitleBarColors()
                }
            )
        },
        groups = arrayOf(
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.background.layerOnMicaBaseAlt.default,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Default",
                    explanation = "Active Tab Rest\n" +
                            "Content layer",
                    usage = "background.layerOnMicaBaseAlt.default"
                ),
                ColorInfo(
                    color = FluentTheme.colors.background.layerOnMicaBaseAlt.tertiary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Tertiary",
                    explanation = "Active Tab Drag",
                    usage = "background.layerOnMicaBaseAlt.tertiary"
                )
            ),
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.background.layerOnMicaBaseAlt.transparent,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Transparent",
                    explanation = "Inactive Tab Rest",
                    usage = "background.layerOnMicaBaseAlt.transparent",
                    showSeparator = false,
                ),
                ColorInfo(
                    color = FluentTheme.colors.background.layerOnMicaBaseAlt.secondary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Secondary",
                    explanation = "Inactive Tab Hover",
                    usage = "background.layerOnMicaBaseAlt.secondary",
                    showSeparator = false
                )
            )
        )
    )

    ColorSection(
        section = "Solid Background",
        description = "Solid background colors to place layers, cards or controls on.",
        sample = {
            WindowLayer(
                color = FluentTheme.colors.background.solid.base
            )
        },
        groups = arrayOf(
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.background.solid.base,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Base",
                    explanation = "Used for the bottom most layer of an experience.",
                    usage = "background.solid.base"
                ),
                ColorInfo(
                    color = FluentTheme.colors.background.solid.baseAlt,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Base Alt",
                    explanation = "Used for the bottom most layer of an experience.",
                    usage = "background.solid.baseAlt"
                ),
                ColorInfo(
                    color = FluentTheme.colors.background.solid.secondary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Secondary",
                    explanation = "Alternate base color for those who need a darker background color.",
                    usage = "background.solid.secondary"
                ),
                ColorInfo(
                    color = FluentTheme.colors.background.solid.tertiary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Tertiary",
                    explanation = "Content layer color",
                    usage = "background.solid.tertiary"
                )
            ),
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.background.solid.quaternary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Quaternary",
                    explanation = "Alt content layer color.",
                    usage = "background.solid.quaternary"
                ),
                ColorInfo(
                    color = FluentTheme.colors.background.solid.quinary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Quinary",
                    explanation = "Used for solid default card colors.",
                    usage = "background.solid.quinary"
                ),
                ColorInfo(
                    color = FluentTheme.colors.background.solid.senary,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Senary",
                    explanation = "Used for solid default card color.",
                    usage = "background.solid.senary"
                )
            )
        )
    )

    ColorSection(
        section = "Mica Background",
        description = "Mica background colors to place layers, cards, or controls on.",
        sample = {
            WindowLayer(
                color = FluentTheme.colors.background.mica.base
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.background.mica.base,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Base",
                explanation = "Used for the bottom most layer of an experience.",
                usage = "background.mica.base"
            ),
            ColorInfo(
                color = FluentTheme.colors.background.mica.baseAlt,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Base Alt",
                explanation = "Default tab band background color.",
                usage = "background.mica.baseAlt"
            )
        )
    )

    ColorSection(
        section = "Acrylic Background",
        description = "Acrylic background colors to place layers, cards, or controls on.",
        sample = {
            WindowLayer(
                color = FluentTheme.colors.background.acrylic.base
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.background.acrylic.base,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Base",
                explanation = "Used for the bottom most layer of an acrylic surface only when the surface will use layers.",
                usage = "background.acrylic.base"
            ),
            ColorInfo(
                color = FluentTheme.colors.background.acrylic.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Default acrylic recipe used for control flyouts and surfaces that live with in the context of an app.",
                usage = "background.acrylic.default"
            )
        )
    )

    ColorSection(
        section = "Accent Acrylic Background",
        description = "Acrylic background colors to place layers, cards, or controls on.",
        sample = {
            WindowLayer(
                color = FluentTheme.colors.background.accentAcrylic.default
            )
        },
        group = arrayOf(
            ColorInfo(
                color = FluentTheme.colors.background.accentAcrylic.base,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Base",
                explanation = "Used for the bottom most layer of an acrylic surface only when the surface will use layers.",
                usage = "background.accentAcrylic.base"
            ),
            ColorInfo(
                color = FluentTheme.colors.background.accentAcrylic.default,
                contentColor = FluentTheme.colors.text.text.primary,
                name = "Default",
                explanation = "Default acrylic recipe used for control flyouts and surfaces that live with in the context of an app.",
                usage = "background.accentAcrylic.default"
            )
        )
    )
}

@Composable
private fun SignalColorPage() {
    ColorSection(
        section = "System",
        description = "Used for accent fills on controls",
        sample = {
            //TODO InfoBar
            Layer(
                color = FluentTheme.colors.system.criticalBackground,
                backgroundSizing = BackgroundSizing.InnerBorderEdge
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .sizeIn(minHeight = 48.dp)
                        .padding(horizontal = 16.dp)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(16.dp)
                            .background(
                                color = FluentTheme.colors.system.critical,
                                shape = CircleShape
                            )
                    ) {
                        Icon(
                            imageVector = Icons.Default.Dismiss,
                            contentDescription = null,
                            tint = FluentTheme.colors.text.onAccent.primary,
                            modifier = Modifier.size(12.dp)
                        )
                    }

                    Text(
                        text = "Title",
                        style = FluentTheme.typography.bodyStrong,
                        modifier = Modifier.padding(horizontal = 12.dp)
                    )

                    Text(
                        text = "This is body text. Windows 11 is faster and more intuitive."
                    )

                    Icon(
                        imageVector = Icons.Default.Dismiss,
                        contentDescription = null,
                        modifier = Modifier.padding(start = 16.dp).size(16.dp)
                    )
                }
            }
        },
        groups = arrayOf(
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.system.success,
                    contentColor = FluentTheme.colors.text.onAccent.primary,
                    name = "Success",
                    explanation = "Badge",
                    usage = "system.success",
                    showSeparator = false
                ),
                ColorInfo(
                    color = FluentTheme.colors.system.caution,
                    contentColor = FluentTheme.colors.text.onAccent.primary,
                    name = "Caution",
                    explanation = "Badge",
                    usage = "system.caution",
                    showSeparator = false
                ),
                ColorInfo(
                    color = FluentTheme.colors.system.critical,
                    contentColor = FluentTheme.colors.text.onAccent.primary,
                    name = "Critical",
                    explanation = "Badge",
                    usage = "system.critical",
                    showSeparator = false
                )
            ),
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.system.successBackground,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Success Background",
                    explanation = "Infobar Background",
                    usage = "system.successBackground",
                    showSeparator = false
                ),
                ColorInfo(
                    color = FluentTheme.colors.system.cautionBackground,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Caution Background",
                    explanation = "Infobar Background",
                    usage = "system.cautionBackground",
                    showSeparator = false
                ),
                ColorInfo(
                    color = FluentTheme.colors.system.criticalBackground,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Critical Background",
                    explanation = "Infobar Background",
                    usage = "system.criticalBackground",
                    showSeparator = false
                )
            ),
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.system.attention,
                    contentColor = FluentTheme.colors.text.onAccent.primary,
                    name = "Attention",
                    explanation = "Badge",
                    usage = "system.attention",
                    showSeparator = false
                ),
                ColorInfo(
                    color = FluentTheme.colors.system.neutral,
                    contentColor = FluentTheme.colors.text.onAccent.primary,
                    name = "Neutral",
                    explanation = "Badge",
                    usage = "system.neutral"
                ),
                ColorInfo(
                    color = FluentTheme.colors.system.solidNeutral,
                    contentColor = FluentTheme.colors.text.onAccent.primary,
                    name = "Solid Neutral",
                    explanation = "Neutral badges over content",
                    usage = "system.solidNeutral"
                )
            ),
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.system.attentionBackground,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Attention Background",
                    explanation = "Infobar Background",
                    usage = "system.attentionBackground"
                ),
                ColorInfo(
                    color = FluentTheme.colors.system.neutralBackground,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Neutral Background",
                    explanation = "Infobar Background",
                    usage = "system.neutralBackground"
                ),
                ColorInfo(
                    color = FluentTheme.colors.system.solidNeutralBackground,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Solid Neutral Background",
                    explanation = "Neutral badges over content",
                    usage = "system.solidNeutralBackground"
                )
            ),
            arrayOf(
                ColorInfo(
                    color = FluentTheme.colors.system.solidAttentionBackground,
                    contentColor = FluentTheme.colors.text.text.primary,
                    name = "Solid Attention Background",
                    explanation = "",
                    usage = "system.solidAttentionBackground",
                    showSeparator = false
                )
            )
        )
    )
}

@Composable
private fun ColorPage(content: @Composable ColumnScope.() -> Unit) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth(),
        content = content
    )
}

@Composable
private fun ColorSection(
    section: String,
    description: String,
    sample: @Composable () -> Unit,
    color: Color = FluentTheme.colors.background.solid.quaternary,
    contentColor: Color = FluentTheme.colors.text.text.primary,
    header: String = section,
    group: Array<ColorInfo>,
) {
    ColorSection(
        section = section,
        description = description,
        sample = sample,
        color = color,
        contentColor = contentColor,
        header = header,
        groups = arrayOf(group)
    )
}

@Composable
private fun ColorSection(
    section: String,
    description: String,
    sample: @Composable () -> Unit,
    color: Color = FluentTheme.colors.background.solid.quaternary,
    contentColor: Color = FluentTheme.colors.text.text.primary,
    header: String = section,
    vararg groups: Array<ColorInfo>,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        ColorHeader(
            section = section,
            description = description,
            color = color,
            contentColor = contentColor,
            sample = sample
        )

        groups.forEach { group ->
            ColorGroup(header, group)
        }
    }
}

@Composable
private fun ColorHeader(
    section: String,
    description: String,
    color: Color,
    contentColor: Color,
    sample: @Composable () -> Unit
) {
    Layer(
        color = color,
        contentColor = contentColor,
        shape = FluentTheme.shapes.overlay,
        backgroundSizing = BackgroundSizing.InnerBorderEdge,
        modifier = Modifier.padding(top = 24.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.padding(12.dp).fillMaxWidth()
        ) {
            Text(
                text = section,
                style = FluentTheme.typography.subtitle
            )
            Text(
                text = description,
                style = FluentTheme.typography.caption
            )
            Box(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                sample()
            }
        }
    }
}

@OptIn(ExperimentalStdlibApi::class)
@Composable
private fun ColorGroup(section: String, colorInfoItems: Array<ColorInfo>) {

    Layer(
        color = FluentTheme.colors.background.solid.quaternary,
        shape = FluentTheme.shapes.overlay,
        clipContent = true,
        backgroundSizing = BackgroundSizing.InnerBorderEdge
    ) {
        Row(modifier = Modifier.height(IntrinsicSize.Min)) {
            colorInfoItems.forEachIndexed { index, colorInfo ->
                val showSeparator = colorInfo.showSeparator && index < colorInfoItems.size - 1

                Layer(
                    border = null,
                    shape = FluentTheme.shapes.intersectionEdge,
                    color = colorInfo.color,
                    contentColor = colorInfo.contentColor,
                    backgroundSizing = BackgroundSizing.InnerBorderEdge,
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .then(
                            if (colorInfo.backgroundBrush != null) {
                                Modifier.background(colorInfo.backgroundBrush)
                            } else {
                                Modifier
                            }
                        )
                ) {
                    val usage = "FluentTheme.colors.${colorInfo.usage}"
                    Box(modifier = Modifier.padding(12.dp)) {
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "${colorInfo.header ?: section} / ${colorInfo.name}",
                                style = FluentTheme.typography.bodyStrong,
                                modifier = Modifier.padding(end = 48.dp, bottom = 4.dp)
                            )
                            Text(
                                text = colorInfo.explanation,
                                style = FluentTheme.typography.caption
                            )
                            Spacer(modifier = Modifier.height(42.dp))
                            Spacer(modifier = Modifier.weight(1f))
                            Text(
                                text = usage,
                                style = FluentTheme.typography.caption
                            )

                            val shades = FluentTheme.colors.shades

                            val colorValue =
                                colorInfo.colorValue ?: remember(colorInfo.color, shades) {
                                    val colorValueType = when (colorInfo.color.copy(1f)) {
                                        shades.light1 -> "Light 1"
                                        shades.light2 -> "Light 2"
                                        shades.light3 -> "Light 3"
                                        shades.dark1 -> "Dark 1"
                                        shades.dark2 -> "Dark 2"
                                        shades.dark3 -> "Dark 3"
                                        shades.base -> "Accent Base"
                                        else -> null
                                    }?.plus(", ") ?: ""
                                    val formatString = colorInfo.color.value.toHexString(hexFormat)
                                    val alpha = formatString.take(2)
                                    val color = formatString.drop(2).take(6)
                                    val alphaPercent =
                                        (colorInfo.color.alpha * 100f).toString().let {
                                            val dotIndex = it.indexOf(".")
                                            val result = it.take(dotIndex + 3)
                                            if (result.endsWith(".0")) {
                                                result.dropLast(2)
                                            } else {
                                                result
                                            }
                                        }
                                    "$colorValueType#$color ($alpha, $alphaPercent%)"
                                }
                            Text(
                                text = colorValue,
                                style = FluentTheme.typography.caption
                            )
                        }

                        CopyButton(
                            copyData = usage,
                            modifier = Modifier.align(Alignment.TopEnd),
                            colors = CopyButtonColor(colorInfo.contentColor)
                        )
                    }
                }
                if (showSeparator) {
                    Spacer(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(1.dp)
                            .background(FluentTheme.colors.stroke.card.default)
                    )
                }
            }
        }
    }
}

enum class ColorPage {
    Text,
    Fill,
    Stroke,
    Background,
    Signal,
    //TODO High Contrast
}

data class ColorInfo(
    val color: Color,
    val contentColor: Color,
    val name: String,
    val explanation: String,
    val usage: String,
    val showSeparator: Boolean = true,
    val backgroundBrush: Brush? = null,
    val colorValue: String? = null,
    val header: String? = null
)

@OptIn(ExperimentalStdlibApi::class)
private val hexFormat by lazy {
    HexFormat {
        upperCase = true
        number {
            removeLeadingZeros = false
        }
    }
}

@Composable
@Stable
private fun CopyButtonColor(
    contentColor: Color
): ButtonColorScheme {
    val default = ButtonColor(
        fillColor = Color.White.copy(0f),
        contentColor = contentColor,
        borderBrush = SolidColor(Color.Transparent)
    )
    val pressed = ButtonColor(
        fillColor = FluentTheme.colors.control.tertiary,
        contentColor = contentColor,
        borderBrush = SolidColor(FluentTheme.colors.stroke.control.default)
    )
    return PentaVisualScheme(
        default = default,
        hovered = default.copy(
            fillColor = FluentTheme.colors.control.secondary,
            borderBrush = FluentTheme.colors.borders.control
        ),
        pressed = pressed,
        disabled = pressed.copy(
            fillColor = FluentTheme.colors.control.disabled,
            contentColor = FluentTheme.colors.text.text.disabled,
        )
    )
}

@Composable
private fun WindowLayer(
    color: Color,
    content: @Composable () -> Unit = {}
) {
    Layer(
        color = color,
        border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.default),
        content = content,
        modifier = Modifier.size(120.dp, 40.dp),
        shape = FluentTheme.shapes.overlay,
        clipContent = true,
        backgroundSizing = BackgroundSizing.InnerBorderEdge,
        elevation = 128.dp
    )
}