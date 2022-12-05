// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.component.*
import com.konyaco.fluent.darkColors
import com.konyaco.fluent.lightColors

@Composable
@Preview
fun App() {
    var checked by remember { mutableStateOf(false) }

    FluentTheme(colors = if (checked) lightColors() else darkColors()) {
        Layer(modifier = Modifier.fillMaxSize()) {
            var displayDialog by remember { mutableStateOf(false) }
            Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                var text by remember { mutableStateOf("Hello, World!") }
                Button(onClick = { text = "Hello, Desktop!" }) {
                    Text(text)
                }
                AccentButton(onClick = {
                    displayDialog = true
                }) { Text("Show dialog") }
                Switcher(checked) { checked = it }
                CheckBox(checked) { checked = it }
            }

            if (displayDialog) Dialog(
                title = "This is a example dialog",
                cancelButtonText = "Cancel",
                confirmButtonText = "Confirm",
                onCancel = {
                    displayDialog = false
                },
                onConfirm = {
                    displayDialog = false
                }
            )
        }
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(position = WindowPosition(Alignment.Center))
    ) {
        App()
    }
}
