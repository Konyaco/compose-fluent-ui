package com.konyaco.fluent.gallery.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.LocalStore
import com.konyaco.fluent.gallery.ProjectUrl
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Open
import com.konyaco.fluent.surface.Card
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.banner
import fluentdesign.gallery.generated.resources.fluent_logo
import fluentdesign.gallery.generated.resources.github_logo
import fluentdesign.gallery.generated.resources.jetpack_compose_logo
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Component(icon = "Home")
@Composable
fun HomeScreen() {
    val uriHandler = LocalUriHandler.current
    Column(
        Modifier
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        val gradient = if (LocalStore.current.darkMode) {
            Brush.linearGradient(
                colors = listOf(
                    Color(0xff1A212C),
                    Color(0xff2C343C),
                ),
                start = Offset.Zero,
                end = Offset.Infinite
            )

        } else {
            Brush.linearGradient(
                colors = listOf(
                    Color(0xffCCD7E8),
                    Color(0xffDAE9F7),
                ),
                start = Offset.Zero,
                end = Offset.Infinite
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(256.dp)
                .border(1.dp, FluentTheme.colors.stroke.card.default, shape = RoundedCornerShape(4.dp))
                .clip(RoundedCornerShape(4.dp))
                .background(gradient)
        ) {
            Image(
                painter = painterResource(Res.drawable.banner),
                contentDescription = null,
                modifier = Modifier.scale(2.05f)
            )
            Text(
                modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp),
                text = "Compose\nFluent Design",
                style = FluentTheme.typography.titleLarge,
                textAlign = TextAlign.End,
                color = FluentTheme.colors.text.text.primary
            )
        }

        Card(
            onClick = {
                uriHandler.openUri(ProjectUrl.FRAMEWORK)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                Modifier.fillMaxWidth().padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(Res.drawable.jetpack_compose_logo),
                    contentDescription = null,
                    modifier = Modifier.size(64.dp)
                )
                Column(
                    modifier = Modifier.weight(1f).padding(start = 16.dp)
                ) {
                    Text(
                        text = "Jetpack Compose",
                        style = FluentTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "A powerful toolkit to build beautiful UI on multiple platforms.",
                        style = FluentTheme.typography.body,
                        color = FluentTheme.colors.text.text.secondary
                    )
                }
                Icon(
                    Icons.Default.Open,
                    contentDescription = "Open Link",
                    Modifier.padding(end = 16.dp),
                    tint = FluentTheme.colors.text.text.secondary
                )
            }
        }

        Card(
            onClick = {
                uriHandler.openUri(ProjectUrl.UI_DESIGN)
            },
            modifier = Modifier.fillMaxWidth()

        ) {
            Row(
                Modifier.fillMaxWidth().padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(Res.drawable.fluent_logo),
                    contentDescription = null,
                    modifier = Modifier.size(64.dp).padding(8.dp),
                    tint = FluentTheme.colors.text.text.primary
                )
                Column(
                    modifier = Modifier.weight(1f).padding(start = 16.dp)
                ) {
                    Text(
                        text = "Fluent Design",
                        style = FluentTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "A modern design system face to desktop and other platforms.",
                        style = FluentTheme.typography.body,
                        color = FluentTheme.colors.text.text.secondary
                    )
                }
                Icon(
                    Icons.Default.Open,
                    contentDescription = "Open Link",
                    Modifier.padding(end = 16.dp),
                    tint = FluentTheme.colors.text.text.secondary
                )
            }
        }

        Card(
            onClick = {
                uriHandler.openUri(ProjectUrl.ROOT)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                Modifier.fillMaxWidth().padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(Res.drawable.github_logo),
                    contentDescription = null,
                    modifier = Modifier.size(64.dp).padding(12.dp),
                    tint = FluentTheme.colors.text.text.primary
                )
                Column(
                    modifier = Modifier.weight(1f).padding(start = 16.dp)
                ) {
                    Text(
                        text = "compose-fluent-ui",
                        style = FluentTheme.typography.bodyLarge
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "View our source code on GitHub.",
                        style = FluentTheme.typography.body,
                        color = FluentTheme.colors.text.text.secondary
                    )
                }
                Icon(
                    Icons.Default.Open,
                    contentDescription = "Open Link",
                    Modifier.padding(end = 16.dp),
                    tint = FluentTheme.colors.text.text.secondary
                )
            }
        }
    }
}