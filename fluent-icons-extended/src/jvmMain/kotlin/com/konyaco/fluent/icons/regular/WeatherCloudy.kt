

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WeatherCloudy: ImageVector
    get() {
        if (_weatherCloudy != null) {
            return _weatherCloudy!!
        }
        _weatherCloudy = fluentIcon(name = "Regular.WeatherCloudy") {
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
                moveTo(13.0f, 8.5f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, -3.88f, 3.9f)
                curveToRelative(0.0f, 0.35f, -0.31f, 0.63f, -0.68f, 0.63f)
                horizontalLineToRelative(-0.69f)
                curveToRelative(-1.26f, 0.0f, -2.28f, 1.0f, -2.28f, 2.24f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, 2.28f, 2.24f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.26f, 0.0f, 2.29f, -1.0f, 2.29f, -2.24f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, -2.29f, -2.24f)
                horizontalLineToRelative(-0.69f)
                curveToRelative(-0.36f, 0.0f, -0.68f, -0.28f, -0.68f, -0.63f)
                curveToRelative(0.0f, -2.29f, -1.8f, -3.9f, -3.88f, -3.9f)
                close()
                moveTo(10.0f, 4.0f)
                curveToRelative(1.62f, 0.0f, 3.05f, 0.82f, 3.9f, 2.06f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -2.04f, 0.03f)
                arcToRelative(3.21f, 3.21f, 0.0f, false, false, -5.03f, 2.07f)
                lineToRelative(-0.07f, 0.41f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.99f, 0.83f)
                horizontalLineToRelative(-0.49f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, false, -1.26f, 3.04f)
                curveToRelative(-0.32f, 0.4f, -0.57f, 0.85f, -0.74f, 1.34f)
                arcTo(3.28f, 3.28f, 0.0f, false, true, 5.1f, 7.9f)
                horizontalLineToRelative(0.25f)
                arcTo(4.72f, 4.72f, 0.0f, false, true, 10.0f, 4.0f)
                close()
            }
        }
        return _weatherCloudy!!
    }

private var _weatherCloudy: ImageVector? = null
