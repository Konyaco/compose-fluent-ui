package com.konyaco.fluent.gallery.screen.status

import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.CheckBox
import com.konyaco.fluent.component.DropDownButton
import com.konyaco.fluent.component.HyperlinkButton
import com.konyaco.fluent.component.InfoBar
import com.konyaco.fluent.component.InfoBarDefaults
import com.konyaco.fluent.component.MenuFlyoutContainer
import com.konyaco.fluent.component.MenuFlyoutItem
import com.konyaco.fluent.component.InfoBarSeverity
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(description = "An inline message to display app-wide status change information.")
@Composable
fun InfoBarScreen() {
    GalleryPage(
        title = "InfoBar",
        description = "Use an InfoBar control when a user should be informed of, acknowledge, " +
                "or take action on a changed application state. " +
                "By default the notification will remain in the content area until closed by the user" +
                " but will not necessarily break user flow.",
        componentPath = FluentSourceFile.InfoBar,
        galleryPath = ComponentPagePath.InfoBarScreen
    ) {
        var basicSampleVisible by remember { mutableStateOf(true) }
        var basicSampleSeverity by remember { mutableStateOf(InfoBarSeverity.Informational) }
        Section(
            title = "A closable InfoBar with options to change its Severity.",
            sourceCode = sourceCodeOfBasicInfoBarSample,
            content = {
                BasicInfoBarSample(
                    severity = basicSampleSeverity,
                    visible = basicSampleVisible,
                    onDismiss = { basicSampleVisible = false }
                )
            },
            options = {
                CheckBox(
                    checked = basicSampleVisible,
                    onCheckStateChange = { basicSampleVisible = it },
                    label = "Is Open"
                )
                Text("Severity")
                MenuFlyoutContainer(
                    flyout = {
                        InfoBarSeverity.entries.forEach { severity ->
                            MenuFlyoutItem(
                                selected = basicSampleSeverity == severity,
                                onSelectedChanged = {
                                    basicSampleSeverity = severity
                                    isFlyoutVisible = false
                                },
                                text = { Text(severity.name) }
                            )
                        }
                    },
                    content = {
                        DropDownButton(
                            content = { Text(basicSampleSeverity.name) },
                            onClick = { isFlyoutVisible = true },
                        )
                    }
                )
            },
        )
        var secondarySampleVisible by remember { mutableStateOf(true) }
        var secondarySampleMessageLong by remember { mutableStateOf(true) }
        var secondarySampleActionHyperLink by remember { mutableStateOf<Boolean?>(false) }
        val secondarySampleMessage by remember {
            derivedStateOf {
                if (secondarySampleMessageLong) {
                    "A long essential app message for your users to be informed of, acknowledge, or take action on. " +
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin dapibus dolor vitae justo rutrum," +
                            " ut lobortis nibh mattis. Aenean id elit commodo, semper felis nec."
                } else {
                    "short essential app message."
                }
            }
        }
        Section(
            title = "A closable InfoBar with a long or short message and various buttons",
            sourceCode = sourceCodeOfInfoBarSampleWithMessageAndAction,
            content = {
                InfoBarSampleWithMessageAndAction(
                    visible = secondarySampleVisible,
                    onDismiss = { secondarySampleVisible = false },
                    message = secondarySampleMessage,
                    isHyperLinkAction = secondarySampleActionHyperLink
                )
            },
            options = {
                CheckBox(
                    checked = secondarySampleVisible,
                    onCheckStateChange = { secondarySampleVisible = it },
                    label = "Is Open"
                )
                Text("Message Length")
                MenuFlyoutContainer(
                    flyout = {
                        MenuFlyoutItem(
                            selected = secondarySampleMessageLong,
                            onSelectedChanged = {
                                secondarySampleMessageLong = true
                                isFlyoutVisible = false
                            },
                            text = { Text("Long") }
                        )

                        MenuFlyoutItem(
                            selected = !secondarySampleMessageLong,
                            onSelectedChanged = {
                                secondarySampleMessageLong = false
                                isFlyoutVisible = false
                            },
                            text = { Text("Short") }
                        )
                    },
                    content = {
                        DropDownButton(
                            content = { Text(if (secondarySampleMessageLong) "Long" else "Short") },
                            onClick = { isFlyoutVisible = true },
                        )
                    }
                )
                Text("Action Button")
                MenuFlyoutContainer(
                    flyout = {
                        MenuFlyoutItem(
                            selected = secondarySampleActionHyperLink == null,
                            onSelectedChanged = {
                                secondarySampleActionHyperLink = null
                                isFlyoutVisible = false
                            },
                            text = { Text("None") }
                        )
                        MenuFlyoutItem(
                            selected = secondarySampleActionHyperLink == false,
                            onSelectedChanged = {
                                secondarySampleActionHyperLink = false
                                isFlyoutVisible = false
                            },
                            text = { Text("Button") }
                        )
                        MenuFlyoutItem(
                            selected = secondarySampleActionHyperLink == true,
                            onSelectedChanged = {
                                secondarySampleActionHyperLink = true
                                isFlyoutVisible = false
                            },
                            text = { Text("Hyperlink") }
                        )
                    },
                    content = {
                        DropDownButton(
                            content = {
                                Text(
                                    when (secondarySampleActionHyperLink) {
                                        null -> "None"
                                        true -> "Hyperlink"
                                        false -> "Button"
                                    }
                                )
                            },
                            onClick = { isFlyoutVisible = true },
                        )
                    }
                )
            }
        )

        var tertiarySampleVisible by remember { mutableStateOf(true) }
        var tertiarySampleIconVisible by remember { mutableStateOf(true) }
        var tertiarySampleCloseVisible by remember { mutableStateOf(true) }
        Section(
            title = "A closable InfoBar with options to display the close button and icon",
            sourceCode = sourceCodeOfInfoBarSampleWithOptions,
            content = {
                InfoBarSampleWithOptions(
                    visible = tertiarySampleVisible,
                    onDismiss = { tertiarySampleVisible = false },
                    iconVisible = tertiarySampleIconVisible,
                    closeVisible = tertiarySampleCloseVisible
                )
            },
            options = {
                CheckBox(
                    checked = tertiarySampleVisible,
                    onCheckStateChange = { tertiarySampleVisible = it },
                    label = "Is Open"
                )
                CheckBox(
                    checked = tertiarySampleIconVisible,
                    onCheckStateChange = { tertiarySampleIconVisible = it },
                    label = "Is Icon Visible"
                )
                CheckBox(
                    checked = tertiarySampleCloseVisible,
                    onCheckStateChange = { tertiarySampleCloseVisible = it },
                    label = "Is Closable"
                )
            }
        )
    }
}

