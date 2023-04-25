

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
                moveTo(7.75f, 6.19f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 3.98f, -2.69f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, true, 0.02f, 8.5f)
                lineTo(3.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(8.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, -0.02f, -4.5f)
                arcTo(2.3f, 2.3f, 0.0f, false, false, 9.6f, 6.93f)
                lineToRelative(-0.17f, 0.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.86f, -0.74f)
                lineToRelative(0.18f, -0.44f)
                close()
                moveTo(15.8f, 11.69f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, true, 6.2f, 1.0f)
                verticalLineToRelative(0.06f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.16f, 0.38f, 0.25f, 0.8f, 0.25f, 1.25f)
                verticalLineToRelative(0.07f)
                arcToRelative(3.18f, 3.18f, 0.0f, false, true, -6.2f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.9f, -0.64f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, 2.3f, -0.36f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(3.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(15.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-0.07f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, -2.3f, -0.36f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.9f, -0.64f)
                close()
            }
        }
        return _weatherSqualls!!
    }

private var _weatherSqualls: ImageVector? = null
