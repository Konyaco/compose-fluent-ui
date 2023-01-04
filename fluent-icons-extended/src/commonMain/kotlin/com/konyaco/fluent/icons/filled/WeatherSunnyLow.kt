

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherSunnyLow: ImageVector
    get() {
        if (_weatherSunnyLow != null) {
            return _weatherSunnyLow!!
        }
        _weatherSunnyLow = fluentIcon(name = "Filled.WeatherSunnyLow") {
            fluentPath {
                moveTo(12.75f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(19.03f, 4.97f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-1.06f, 1.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(6.59f, 13.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 10.82f, 0.0f)
                horizontalLineToRelative(3.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.84f)
                close()
                moveTo(6.75f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(6.75f, 16.0f)
                close()
                moveTo(10.75f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(4.97f, 4.97f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(1.06f, 1.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(4.97f, 6.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
            }
        }
        return _weatherSunnyLow!!
    }

private var _weatherSunnyLow: ImageVector? = null
