package com.konyaco.fluent.gallery

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.konyaco.fluent.gallery.component.rememberComponentNavigator
import com.konyaco.fluent.gallery.window.WindowFrame
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.icon
import org.jetbrains.compose.resources.painterResource

fun main() = application {
    val state = rememberWindowState(
        position = WindowPosition(Alignment.Center),
        size = DpSize(1280.dp, 720.dp)
    )
    Window(
        onCloseRequest = ::exitApplication,
        state = state,
        title = "Compose Fluent Design Gallery",
        icon = painterResource(Res.drawable.icon)
    ) {
        val navigator = rememberComponentNavigator()
        WindowFrame(
            onCloseRequest = ::exitApplication,
            icon = painterResource(Res.drawable.icon),
            title = "Compose Fluent Design Gallery",
            state = state,
            backButtonEnabled = navigator.canNavigateUp,
            backButtonClick = { navigator.navigateUp() },
        ) { windowInset, _ ->
            App(windowInset = windowInset, navigator = navigator)
        }
    }
}
