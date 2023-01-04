

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TabDesktopArrowClockwise: ImageVector
    get() {
        if (_tabDesktopArrowClockwise != null) {
            return _tabDesktopArrowClockwise!!
        }
        _tabDesktopArrowClockwise = fluentIcon(name = "Filled.TabDesktopArrowClockwise") {
            fluentPath {
                moveTo(5.75f, 3.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 3.0f, 5.75f)
                verticalLineToRelative(5.35f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, true, 7.77f, -1.53f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 3.23f, 0.93f)
                verticalLineToRelative(1.9f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, -1.1f, 8.6f)
                horizontalLineToRelative(5.35f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 21.0f, 18.25f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-7.75f)
                curveTo(12.01f, 8.0f, 11.0f, 7.0f, 11.0f, 5.75f)
                lineTo(11.0f, 3.0f)
                lineTo(5.75f, 3.0f)
                close()
                moveTo(12.5f, 3.0f)
                verticalLineToRelative(2.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                lineTo(21.0f, 6.5f)
                verticalLineToRelative(-0.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 18.25f, 3.0f)
                lineTo(12.5f, 3.0f)
                close()
                moveTo(13.0f, 13.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(9.5f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.33f)
                lineToRelative(-0.02f, -0.01f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 12.5f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -2.5f, -4.87f)
                verticalLineToRelative(-0.63f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.75f)
                close()
            }
        }
        return _tabDesktopArrowClockwise!!
    }

private var _tabDesktopArrowClockwise: ImageVector? = null
