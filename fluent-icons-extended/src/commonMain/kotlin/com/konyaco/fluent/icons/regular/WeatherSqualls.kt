

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WeatherSqualls: ImageVector
    get() {
        if (_weatherSqualls != null) {
            return _weatherSqualls!!
        }
        _weatherSqualls = fluentIcon(name = "Regular.WeatherSqualls") {
            fluentPath {
                moveTo(19.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.17f, 6.0f)
                lineTo(17.7f, 16.0f)
                curveToRelative(0.2f, 0.38f, 0.3f, 0.8f, 0.3f, 1.25f)
                arcTo(2.68f, 2.68f, 0.0f, false, true, 15.32f, 20.0f)
                curveToRelative(-1.5f, 0.0f, -2.41f, -0.89f, -2.66f, -2.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.47f, -0.3f)
                curveToRelative(0.12f, 0.56f, 0.46f, 0.9f, 1.2f, 0.9f)
                curveToRelative(0.67f, 0.0f, 1.17f, -0.54f, 1.17f, -1.26f)
                curveToRelative(0.0f, -0.69f, -0.57f, -1.25f, -1.27f, -1.25f)
                lineTo(2.73f, 15.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.49f)
                horizontalLineToRelative(12.5f)
                lineToRelative(0.1f, -0.01f)
                horizontalLineToRelative(3.91f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.63f, -1.73f)
                lineToRelative(-0.02f, 0.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.49f, -0.2f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 10.0f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(2.76f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(12.0f, 10.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 9.5f, 8.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.22f, 4.0f)
                lineTo(2.76f, 12.0f)
                lineTo(12.0f, 12.0f)
                close()
            }
        }
        return _weatherSqualls!!
    }

private var _weatherSqualls: ImageVector? = null
