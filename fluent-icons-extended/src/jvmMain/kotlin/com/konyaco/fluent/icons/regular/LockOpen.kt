

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) {
            return _lockOpen!!
        }
        _lockOpen = fluentIcon(name = "Regular.LockOpen") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                curveToRelative(1.88f, 0.0f, 3.33f, 1.21f, 3.93f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.43f, 0.48f)
                curveTo(14.1f, 4.26f, 13.2f, 3.5f, 12.0f, 3.5f)
                curveToRelative(-1.4f, 0.0f, -2.42f, 0.96f, -2.5f, 2.56f)
                lineTo(9.5f, 8.0f)
                horizontalLineToRelative(8.25f)
                curveToRelative(1.2f, 0.0f, 2.17f, 0.92f, 2.24f, 2.1f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.19f, -0.93f, 2.16f, -2.1f, 2.24f)
                lineTo(6.25f, 21.99f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.24f, -2.09f)
                lineTo(4.0f, 19.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.25f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 6.25f)
                curveTo(8.0f, 3.71f, 9.7f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.75f, 9.5f)
                lineTo(6.25f, 9.5f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.69f, 0.65f, 0.74f)
                horizontalLineToRelative(11.6f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.74f, -0.64f)
                lineToRelative(0.01f, -0.1f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.65f, -0.74f)
                lineToRelative(-0.1f, -0.01f)
                close()
                moveTo(12.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
