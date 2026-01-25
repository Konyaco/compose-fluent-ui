package io.github.composefluent.gallery.screen.status

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.github.composefluent.component.ProgressBar
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.source.generated.FluentSourceFile

@Component(
    index = 2,
    description = "Shows the apps progress on a task, or that the app is performing ongoing work that doesn't block user interaction."
)
@Composable
fun ProgressBarScreen() {
    GalleryPage(
        title = "ProgressBar",
        description = "The ProgressBar has two different visual representations:\n" +
                "Indeterminate - shows that a task is ongoing, but doesn't block user interaction.\n" +
                "Determinate - shows how much progress has been made on a known amount of work.",
        componentPath = FluentSourceFile.ProgressBar,
        galleryPath = ComponentPagePath.ProgressBarScreen
    ) {
        Section(
            title = "An indeterminate progress bar.",
            sourceCode = sourceCodeOfProgressBarSample,
            content = { ProgressBarSample() }
        )
        Section(
            title = "A determinate progress bar.",
            sourceCode = sourceCodeOfDeterminateProgressBarSample,
            content = { DeterminateProgressBarSample() }
        )
    }

}

@Sample
@Composable
private fun ProgressBarSample() {
    ProgressBar()
}

@Sample
@Composable
private fun DeterminateProgressBarSample() {
    var progress by remember { mutableStateOf(0.5f) }
    ProgressBar(progress)
    // TODO: Use NumberBox to change progress
}