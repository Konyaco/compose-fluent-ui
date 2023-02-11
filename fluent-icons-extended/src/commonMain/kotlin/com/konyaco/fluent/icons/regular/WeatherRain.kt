

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WeatherRain: ImageVector
    get() {
        if (_weatherRain != null) {
            return _weatherRain!!
        }
        _weatherRain = fluentIcon(name = "Regular.WeatherRain") {
            fluentPath {
                moveTo(12.0f, 4.0f)
                curveToRelative(3.17f, 0.0f, 4.97f, 2.1f, 5.23f, 4.63f)
                horizontalLineToRelative(0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, 7.37f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(-1.58f, 2.63f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.34f, -0.66f)
                lineToRelative(0.04f, -0.09f)
                lineTo(15.0f, 16.0f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(-1.59f, 2.63f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.34f, -0.66f)
                lineToRelative(0.05f, -0.09f)
                lineTo(11.12f, 16.0f)
                lineTo(9.0f, 16.0f)
                lineTo(7.4f, 18.63f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.35f, -0.66f)
                lineToRelative(0.05f, -0.09f)
                lineTo(7.26f, 16.0f)
                horizontalLineToRelative(-0.57f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.37f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 12.0f, 4.0f)
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
        return _weatherRain!!
    }

private var _weatherRain: ImageVector? = null
