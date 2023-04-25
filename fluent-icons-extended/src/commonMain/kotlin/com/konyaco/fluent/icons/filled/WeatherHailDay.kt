

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherHailDay: ImageVector
    get() {
        if (_weatherHailDay != null) {
            return _weatherHailDay!!
        }
        _weatherHailDay = fluentIcon(name = "Filled.WeatherHailDay") {
            fluentPath {
                moveTo(13.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(9.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(16.5f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(13.0f, 6.0f)
                curveToRelative(3.17f, 0.0f, 4.97f, 2.1f, 5.23f, 4.64f)
                horizontalLineToRelative(0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, 7.36f)
                lineTo(7.69f, 18.0f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.36f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 13.0f, 6.0f)
                close()
                moveTo(4.37f, 10.16f)
                curveToRelative(0.14f, 0.36f, 0.0f, 0.75f, -0.32f, 0.94f)
                lineToRelative(-0.09f, 0.04f)
                lineToRelative(-0.92f, 0.39f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.67f, -1.34f)
                lineToRelative(0.1f, -0.05f)
                lineToRelative(0.92f, -0.38f)
                curveToRelative(0.38f, -0.16f, 0.82f, 0.02f, 0.98f, 0.4f)
                close()
                moveTo(10.85f, 5.33f)
                lineTo(10.68f, 5.39f)
                curveToRelative(-1.78f, 0.63f, -3.06f, 2.0f, -3.61f, 3.82f)
                lineTo(7.0f, 9.46f)
                lineToRelative(-0.06f, 0.24f)
                lineToRelative(-0.2f, 0.04f)
                curveToRelative(-0.62f, 0.13f, -1.18f, 0.37f, -1.68f, 0.71f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 5.8f, -5.12f)
                close()
                moveTo(2.95f, 5.36f)
                lineTo(3.05f, 5.4f)
                lineTo(3.97f, 5.78f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.5f, 7.2f)
                lineToRelative(-0.1f, -0.03f)
                lineToRelative(-0.93f, -0.39f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.47f, -1.42f)
                close()
                moveTo(6.75f, 2.38f)
                lineTo(6.8f, 2.47f)
                lineTo(7.18f, 3.39f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.34f, 0.67f)
                lineToRelative(-0.04f, -0.1f)
                lineToRelative(-0.38f, -0.92f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.34f, -0.66f)
                close()
                moveTo(11.11f, 2.06f)
                curveToRelative(0.35f, 0.14f, 0.53f, 0.52f, 0.44f, 0.87f)
                lineToRelative(-0.03f, 0.1f)
                lineToRelative(-0.39f, 0.93f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.42f, -0.47f)
                lineToRelative(0.04f, -0.1f)
                lineToRelative(0.38f, -0.93f)
                curveToRelative(0.16f, -0.38f, 0.6f, -0.56f, 0.98f, -0.4f)
                close()
            }
        }
        return _weatherHailDay!!
    }

private var _weatherHailDay: ImageVector? = null
