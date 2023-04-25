

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoPersonClock: ImageVector
    get() {
        if (_videoPersonClock != null) {
            return _videoPersonClock!!
        }
        _videoPersonClock = fluentIcon(name = "Filled.VideoPersonClock") {
            fluentPath {
                moveTo(22.0f, 5.25f)
                curveTo(22.0f, 4.01f, 20.99f, 3.0f, 19.75f, 3.0f)
                lineTo(4.25f, 3.0f)
                curveTo(3.01f, 3.0f, 2.0f, 4.0f, 2.0f, 5.25f)
                verticalLineToRelative(11.5f)
                curveTo(2.0f, 18.0f, 3.0f, 19.0f, 4.25f, 19.0f)
                horizontalLineToRelative(6.93f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, 1.63f, -6.0f)
                lineTo(8.61f, 13.0f)
                curveToRelative(-0.9f, 0.08f, -1.61f, 0.83f, -1.61f, 1.75f)
                verticalLineToRelative(2.75f)
                lineTo(4.25f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(3.5f, 5.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.48f)
                curveToRelative(0.55f, 0.29f, 1.05f, 0.65f, 1.5f, 1.08f)
                lineTo(22.0f, 5.25f)
                close()
                moveTo(15.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(19.5f, 17.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
            }
        }
        return _videoPersonClock!!
    }

private var _videoPersonClock: ImageVector? = null
