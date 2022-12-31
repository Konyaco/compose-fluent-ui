

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherMoon: ImageVector
    get() {
        if (_weatherMoon != null) {
            return _weatherMoon!!
        }
        _weatherMoon = fluentIcon(name = "Filled.WeatherMoon") {
            fluentPath {
                moveTo(20.03f, 17.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -16.9f, 0.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.36f, -1.13f)
                curveToRelative(3.77f, -1.35f, 5.79f, -2.91f, 6.96f, -5.15f)
                curveToRelative(1.23f, -2.35f, 1.55f, -4.93f, 0.69f, -8.46f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 11.9f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 20.03f, 17.0f)
                close()
            }
        }
        return _weatherMoon!!
    }

private var _weatherMoon: ImageVector? = null
