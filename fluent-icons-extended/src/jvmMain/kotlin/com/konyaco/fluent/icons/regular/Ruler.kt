

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
                moveTo(17.0f, 3.75f)
                curveTo(17.0f, 2.78f, 16.22f, 2.0f, 15.25f, 2.0f)
                horizontalLineToRelative(-6.5f)
                curveTo(7.78f, 2.0f, 7.0f, 2.78f, 7.0f, 3.75f)
                verticalLineToRelative(11.49f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.0f, 0.02f)
                verticalLineToRelative(4.99f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineTo(3.75f)
                close()
                moveTo(8.5f, 16.0f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(3.75f)
                curveToRelative(0.0f, -0.14f, 0.11f, -0.25f, 0.25f, -0.25f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, 0.11f, 0.25f, 0.25f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.14f, -0.1f, 0.25f, -0.25f, 0.25f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(16.0f)
                close()
            }
        }
        return _ruler!!
    }

private var _ruler: ImageVector? = null
