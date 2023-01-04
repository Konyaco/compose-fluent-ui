

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherDrizzle: ImageVector
    get() {
        if (_weatherDrizzle != null) {
            return _weatherDrizzle!!
        }
        _weatherDrizzle = fluentIcon(name = "Filled.WeatherDrizzle") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                curveToRelative(3.17f, 0.0f, 4.97f, 2.1f, 5.23f, 4.63f)
                horizontalLineToRelative(0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, 7.37f)
                horizontalLineToRelative(-0.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.09f, 0.17f)
                lineToRelative(-1.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.24f, -0.84f)
                lineToRelative(0.56f, -0.83f)
                horizontalLineToRelative(-2.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.09f, 0.17f)
                lineToRelative(-1.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.24f, -0.84f)
                lineToRelative(0.56f, -0.83f)
                lineTo(8.46f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.09f, 0.17f)
                lineToRelative(-1.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.24f, -0.84f)
                lineToRelative(0.56f, -0.83f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.37f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(7.13f, 18.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.24f, 0.84f)
                lineToRelative(1.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.24f, -0.84f)
                lineToRelative(-1.0f, 1.5f)
                close()
                moveTo(11.33f, 19.87f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.2f, -1.04f)
                lineToRelative(1.0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.24f, 0.84f)
                lineToRelative(-1.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.04f, 0.2f)
                close()
            }
        }
        return _weatherDrizzle!!
    }

private var _weatherDrizzle: ImageVector? = null
