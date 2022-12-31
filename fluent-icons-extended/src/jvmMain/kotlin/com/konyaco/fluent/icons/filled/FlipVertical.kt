

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) {
            return _flipVertical!!
        }
        _flipVertical = fluentIcon(name = "Filled.FlipVertical") {
            fluentPath {
                moveTo(19.55f, 2.16f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 3.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.4f, -1.92f)
                lineToRelative(16.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.95f, 0.08f)
                close()
                moveTo(7.78f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.53f)
                lineTo(7.78f, 9.0f)
                close()
                moveTo(20.0f, 21.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.71f, 0.45f)
                lineToRelative(-17.0f, -8.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.5f, 13.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
