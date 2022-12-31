

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MegaphoneOff: ImageVector
    get() {
        if (_megaphoneOff != null) {
            return _megaphoneOff!!
        }
        _megaphoneOff = fluentIcon(name = "Regular.MegaphoneOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(-3.11f, 0.93f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 2.0f, 10.87f)
                verticalLineToRelative(2.26f)
                curveToRelative(0.0f, 1.0f, 0.65f, 1.87f, 1.6f, 2.16f)
                lineToRelative(2.4f, 0.7f)
                verticalLineToRelative(0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.6f, 1.57f)
                lineToRelative(5.12f, 1.52f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(16.49f, 17.55f)
                lineToRelative(-12.45f, -3.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.54f, -0.72f)
                verticalLineToRelative(-2.26f)
                curveToRelative(0.0f, -0.33f, 0.22f, -0.63f, 0.54f, -0.72f)
                lineToRelative(3.9f, -1.16f)
                lineToRelative(8.55f, 8.56f)
                close()
                moveTo(7.49f, 16.45f)
                lineToRelative(4.63f, 1.37f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.5f, 16.5f)
                verticalLineToRelative(-0.06f)
                close()
                moveTo(20.5f, 6.25f)
                verticalLineToRelative(11.06f)
                lineToRelative(1.32f, 1.31f)
                curveToRelative(0.11f, -0.27f, 0.18f, -0.57f, 0.18f, -0.9f)
                lineTo(22.0f, 6.27f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.9f, -2.15f)
                lineTo(10.0f, 6.8f)
                lineToRelative(1.2f, 1.21f)
                lineToRelative(8.34f, -2.48f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.96f, 0.72f)
                close()
            }
        }
        return _megaphoneOff!!
    }

private var _megaphoneOff: ImageVector? = null
