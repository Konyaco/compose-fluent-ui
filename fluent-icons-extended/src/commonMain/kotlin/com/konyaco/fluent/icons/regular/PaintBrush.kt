

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = fluentIcon(name = "Regular.PaintBrush") {
            fluentPath {
                moveTo(5.75f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                lineTo(9.5f, 16.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(19.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(5.75f, 2.0f)
                close()
                moveTo(6.5f, 11.0f)
                lineTo(6.5f, 3.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                lineTo(14.0f, 3.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                lineTo(16.5f, 3.5f)
                horizontalLineToRelative(1.0f)
                lineTo(17.5f, 11.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(6.5f, 14.25f)
                lineTo(6.5f, 12.5f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(1.75f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
