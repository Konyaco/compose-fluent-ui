

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff = fluentIcon(name = "Regular.FlashOff") {
            fluentPath {
                moveTo(5.94f, 7.0f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-6.28f, -6.28f)
                lineToRelative(-5.85f, 6.04f)
                curveToRelative(-1.06f, 1.08f, -2.88f, 0.1f, -2.55f, -1.38f)
                lineToRelative(1.27f, -5.66f)
                lineToRelative(-1.57f, -0.01f)
                curveToRelative(-1.2f, 0.0f, -2.04f, -1.2f, -1.64f, -2.34f)
                lineTo(5.94f, 7.0f)
                close()
                moveTo(13.38f, 14.44f)
                lineTo(7.1f, 8.17f)
                lineToRelative(-1.6f, 4.49f)
                curveToRelative(-0.05f, 0.16f, 0.07f, 0.33f, 0.24f, 0.33f)
                lineToRelative(2.5f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.73f, 0.91f)
                lineTo(7.51f, 20.5f)
                lineToRelative(5.87f, -6.05f)
                close()
                moveTo(18.16f, 9.5f)
                lineTo(15.46f, 12.28f)
                lineTo(16.52f, 13.34f)
                lineTo(19.65f, 10.12f)
                curveToRelative(0.76f, -0.8f, 0.2f, -2.12f, -0.9f, -2.12f)
                horizontalLineToRelative(-3.96f)
                lineToRelative(1.45f, -4.35f)
                curveToRelative(0.27f, -0.81f, -0.33f, -1.65f, -1.18f, -1.65f)
                lineTo(8.6f, 2.0f)
                curveToRelative(-0.53f, 0.0f, -1.0f, 0.33f, -1.18f, 0.83f)
                lineToRelative(-0.37f, 1.04f)
                lineToRelative(1.18f, 1.18f)
                lineToRelative(0.55f, -1.55f)
                horizontalLineToRelative(5.93f)
                lineToRelative(-1.67f, 5.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.7f, 0.99f)
                horizontalLineToRelative(4.42f)
                close()
            }
        }
        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
