

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WeatherSnowflake: ImageVector
    get() {
        if (_weatherSnowflake != null) {
            return _weatherSnowflake!!
        }
        _weatherSnowflake = fluentIcon(name = "Regular.WeatherSnowflake") {
            fluentPath {
                moveTo(11.75f, 2.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(5.9f)
                lineToRelative(2.13f, -2.13f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.19f, 3.2f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(2.97f)
                lineToRelative(3.2f, -3.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 1.07f)
                lineTo(17.6f, 11.0f)
                horizontalLineToRelative(3.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(17.6f)
                lineToRelative(2.13f, 2.13f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-3.2f, -3.19f)
                horizontalLineTo(12.5f)
                verticalLineToRelative(2.97f)
                lineToRelative(3.2f, 3.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.07f, 1.06f)
                lineTo(12.5f, 17.6f)
                verticalLineToRelative(3.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(17.6f)
                lineToRelative(-2.13f, 2.13f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(3.19f, -3.2f)
                verticalLineTo(12.5f)
                horizontalLineTo(8.03f)
                lineToRelative(-3.2f, 3.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.07f)
                lineTo(5.9f, 12.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineTo(5.9f)
                lineTo(3.77f, 8.87f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.83f, 7.8f)
                lineTo(8.03f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.03f)
                lineToRelative(-3.2f, -3.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.07f, -1.06f)
                lineTo(11.0f, 5.9f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _weatherSnowflake!!
    }

private var _weatherSnowflake: ImageVector? = null
