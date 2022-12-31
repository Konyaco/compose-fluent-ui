

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherSqualls: ImageVector
    get() {
        if (_weatherSqualls != null) {
            return _weatherSqualls!!
        }
        _weatherSqualls = fluentIcon(name = "Filled.WeatherSqualls") {
            fluentPath {
                moveTo(18.75f, 9.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.18f, 6.49f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.11f, 0.01f)
                horizontalLineToRelative(-0.8f)
                curveToRelative(0.12f, 0.31f, 0.18f, 0.65f, 0.18f, 1.0f)
                curveToRelative(0.0f, 1.66f, -1.26f, 3.0f, -2.93f, 3.0f)
                curveToRelative(-1.3f, 0.0f, -2.23f, -0.63f, -2.69f, -1.63f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.77f, -0.93f)
                lineToRelative(0.1f, 0.2f)
                curveToRelative(0.14f, 0.23f, 0.37f, 0.36f, 0.82f, 0.36f)
                curveToRelative(0.53f, 0.0f, 0.93f, -0.42f, 0.93f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.9f, -1.0f)
                lineTo(3.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineToRelative(15.87f)
                lineToRelative(0.13f, -0.01f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -1.26f, -1.8f)
                lineToRelative(-0.1f, 0.23f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.83f, -0.8f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.06f, -2.13f)
                close()
                moveTo(11.75f, 12.0f)
                lineTo(3.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineToRelative(8.87f)
                arcTo(2.25f, 2.25f, 0.0f, true, false, 9.5f, 7.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, true, 4.48f, 4.24f)
                lineToRelative(-0.23f, 0.01f)
                lineTo(3.0f, 12.0f)
                horizontalLineToRelative(8.75f)
                close()
            }
        }
        return _weatherSqualls!!
    }

private var _weatherSqualls: ImageVector? = null
