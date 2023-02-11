

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherMoonOff: ImageVector
    get() {
        if (_weatherMoonOff != null) {
            return _weatherMoonOff!!
        }
        _weatherMoonOff = fluentIcon(name = "Filled.WeatherMoonOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(8.2f, 8.2f)
                curveToRelative(-1.18f, 2.19f, -3.2f, 3.73f, -6.93f, 5.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.36f, 1.13f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 15.1f, 1.6f)
                lineToRelative(2.49f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(16.37f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 3.71f, 13.56f)
                lineTo(11.5f, 8.31f)
                curveToRelative(0.25f, -1.56f, 0.15f, -3.3f, -0.35f, -5.37f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 11.9f, 2.0f)
                curveToRelative(1.55f, 0.09f, 3.08f, 0.53f, 4.46f, 1.33f)
                close()
            }
        }
        return _weatherMoonOff!!
    }

private var _weatherMoonOff: ImageVector? = null
