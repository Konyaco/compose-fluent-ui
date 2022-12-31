

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SendClock: ImageVector
    get() {
        if (_sendClock != null) {
            return _sendClock!!
        }
        _sendClock = fluentIcon(name = "Filled.SendClock") {
            fluentPath {
                moveTo(12.81f, 12.2f)
                lineToRelative(-7.53f, 1.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.38f, 0.32f)
                lineToRelative(-2.6f, 6.96f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.03f, 0.94f)
                lineToRelative(7.68f, -3.84f)
                lineToRelative(-0.01f, -0.33f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 10.6f, -5.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.27f, -1.12f)
                lineToRelative(-18.0f, -9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.03f, 0.94f)
                lineToRelative(2.6f, 6.96f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.38f, 0.32f)
                lineToRelative(7.53f, 1.25f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, 0.0f, 0.4f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(19.5f, 17.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
            }
        }
        return _sendClock!!
    }

private var _sendClock: ImageVector? = null
