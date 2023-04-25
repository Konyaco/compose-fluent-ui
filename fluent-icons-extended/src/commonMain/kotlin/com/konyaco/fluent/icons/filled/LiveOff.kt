

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LiveOff: ImageVector
    get() {
        if (_liveOff != null) {
            return _liveOff!!
        }
        _liveOff = fluentIcon(name = "Filled.LiveOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.2f, 2.2f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.5f, 13.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, -1.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.5f, -10.77f)
                lineToRelative(1.52f, 1.52f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, 0.54f, 7.76f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, -1.41f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -0.51f, -4.91f)
                lineToRelative(1.83f, 1.83f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.84f, 1.84f)
                lineToRelative(8.25f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(19.03f, 15.85f)
                lineTo(20.49f, 17.31f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -1.42f, -12.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.41f, 1.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.37f, 9.5f)
                close()
                moveTo(15.93f, 12.75f)
                lineTo(17.53f, 14.34f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, -1.26f, -6.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.42f, 1.42f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 1.08f, 3.52f)
                close()
            }
        }
        return _liveOff!!
    }

private var _liveOff: ImageVector? = null
