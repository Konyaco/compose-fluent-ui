@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFluentApi::class)

package io.github.composefluent.gallery.screen.status

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.component.Button
import io.github.composefluent.component.Text
import io.github.composefluent.component.TooltipBox
import io.github.composefluent.component.rememberTooltipPositionProvider
import io.github.composefluent.component.rememberTooltipState
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@Component(description = "Displays information for an element in a pop-up window.")
@Composable
fun TooltipScreen() {
    GalleryPage(
        title = "Tooltip",
        description = "A Tooltip shows more information about a UI element. " +
                "You might show information about what the element does, or what the user should do. " +
                "The ToolTip is shown when a user hovers over or presses and holds the Ul element.",
        componentPath = FluentSourceFile.TooltipBox,
        galleryPath = ComponentPagePath.TooltipScreen
    ) {
        Section(
            title = "Basic TooltipBox",
            sourceCode = sourceCodeOfBasicTooltipBoxSample,
            content = { BasicTooltipBoxSample() }
        )

        Section(
            title = "TooltipBox with anchor padding",
            sourceCode = sourceCodeOfTooltipBoxWithAnchorPaddingSample,
            content = { TooltipBoxWithAnchorPaddingSample() }
        )
    }
}

@Sample
@Composable
private fun BasicTooltipBoxSample() {
    TooltipBox(
        tooltip = { Text("Simple Tooltip") }
    ) {
        Button(
            onClick = {},
            content = { Text("Button with a simple Tooltip") }
        )
    }
}

@Sample
@Composable
private fun TooltipBoxWithAnchorPaddingSample() {
    val state = rememberTooltipState()
    TooltipBox(
        state = state,
        tooltip = { Text("Offset Tooltip.") },
        positionProvider = rememberTooltipPositionProvider(
            anchorPadding = (-80).dp,
            state = state
        )
    ) {
        Text("TextBlock with an offset ToolTip.")
    }
}