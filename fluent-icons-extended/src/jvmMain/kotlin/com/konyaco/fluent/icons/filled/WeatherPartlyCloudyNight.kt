

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherPartlyCloudyNight: ImageVector
    get() {
        if (_weatherPartlyCloudyNight != null) {
            return _weatherPartlyCloudyNight!!
        }
        _weatherPartlyCloudyNight = fluentIcon(name = "Filled.WeatherPartlyCloudyNight") {
            fluentPath {
                moveTo(13.0f, 8.01f)
                curveToRelative(3.17f, 0.0f, 4.97f, 2.1f, 5.23f, 4.63f)
                horizontalLineToRelative(0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, 7.37f)
                lineTo(7.69f, 20.01f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.37f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 13.0f, 8.01f)
                close()
                moveTo(6.59f, 4.01f)
                arcToRelative(5.06f, 5.06f, 0.0f, false, true, 4.47f, 3.26f)
                curveToRelative(-1.98f, 0.57f, -3.4f, 2.0f, -4.0f, 3.95f)
                lineToRelative(-0.06f, 0.25f)
                lineToRelative(-0.06f, 0.23f)
                lineToRelative(-0.2f, 0.04f)
                curveToRelative(-1.15f, 0.24f, -2.14f, 0.9f, -2.81f, 1.82f)
                lineToRelative(-0.16f, -0.09f)
                arcToRelative(5.06f, 5.06f, 0.0f, false, true, -1.64f, -1.51f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.37f, -1.13f)
                curveToRelative(1.64f, -0.6f, 2.53f, -1.25f, 3.03f, -2.22f)
                curveToRelative(0.55f, -1.05f, 0.66f, -2.17f, 0.29f, -3.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.77f, -0.92f)
                close()
            }
        }
        return _weatherPartlyCloudyNight!!
    }

private var _weatherPartlyCloudyNight: ImageVector? = null
