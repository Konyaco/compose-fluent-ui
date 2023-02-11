

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WeatherFog: ImageVector
    get() {
        if (_weatherFog != null) {
            return _weatherFog!!
        }
        _weatherFog = fluentIcon(name = "Regular.WeatherFog") {
            fluentPath {
                moveTo(7.74f, 19.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-8.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(8.6f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(4.75f, 16.52f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(4.75f, 18.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(3.17f, 0.0f, 4.97f, 2.1f, 5.23f, 4.64f)
                horizontalLineToRelative(0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, 7.36f)
                lineTo(6.69f, 15.0f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.36f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 4.5f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, -3.88f, 3.9f)
                curveToRelative(0.0f, 0.35f, -0.32f, 0.63f, -0.68f, 0.63f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-1.25f, 0.0f, -2.27f, 1.0f, -2.27f, 2.24f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, 2.28f, 2.23f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.26f, 0.0f, 2.28f, -1.0f, 2.28f, -2.23f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, -2.28f, -2.24f)
                horizontalLineToRelative(-0.69f)
                curveToRelative(-0.36f, 0.0f, -0.68f, -0.28f, -0.68f, -0.64f)
                curveToRelative(0.0f, -2.28f, -1.8f, -3.89f, -3.88f, -3.89f)
                close()
            }
        }
        return _weatherFog!!
    }

private var _weatherFog: ImageVector? = null
