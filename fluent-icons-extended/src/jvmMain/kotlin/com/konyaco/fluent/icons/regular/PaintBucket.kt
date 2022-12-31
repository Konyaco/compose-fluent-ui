

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = fluentIcon(name = "Regular.PaintBucket") {
            fluentPath {
                moveTo(12.0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                lineTo(10.5f, 3.5f)
                curveToRelative(-0.3f, 0.1f, -0.6f, 0.28f, -0.84f, 0.53f)
                lineToRelative(-6.88f, 6.88f)
                curveToRelative(-0.88f, 0.88f, -0.88f, 2.3f, 0.0f, 3.18f)
                lineToRelative(4.88f, 4.88f)
                curveToRelative(0.88f, 0.88f, 2.3f, 0.88f, 3.18f, 0.0f)
                lineToRelative(6.88f, -6.88f)
                curveToRelative(0.88f, -0.88f, 0.88f, -2.3f, 0.0f, -3.18f)
                lineToRelative(-4.88f, -4.88f)
                arcTo(2.24f, 2.24f, 0.0f, false, false, 12.0f, 3.5f)
                lineTo(12.0f, 2.25f)
                close()
                moveTo(3.84f, 11.97f)
                lineToRelative(6.66f, -6.66f)
                verticalLineToRelative(1.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(12.0f, 5.31f)
                lineToRelative(4.66f, 4.66f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-0.97f, 0.97f)
                lineTo(3.8f, 12.0f)
                lineToRelative(0.03f, -0.03f)
                close()
                moveTo(4.31f, 13.5f)
                horizontalLineToRelative(9.88f)
                lineToRelative(-4.41f, 4.4f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-4.4f, -4.4f)
                close()
                moveTo(19.52f, 13.6f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, false, -1.54f, 0.0f)
                lineToRelative(-2.0f, 3.77f)
                arcToRelative(3.15f, 3.15f, 0.0f, true, false, 5.55f, 0.0f)
                lineToRelative(-2.0f, -3.77f)
                close()
                moveTo(17.29f, 18.07f)
                lineToRelative(1.46f, -2.73f)
                lineToRelative(1.46f, 2.73f)
                arcToRelative(1.65f, 1.65f, 0.0f, true, true, -2.92f, 0.0f)
                close()
            }
        }
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
