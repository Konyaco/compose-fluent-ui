

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.RibbonOff: ImageVector
    get() {
        if (_ribbonOff != null) {
            return _ribbonOff!!
        }
        _ribbonOff = fluentIcon(name = "Regular.RibbonOff") {
            fluentPath {
                moveTo(5.45f, 6.51f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineTo(17.0f, 18.06f)
                verticalLineToRelative(3.19f)
                curveToRelative(0.0f, 0.57f, -0.6f, 0.92f, -1.1f, 0.67f)
                lineToRelative(-0.08f, -0.06f)
                lineTo(12.0f, 19.18f)
                lineToRelative(-3.82f, 2.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.17f, -0.5f)
                verticalLineToRelative(-0.11f)
                lineTo(7.0f, 13.9f)
                arcTo(6.98f, 6.98f, 0.0f, false, true, 5.45f, 6.5f)
                close()
                moveTo(15.5f, 16.56f)
                lineToRelative(-1.01f, -1.01f)
                arcToRelative(6.98f, 6.98f, 0.0f, false, true, -5.99f, -0.49f)
                verticalLineToRelative(4.74f)
                lineToRelative(3.07f, -2.15f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.76f, -0.06f)
                lineToRelative(0.1f, 0.06f)
                lineToRelative(3.07f, 2.16f)
                verticalLineToRelative(-3.25f)
                close()
                moveTo(13.29f, 14.35f)
                lineTo(6.65f, 7.7f)
                arcToRelative(5.51f, 5.51f, 0.0f, false, false, 6.64f, 6.64f)
                close()
                moveTo(17.5f, 9.0f)
                curveToRelative(0.0f, 1.47f, -0.58f, 2.81f, -1.52f, 3.8f)
                lineToRelative(1.06f, 1.06f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.9f, -9.9f)
                lineTo(8.2f, 5.02f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 17.5f, 9.0f)
                close()
            }
        }
        return _ribbonOff!!
    }

private var _ribbonOff: ImageVector? = null
