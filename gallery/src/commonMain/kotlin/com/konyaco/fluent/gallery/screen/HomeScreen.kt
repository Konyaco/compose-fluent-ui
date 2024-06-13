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
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.gallery.LocalStore
import com.konyaco.fluent.gallery.ProjectUrl
import com.konyaco.fluent.gallery.annotation.Component
import com.konyaco.fluent.gallery.component.FontIcon
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.Open
import com.konyaco.fluent.surface.Card
import fluentdesign.gallery.generated.resources.Res
import fluentdesign.gallery.generated.resources.banner
import fluentdesign.gallery.generated.resources.fluent_logo
import fluentdesign.gallery.generated.resources.github_logo
import fluentdesign.gallery.generated.resources.jetpack_compose_logo
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Component(icon = "Home", iconGlyph = '\uE80F')
@Composable
fun HomeScreen() {
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
                .border(1.dp, FluentTheme.colors.stroke.card.default, shape = FluentTheme.shapes.control)
                .clip(FluentTheme.shapes.control)
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

        HomeCardItem(
            url = ProjectUrl.FRAMEWORK,
            icon = Res.drawable.jetpack_compose_logo,
            title = "Jetpack Compose",
            caption = "A powerful toolkit to build beautiful UI on multiple platforms."
        )

        HomeCardItem(
            url = ProjectUrl.UI_DESIGN,
            icon = Res.drawable.fluent_logo,
            title = "Fluent Design",
            caption = "A modern design system face to desktop and other platforms.",
            iconColorFilter = ColorFilter.tint(FluentTheme.colors.text.text.primary)
        )

        HomeCardItem(
            url = ProjectUrl.ROOT,
            icon = Res.drawable.github_logo,
            title = "compose-fluent-ui",
            caption = "View our source code on GitHub.",
            iconColorFilter = ColorFilter.tint(FluentTheme.colors.text.text.primary)
        )
    }
}

@Composable
private fun HomeCardItem(
    url: String,
    icon: DrawableResource,
    title: String,
    caption: String,
    iconColorFilter: ColorFilter? = null
) {
    val uriHandler = LocalUriHandler.current
    Card(
        onClick = {
            uriHandler.openUri(url)
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(icon),
                contentDescription = null,
                modifier = Modifier.size(64.dp).padding(12.dp),
                colorFilter = iconColorFilter,
            )
            Column(
                modifier = Modifier.weight(1f).padding(start = 16.dp)
            ) {
                Text(
                    text = title,
                    style = FluentTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = caption,
                    style = FluentTheme.typography.body,
                    color = FluentTheme.colors.text.text.secondary
                )
            }
            CompositionLocalProvider(
                LocalContentColor provides FluentTheme.colors.text.text.secondary,
                LocalContentAlpha provides FluentTheme.colors.text.text.secondary.alpha
            ) {
                FontIcon(
                    glyph = '\uE8A7',
                    vector = Icons.Default.Open,
                    contentDescription = "Open Link",
                    modifier = Modifier.padding(end = 16.dp)
                )
            }
        }
    }
}