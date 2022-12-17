package com.konyaco.fluent.example

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.Mica
import com.konyaco.fluent.component.*
import com.konyaco.fluent.darkColors
import com.konyaco.fluent.lightColors

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(position = WindowPosition(Alignment.Center)),
        title = "Compose Fluent"
    ) {
        App()
    }
}

@Composable
private fun App() {
    val systemDarkMode = isSystemInDarkTheme()
    var darkMode by remember(systemDarkMode) { mutableStateOf(systemDarkMode) }

    FluentTheme(colors = if (darkMode) darkColors() else lightColors()) {
        Mica(Modifier.fillMaxSize().verticalScroll(rememberScrollState()).horizontalScroll(rememberScrollState())) {
            val density = LocalDensity.current
            var scale by remember { mutableStateOf(density.density) }

            Layer(
                modifier = Modifier.padding(start = 32.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                    .defaultMinSize(minWidth = 600.dp),
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(1.dp, FluentTheme.colors.stroke.control.default),
                cornerRadius = 8.dp
            ) {
                Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text("Scale: %.2f".format(scale))
                        Button(onClick = { scale = density.density }) { Text("Reset") }
                        Switcher(darkMode, text = "Dark Mode", onCheckStateChange = { darkMode = it })
                    }
                    Slider(
                        modifier = Modifier.width(200.dp),
                        value = scale,
                        onValueChange = { scale = it },
                        valueRange = 1f..10f
                    )
                    CompositionLocalProvider(LocalDensity provides Density(scale)) {
                        var sliderValue by remember { mutableStateOf(0.5f) }
                        Slider(
                            modifier = Modifier.width(200.dp),
                            value = sliderValue,
                            onValueChange = { sliderValue = it },
                        )
                        var text by remember { mutableStateOf("Hello World") }
                        Row {
                            val onClick = { text = "Hello, Fluent Design!" }
                            Button(onClick) { Text(text) }
                            Spacer(Modifier.width(8.dp))
                            AccentButton(onClick) {
                                Icon(
                                    modifier = Modifier.size(12.dp),
                                    painter = rememberResourcePainter("icon/AcceptMedium.svg"),
                                    contentDescription = null
                                )
                                Text(text)
                            }
                            Spacer(Modifier.width(8.dp))
                        }
                        var checked by remember { mutableStateOf(false) }
                        Switcher(checked, text = null, onCheckStateChange = { checked = it })

                        var checked2 by remember { mutableStateOf(true) }
                        Switcher(checked2, text = "With Label", onCheckStateChange = { checked2 = it })

                        var checked3 by remember { mutableStateOf(true) }
                        Switcher(
                            checked3,
                            text = "Before Label",
                            textBefore = true,
                            onCheckStateChange = { checked3 = it }
                        )

                        var checked4 by remember { mutableStateOf(false) }
                        CheckBox(checked4) { checked4 = it }

                        var checked5 by remember { mutableStateOf(true) }
                        CheckBox(checked5, label = "With Label") { checked5 = it }

                        var selectedRadio by remember { mutableStateOf(0) }
                        RadioButton(selectedRadio == 0, onClick = { selectedRadio = 0 })
                        RadioButton(selectedRadio == 1, onClick = { selectedRadio = 1 }, label = "With Label")

                        Row {
                            Layer(
                                modifier = Modifier.size(32.dp),
                                shape = RoundedCornerShape(4.dp),
                                cornerRadius = 4.dp,
                                color = FluentTheme.colors.fillAccent.default,
                                border = BorderStroke(1.dp, FluentTheme.colors.stroke.control.default),
                                content = {},
                                outsideBorder = false
                            )
                            Layer(
                                modifier = Modifier.size(32.dp),
                                shape = RoundedCornerShape(4.dp),
                                cornerRadius = 4.dp,
                                color = FluentTheme.colors.fillAccent.default,
                                border = BorderStroke(1.dp, FluentTheme.colors.stroke.control.default),
                                content = {},
                                outsideBorder = true
                            )
                        }

                        var value by remember { mutableStateOf(TextFieldValue("")) }
                        TextField(value, onValueChange = { value = it })
                        TextField(value, onValueChange = { value = it }, enabled = false)

                        // ProgressRings
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(32.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            ProgressRing(size = ProgressRingSize.Medium)
                            ProgressRing(progress = sliderValue)
                            AccentButton(onClick = {}) {
                                ProgressRing(size = ProgressRingSize.Small, color = LocalContentColor.current)
                                Text("Small")
                            }
                        }

                        ProgressBar(sliderValue)
                        ProgressBar()
                    }

                    var displayDialog by remember { mutableStateOf(false) }
                    AccentButton(onClick = {
                        displayDialog = true
                    }) { Text("Display Dialog") }

                    Dialog(
                        title = "This is a example dialog",
                        visible = displayDialog,
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
    }
}