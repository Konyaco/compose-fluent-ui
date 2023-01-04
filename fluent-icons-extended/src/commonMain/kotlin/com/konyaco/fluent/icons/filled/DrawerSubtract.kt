

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DrawerSubtract: ImageVector
    get() {
        if (_drawerSubtract != null) {
            return _drawerSubtract!!
        }
        _drawerSubtract = fluentIcon(name = "Filled.DrawerSubtract") {
            fluentPath {
                moveTo(22.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(13.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(6.25f, 4.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(-0.2f, 0.47f, -0.34f, 0.98f, -0.42f, 1.5f)
                lineTo(6.25f, 5.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(4.5f, 8.0f)
                horizontalLineToRelative(5.67f)
                curveToRelative(0.13f, 0.53f, 0.32f, 1.03f, 0.56f, 1.5f)
                lineTo(4.5f, 9.5f)
                lineTo(4.5f, 14.0f)
                horizontalLineToRelative(4.56f)
                curveToRelative(0.38f, 0.0f, 0.69f, 0.31f, 0.69f, 0.7f)
                verticalLineToRelative(0.05f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 4.5f, 0.0f)
                verticalLineToRelative(-0.06f)
                curveToRelative(0.0f, -0.38f, 0.31f, -0.69f, 0.7f, -0.69f)
                horizontalLineToRelative(4.55f)
                verticalLineToRelative(-1.73f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, 1.5f, -1.08f)
                verticalLineToRelative(7.56f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 22.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 18.75f)
                lineTo(3.0f, 7.25f)
                curveTo(3.0f, 5.45f, 4.46f, 4.0f, 6.25f, 4.0f)
                close()
            }
        }
        return _drawerSubtract!!
    }

private var _drawerSubtract: ImageVector? = null
