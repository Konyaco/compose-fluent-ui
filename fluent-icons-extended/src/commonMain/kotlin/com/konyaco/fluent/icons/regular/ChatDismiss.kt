

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChatDismiss: ImageVector
    get() {
        if (_chatDismiss != null) {
            return _chatDismiss!!
        }
        _chatDismiss = fluentIcon(name = "Regular.ChatDismiss") {
            fluentPath {
                moveTo(9.28f, 8.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineTo(10.94f, 12.0f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineTo(12.0f, 13.06f)
                lineToRelative(2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(13.06f, 12.0f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineTo(12.0f, 10.94f)
                lineTo(9.28f, 8.22f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -18.89f, 4.6f)
                lineToRelative(-1.06f, 3.82f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 1.54f, 1.54f)
                lineToRelative(3.82f, -1.07f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 4.37f, 7.43f)
                lineToRelative(-0.27f, -0.15f)
                lineToRelative(-3.99f, 1.11f)
                lineToRelative(1.11f, -3.98f)
                lineToRelative(-0.15f, -0.27f)
                arcTo(8.46f, 8.46f, 0.0f, false, true, 3.5f, 12.0f)
                close()
            }
        }
        return _chatDismiss!!
    }

private var _chatDismiss: ImageVector? = null
