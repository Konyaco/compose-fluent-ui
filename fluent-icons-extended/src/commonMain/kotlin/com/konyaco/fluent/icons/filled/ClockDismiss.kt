

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClockDismiss: ImageVector
    get() {
        if (_clockDismiss != null) {
            return _clockDismiss!!
        }
        _clockDismiss = fluentIcon(name = "Filled.ClockDismiss") {
            fluentPath {
                moveTo(16.25f, 12.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(13.0f, 1.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -9.95f, 11.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 12.0f, 20.95f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 13.0f, 1.0f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(4.85f, 15.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(1.64f, 1.65f)
                lineToRelative(-1.64f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(1.65f, -1.64f)
                lineToRelative(1.65f, 1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineTo(7.21f, 17.5f)
                lineToRelative(1.64f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineTo(6.5f, 16.79f)
                lineToRelative(-1.65f, -1.64f)
                close()
            }
        }
        return _clockDismiss!!
    }

private var _clockDismiss: ImageVector? = null
