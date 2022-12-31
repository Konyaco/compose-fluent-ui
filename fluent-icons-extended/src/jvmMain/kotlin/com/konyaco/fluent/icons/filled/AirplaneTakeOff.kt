

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AirplaneTakeOff: ImageVector
    get() {
        if (_airplaneTakeOff != null) {
            return _airplaneTakeOff!!
        }
        _airplaneTakeOff = fluentIcon(name = "Filled.AirplaneTakeOff") {
            fluentPath {
                moveTo(12.4f, 5.93f)
                lineTo(10.51f, 4.4f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, false, -2.76f, 2.33f)
                lineToRelative(0.38f, 0.68f)
                lineToRelative(3.46f, -0.72f)
                curveToRelative(0.06f, -0.01f, 0.17f, -0.06f, 0.3f, -0.2f)
                curveToRelative(0.14f, -0.18f, 0.3f, -0.37f, 0.5f, -0.57f)
                close()
                moveTo(3.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(21.55f, 6.83f)
                curveToRelative(-0.95f, -1.08f, -2.62f, -2.5f, -4.86f, -2.33f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -2.43f, 1.06f)
                curveToRelative(-0.67f, 0.52f, -1.22f, 1.12f, -1.6f, 1.57f)
                curveToRelative(-0.24f, 0.3f, -0.54f, 0.49f, -0.85f, 0.55f)
                lineToRelative(-4.67f, 0.97f)
                lineToRelative(-0.96f, -1.77f)
                arcTo(1.7f, 1.7f, 0.0f, false, false, 3.0f, 7.7f)
                verticalLineToRelative(3.7f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 2.73f, 2.24f)
                lineToRelative(3.3f, -0.63f)
                lineToRelative(-0.51f, 1.23f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.46f, 1.97f)
                lineToRelative(3.23f, -4.32f)
                lineToRelative(5.37f, -1.85f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, false, 1.34f, -1.32f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.37f, -1.88f)
                close()
            }
        }
        return _airplaneTakeOff!!
    }

private var _airplaneTakeOff: ImageVector? = null
