

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ResizeImage: ImageVector
    get() {
        if (_resizeImage != null) {
            return _resizeImage!!
        }
        _resizeImage = fluentIcon(name = "Filled.ResizeImage") {
            fluentPath {
                moveTo(11.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(5.25f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                lineTo(2.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(4.0f, 5.25f)
                curveTo(4.0f, 4.56f, 4.56f, 4.0f, 5.25f, 4.0f)
                lineTo(10.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(14.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(4.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                lineTo(20.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(22.0f, 5.25f)
                curveTo(22.0f, 3.45f, 20.54f, 2.0f, 18.75f, 2.0f)
                lineTo(14.0f, 2.0f)
                close()
                moveTo(14.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(4.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                lineTo(20.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(4.75f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(14.0f, 22.0f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.56f, 0.15f, 1.08f, 0.42f, 1.52f)
                lineToRelative(3.49f, -3.49f)
                curveToRelative(0.88f, -0.88f, 2.3f, -0.88f, 3.18f, 0.0f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.26f, -0.45f, 0.41f, -0.97f, 0.41f, -1.53f)
                verticalLineToRelative(-5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(4.0f, 23.0f)
                curveToRelative(-0.56f, 0.0f, -1.08f, -0.15f, -1.52f, -0.42f)
                lineToRelative(3.49f, -3.49f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(-0.45f, 0.26f, -0.97f, 0.41f, -1.53f, 0.41f)
                lineTo(4.0f, 23.0f)
                close()
                moveTo(9.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        return _resizeImage!!
    }

private var _resizeImage: ImageVector? = null
