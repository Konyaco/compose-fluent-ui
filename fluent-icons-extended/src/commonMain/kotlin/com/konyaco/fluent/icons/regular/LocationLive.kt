

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LocationLive: ImageVector
    get() {
        if (_locationLive != null) {
            return _locationLive!!
        }
        _locationLive = fluentIcon(name = "Regular.LocationLive") {
            fluentPath {
                moveTo(9.8f, 2.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, 9.78f, 9.77f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, -0.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 9.8f, 2.03f)
                close()
                moveTo(8.5f, 15.63f)
                arcToRelative(1.13f, 1.13f, 0.0f, true, false, 0.0f, -2.26f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, false, 0.0f, 2.25f)
                close()
                moveTo(7.98f, 21.77f)
                lineTo(7.58f, 21.39f)
                arcToRelative(4307.72f, 4307.72f, 0.0f, false, true, -2.96f, -2.96f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 7.77f, 0.0f)
                lineToRelative(-2.01f, 2.0f)
                lineToRelative(-1.35f, 1.34f)
                curveToRelative(-0.29f, 0.3f, -0.76f, 0.3f, -1.05f, 0.0f)
                close()
                moveTo(5.68f, 11.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.65f)
                lineToRelative(2.04f, 2.03f)
                lineToRelative(0.78f, 0.78f)
                lineToRelative(0.82f, -0.8f)
                lineToRelative(2.01f, -2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.65f, -5.66f)
                close()
                moveTo(9.82f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 9.68f, 7.0f)
                arcTo(6.99f, 6.99f, 0.0f, false, true, 16.0f, 13.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, -0.13f)
                arcTo(8.49f, 8.49f, 0.0f, false, false, 9.82f, 5.5f)
                close()
            }
        }
        return _locationLive!!
    }

private var _locationLive: ImageVector? = null
