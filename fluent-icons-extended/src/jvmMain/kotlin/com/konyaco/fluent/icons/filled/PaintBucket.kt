

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = fluentIcon(name = "Filled.PaintBucket") {
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
                moveTo(10.5f, 5.31f)
                verticalLineToRelative(1.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(12.0f, 5.31f)
                lineToRelative(4.66f, 4.66f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-0.97f, 0.97f)
                lineTo(3.8f, 12.0f)
                lineToRelative(0.03f, -0.03f)
                lineToRelative(6.66f, -6.66f)
                close()
                moveTo(19.52f, 13.61f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, false, -1.54f, 0.0f)
                lineToRelative(-2.0f, 3.76f)
                arcToRelative(3.15f, 3.15f, 0.0f, true, false, 5.55f, 0.0f)
                lineToRelative(-2.0f, -3.77f)
                close()
            }
        }
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
