

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherRain: ImageVector
    get() {
        if (_weatherRain != null) {
            return _weatherRain!!
        }
        _weatherRain = fluentIcon(name = "Filled.WeatherRain") {
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
                lineToRelative(0.04f, -0.09f)
                lineTo(11.12f, 16.0f)
                horizontalLineTo(9.0f)
                lineTo(7.4f, 18.63f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.35f, -0.66f)
                lineToRelative(0.05f, -0.09f)
                lineTo(7.26f, 16.0f)
                horizontalLineToRelative(-0.57f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.37f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 12.0f, 4.0f)
                close()
            }
        }
        return _weatherRain!!
    }

private var _weatherRain: ImageVector? = null
