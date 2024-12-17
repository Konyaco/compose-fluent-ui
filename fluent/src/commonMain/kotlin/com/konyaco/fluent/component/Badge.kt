package com.konyaco.fluent.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.layout
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.LocalContentAlpha
import com.konyaco.fluent.LocalContentColor
import com.konyaco.fluent.LocalTextStyle
import com.konyaco.fluent.contentColorFor
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.filled.Checkmark
import com.konyaco.fluent.icons.filled.Dismiss

@Composable
fun Badge(
    status: BadgeStatus,
    backgroundColor: Color = BadgeDefaults.color(status),
    contentColor: Color = contentColorFor(backgroundColor),
    modifier: Modifier = Modifier,
    content: (@Composable (status: BadgeStatus) -> Unit)? = null
) {
    Badge(
        content = content?.let { { it(status) } },
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        modifier = modifier
    )
}

@Composable
fun Badge(
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    contentColor: Color = contentColorFor(backgroundColor),
    content: (@Composable () -> Unit)? = null
) {
    val defaultSize = if (content != null) {
        16.dp
    } else {
        4.dp
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.defaultMinSize(defaultSize, defaultSize)
            .clip(CircleShape)
            .background(color = backgroundColor)
    ) {
        if (content != null) {
            CompositionLocalProvider(
                LocalContentColor provides contentColor,
                LocalContentAlpha provides contentColor.alpha,
                LocalTextStyle provides FluentTheme.typography.caption
            ) {
                Box(
                    content = { content() },
                    propagateMinConstraints = true,
                    modifier = Modifier.layout { measurable, constraints ->
                        val placeable = measurable.measure(constraints)
                        val hasText = placeable[FirstBaseline] > 0
                        val padding = when {
                            hasText -> 3.dp.roundToPx()
                            else -> 0
                        }
                        layout((placeable.width + 2 * padding), placeable.height) {
                            val offset = if (hasText) {
                                -(1.dp.roundToPx())
                            } else {
                                0
                            }
                            placeable.placeRelative(padding, offset)
                        }
                    }
                )
            }
        }
    }
}

object BadgeDefaults {

    inline val informationIcon: ImageVector
        get() = Icons.Filled.BadgeInformation

    inline val cautionIcon: ImageVector
        get() = Icons.Filled.BadgeImportant

    inline val attentionIcon: ImageVector
        get() = Icons.Filled.BadgeAttention

    inline val successIcon: ImageVector
        get() = Icons.Filled.Checkmark

    inline val criticalIcon: ImageVector
        get() = Icons.Filled.Dismiss

    @Stable
    @Composable
    fun color(status: BadgeStatus): Color {
        return when (status) {
            BadgeStatus.Informational -> FluentTheme.colors.system.neutralBackground
            BadgeStatus.InformationalSafe -> FluentTheme.colors.system.solidNeutral
            BadgeStatus.Attention -> FluentTheme.colors.system.attention
            BadgeStatus.Caution -> FluentTheme.colors.system.caution
            BadgeStatus.Critical -> FluentTheme.colors.system.critical
            BadgeStatus.Success -> FluentTheme.colors.system.success
        }
    }

    @Composable
    fun Icon(
        status: BadgeStatus,
        contentDescription: String? = status.name,
        modifier: Modifier = Modifier
    ) {
        this.Icon(
            imageVector = when (status) {
                BadgeStatus.Attention -> attentionIcon
                BadgeStatus.Caution -> cautionIcon
                BadgeStatus.Critical -> criticalIcon
                BadgeStatus.Success -> successIcon
                else -> informationIcon
            },
            contentDescription = contentDescription,
            modifier = modifier
        )
    }

    @Composable
    internal fun Icon(imageVector: ImageVector, contentDescription: String?, modifier: Modifier = Modifier) {
        com.konyaco.fluent.component.Icon(
            imageVector = imageVector,
            contentDescription = contentDescription,
            modifier = modifier.size(12.dp)
        )
    }

}

enum class BadgeStatus {
    Informational,
    InformationalSafe,
    Caution,
    Attention,
    Success,
    Critical,
}