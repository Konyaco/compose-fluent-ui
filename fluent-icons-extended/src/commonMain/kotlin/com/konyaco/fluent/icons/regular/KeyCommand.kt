

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.KeyCommand: ImageVector
    get() {
        if (_keyCommand != null) {
            return _keyCommand!!
        }
        _keyCommand = fluentIcon(name = "Regular.KeyCommand") {
            fluentPath {
                moveTo(6.25f, 4.5f)
                curveTo(7.22f, 4.5f, 8.0f, 5.28f, 8.0f, 6.25f)
                lineTo(8.0f, 8.0f)
                lineTo(6.25f, 8.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, -3.5f)
                close()
                moveTo(9.5f, 8.0f)
                lineTo(9.5f, 6.25f)
                arcTo(3.25f, 3.25f, 0.0f, true, false, 6.25f, 9.5f)
                lineTo(8.0f, 9.5f)
                verticalLineToRelative(5.0f)
                lineTo(6.25f, 14.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, 3.25f, 3.25f)
                lineTo(9.5f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, 3.25f, -3.25f)
                lineTo(16.0f, 14.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, -3.25f, -3.25f)
                lineTo(14.5f, 8.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(9.5f, 9.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(16.0f, 6.25f)
                arcTo(1.75f, 1.75f, 0.0f, true, true, 17.75f, 8.0f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineToRelative(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, true, true, 16.0f, 17.75f)
                lineTo(16.0f, 16.0f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, true, true, 6.25f, 16.0f)
                lineTo(8.0f, 16.0f)
                close()
            }
        }
        return _keyCommand!!
    }

private var _keyCommand: ImageVector? = null
