

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherCloudy: ImageVector
    get() {
        if (_weatherCloudy != null) {
            return _weatherCloudy!!
        }
        _weatherCloudy = fluentIcon(name = "Filled.WeatherCloudy") {
            fluentPath {
                moveTo(13.0f, 7.0f)
                curveToRelative(3.17f, 0.0f, 4.97f, 2.1f, 5.23f, 4.64f)
                horizontalLineToRelative(0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, 7.36f)
                lineTo(7.69f, 19.0f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.36f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 13.0f, 7.0f)
                close()
                moveTo(10.0f, 4.0f)
                curveToRelative(1.62f, 0.0f, 3.05f, 0.82f, 3.9f, 2.06f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -0.9f, -0.05f)
                curveToRelative(-3.0f, 0.0f, -5.17f, 1.68f, -5.94f, 4.21f)
                lineToRelative(-0.06f, 0.24f)
                lineToRelative(-0.06f, 0.24f)
                lineToRelative(-0.2f, 0.04f)
                arcToRelative(4.68f, 4.68f, 0.0f, false, false, -3.46f, 3.04f)
                arcTo(3.28f, 3.28f, 0.0f, false, true, 5.1f, 7.9f)
                horizontalLineToRelative(0.25f)
                arcTo(4.72f, 4.72f, 0.0f, false, true, 10.0f, 4.0f)
                close()
            }
        }
        return _weatherCloudy!!
    }

private var _weatherCloudy: ImageVector? = null
