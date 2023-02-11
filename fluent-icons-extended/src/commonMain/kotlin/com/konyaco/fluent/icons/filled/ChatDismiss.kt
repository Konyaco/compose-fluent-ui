

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChatDismiss: ImageVector
    get() {
        if (_chatDismiss != null) {
            return _chatDismiss!!
        }
        _chatDismiss = fluentIcon(name = "Filled.ChatDismiss") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -18.89f, 4.6f)
                lineToRelative(-1.06f, 3.82f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 1.54f, 1.54f)
                lineToRelative(3.82f, -1.07f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(9.28f, 8.22f)
                lineTo(12.0f, 10.94f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineTo(13.06f, 12.0f)
                lineToRelative(2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(12.0f, 13.06f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineTo(10.94f, 12.0f)
                lineTo(8.22f, 9.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                close()
            }
        }
        return _chatDismiss!!
    }

private var _chatDismiss: ImageVector? = null
