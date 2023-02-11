

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = fluentIcon(name = "Regular.HeartPulse") {
            fluentPath {
                moveTo(12.82f, 5.58f)
                lineTo(12.0f, 6.4f)
                lineToRelative(-0.82f, -0.82f)
                arcTo(5.37f, 5.37f, 0.0f, false, false, 2.25f, 11.0f)
                horizontalLineToRelative(1.6f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, 6.27f, -4.36f)
                lineTo(11.47f, 8.0f)
                curveToRelative(0.3f, 0.3f, 0.79f, 0.29f, 1.08f, -0.02f)
                lineToRelative(1.33f, -1.34f)
                arcTo(3.88f, 3.88f, 0.0f, false, true, 20.15f, 11.0f)
                horizontalLineToRelative(1.6f)
                arcToRelative(5.37f, 5.37f, 0.0f, false, false, -8.93f, -5.42f)
                close()
                moveTo(11.47f, 21.08f)
                lineTo(4.89f, 14.5f)
                horizontalLineToRelative(2.12f)
                lineTo(12.0f, 19.47f)
                lineToRelative(4.99f, -4.98f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-6.58f, 6.58f)
                curveToRelative(-0.3f, 0.29f, -0.77f, 0.29f, -1.06f, 0.0f)
                close()
                moveTo(9.42f, 8.4f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.35f, 0.02f)
                lineTo(6.38f, 12.0f)
                lineTo(2.75f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.1f)
                curveToRelative(0.3f, 0.0f, 0.56f, -0.17f, 0.69f, -0.43f)
                lineToRelative(1.23f, -2.6f)
                lineToRelative(2.56f, 5.11f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.28f, 0.1f)
                lineToRelative(2.7f, -3.73f)
                lineToRelative(1.13f, 1.3f)
                curveToRelative(0.14f, 0.16f, 0.34f, 0.25f, 0.56f, 0.25f)
                horizontalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.91f)
                lineToRelative(-1.53f, -1.74f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.17f, 0.05f)
                lineToRelative(-2.52f, 3.5f)
                lineToRelative(-2.7f, -5.4f)
                close()
            }
        }
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
