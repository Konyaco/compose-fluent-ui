

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DesktopCursor: ImageVector
    get() {
        if (_desktopCursor != null) {
            return _desktopCursor!!
        }
        _desktopCursor = fluentIcon(name = "Regular.DesktopCursor") {
            fluentPath {
                moveTo(6.75f, 22.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(8.5f, 20.5f)
                lineTo(8.5f, 18.0f)
                lineTo(4.25f, 18.0f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.24f, -2.1f)
                lineTo(2.0f, 15.76f)
                lineTo(2.0f, 5.25f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(4.25f, 3.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.19f, 0.0f, 2.16f, 0.93f, 2.24f, 2.1f)
                verticalLineToRelative(10.65f)
                curveToRelative(0.0f, 0.37f, -0.08f, 0.72f, -0.24f, 1.03f)
                lineTo(20.5f, 15.4f)
                lineTo(20.5f, 5.25f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.65f, -0.74f)
                lineToRelative(-0.1f, -0.01f)
                lineTo(4.25f, 4.5f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.65f, 0.75f)
                lineTo(14.0f, 16.5f)
                lineTo(14.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 22.0f)
                lineTo(6.75f, 22.0f)
                close()
                moveTo(15.49f, 12.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.82f, 0.2f)
                lineToRelative(6.37f, 7.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, 1.23f)
                lineToRelative(-3.54f, -0.88f)
                lineToRelative(-2.03f, 3.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.37f, -0.42f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.31f, 0.2f, -0.59f, 0.49f, -0.7f)
                close()
            }
        }
        return _desktopCursor!!
    }

private var _desktopCursor: ImageVector? = null
