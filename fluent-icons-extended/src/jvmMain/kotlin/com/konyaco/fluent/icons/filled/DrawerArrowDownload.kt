

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DrawerArrowDownload: ImageVector
    get() {
        if (_drawerArrowDownload != null) {
            return _drawerArrowDownload!!
        }
        _drawerArrowDownload = fluentIcon(name = "Filled.DrawerArrowDownload") {
            fluentPath {
                moveTo(11.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.0f, -5.48f)
                lineTo(16.0f, 6.8f)
                lineToRelative(-1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineTo(17.0f, 6.79f)
                lineTo(17.0f, 1.02f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -6.0f, 5.48f)
                close()
                moveTo(19.5f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 19.0f, 9.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(6.25f, 4.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(-0.2f, 0.48f, -0.34f, 0.98f, -0.42f, 1.5f)
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
        return _drawerArrowDownload!!
    }

private var _drawerArrowDownload: ImageVector? = null
