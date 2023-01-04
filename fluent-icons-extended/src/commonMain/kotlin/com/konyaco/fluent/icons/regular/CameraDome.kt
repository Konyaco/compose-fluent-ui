

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CameraDome: ImageVector
    get() {
        if (_cameraDome != null) {
            return _cameraDome!!
        }
        _cameraDome = fluentIcon(name = "Regular.CameraDome") {
            fluentPath {
                moveTo(12.0f, 16.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, -11.0f)
                close()
                moveTo(8.0f, 13.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 2.78f, 2.78f, 2.0f, 3.75f, 2.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.7f, -0.4f, 1.3f, -1.0f, 1.58f)
                lineTo(21.0f, 13.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -18.0f, 0.0f)
                lineTo(3.0f, 6.83f)
                curveToRelative(-0.6f, -0.28f, -1.0f, -0.88f, -1.0f, -1.58f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(4.5f, 7.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 15.0f, 0.0f)
                lineTo(19.5f, 7.0f)
                horizontalLineToRelative(-15.0f)
                close()
                moveTo(3.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(3.75f, 3.5f)
                close()
            }
        }
        return _cameraDome!!
    }

private var _cameraDome: ImageVector? = null
