

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherFog: ImageVector
    get() {
        if (_weatherFog != null) {
            return _weatherFog!!
        }
        _weatherFog = fluentIcon(name = "Filled.WeatherFog") {
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
            }
        }
        return _weatherFog!!
    }

private var _weatherFog: ImageVector? = null
