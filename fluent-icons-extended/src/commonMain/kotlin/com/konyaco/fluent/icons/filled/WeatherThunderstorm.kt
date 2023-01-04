

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WeatherThunderstorm: ImageVector
    get() {
        if (_weatherThunderstorm != null) {
            return _weatherThunderstorm!!
        }
        _weatherThunderstorm = fluentIcon(name = "Filled.WeatherThunderstorm") {
            fluentPath {
                moveTo(13.76f, 13.2f)
                curveToRelative(0.3f, 0.28f, 0.33f, 0.75f, 0.06f, 1.06f)
                lineTo(12.7f, 15.5f)
                horizontalLineToRelative(2.28f)
                curveToRelative(0.63f, 0.0f, 0.98f, 0.73f, 0.59f, 1.22f)
                lineToRelative(-3.21f, 4.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.18f, -0.94f)
                lineTo(13.42f, 17.0f)
                horizontalLineToRelative(-2.4f)
                curveToRelative(-0.65f, 0.0f, -0.99f, -0.77f, -0.56f, -1.25f)
                lineToRelative(2.24f, -2.49f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -0.06f)
                close()
                moveTo(13.0f, 5.0f)
                curveToRelative(3.17f, 0.0f, 4.97f, 2.1f, 5.23f, 4.64f)
                horizontalLineToRelative(0.08f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, 7.36f)
                horizontalLineToRelative(-1.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.58f, -2.5f)
                horizontalLineToRelative(-0.13f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -2.9f, -1.9f)
                lineToRelative(-2.23f, 2.48f)
                arcTo(1.73f, 1.73f, 0.0f, false, false, 9.44f, 17.0f)
                lineTo(7.7f, 17.0f)
                arcToRelative(3.69f, 3.69f, 0.0f, true, true, 0.0f, -7.36f)
                horizontalLineToRelative(0.08f)
                arcTo(4.95f, 4.95f, 0.0f, false, true, 13.0f, 5.0f)
                close()
                moveTo(10.0f, 2.0f)
                curveToRelative(1.62f, 0.0f, 3.05f, 0.82f, 3.9f, 2.06f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -0.9f, -0.05f)
                curveToRelative(-3.0f, 0.0f, -5.17f, 1.68f, -5.94f, 4.21f)
                lineTo(7.0f, 8.46f)
                lineToRelative(-0.06f, 0.24f)
                lineToRelative(-0.2f, 0.04f)
                arcToRelative(4.68f, 4.68f, 0.0f, false, false, -3.46f, 3.04f)
                arcTo(3.28f, 3.28f, 0.0f, false, true, 5.1f, 5.9f)
                horizontalLineToRelative(0.25f)
                arcTo(4.72f, 4.72f, 0.0f, false, true, 10.0f, 2.0f)
                close()
            }
        }
        return _weatherThunderstorm!!
    }

private var _weatherThunderstorm: ImageVector? = null
