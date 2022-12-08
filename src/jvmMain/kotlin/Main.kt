import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.Mica
import com.konyaco.fluent.color.Colors
import com.konyaco.fluent.component.*
import com.konyaco.fluent.darkColors

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(position = WindowPosition(Alignment.Center))
    ) {
        App()
    }
}

@Composable
@Preview
fun App() {
    var checked by remember { mutableStateOf(true) }

    FluentTheme(colors = darkColors()) {
        Mica(Modifier.fillMaxSize().verticalScroll(rememberScrollState()).horizontalScroll(rememberScrollState())) {
            Layer(
                modifier = Modifier.padding(start = 32.dp, top = 8.dp, end = 8.dp, bottom = 8.dp)
                    .fillMaxSize().padding(16.dp),
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(1.dp, Colors.Stroke.Control.Default),
                cornerRadius = 8.dp
            ) {
                var displayDialog by remember { mutableStateOf(false) }
                val density = LocalDensity.current
                var scale by remember { mutableStateOf(density.density) }

                Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Column(Modifier.fillMaxSize()) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text("Scale: %.2f".format(scale))
                            Spacer(Modifier.width(8.dp))
                            Button(onClick = { scale = density.density }) { Text("Reset") }
                        }
                        Slider(
                            modifier = Modifier.width(200.dp),
                            value = scale,
                            onValueChange = { scale = it },
                            valueRange = 1f..10f
                        )
                        Spacer(Modifier.width(8.dp))
                    }
                    CompositionLocalProvider(LocalDensity provides Density(scale)) {
                        var sliderValue by remember { mutableStateOf(0.5f) }
                        Slider(
                            modifier = Modifier.width(200.dp),
                            value = sliderValue,
                            onValueChange = { sliderValue = it },
                        )
                        var text by remember { mutableStateOf("Hello, world!") }
                        Row {
                            Button(onClick = {}) {
                                Text("Hello, world!")
                            }
                            Spacer(Modifier.width(2.dp))
                            AccentButton(onClick = {}) {
                                Text("Hello, world!")
                            }
                        }
                        Button(onClick = { text = "Hello, Desktop!" }) {
                            Text(text)
                        }
                        AccentButton(onClick = {
                            displayDialog = true
                        }) { Text("Hello, world!") }
                        Switcher(checked, text = "Dark Mode", onCheckStateChange = { checked = it })
                        Switcher(
                            checked,
                            text = "Before Label",
                            textBefore = true,
                            onCheckStateChange = { checked = it })
                        CheckBox(checked) { checked = it }
                        CheckBox(checked, label = "With Label") { checked = it }
                        RadioButton(checked, onClick = { checked = true })
                        RadioButton(checked, onClick = { checked = true }, label = "With Label")

                        Row {
                            Layer(
                                modifier = Modifier.size(32.dp),
                                shape = RoundedCornerShape(4.dp),
                                cornerRadius = 4.dp,
                                color = Color.Red,
                                border = BorderStroke(1.dp, Color.Green.copy(0.2f)),
                                content = {},
                                outsideBorder = false
                            )
                            Layer(
                                modifier = Modifier.size(32.dp),
                                shape = RoundedCornerShape(4.dp),
                                cornerRadius = 4.dp,
                                color = Color.Red,
                                border = BorderStroke(1.dp, Color.Green.copy(0.2f)),
                                content = {},
                                outsideBorder = true
                            )
                        }
                        var value by remember { mutableStateOf(TextFieldValue("")) }
                        TextField(value, onValueChange = { value = it })
                        TextField(value, onValueChange = { value = it }, enabled = false)
                    }
                }


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