

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CameraDome: ImageVector
    get() {
        if (_cameraDome != null) {
            return _cameraDome!!
        }
        _cameraDome = fluentIcon(name = "Filled.CameraDome") {
            fluentPath {
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 2.78f, 2.78f, 2.0f, 3.75f, 2.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                lineTo(3.75f, 5.5f)
                curveTo(2.78f, 5.5f, 2.0f, 4.72f, 2.0f, 3.75f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(14.5f, 13.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(3.0f, 7.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -18.0f, 0.0f)
                lineTo(3.0f, 7.0f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
            }
        }
        return _cameraDome!!
    }

private var _cameraDome: ImageVector? = null
