

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DrawerAdd: ImageVector
    get() {
        if (_drawerAdd != null) {
            return _drawerAdd!!
        }
        _drawerAdd = fluentIcon(name = "Regular.DrawerAdd") {
            fluentPath {
                moveTo(22.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(17.0f, 7.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(16.0f, 6.0f)
                lineTo(16.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                lineTo(17.0f, 6.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(21.0f, 11.19f)
                curveToRelative(-0.44f, 0.43f, -0.95f, 0.8f, -1.5f, 1.08f)
                lineTo(19.5f, 14.0f)
                horizontalLineToRelative(-4.56f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.69f, 0.7f)
                verticalLineToRelative(0.05f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -4.5f, 0.0f)
                verticalLineToRelative(-0.06f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.7f, -0.69f)
                lineTo(4.5f, 14.0f)
                lineTo(4.5f, 9.5f)
                horizontalLineToRelative(6.23f)
                arcToRelative(6.46f, 6.46f, 0.0f, false, true, -0.56f, -1.5f)
                lineTo(4.5f, 8.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(3.83f)
                curveToRelative(0.08f, -0.52f, 0.22f, -1.03f, 0.42f, -1.5f)
                lineTo(6.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 7.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 20.55f, 4.46f, 22.0f, 6.25f, 22.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-7.56f)
                close()
                moveTo(19.5f, 15.5f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(6.25f, 20.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(4.5f, 15.5f)
                horizontalLineToRelative(3.83f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 7.35f, 0.0f)
                horizontalLineToRelative(3.82f)
                close()
            }
        }
        return _drawerAdd!!
    }

private var _drawerAdd: ImageVector? = null
