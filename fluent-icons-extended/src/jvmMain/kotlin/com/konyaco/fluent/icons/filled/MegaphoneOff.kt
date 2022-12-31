

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MegaphoneOff: ImageVector
    get() {
        if (_megaphoneOff != null) {
            return _megaphoneOff!!
        }
        _megaphoneOff = fluentIcon(name = "Filled.MegaphoneOff") {
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
                moveTo(7.5f, 16.44f)
                lineToRelative(4.62f, 1.38f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.5f, 16.5f)
                verticalLineToRelative(-0.06f)
                close()
                moveTo(22.0f, 17.74f)
                curveToRelative(0.0f, 0.32f, -0.07f, 0.62f, -0.18f, 0.9f)
                lineTo(10.0f, 6.8f)
                lineToRelative(9.1f, -2.7f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 22.0f, 6.26f)
                verticalLineToRelative(11.48f)
                close()
            }
        }
        return _megaphoneOff!!
    }

private var _megaphoneOff: ImageVector? = null
