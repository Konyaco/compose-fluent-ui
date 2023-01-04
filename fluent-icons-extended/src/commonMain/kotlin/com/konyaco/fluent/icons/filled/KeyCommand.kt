

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.KeyCommand: ImageVector
    get() {
        if (_keyCommand != null) {
            return _keyCommand!!
        }
        _keyCommand = fluentIcon(name = "Filled.KeyCommand") {
            fluentPath {
                moveTo(6.5f, 5.0f)
                curveTo(7.33f, 5.0f, 8.0f, 5.67f, 8.0f, 6.5f)
                lineTo(8.0f, 8.0f)
                lineTo(6.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(10.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 6.5f, 10.0f)
                lineTo(8.0f, 10.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.5f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 3.5f, 3.5f)
                lineTo(10.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 3.5f, -3.5f)
                lineTo(16.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 14.0f, 6.5f)
                lineTo(14.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(16.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 17.5f, 8.0f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.5f, 1.5f)
                lineTo(16.0f, 16.0f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 6.5f, 16.0f)
                lineTo(8.0f, 16.0f)
                close()
            }
        }
        return _keyCommand!!
    }

private var _keyCommand: ImageVector? = null
