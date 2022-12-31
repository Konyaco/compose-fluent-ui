

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DualScreenClock: ImageVector
    get() {
        if (_dualScreenClock != null) {
            return _dualScreenClock!!
        }
        _dualScreenClock = fluentIcon(name = "Regular.DualScreenClock") {
            fluentPath {
                moveTo(10.02f, 6.0f)
                arcToRelative(6.63f, 6.63f, 0.0f, false, false, 0.06f, 1.5f)
                lineTo(3.75f, 7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.13f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(7.5f)
                lineTo(11.25f, 10.33f)
                curveToRelative(0.41f, 0.57f, 0.92f, 1.07f, 1.5f, 1.48f)
                verticalLineToRelative(8.69f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.13f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-8.62f)
                arcTo(6.53f, 6.53f, 0.0f, false, false, 22.0f, 9.97f)
                verticalLineToRelative(10.28f)
                curveToRelative(0.0f, 0.97f, -0.79f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 22.0f)
                curveTo(2.78f, 22.0f, 2.0f, 21.2f, 2.0f, 20.25f)
                lineTo(2.0f, 7.75f)
                curveTo(2.0f, 6.78f, 2.78f, 6.0f, 3.75f, 6.0f)
                horizontalLineToRelative(6.27f)
                close()
                moveTo(16.24f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(1.6f)
                close()
                moveTo(9.24f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(1.6f)
                close()
                moveTo(16.5f, 1.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(15.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        return _dualScreenClock!!
    }

private var _dualScreenClock: ImageVector? = null
