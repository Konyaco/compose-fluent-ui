

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.RibbonOff: ImageVector
    get() {
        if (_ribbonOff != null) {
            return _ribbonOff!!
        }
        _ribbonOff = fluentIcon(name = "Filled.RibbonOff") {
            fluentPath {
                moveTo(5.45f, 6.51f)
                arcTo(6.98f, 6.98f, 0.0f, false, false, 12.0f, 16.0f)
                curveToRelative(0.88f, 0.0f, 1.71f, -0.16f, 2.49f, -0.45f)
                lineToRelative(0.76f, 0.76f)
                arcTo(7.97f, 7.97f, 0.0f, false, true, 7.0f, 15.25f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.6f, 0.69f, 0.96f, 1.18f, 0.6f)
                lineTo(12.0f, 19.18f)
                lineToRelative(3.82f, 2.69f)
                curveToRelative(0.5f, 0.35f, 1.18f, 0.0f, 1.18f, -0.61f)
                verticalLineToRelative(-3.19f)
                lineToRelative(3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(3.23f, 3.23f)
                close()
                moveTo(7.15f, 3.96f)
                lineToRelative(9.89f, 9.9f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.9f, -9.9f)
                close()
            }
        }
        return _ribbonOff!!
    }

private var _ribbonOff: ImageVector? = null
