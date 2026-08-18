package io.github.composefluent.gallery.screen.dialogs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.dp
import io.github.composefluent.FluentTheme
import io.github.composefluent.component.Button
import io.github.composefluent.component.CheckBox
import io.github.composefluent.component.FlyoutPlacement
import io.github.composefluent.component.Icon
import io.github.composefluent.component.TeachingTip
import io.github.composefluent.component.TeachingTipContainer
import io.github.composefluent.component.TeachingTipDefaults
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.annotation.Component
import io.github.composefluent.gallery.annotation.Sample
import io.github.composefluent.gallery.component.ComponentPagePath
import io.github.composefluent.gallery.component.GalleryPage
import io.github.composefluent.gallery.resources.Res
import io.github.composefluent.gallery.resources.banner
import io.github.composefluent.icons.Icons
import io.github.composefluent.icons.regular.Lightbulb
import io.github.composefluent.source.generated.FluentSourceFile
import org.jetbrains.compose.resources.painterResource

@Component(index = 2, description = "Draws attention to a new or important feature.")
@Composable
fun TeachingTipScreen() {
    GalleryPage(
        title = "TeachingTip",
        description = "A TeachingTip is a rich flyout that can teach users about a feature. " +
                "It can point to an anchor or open by itself in the center of the window.",
        componentPath = FluentSourceFile.TeachingTip,
        galleryPath = ComponentPagePath.TeachingTipScreen,
    ) {
        var showIcon by remember { mutableStateOf(true) }
        var showHero by remember { mutableStateOf(true) }
        var showAction by remember { mutableStateOf(true) }
        var showSecondaryAction by remember { mutableStateOf(true) }
        var showCloseAction by remember { mutableStateOf(true) }
        Section(
            title = "A teaching tip with configurable slots.",
            sourceCode = sourceCodeOfConfigurableTeachingTipSlotsSample,
            content = {
                ConfigurableTeachingTipSlotsSample(
                    showIcon = showIcon,
                    showHero = showHero,
                    showAction = showAction,
                    showSecondaryAction = showSecondaryAction,
                    showCloseAction = showCloseAction,
                )
            },
            options = {
                CheckBox(
                    checked = showIcon,
                    onCheckStateChange = { showIcon = it },
                    label = "Show icon",
                )
                CheckBox(
                    checked = showHero,
                    onCheckStateChange = { showHero = it },
                    label = "Show hero",
                )
                CheckBox(
                    checked = showAction,
                    onCheckStateChange = { showAction = it },
                    label = "Show action",
                )
                CheckBox(
                    checked = showSecondaryAction,
                    onCheckStateChange = { showSecondaryAction = it },
                    label = "Show secondary action",
                )
                CheckBox(
                    checked = showCloseAction,
                    onCheckStateChange = { showCloseAction = it },
                    label = "Show close action",
                )
            },
        )
        Section(
            title = "A targeted teaching tip with hero content.",
            sourceCode = sourceCodeOfTargetedTeachingTipSample,
            content = { TargetedTeachingTipSample() },
        )
        Section(
            title = "Multiple teaching tips targeting one image.",
            sourceCode = sourceCodeOfMultipleImageTeachingTipsSample,
            content = { MultipleImageTeachingTipsSample() },
        )
        Section(
            title = "A preferred placement that falls back when space is unavailable.",
            sourceCode = sourceCodeOfAdaptiveTeachingTipSample,
            content = { AdaptiveTeachingTipSample() },
        )
        Section(
            title = "A teaching tip without an anchor.",
            sourceCode = sourceCodeOfCenteredTeachingTipSample,
            content = { CenteredTeachingTipSample() },
        )
    }
}

@Sample
@Composable
private fun ConfigurableTeachingTipSlotsSample(
    showIcon: Boolean,
    showHero: Boolean,
    showAction: Boolean,
    showSecondaryAction: Boolean,
    showCloseAction: Boolean,
) {
    TeachingTipContainer(
        teachingTip = {
            TeachingTip(
                title = { Text("Inspect the layout") },
                placement = FlyoutPlacement.Bottom,
                icon = if (showIcon) {
                    {
                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = null,
                            tint = FluentTheme.colors.text.text.primary,
                            modifier = Modifier.size(TeachingTipDefaults.IconSize),
                        )
                    }
                } else {
                    null
                },
                hero = if (showHero) {
                    {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(96.dp)
                                .background(FluentTheme.colors.fillAccent.default),
                            contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                text = "Hero",
                                color = FluentTheme.colors.text.onAccent.primary,
                            )
                        }
                    }
                } else {
                    null
                },
                action = if (showAction) {
                    {
                        Button(
                            onClick = { isTeachingTipVisible = false },
                            content = { Text("Primary") },
                        )
                    }
                } else {
                    null
                },
                secondaryAction = if (showSecondaryAction) {
                    {
                        Button(
                            onClick = {},
                            content = { Text("Secondary") },
                        )
                    }
                } else {
                    null
                },
                closeAction = if (showCloseAction) {
                    {
                        TeachingTipDefaults.CloseButton(
                            onClick = { isTeachingTipVisible = false },
                            contentDescription = "Close",
                        )
                    }
                } else {
                    null
                },
                focusable = false,
                content = {
                    Text("Toggle the optional slots to inspect their spacing and alignment.")
                },
            )
        },
        content = {
            Button(
                onClick = { isTeachingTipVisible = !isTeachingTipVisible },
                content = { Text("Show configurable tip") },
            )
        },
    )
}

