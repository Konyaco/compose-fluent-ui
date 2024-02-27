package com.konyaco.fluent.gallery.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.Text
import java.awt.Desktop
import java.net.URI

@Composable
fun TodoComponent() {
    Box(Modifier.fillMaxWidth()) {
        Text(modifier = Modifier.align(Alignment.CenterStart), text = "TODO")
        Button(
            modifier = Modifier.align(Alignment.CenterEnd),
            onClick = {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().browse(URI("https://github.com/Konyaco/compose-fluent-ui"))
                }
            }) {
            Text("Contribute")
        }
    }
}