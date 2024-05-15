package com.konyaco.fluent.gallery.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.ProjectUrl

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