@Sample
@Composable
private fun BasicInfoBarSample(
    severity: InfoBarSeverity = InfoBarSeverity.Informational,
    visible: Boolean = true,
    onDismiss: () -> Unit = {}
) {
    if (visible) {
        InfoBar(
            title = {
                Text("Title")
            },
            message = {
                Text(
                    text = "Essential app message for your users to be informed of, acknowledge, or take action on."
                )
            },
            closeAction = { InfoBarDefaults.CloseActionButton(onClick = onDismiss) },
            severity = severity
        )
    }
}

@Sample
@Composable
private fun InfoBarSampleWithMessageAndAction(
    visible: Boolean = true,
    onDismiss: () -> Unit = {},
    message: String,
    isHyperLinkAction: Boolean?
) {
    if (visible) {
        InfoBar(
            title = { Text("Title") },
            message = { Text(text = message) },
            closeAction = { InfoBarDefaults.CloseActionButton(onClick = onDismiss) },
            action = when (isHyperLinkAction) {
                null -> null
                true -> {
                    { HyperlinkButton(onClick = {}, content = { Text("Action") }) }
                }

                false -> {
                    { Button(onClick = {}, content = { Text("Action") }) }
                }
            }
        )
    }
}

@Sample
@Composable
private fun InfoBarSampleWithOptions(
    visible: Boolean = true,
    onDismiss: () -> Unit = {},
    iconVisible: Boolean,
    closeVisible: Boolean
) {
    val colors = InfoBarDefaults.colors()
    if (visible) {
        InfoBar(
            title = { Text("Title") },
            message = { Text(text = "Essential app message for your users to be informed of, acknowledge, or take action on.") },
            colors = colors,
            closeAction = if (closeVisible) {
                { InfoBarDefaults.CloseActionButton(onClick = onDismiss) }
            } else {
                null
            },
            icon = if (iconVisible) {
                { InfoBarDefaults.Badge() }
            } else {
                null
            }
        )
    }
}