

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LocationLive: ImageVector
    get() {
        if (_locationLive != null) {
            return _locationLive!!
        }
        _locationLive = fluentIcon(name = "Filled.LocationLive") {
            fluentPath {
                moveTo(9.0f, 2.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.8f, -0.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 20.97f, 13.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                arcTo(10.5f, 10.5f, 0.0f, false, false, 9.7f, 3.52f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.7f, -0.8f)
                close()
                moveTo(7.6f, 21.39f)
                lineToRelative(0.39f, 0.38f)
                curveToRelative(0.29f, 0.3f, 0.76f, 0.3f, 1.05f, 0.0f)
                lineToRelative(1.35f, -1.33f)
                lineToRelative(2.01f, -2.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -7.77f, 0.0f)
                arcToRelative(1162.27f, 1162.27f, 0.0f, false, false, 2.97f, 2.95f)
                close()
                moveTo(8.51f, 15.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, 2.5f)
                close()
                moveTo(9.82f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, true, false, 9.68f, 7.0f)
                arcTo(6.99f, 6.99f, 0.0f, false, true, 16.0f, 13.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, -0.13f)
                arcTo(8.49f, 8.49f, 0.0f, false, false, 9.82f, 5.5f)
                close()
            }
        }
        return _locationLive!!
    }

private var _locationLive: ImageVector? = null
