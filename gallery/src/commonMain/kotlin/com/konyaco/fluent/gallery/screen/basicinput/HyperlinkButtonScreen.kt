package com.konyaco.fluent.gallery.screen.basicinput

import androidx.compose.runtime.Composable
import com.konyaco.fluent.component.HyperlinkButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.*
import com.konyaco.fluent.gallery.component.Basic_input_ToggleButtonScreenComponent

@Component(index = 2, description = "A button that appears as hyperlink text, and can navigate to a URl or handle a Click event.")
@Composable
fun HyperlinkButtonScreen(navigator: ComponentNavigator) {
    GalleryPage(
        title = "HyperlinkButton",
        description = "A HyperlinkButton appears as a text hyperlink. When a user clicks it, it opens the page you specify in the NavigateUri property in the default browser. Or you can handle its Click event, typically to navigate within your app."
    ) {
        Section(
            title = "A hyperlink button that navigates to a URl.",
            sourceCode = sourceCodeOfNavigateUriHyperlinkButtonSample
        ) {
            NavigateUriHyperlinkButtonSample()
        }
        Section(
            title = "A hyperlink button that handles a Click event.",
            sourceCode = sourceCodeOfClickEventHyperlinkButtonSample
        ) {
            ClickEventHyperlinkButtonSample {
                navigator.navigate(Basic_input_ToggleButtonScreenComponent)
            }
        }
    }
}

@Sample
@Composable
private fun NavigateUriHyperlinkButtonSample() {
    HyperlinkButton(navigateUri = "https://www.microsoft.com") {
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