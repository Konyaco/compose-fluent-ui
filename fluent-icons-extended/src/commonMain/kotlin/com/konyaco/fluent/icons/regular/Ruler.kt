

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = fluentIcon(name = "Regular.Ruler") {
            fluentPath {
                moveTo(9.25f, 2.0f)
                curveTo(8.01f, 2.0f, 7.0f, 3.0f, 7.0f, 4.25f)
                verticalLineToRelative(15.5f)
                curveTo(7.0f, 20.99f, 8.0f, 22.0f, 9.25f, 22.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineTo(4.25f)
                curveTo(17.0f, 3.01f, 16.0f, 2.0f, 14.75f, 2.0f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(8.5f, 19.0f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineTo(19.0f)
                close()
            }
        }
        return _ruler!!
    }

private var _ruler: ImageVector? = null
