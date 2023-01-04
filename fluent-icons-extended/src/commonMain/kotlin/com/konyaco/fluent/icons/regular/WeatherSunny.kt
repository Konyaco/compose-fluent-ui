

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WeatherSunny: ImageVector
    get() {
        if (_weatherSunny != null) {
            return _weatherSunny!!
        }
        _weatherSunny = fluentIcon(name = "Regular.WeatherSunny") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
                close()
                moveTo(12.0f, 15.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 7.0f)
                close()
                moveTo(21.25f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(4.25f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(4.22f, 4.22f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(5.28f, 19.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(19.78f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.77f, 0.0f, -1.06f)
                close()
                moveTo(18.72f, 19.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.5f, 1.5f)
                close()
            }
        }
        return _weatherSunny!!
    }

private var _weatherSunny: ImageVector? = null
