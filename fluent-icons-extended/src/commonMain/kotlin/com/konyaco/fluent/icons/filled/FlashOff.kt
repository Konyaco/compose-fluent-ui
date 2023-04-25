

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff = fluentIcon(name = "Filled.FlashOff") {
            fluentPath {
                moveToRelative(14.44f, 15.5f)
                lineToRelative(6.28f, 6.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(5.94f, 7.0f)
                lineTo(4.1f, 12.15f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.64f, 2.34f)
                horizontalLineToRelative(1.57f)
                lineToRelative(-1.27f, 5.67f)
                curveToRelative(-0.33f, 1.48f, 1.5f, 2.46f, 2.55f, 1.38f)
                lineToRelative(5.85f, -6.04f)
                close()
                moveTo(19.64f, 10.12f)
                lineTo(16.52f, 13.34f)
                lineTo(7.05f, 3.87f)
                lineTo(7.42f, 2.83f)
                curveTo(7.6f, 2.33f, 8.07f, 2.0f, 8.6f, 2.0f)
                horizontalLineToRelative(6.46f)
                curveToRelative(0.85f, 0.0f, 1.45f, 0.84f, 1.18f, 1.65f)
                lineTo(14.8f, 8.0f)
                horizontalLineToRelative(3.96f)
                curveToRelative(1.1f, 0.0f, 1.66f, 1.33f, 0.9f, 2.12f)
                close()
            }
        }
        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
