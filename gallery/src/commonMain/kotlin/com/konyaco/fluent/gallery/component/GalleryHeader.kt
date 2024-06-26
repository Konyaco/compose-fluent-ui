package com.konyaco.fluent.gallery.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.component.Button
import com.konyaco.fluent.component.DropDownButton
import com.konyaco.fluent.component.FlyoutPlacement
import com.konyaco.fluent.component.HyperlinkButton
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.MenuFlyoutContainer
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.component.ToggleButton
import com.konyaco.fluent.gallery.ProjectUrl
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.filled.BrightnessHigh
import com.konyaco.fluent.icons.regular.Document
import com.konyaco.fluent.icons.regular.PersonFeedback
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.github_logo
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@Composable
fun GalleryHeader(
    title: String,
    description: String,
    documentationPath: String? = null,
    componentPath: String? = null,
    galleryPath: String? = null,
    controlVisible: Boolean = true,
    themeButtonChecked: Boolean = false,
    onThemeButtonChanged: (Boolean) -> Unit = {}
) {
    GalleryHeader(
        AnnotatedString(title),
        AnnotatedString(description),
        documentationPath,
        componentPath,
        galleryPath,
        controlVisible,
        themeButtonChecked,
        onThemeButtonChanged
    )
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun GalleryHeader(
    title: AnnotatedString,
    description: AnnotatedString,
    documentPath: String? = null,
    componentPath: String? = null,
    galleryPath: String? = null,
    themeButtonChecked: Boolean = false,
    controlVisible: Boolean = true,
    onThemeButtonChanged: (Boolean) -> Unit = {}
) {
    Column(Modifier.padding(top = 32.dp, bottom = 24.dp, start = 32.dp, end = 32.dp)) {
        val uriHandler = LocalUriHandler.current
        Text(
            text = title,
            style = FluentTheme.typography.title
        )

        if (controlVisible || documentPath != null || componentPath != null || galleryPath != null) {
            Row(
                modifier = Modifier.padding(top = 12.dp).height(IntrinsicSize.Min),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (documentPath != null) {
                    Button(
                        onClick = {
                            uriHandler.openUri(ProjectUrl.documentationOf(documentPath))
                        },
                        content = {
                            Icon(
                                Icons.Default.Document,
                                contentDescription = null,
                                modifier = Modifier.size(18.dp)
                            )
                            Text("Documentation")
                        }
                    )
                }
                if (componentPath != null && galleryPath != null) {
                    MenuFlyoutContainer(
                        flyout = {
                            HyperlinkButton(
                                onClick = {
                                    uriHandler.openUri(
                                        ProjectUrl.componentCodeOf(componentPath)
                                    )
                                    isFlyoutVisible = false
                                },
                                content = { Text("Component") },
                                modifier = Modifier.fillMaxWidth()
                                    .padding(horizontal = 5.dp, vertical = 2.dp)
                            )
                            HyperlinkButton(
                                onClick = {
                                    uriHandler.openUri(ProjectUrl.galleryCodeOf(galleryPath))
                                    isFlyoutVisible = false
                                },
                                content = { Text("Sample") },
                                modifier = Modifier.fillMaxWidth()
                                    .padding(horizontal = 5.dp, vertical = 2.dp)
                            )
                        },
                        content = {
                            DropDownButton(
                                onClick = { isFlyoutVisible = true },
                                content = {
                                    Icon(
                                        painter = painterResource(Res.drawable.github_logo),
                                        contentDescription = null,
                                        modifier = Modifier.size(18.dp)
                                    )
                                    Text("Source")
                                }
                            )
                        },
                        placement = FlyoutPlacement.Bottom,
                        adaptivePlacement = true
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                if (controlVisible) {
                    ToggleButton(
                        checked = themeButtonChecked,
                        onCheckedChanged = onThemeButtonChanged,
                        content = {
                            Icon(
                                Icons.Filled.BrightnessHigh,
                                contentDescription = null,
                                modifier = Modifier.size(18.dp)
                            )
                        },
                        iconOnly = true,
                        modifier = Modifier.widthIn(40.dp)
                    )
                    Spacer(
                        modifier = Modifier.padding(2.dp).height(16.dp).width(1.dp)
                            .background(FluentTheme.colors.stroke.divider.default)
                    )
                    Button(
                        onClick = { uriHandler.openUri(ProjectUrl.FEED_BACK) },
                        content = {
                            Icon(
                                Icons.Default.PersonFeedback,
                                contentDescription = null,
                                modifier = Modifier.size(18.dp)
                            )
                        },
                        iconOnly = true,
                        modifier = Modifier.widthIn(40.dp)
                    )
                }
            }
        }

        if (description.isNotBlank()) {
            GalleryDescription(title, Modifier.padding(top = 24.dp))
        }
    }
}

@OptIn(ExperimentalFoundationApi::class, ExperimentalTextApi::class)
@Composable
fun GalleryDescription(description: AnnotatedString, modifier: Modifier = Modifier) {
    var isOnHoverLink by remember {
        mutableStateOf(false)
    }
    val uriHandler = LocalUriHandler.current
    ClickableText(
        text = description,
        onHover = {
            val index = it ?: return@ClickableText
            isOnHoverLink =
                description.getUrlAnnotations(index, index + 1).firstOrNull() != null
        },
        style = LocalTextStyle.current.copy(LocalContentColor.current.copy(alpha = LocalContentAlpha.current)),
        modifier = modifier.pointerHoverIcon(
            icon = if (isOnHoverLink) PointerIcon.Hand else PointerIcon.Default
        )
    ) {
        description.getUrlAnnotations(it, it + 1).firstOrNull()?.let { urlAnnotation ->
            uriHandler.openUri(urlAnnotation.item.url)
        }
    }
}