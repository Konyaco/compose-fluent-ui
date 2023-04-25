

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherSnowflake: ImageVector
    get() {
        if (_weatherSnowflake != null) {
            return _weatherSnowflake!!
        }
        _weatherSnowflake = fluentIcon(name = "Filled.WeatherSnowflake") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.55f)
                lineToRelative(1.7f, -1.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.42f, 1.4f)
                lineTo(13.0f, 8.39f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(2.62f)
                lineToRelative(3.12f, -3.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.42f, 1.41f)
                lineTo(18.45f, 11.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(1.7f, 1.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 1.42f)
                lineTo(15.61f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(2.62f)
                lineToRelative(3.12f, 3.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.41f, 1.42f)
                lineTo(13.0f, 18.45f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.55f)
                lineToRelative(-1.7f, 1.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, -1.4f)
                lineTo(11.0f, 15.61f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.38f)
                lineToRelative(-3.12f, 3.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, -1.41f)
                lineTo(5.55f, 13.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.55f)
                lineToRelative(-1.7f, -1.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, -1.42f)
                lineTo(8.39f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.38f)
                lineTo(7.88f, 5.26f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, -1.42f)
                lineTo(11.0f, 5.55f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        return _weatherSnowflake!!
    }

private var _weatherSnowflake: ImageVector? = null
