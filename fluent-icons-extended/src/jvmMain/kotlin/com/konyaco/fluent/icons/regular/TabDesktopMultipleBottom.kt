

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TabDesktopMultipleBottom: ImageVector
    get() {
        if (_tabDesktopMultipleBottom != null) {
            return _tabDesktopMultipleBottom!!
        }
        _tabDesktopMultipleBottom = fluentIcon(name = "Regular.TabDesktopMultipleBottom") {
            fluentPath {
                moveTo(6.0f, 5.0f)
                horizontalLineToRelative(1.52f)
                curveToRelative(0.12f, -0.85f, 0.85f, -1.5f, 1.73f, -1.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.88f, -0.65f, 1.61f, -1.5f, 1.73f)
                lineTo(19.0f, 18.0f)
                curveToRelative(1.68f, -0.13f, 3.0f, -1.53f, 3.0f, -3.24f)
                verticalLineToRelative(-8.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 17.25f, 2.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.24f, 3.0f)
                close()
                moveTo(2.0f, 9.25f)
                curveTo(2.0f, 7.45f, 3.46f, 6.0f, 5.25f, 6.0f)
                horizontalLineToRelative(9.5f)
                curveTo(16.55f, 6.0f, 18.0f, 7.46f, 18.0f, 9.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.8f, -1.45f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-9.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 18.75f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(5.25f, 7.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(7.25f)
                horizontalLineToRelative(5.75f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(3.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(10.0f, 20.5f)
                verticalLineToRelative(-1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(3.5f, 18.0f)
                verticalLineToRelative(0.75f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                lineTo(10.0f, 20.5f)
                close()
            }
        }
        return _tabDesktopMultipleBottom!!
    }

private var _tabDesktopMultipleBottom: ImageVector? = null
