

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MicPulse: ImageVector
    get() {
        if (_micPulse != null) {
            return _micPulse!!
        }
        _micPulse = fluentIcon(name = "Filled.MicPulse") {
            fluentPath {
                moveTo(11.0f, 17.5f)
                curveToRelative(0.0f, 1.1f, 0.27f, 2.13f, 0.75f, 3.03f)
                verticalLineToRelative(0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-2.37f)
                arcTo(6.75f, 6.75f, 0.0f, false, true, 4.0f, 12.48f)
                verticalLineToRelative(-0.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(0.6f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, 5.03f, 5.25f)
                lineTo(11.0f, 17.5f)
                close()
                moveTo(11.17f, 16.0f)
                arcTo(6.51f, 6.51f, 0.0f, false, true, 15.0f, 11.5f)
                lineTo(15.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.17f, 4.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(16.01f, 14.5f)
                curveToRelative(0.21f, 0.0f, 0.4f, 0.14f, 0.46f, 0.34f)
                lineTo(17.53f, 18.0f)
                lineToRelative(1.0f, -2.68f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.92f, -0.04f)
                lineTo(20.3f, 17.0f)
                lineTo(21.0f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.45f, -0.28f)
                lineToRelative(-0.48f, -0.97f)
                lineToRelative(-1.1f, 2.93f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.94f, -0.02f)
                lineToRelative(-1.07f, -3.2f)
                lineToRelative(-0.5f, 1.23f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 15.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(0.66f)
                lineToRelative(0.88f, -2.19f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.47f, -0.31f)
                close()
            }
        }
        return _micPulse!!
    }

private var _micPulse: ImageVector? = null
