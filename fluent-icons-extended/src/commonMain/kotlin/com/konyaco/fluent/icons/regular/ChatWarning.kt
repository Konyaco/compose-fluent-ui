

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChatWarning: ImageVector
    get() {
        if (_chatWarning != null) {
            return _chatWarning!!
        }
        _chatWarning = fluentIcon(name = "Regular.ChatWarning") {
            fluentPath {
                moveTo(12.0f, 6.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.25f, 7.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -4.59f, 18.89f)
                lineTo(3.6f, 21.96f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.54f, -1.54f)
                lineToRelative(1.06f, -3.83f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -7.43f, 12.64f)
                lineToRelative(0.15f, 0.27f)
                lineToRelative(-1.1f, 3.98f)
                lineToRelative(3.98f, -1.11f)
                lineToRelative(0.27f, 0.15f)
                arcTo(8.5f, 8.5f, 0.0f, true, false, 12.0f, 3.5f)
                close()
            }
        }
        return _chatWarning!!
    }

private var _chatWarning: ImageVector? = null
