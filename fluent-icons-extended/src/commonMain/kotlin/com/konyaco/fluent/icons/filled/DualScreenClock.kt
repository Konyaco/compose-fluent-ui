

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DualScreenClock: ImageVector
    get() {
        if (_dualScreenClock != null) {
            return _dualScreenClock!!
        }
        _dualScreenClock = fluentIcon(name = "Filled.DualScreenClock") {
            fluentPath {
                moveTo(22.0f, 9.97f)
                verticalLineToRelative(10.28f)
                curveToRelative(0.0f, 0.97f, -0.79f, 1.75f, -1.75f, 1.75f)
                lineTo(13.0f, 22.0f)
                curveToRelative(-0.09f, 0.0f, -0.17f, 0.0f, -0.26f, -0.02f)
                lineTo(12.74f, 11.8f)
                arcTo(6.47f, 6.47f, 0.0f, false, false, 22.0f, 9.97f)
                close()
                moveTo(10.02f, 6.0f)
                arcToRelative(6.63f, 6.63f, 0.0f, false, false, 1.22f, 4.32f)
                verticalLineToRelative(11.66f)
                lineTo(11.0f, 22.0f)
                lineTo(3.75f, 22.0f)
                curveTo(2.78f, 22.0f, 2.0f, 21.2f, 2.0f, 20.25f)
                lineTo(2.0f, 7.75f)
                curveTo(2.0f, 6.78f, 2.78f, 6.0f, 3.75f, 6.0f)
                horizontalLineToRelative(6.27f)
                close()
                moveTo(9.24f, 17.5f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(9.34f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(16.24f, 17.5f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(16.34f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
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
