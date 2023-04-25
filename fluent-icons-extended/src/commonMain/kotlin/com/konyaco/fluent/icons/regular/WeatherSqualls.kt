

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.WeatherSqualls: ImageVector
    get() {
        if (_weatherSqualls != null) {
            return _weatherSqualls!!
        }
        _weatherSqualls = fluentIcon(name = "Regular.WeatherSqualls") {
            fluentPath {
                moveTo(8.08f, 6.88f)
                arcTo(4.07f, 4.07f, 0.0f, false, true, 11.98f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.03f, 8.0f)
                lineTo(2.74f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(12.0f, 10.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -0.03f, -5.0f)
                curveToRelative(-1.13f, 0.0f, -2.13f, 0.74f, -2.46f, 1.82f)
                lineToRelative(-0.04f, 0.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.44f, -0.44f)
                lineToRelative(0.05f, -0.15f)
                close()
                moveTo(16.28f, 12.01f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, true, 5.71f, 0.92f)
                lineTo(21.99f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.99f, 3.0f)
                horizontalLineToRelative(-1.3f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.45f, 4.0f)
                horizontalLineToRelative(-0.13f)
                curveToRelative(-0.97f, 0.0f, -1.86f, -0.55f, -2.29f, -1.41f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.34f, -0.67f)
                curveToRelative(0.18f, 0.35f, 0.55f, 0.58f, 0.95f, 0.58f)
                horizontalLineToRelative(0.13f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                lineTo(2.75f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(19.0f, 14.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.07f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, false, -2.79f, -0.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.42f, -0.48f)
                close()
            }
        }
        return _weatherSqualls!!
    }

private var _weatherSqualls: ImageVector? = null
