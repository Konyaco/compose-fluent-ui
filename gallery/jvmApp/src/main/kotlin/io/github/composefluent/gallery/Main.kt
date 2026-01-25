package io.github.composefluent.gallery

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import io.github.composefluent.gallery.component.rememberComponentNavigator
import io.github.composefluent.gallery.resources.Res
import io.github.composefluent.gallery.resources.icon
import io.github.composefluent.gallery.window.WindowFrame
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.skiko.hostOs

fun main() = application {
    val state = rememberWindowState(
        position = WindowPosition(Alignment.Center),
        size = DpSize(1280.dp, 720.dp)
    )
    val title = "Compose Fluent Design Gallery"
    val icon = painterResource(Res.drawable.icon)
    Window(
        onCloseRequest = ::exitApplication,
        state = state,
        title = title,
        icon = icon
    ) {
        val navigator = rememberComponentNavigator()
        WindowFrame(
            onCloseRequest = ::exitApplication,
            icon = icon,
            title = title,
            state = state,
            backButtonEnabled = navigator.canNavigateUp,
            backButtonClick = { navigator.navigateUp() },
            backButtonVisible = hostOs.isWindows
        ) { windowInset, contentInset ->
            App(
                windowInset = windowInset,
                contentInset = contentInset,
                navigator = navigator,
                title = title,
                icon = icon
            )
        }
    }
}
