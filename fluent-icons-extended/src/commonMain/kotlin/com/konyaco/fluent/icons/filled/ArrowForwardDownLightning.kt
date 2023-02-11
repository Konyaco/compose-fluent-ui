

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowForwardDownLightning: ImageVector
    get() {
        if (_arrowForwardDownLightning != null) {
            return _arrowForwardDownLightning!!
        }
        _arrowForwardDownLightning = fluentIcon(name = "Filled.ArrowForwardDownLightning") {
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
                moveTo(16.3f, 4.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.4f)
                lineTo(19.59f, 9.0f)
                horizontalLineToRelative(-6.81f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 7.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(0.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 13.0f, 11.0f)
                horizontalLineToRelative(6.59f)
                lineToRelative(-3.3f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.42f, 1.4f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.4f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                close()
            }
        }
        return _arrowForwardDownLightning!!
    }

private var _arrowForwardDownLightning: ImageVector? = null
