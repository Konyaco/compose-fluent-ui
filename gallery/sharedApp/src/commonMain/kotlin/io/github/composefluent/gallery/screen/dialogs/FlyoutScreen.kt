package io.github.composefluent.gallery.screen.dialogs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.component.Button
import io.github.composefluent.component.FlyoutContainer
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@Component(description = "Shows contextual information and enables user interaction.")
@Composable
fun FlyoutScreen() {
    GalleryPage(
        title = "Flyout",
        description = "A Flyout displays lightweight UI that is either information, " +
                "or requires user interaction. Unlike a dialog, a Flyout can be light dismissed by clicking or tapping off of it. " +
                "Use it to collect input from the user, show more details about an item, or ask the user to confirm an action.",
        componentPath = FluentSourceFile.Flyout,
        galleryPath = ComponentPagePath.FlyoutScreen
    ) {
        Section(
            title = "A button with flyout",
            sourceCode = sourceCodeOfBasicFlyoutSample,
            content = { BasicFlyoutSample() }
        )
    }
}

@Sample
@Composable
private fun BasicFlyoutSample() {
    FlyoutContainer(
        flyout = {
            Column {
                Text(
                    text = "All items will be removed. Do you want to continue?",
                    style = FluentTheme.typography.bodyStrong,
                    modifier = Modifier.padding(bottom = 12.dp)
                )
                Button(
                    onClick = { isFlyoutVisible = false },
                    content = {
                        Text("Yes, empty my cart")
                    }
                )
            }
        },
        content = {
            Button(
                onClick = { isFlyoutVisible = !isFlyoutVisible },
                content = {
                    Text("Empty cart")
                }
            )
        }
    )
}