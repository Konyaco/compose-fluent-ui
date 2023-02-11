

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = fluentIcon(name = "Filled.Flashlight") {
            fluentPath {
                moveTo(16.75f, 1.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 16.0f, 3.0f)
                lineTo(16.0f, 2.0f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(20.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(8.25f, 6.31f)
                lineTo(8.25f, 9.2f)
                lineToRelative(6.56f, 6.56f)
                horizontalLineToRelative(2.88f)
                lineTo(8.25f, 6.31f)
                close()
                moveTo(19.06f, 15.0f)
                lineToRelative(1.41f, -1.4f)
                curveToRelative(0.88f, -0.89f, 0.88f, -2.31f, 0.0f, -3.2f)
                lineToRelative(-6.88f, -6.87f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -3.18f, 0.0f)
                lineTo(9.0f, 4.93f)
                lineTo(19.06f, 15.0f)
                close()
                moveTo(13.0f, 16.06f)
                lineTo(7.94f, 11.0f)
                lineToRelative(-4.91f, 4.9f)
                curveToRelative(-0.88f, 0.89f, -0.88f, 2.31f, 0.0f, 3.2f)
                lineToRelative(1.88f, 1.87f)
                curveToRelative(0.88f, 0.88f, 2.3f, 0.88f, 3.18f, 0.0f)
                lineToRelative(4.91f, -4.9f)
                close()
                moveTo(9.53f, 14.47f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
                moveTo(22.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 22.0f, 8.0f)
                close()
            }
        }
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
