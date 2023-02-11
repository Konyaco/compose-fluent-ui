

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TrayItemAdd: ImageVector
    get() {
        if (_trayItemAdd != null) {
            return _trayItemAdd!!
        }
        _trayItemAdd = fluentIcon(name = "Filled.TrayItemAdd") {
            fluentPath {
                moveTo(13.75f, 2.0f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(4.0f)
                curveTo(18.44f, 7.0f, 19.0f, 6.44f, 19.0f, 5.75f)
                verticalLineToRelative(-2.5f)
                curveTo(19.0f, 2.56f, 18.44f, 2.0f, 17.75f, 2.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(16.5f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(6.69f)
                lineToRelative(-1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.22f, 1.22f)
                lineTo(16.5f, 9.25f)
                close()
                moveTo(6.25f, 13.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(3.5f, 16.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, 2.75f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 22.0f, 18.75f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                lineTo(4.75f, 20.0f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        return _trayItemAdd!!
    }

private var _trayItemAdd: ImageVector? = null
