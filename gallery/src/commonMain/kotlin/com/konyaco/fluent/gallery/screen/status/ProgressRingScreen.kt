package com.konyaco.fluent.gallery.screen.status

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.konyaco.fluent.component.ProgressRing
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.annotation.Sample
import com.konyaco.fluent.gallery.component.ComponentPagePath
import com.konyaco.fluent.gallery.component.GalleryPage
import com.konyaco.fluent.source.generated.FluentSourceFile

@Component(
    index = 2,
    description = "Shows the apps progress on a task, or that the app is performing ongoing work that does block user interaction."
)
@Composable
fun ProgressRingScreen() {
    GalleryPage(
        title = "ProgressRing",
        description = "The ProgressRing has two different visual representations:\n" +
                "Indeterminate - shows that a task is ongoing, but blocks user interaction.\n" +
                "Determinate - shows how much progress has been made on a known amount of work.",
        componentPath = FluentSourceFile.ProgressRing,
        galleryPath = ComponentPagePath.ProgressRingScreen
    ) {
        Section(
            title = "An indeterminate progress ring.",
            sourceCode = sourceCodeOfProgressRingSample,
            content = { ProgressRingSample() }
        )
        Section(
            title = "A determinate progress ring.",
            sourceCode = sourceCodeOfDeterminateProgressRingSample,
            content = { DeterminateProgressRingSample() }
        )
    }
}

@Sample
@Composable
private fun ProgressRingSample() {
    ProgressRing()
}

@Sample
@Composable
private fun DeterminateProgressRingSample() {
    var progress by remember { mutableStateOf(0.5f) }
    ProgressRing(progress)
    // TODO: Use NumberBox to change progress
}