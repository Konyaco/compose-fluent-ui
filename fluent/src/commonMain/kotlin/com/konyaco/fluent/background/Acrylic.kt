package com.konyaco.fluent.background

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.res.ResourceLoader
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.konyaco.fluent.FluentTheme
import kotlin.math.ceil

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Acrylic(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val img = remember {
        loadImageBitmap(ResourceLoader.Default.load("NoiseAsset_256.png"))
    }
    Layer(
        outsideBorder = true,
        shape = RoundedCornerShape(8.dp),
        color = FluentTheme.colors.background.acrylic.base,
        border = BorderStroke(1.dp, FluentTheme.colors.stroke.surface.default),
        cornerRadius = 8.dp
    ) {
        Box(Modifier.drawWithContent {
            val w = ceil(size.width / img.width).toInt()
            val h = ceil(size.height / img.height).toInt()

            repeat(h) { y ->
                repeat(w) { x ->
                    drawImage(
                        image = img,
                        dstOffset = IntOffset(x * img.width, y * img.height),
                        blendMode = BlendMode.Luminosity,
                        alpha = 0.02f,
                        filterQuality = FilterQuality.None
                    )
                }
            }
            drawContent()
        }.then(modifier)) {
            content()
        }
    }
}