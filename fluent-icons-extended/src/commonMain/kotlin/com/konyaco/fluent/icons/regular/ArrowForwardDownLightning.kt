

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowForwardDownLightning: ImageVector
    get() {
        if (_arrowForwardDownLightning != null) {
            return _arrowForwardDownLightning!!
        }
        _arrowForwardDownLightning = fluentIcon(name = "Regular.ArrowForwardDownLightning") {
            fluentPath {
                moveTo(13.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(8.53f, 13.0f)
                lineTo(7.1f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.47f, 0.32f)
                lineToRelative(-1.13f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.47f, 0.68f)
                horizontalLineToRelative(0.78f)
                lineToRelative(-0.77f, 2.32f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.92f, 0.44f)
                lineToRelative(2.63f, -4.03f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, -0.4f, -0.73f)
                lineTo(8.5f, 15.0f)
                lineToRelative(0.5f, -1.32f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.47f, -0.68f)
                close()
                moveTo(16.63f, 6.54f)
                lineTo(19.59f, 9.5f)
                horizontalLineToRelative(-5.92f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, true, -6.02f, -6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.5f, 0.0f)
                verticalLineToRelative(0.25f)
                arcTo(7.75f, 7.75f, 0.0f, false, false, 13.9f, 11.0f)
                horizontalLineToRelative(5.69f)
                lineToRelative(-2.97f, 2.96f)
                lineToRelative(-0.07f, 0.09f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.13f, 0.97f)
                lineToRelative(4.25f, -4.24f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.22f, -0.3f, 0.2f, -0.71f, -0.07f, -0.98f)
                lineToRelative(-4.25f, -4.24f)
                lineToRelative(-0.08f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 1.14f)
                close()
            }
        }
        return _arrowForwardDownLightning!!
    }

private var _arrowForwardDownLightning: ImageVector? = null
