

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) {
            return _lockOpen!!
        }
        _lockOpen = fluentIcon(name = "Filled.LockOpen") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.77f, 2.67f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.84f, 0.77f)
                lineToRelative(-0.04f, -0.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.88f, 0.51f)
                lineTo(10.01f, 8.0f)
                horizontalLineToRelative(7.74f)
                curveToRelative(1.2f, 0.0f, 2.17f, 0.93f, 2.24f, 2.1f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.19f, -0.93f, 2.16f, -2.1f, 2.24f)
                lineTo(6.25f, 21.99f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.24f, -2.09f)
                lineTo(4.0f, 19.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(6.25f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                close()
                moveTo(12.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