@Sample
@Composable
private fun TargetedTeachingTipSample() {
    TeachingTipContainer(
        teachingTip = {
            TeachingTip(
                title = { Text("Create faster with suggestions") },
                icon = {
                    Icon(
                        imageVector = Icons.Default.Lightbulb,
                        contentDescription = null,
                        tint = FluentTheme.colors.text.text.primary,
                        modifier = Modifier.size(TeachingTipDefaults.IconSize)
                    )
                },
                placement = FlyoutPlacement.Bottom,
                hero = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(112.dp)
                            .background(FluentTheme.colors.fillAccent.default),
                        contentAlignment = Alignment.Center,
                    ) {
                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = null,
                            modifier = Modifier.size(44.dp),
                            tint = FluentTheme.colors.text.onAccent.primary,
                        )
                    }
                },
                action = {
                    Button(
                        onClick = { isTeachingTipVisible = false },
                        content = { Text("Try it") }
                    )
                },
                closeAction = {
                    TeachingTipDefaults.CloseButton(
                        onClick = { isTeachingTipVisible = false },
                        contentDescription = "Close",
                    )
                },
                content = { Text("Suggestions appear while you work and stay out of the way when you do not need them.") }
            )
        },
        content = {
            Button(
                onClick = { isTeachingTipVisible = !isTeachingTipVisible },
                content = { Text("Show teaching tip") }
            )
        },
    )
}

@Sample
@Composable
private fun MultipleImageTeachingTipsSample() {
    var imageBounds by remember { mutableStateOf<Rect?>(null) }
    var firstVisible by remember { mutableStateOf(false) }
    var secondVisible by remember { mutableStateOf(false) }
    val firstTarget = imageBounds?.let { bounds ->
        Rect(
            left = bounds.left + bounds.width * 0.2f,
            top = bounds.top + bounds.height * 0.18f,
            right = bounds.left + bounds.width * 0.3f,
            bottom = bounds.top + bounds.height * 0.34f,
        )
    }
    val secondTarget = imageBounds?.let { bounds ->
        Rect(
            left = bounds.left + bounds.width * 0.7f,
            top = bounds.top + bounds.height * 0.66f,
            right = bounds.left + bounds.width * 0.8f,
            bottom = bounds.top + bounds.height * 0.82f,
        )
    }

    Box {
        Box(
            modifier = Modifier
                .size(320.dp, 200.dp)
                .onGloballyPositioned { imageBounds = it.boundsInWindow() },
        ) {
            Image(
                painter = painterResource(Res.drawable.banner),
                contentDescription = "Image with multiple teaching tip targets",
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize(),
            )
            TeachingTipMarker(
                label = "1",
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 64.dp, y = 36.dp)
                    .clickable { firstVisible = !firstVisible },
            )
            TeachingTipMarker(
                label = "2",
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .offset(x = (-64).dp, y = (-36).dp)
                    .clickable { secondVisible = !secondVisible },
            )
        }
        TeachingTip(
            visible = firstVisible && firstTarget != null,
            onDismissRequest = { firstVisible = false },
            target = firstTarget,
            placement = FlyoutPlacement.Bottom,
            title = { Text("Image detail") },
            content = { Text("This tip points to the first region of the image.") }
        )
        TeachingTip(
            visible = secondVisible && secondTarget != null,
            onDismissRequest = { secondVisible = false },
            target = secondTarget,
            placement = FlyoutPlacement.Top,
            title = { Text("Another detail") },
            content = { Text("A second tip can use another Rect from the same image.") }
        )
    }
}

@Composable
private fun TeachingTipMarker(
    label: String,
    modifier: Modifier = Modifier,
) {
    Box(
        contentAlignment = Alignment.Center,
        content = { Text(label, color = FluentTheme.colors.text.onAccent.primary) },
        modifier = modifier
            .size(32.dp)
            .background(FluentTheme.colors.fillAccent.default, CircleShape),
    )
}

@Sample
@Composable
private fun AdaptiveTeachingTipSample() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp),
        contentAlignment = Alignment.CenterEnd,
    ) {
        TeachingTipContainer(
            teachingTip = {
                TeachingTip(
                    title = { Text("Placement adjusted") },
                    placement = FlyoutPlacement.End,
                    closeAction = {
                        TeachingTipDefaults.CloseButton(
                            onClick = { isTeachingTipVisible = false },
                            contentDescription = "Close",
                        )
                    },
                    content = { Text("The preferred end placement is used only when enough window space is available.") }
                )
            },
            content = {
                Button(
                    onClick = { isTeachingTipVisible = !isTeachingTipVisible },
                    content = { Text("Show at edge") }
                )
            },
        )
    }
}

@Sample
@Composable
private fun CenteredTeachingTipSample() {
    var visible by remember { mutableStateOf(false) }
    TeachingTip(
        visible = visible,
        onDismissRequest = { visible = false },
        title = { Text("Welcome to the gallery") },
        target = null,
        action = {
            Button(
                onClick = { visible = false },
                content =  { Text("Get started") }
            )
        },
        closeAction = {
            TeachingTipDefaults.CloseButton(
                onClick = { visible = false },
                contentDescription = "Close",
            )
        },
        content = { Text("This teaching tip has no anchor, so it opens from the center of the window.") }
    )

    Button(
        onClick = { visible = true },
        content = { Text("Show centered tip") }
    )
}
