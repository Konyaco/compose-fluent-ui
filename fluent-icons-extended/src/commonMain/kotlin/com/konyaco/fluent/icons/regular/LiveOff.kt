

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LiveOff: ImageVector
    get() {
        if (_liveOff != null) {
            return _liveOff!!
        }
        _liveOff = fluentIcon(name = "Regular.LiveOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.2f, 2.2f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.5f, 13.6f)
                arcTo(0.75f, 0.75f, 0.0f, true, false, 6.0f, 18.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -0.5f, -11.47f)
                lineToRelative(1.77f, 1.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.5f, 7.92f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.49f, -5.79f)
                lineToRelative(2.22f, 2.22f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.84f, 1.84f)
                lineToRelative(8.33f, 8.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(19.38f, 16.21f)
                lineTo(20.48f, 17.31f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -1.4f, -12.38f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 18.0f, 5.99f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 1.38f, 10.22f)
                close()
                moveTo(16.35f, 13.17f)
                lineTo(17.53f, 14.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.29f, -6.58f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 1.17f, 4.35f)
                close()
            }
        }
        return _liveOff!!
    }

private var _liveOff: ImageVector? = null
