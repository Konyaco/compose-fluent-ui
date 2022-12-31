

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WeatherSnow: ImageVector
    get() {
        if (_weatherSnow != null) {
            return _weatherSnow!!
        }
        _weatherSnow = fluentIcon(name = "Regular.WeatherSnow") {
            fluentPath {
                moveTo(9.75f, 18.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(14.25f, 18.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(7.5f, 17.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(12.0f, 17.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(16.5f, 17.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(3.17f, 0.0f, 4.97f, 2.1f, 5.23f, 4.63f)
                horizontalLineToRelative(0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, 7.37f)
                lineTo(6.69f, 16.0f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.37f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 5.5f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, false, -3.88f, 3.89f)
                curveToRelative(0.0f, 0.36f, -0.32f, 0.64f, -0.68f, 0.64f)
                horizontalLineToRelative(-0.7f)
                curveToRelative(-1.25f, 0.0f, -2.27f, 1.0f, -2.27f, 2.23f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, 2.28f, 2.24f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.26f, 0.0f, 2.28f, -1.0f, 2.28f, -2.24f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, -2.28f, -2.23f)
                horizontalLineToRelative(-0.69f)
                curveToRelative(-0.36f, 0.0f, -0.68f, -0.28f, -0.68f, -0.64f)
                curveToRelative(0.0f, -2.29f, -1.8f, -3.9f, -3.88f, -3.9f)
                close()
            }
        }
        return _weatherSnow!!
    }

private var _weatherSnow: ImageVector? = null
