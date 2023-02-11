

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherHailNight: ImageVector
    get() {
        if (_weatherHailNight != null) {
            return _weatherHailNight!!
        }
        _weatherHailNight = fluentIcon(name = "Filled.WeatherHailNight") {
            fluentPath {
                moveTo(13.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(9.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(16.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(13.0f, 6.0f)
                curveToRelative(3.17f, 0.0f, 4.97f, 2.1f, 5.23f, 4.64f)
                horizontalLineToRelative(0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, 7.36f)
                lineTo(7.69f, 18.0f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.36f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 13.0f, 6.0f)
                close()
                moveTo(6.6f, 2.0f)
                arcToRelative(5.06f, 5.06f, 0.0f, false, true, 4.47f, 3.27f)
                curveToRelative(-1.98f, 0.56f, -3.4f, 2.0f, -4.0f, 3.95f)
                lineTo(7.0f, 9.46f)
                lineToRelative(-0.06f, 0.24f)
                lineToRelative(-0.2f, 0.04f)
                curveToRelative(-1.15f, 0.24f, -2.14f, 0.9f, -2.81f, 1.81f)
                lineToRelative(-0.16f, -0.08f)
                arcToRelative(5.06f, 5.06f, 0.0f, false, true, -1.64f, -1.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.37f, -1.13f)
                curveToRelative(1.64f, -0.59f, 2.53f, -1.25f, 3.03f, -2.21f)
                curveToRelative(0.55f, -1.06f, 0.66f, -2.18f, 0.29f, -3.68f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.59f, 2.0f)
                close()
            }
        }
        return _weatherHailNight!!
    }

private var _weatherHailNight: ImageVector? = null
