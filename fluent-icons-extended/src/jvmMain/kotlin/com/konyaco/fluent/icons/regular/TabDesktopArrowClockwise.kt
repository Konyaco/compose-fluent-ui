

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TabDesktopArrowClockwise: ImageVector
    get() {
        if (_tabDesktopArrowClockwise != null) {
            return _tabDesktopArrowClockwise!!
        }
        _tabDesktopArrowClockwise = fluentIcon(name = "Regular.TabDesktopArrowClockwise") {
            fluentPath {
                moveTo(5.75f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 5.75f)
                verticalLineToRelative(5.35f)
                curveToRelative(0.44f, -0.45f, 0.95f, -0.84f, 1.5f, -1.16f)
                lineTo(4.5f, 5.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                lineTo(11.0f, 4.5f)
                verticalLineToRelative(1.25f)
                curveTo(11.0f, 6.99f, 12.0f, 8.0f, 13.25f, 8.0f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(10.25f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-4.19f)
                arcTo(7.03f, 7.03f, 0.0f, false, true, 12.9f, 21.0f)
                horizontalLineToRelative(5.35f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 21.0f, 18.25f)
                lineTo(21.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.25f, 3.0f)
                lineTo(5.75f, 3.0f)
                close()
                moveTo(19.5f, 6.5f)
                horizontalLineToRelative(-6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(12.5f, 4.5f)
                horizontalLineToRelative(5.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(0.75f)
                close()
                moveTo(12.25f, 9.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.75f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(9.5f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.33f)
                lineToRelative(-0.02f, -0.01f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 12.5f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -2.5f, -4.87f)
                verticalLineToRelative(-0.63f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _tabDesktopArrowClockwise!!
    }

private var _tabDesktopArrowClockwise: ImageVector? = null
