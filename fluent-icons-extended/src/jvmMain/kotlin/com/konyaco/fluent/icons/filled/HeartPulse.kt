

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = fluentIcon(name = "Filled.HeartPulse") {
            fluentPath {
                moveTo(12.82f, 5.58f)
                lineTo(12.0f, 6.4f)
                lineToRelative(-0.82f, -0.82f)
                arcTo(5.37f, 5.37f, 0.0f, false, false, 2.25f, 11.0f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.42f, -3.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 3.13f, -0.06f)
                lineToRelative(1.98f, 3.8f)
                lineToRelative(1.58f, -2.05f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.7f, -0.1f)
                lineTo(17.8f, 11.0f)
                horizontalLineToRelative(3.96f)
                arcToRelative(5.37f, 5.37f, 0.0f, false, false, -8.93f, -5.41f)
                close()
                moveTo(11.47f, 21.08f)
                lineTo(4.89f, 14.5f)
                horizontalLineToRelative(1.97f)
                curveToRelative(0.67f, 0.0f, 1.29f, -0.39f, 1.58f, -1.0f)
                lineToRelative(0.38f, -0.82f)
                lineToRelative(1.63f, 3.13f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 2.94f, 0.25f)
                lineToRelative(1.95f, -2.55f)
                lineToRelative(0.34f, 0.4f)
                curveToRelative(0.34f, 0.37f, 0.82f, 0.59f, 1.32f, 0.59f)
                horizontalLineToRelative(2.11f)
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
