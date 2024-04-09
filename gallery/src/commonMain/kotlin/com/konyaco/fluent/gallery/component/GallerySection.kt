package com.konyaco.fluent.gallery.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import com.konyaco.fluent.animation.FluentDuration
import com.konyaco.fluent.animation.FluentEasing
import com.konyaco.fluent.background.BackgroundSizing
import com.konyaco.fluent.background.Layer
import com.konyaco.fluent.background.Mica
import com.konyaco.fluent.component.Icon
import com.konyaco.fluent.component.Scrollbar
import com.konyaco.fluent.component.SubtleButton
import com.konyaco.fluent.component.Text
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.regular.ChevronDown
import com.konyaco.fluent.surface.Card

@Composable
fun GallerySection(
    modifier: Modifier,
    title: String,
    sourceCode: String,
    content: @Composable BoxScope.() -> Unit,
) {
    Column(modifier) {
        Text(title, style = FluentTheme.typography.bodyStrong)
        Spacer(Modifier.height(16.dp))
        Layer(
            modifier = Modifier.fillMaxWidth().wrapContentHeight(),
            shape = RoundedCornerShape(
                topStart = 8.dp, topEnd = 8.dp
            ),
            backgroundSizing = BackgroundSizing.OuterBorderEdge
        ) {
            Mica(Modifier) {
                Box(
                    Modifier.wrapContentHeight().fillMaxWidth().defaultMinSize(minHeight = 100.dp)
                        .padding(16.dp), Alignment.CenterStart,
                    content = content
                )
            }
        }

        var sourceCodeExpanded by remember { mutableStateOf(false) }

        val interactionSource = remember { MutableInteractionSource() }
        Card(
            modifier = Modifier.fillMaxWidth()
                .clickable(interactionSource = interactionSource, indication = null, onClick = {
                    sourceCodeExpanded = !sourceCodeExpanded
                }),
            shape = RoundedCornerShape(
                bottomEnd = if (sourceCodeExpanded) 0.dp else 8.dp,
                bottomStart = if (sourceCodeExpanded) 0.dp else 8.dp
            )
        ) {
            Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                Text(modifier = Modifier.padding(start = 8.dp).weight(1f), text = "Source Code")
                SubtleButton(
                    onClick = { sourceCodeExpanded = !sourceCodeExpanded },
                    interaction = interactionSource,
                    iconOnly = true
                ) {
                    Icon(
                        modifier = Modifier.rotate(
                            animateFloatAsState(
                                if (sourceCodeExpanded) 180f else 0f,
                            ).value
                        ),
                        imageVector = Icons.Default.ChevronDown,
                        contentDescription = "Expand source code"
                    )
                }
            }
        }
        AnimatedVisibility(
            visible = sourceCodeExpanded,
            enter = expandVertically(
                tween(FluentDuration.MediumDuration, 0, FluentEasing.FastInvokeEasing)
            ),
            exit = shrinkVertically(
                tween(FluentDuration.QuickDuration, 0, FluentEasing.SoftDismissEasing)
            )
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(
                    bottomEnd = 8.dp,
                    bottomStart = 8.dp
                )
            ) {
                Column(Modifier.padding(16.dp, 12.dp)) {
                    Text("Kotlin", style = FluentTheme.typography.bodyStrong)
                    Spacer(Modifier.height(12.dp))
                    val scrollState = rememberScrollState()
                    Box(Modifier.fillMaxWidth().wrapContentHeight()) {
                        SourceCode(
                            modifier = Modifier.horizontalScroll(scrollState),
                            code = sourceCode
                        )
                        Box(Modifier.fillMaxWidth().align(Alignment.BottomCenter)) {
                            Scrollbar(modifier = Modifier.fillMaxWidth(), isVertical = false, adapter = com.konyaco.fluent.component.rememberScrollbarAdapter(scrollState))
                        }
                    }
                }
            }
        }
    }
}