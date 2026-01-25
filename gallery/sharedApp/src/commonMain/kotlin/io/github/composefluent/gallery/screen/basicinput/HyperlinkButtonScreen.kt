package io.github.composefluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.HyperlinkButton
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.*
import io.github.composefluent.gallery.component.Basic_input_ToggleButtonScreenComponent
import io.github.composefluent.source.generated.FluentSourceFile

@Component(index = 2, description = "A button that appears as hyperlink text, and can navigate to a URl or handle a Click event.")
@Composable
fun HyperlinkButtonScreen(navigator: ComponentNavigator) {
    GalleryPage(
        title = "HyperlinkButton",
        description = "A HyperlinkButton appears as a text hyperlink. When a user clicks it, it opens the page you specify in the NavigateUri property in the default browser. Or you can handle its Click event, typically to navigate within your app.",
        componentPath = FluentSourceFile.Button,
        galleryPath = ComponentPagePath.HyperlinkButtonScreen
    ) {
        val enabled = remember { mutableStateOf(true) }
        Section(
            title = "A hyperlink button that navigates to a URl.",
            sourceCode = sourceCodeOfNavigateUriHyperlinkButtonSample,
            content = { NavigateUriHyperlinkButtonSample(enabled.value) },
            options = {
                CheckBox(
                    checked = !enabled.value,
                    onCheckStateChange = { enabled.value = !it },
                    label = "Disable hyperlink button"
                )
            }
        )
        Section(
            title = "A hyperlink button that handles a Click event.",
            sourceCode = sourceCodeOfClickEventHyperlinkButtonSample,
            content = {
                ClickEventHyperlinkButtonSample {
                    navigator.navigate(Basic_input_ToggleButtonScreenComponent)
                }
            }
        )
    }
}

@Sample
@Composable
private fun NavigateUriHyperlinkButtonSample(enabled: Boolean) {
    HyperlinkButton(navigateUri = "https://www.microsoft.com", disabled = !enabled) {
        Text("Microsoft home page")
    }
}

@Sample
@Composable
private fun ClickEventHyperlinkButtonSample(onClick: () -> Unit) {
    HyperlinkButton(onClick = onClick) {
        Text("Go to ToggleButton")
    }
}