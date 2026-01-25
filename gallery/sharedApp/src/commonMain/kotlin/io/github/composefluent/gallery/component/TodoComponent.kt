package io.github.composefluent.gallery.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import io.github.composefluent.component.Button
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.ProjectUrl

@Composable
fun TodoComponent() {
    Box(Modifier.fillMaxWidth()) {
        Text(modifier = Modifier.align(Alignment.CenterStart), text = "TODO")
        val urlHandle = LocalUriHandler.current
        Button(
            modifier = Modifier.align(Alignment.CenterEnd),
            onClick = {
                urlHandle.openUri(ProjectUrl.ROOT)
            }) {
            Text("Contribute")
        }
    }
}