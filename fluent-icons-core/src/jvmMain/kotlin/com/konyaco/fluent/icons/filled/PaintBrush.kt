

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = fluentIcon(name = "Filled.PaintBrush") {
            fluentPath {
                moveTo(12.5f, 2.0f)
                verticalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(6.75f)
                close()
                moveTo(5.0f, 12.5f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(2.75f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineTo(12.5f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
