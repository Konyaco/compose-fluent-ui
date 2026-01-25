package io.github.composefluent.gallery.screen.text

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.composefluent.ExperimentalFluentApi
import io.github.composefluent.component.AutoSuggestBoxDefaults
import io.github.composefluent.component.AutoSuggestionBox
import io.github.composefluent.component.ListItem
import io.github.composefluent.component.Text
import io.github.composefluent.component.TextField
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.gallery.component.flatMapComponents
import io.github.composefluent.source.generated.FluentSourceFile
import kotlinx.coroutines.flow.map

@Component(index = 0, description = "A control to provide suggestions as a user is typing.")
@Composable
fun AutoSuggestBoxScreen() {
    GalleryPage(
        title = "AutoSuggestBox",
        description = "A text control that makes suggestions to users as they type. " +
                "The app is notified when text has been changed by the user " +
                "and is responsible for providing relevant suggestions for this control to display.",
        componentPath = FluentSourceFile.AutoSuggestBox,
        galleryPath = ComponentPagePath.AutoSuggestBoxScreen
    ) {
        Section(
            title = "Basic AutoSuggestBox Sample",
            sourceCode = sourceCodeOfBasicAutoSuggestBoxSample,
            content = { BasicAutoSuggestBoxSample() }
        )
    }
}

@Sample
@OptIn(ExperimentalFluentApi::class)
@Composable
private fun BasicAutoSuggestBoxSample() {
    var expanded by remember { mutableStateOf(false) }
    var keyword by remember { mutableStateOf("") }
    AutoSuggestionBox(
        expanded = expanded,
        onExpandedChange = { expanded = it }
    ) {
        TextField(
            value = keyword,
            onValueChange = { keyword = it },
            shape = AutoSuggestBoxDefaults.textFieldShape(expanded),
            modifier = Modifier.widthIn(300.dp).flyoutAnchor()
        )
        val searchResult = remember(flatMapComponents) {
            snapshotFlow { keyword }.map {
                flatMapComponents.filter { item ->
                    item.name.contains(
                        it,
                        ignoreCase = true
                    ) || item.description.contains(it, ignoreCase = true)
                }
            }
        }.collectAsState(flatMapComponents)

        AutoSuggestBoxDefaults.suggestFlyout(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            itemsContent = {
                items(items = searchResult.value) {
                    ListItem(
                        onClick = { expanded = false },
                        text = { Text(it.name, maxLines = 1) },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            modifier = Modifier.flyoutSize(matchAnchorWidth = true)
        )
    }
}