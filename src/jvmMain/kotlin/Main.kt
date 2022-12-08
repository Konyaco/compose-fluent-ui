import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
        state = rememberWindowState(position = WindowPosition(Alignment.Center)),
        title = "Fluent Compose"
    ) {
        App()
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun App() {
    var checked by remember { mutableStateOf(true) }

    FluentTheme(colors = darkColors()) {
        Mica(Modifier.fillMaxSize().verticalScroll(rememberScrollState()).horizontalScroll(rememberScrollState())) {
            val density = LocalDensity.current
            var scale by remember { mutableStateOf(density.density) }

            Layer(
                modifier = Modifier.padding(start = 32.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
                    .defaultMinSize(minWidth = 600.dp),
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(1.dp, Colors.Stroke.Control.Default),
                cornerRadius = 8.dp
            ) {
                Column(Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
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
                    CompositionLocalProvider(LocalDensity provides Density(scale)) {
                        var sliderValue by remember { mutableStateOf(0.5f) }
                        Slider(
                            modifier = Modifier.width(200.dp),
                            value = sliderValue,
                            onValueChange = { sliderValue = it },
                        )
                        var text by remember { mutableStateOf("Hello World") }
                        Row {
                            val onClick = { text = "Hello, Fluent Design!"}
                            Button(onClick) { Text(text) }
                            Spacer(Modifier.width(8.dp))
                            AccentButton(onClick) { Text(text) }
                        }
                        Switcher(checked, text = null, onCheckStateChange = { checked = it })
                        Switcher(checked, text = "With Label", onCheckStateChange = { checked = it })
                        Switcher(
                            checked,
                            text = "Before Label",
                            textBefore = true,
                            onCheckStateChange = { checked = it }
                        )
                        CheckBox(checked) { checked = it }
                        CheckBox(checked, label = "With Label") { checked = it }
                        RadioButton(checked, onClick = { checked = true })
                        RadioButton(checked, onClick = { checked = true }, label = "With Label")

                        Row {
                            Layer(
                                modifier = Modifier.size(32.dp),
                                shape = RoundedCornerShape(4.dp),
                                cornerRadius = 4.dp,
                                color = Colors.Fill.Accent.Default,
                                border = BorderStroke(1.dp, Colors.Stroke.Control.Default),
                                content = {},
                                outsideBorder = false
                            )
                            Layer(
                                modifier = Modifier.size(32.dp),
                                shape = RoundedCornerShape(4.dp),
                                cornerRadius = 4.dp,
                                color = Colors.Fill.Accent.Default,
                                border = BorderStroke(1.dp, Colors.Stroke.Control.Default),
                                content = {},
                                outsideBorder = true
                            )
                        }

                        var value by remember { mutableStateOf(TextFieldValue("")) }
                        TextField(value, onValueChange = { value = it })
                        TextField(value, onValueChange = { value = it }, enabled = false)
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