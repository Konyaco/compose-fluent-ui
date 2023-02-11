

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DualScreenLock: ImageVector
    get() {
        if (_dualScreenLock != null) {
            return _dualScreenLock!!
        }
        _dualScreenLock = fluentIcon(name = "Regular.DualScreenLock") {
            fluentPath {
                moveTo(17.0f, 5.0f)
                lineTo(17.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 5.0f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(18.5f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.5f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                close()
                moveTo(20.5f, 8.9f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 0.2f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 0.0f, -0.2f)
                close()
                moveTo(7.74f, 17.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(12.74f, 6.0f)
                horizontalLineToRelative(1.3f)
                curveToRelative(-0.02f, 0.16f, -0.04f, 0.33f, -0.04f, 0.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.13f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                lineTo(20.5f, 14.0f)
                lineTo(22.0f, 14.0f)
                verticalLineToRelative(6.25f)
                curveToRelative(0.0f, 0.96f, -0.79f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 22.0f)
                curveTo(2.78f, 22.0f, 2.0f, 21.2f, 2.0f, 20.25f)
                lineTo(2.0f, 7.75f)
                curveTo(2.0f, 6.78f, 2.78f, 6.0f, 3.75f, 6.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(11.24f, 7.5f)
                lineTo(3.76f, 7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.13f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(14.74f, 17.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(0.1f)
                close()
            }
        }
        return _dualScreenLock!!
    }

private var _dualScreenLock: ImageVector? = null
