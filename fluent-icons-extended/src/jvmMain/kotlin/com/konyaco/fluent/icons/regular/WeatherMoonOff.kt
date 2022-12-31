

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WeatherMoonOff: ImageVector
    get() {
        if (_weatherMoonOff != null) {
            return _weatherMoonOff!!
        }
        _weatherMoonOff = fluentIcon(name = "Regular.WeatherMoonOff") {
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
                moveTo(17.16f, 18.22f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -12.2f, -0.62f)
                curveToRelative(3.27f, -1.3f, 5.28f, -2.88f, 6.55f, -5.03f)
                lineToRelative(5.65f, 5.65f)
                close()
                moveTo(15.62f, 4.64f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 3.35f, 11.15f)
                lineToRelative(1.11f, 1.11f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -8.17f, -14.89f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.77f, 0.93f)
                curveToRelative(0.5f, 2.07f, 0.6f, 3.81f, 0.35f, 5.37f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(0.45f, -1.76f, 0.5f, -3.7f, 0.06f, -5.96f)
                curveToRelative(0.98f, 0.17f, 1.92f, 0.51f, 2.8f, 1.02f)
                close()
            }
        }
        return _weatherMoonOff!!
    }

private var _weatherMoonOff: ImageVector? = null
