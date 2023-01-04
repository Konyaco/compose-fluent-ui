

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WeatherRainSnow: ImageVector
    get() {
        if (_weatherRainSnow != null) {
            return _weatherRainSnow!!
        }
        _weatherRainSnow = fluentIcon(name = "Regular.WeatherRainSnow") {
            fluentPath {
                moveTo(14.5f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(3.17f, 0.0f, 4.97f, 2.1f, 5.23f, 4.63f)
                horizontalLineToRelative(0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, 7.37f)
                lineTo(16.0f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.43f, 0.0f)
                lineTo(8.99f, 16.0f)
                lineTo(7.4f, 18.62f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.35f, -0.66f)
                lineToRelative(0.05f, -0.09f)
                lineTo(7.26f, 16.0f)
                horizontalLineToRelative(-0.57f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.37f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 12.0f, 4.0f)
                close()
                moveTo(11.58f, 16.7f)
                curveToRelative(0.33f, 0.2f, 0.46f, 0.6f, 0.32f, 0.94f)
                lineToRelative(-0.05f, 0.09f)
                lineToRelative(-0.56f, 0.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.35f, -0.66f)
                lineToRelative(0.05f, -0.1f)
                lineToRelative(0.56f, -0.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.03f, -0.27f)
                close()
                moveTo(17.25f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(12.0f, 5.5f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, -3.88f, 3.89f)
                curveToRelative(0.0f, 0.36f, -0.32f, 0.64f, -0.68f, 0.64f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-1.25f, 0.0f, -2.27f, 1.0f, -2.27f, 2.23f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, 2.28f, 2.24f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.26f, 0.0f, 2.28f, -1.0f, 2.28f, -2.24f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, -2.28f, -2.23f)
                horizontalLineToRelative(-0.69f)
                curveToRelative(-0.36f, 0.0f, -0.68f, -0.28f, -0.68f, -0.64f)
                curveToRelative(0.0f, -2.29f, -1.8f, -3.9f, -3.88f, -3.9f)
                close()
            }
        }
        return _weatherRainSnow!!
    }

private var _weatherRainSnow: ImageVector? = null
