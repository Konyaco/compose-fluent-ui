

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) {
            return _flipVertical!!
        }
        _flipVertical = fluentIcon(name = "Regular.FlipVertical") {
            fluentPath {
                moveTo(19.66f, 2.12f)
                curveToRelative(0.21f, 0.14f, 0.34f, 0.38f, 0.34f, 0.63f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.31f, -1.43f)
                lineToRelative(16.5f, -7.5f)
                curveToRelative(0.23f, -0.1f, 0.5f, -0.09f, 0.72f, 0.05f)
                close()
                moveTo(6.2f, 9.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(3.91f)
                lineTo(6.21f, 9.5f)
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
