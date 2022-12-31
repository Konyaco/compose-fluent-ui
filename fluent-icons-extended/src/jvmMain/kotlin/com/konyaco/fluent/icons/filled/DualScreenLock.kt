

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DualScreenLock: ImageVector
    get() {
        if (_dualScreenLock != null) {
            return _dualScreenLock!!
        }
        _dualScreenLock = fluentIcon(name = "Filled.DualScreenLock") {
            fluentPath {
                moveTo(17.0f, 5.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 6.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(22.0f, 5.0f)
                lineTo(22.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.5f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.5f, 4.0f)
                close()
                moveTo(20.5f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineToRelative(1.05f)
                curveToRelative(-0.03f, 0.16f, -0.05f, 0.33f, -0.05f, 0.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                lineTo(22.0f, 14.0f)
                verticalLineToRelative(6.25f)
                curveToRelative(0.0f, 0.96f, -0.79f, 1.75f, -1.75f, 1.75f)
                lineTo(13.0f, 22.0f)
                curveToRelative(-0.09f, 0.0f, -0.17f, 0.0f, -0.26f, -0.02f)
                lineTo(12.74f, 6.02f)
                lineTo(13.0f, 6.0f)
                close()
                moveTo(16.24f, 17.5f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(16.34f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(11.0f, 6.0f)
                curveToRelative(0.08f, 0.0f, 0.16f, 0.0f, 0.24f, 0.02f)
                verticalLineToRelative(15.96f)
                lineTo(11.0f, 22.0f)
                lineTo(3.75f, 22.0f)
                curveTo(2.78f, 22.0f, 2.0f, 21.2f, 2.0f, 20.25f)
                lineTo(2.0f, 7.75f)
                curveTo(2.0f, 6.78f, 2.78f, 6.0f, 3.75f, 6.0f)
                lineTo(11.0f, 6.0f)
                close()
                moveTo(9.24f, 17.5f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(9.34f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _dualScreenLock!!
    }

private var _dualScreenLock: ImageVector? = null
