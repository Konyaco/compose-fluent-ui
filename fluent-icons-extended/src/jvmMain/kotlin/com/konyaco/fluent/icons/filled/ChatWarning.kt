

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChatWarning: ImageVector
    get() {
        if (_chatWarning != null) {
            return _chatWarning!!
        }
        _chatWarning = fluentIcon(name = "Filled.ChatWarning") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -18.86f, 4.65f)
                lineToRelative(-1.11f, 4.29f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, 1.04f, 1.03f)
                lineToRelative(4.29f, -1.11f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(12.0f, 6.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.25f, 7.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(13.0f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        return _chatWarning!!
    }

private var _chatWarning: ImageVector? = null
