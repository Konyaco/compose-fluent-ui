

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = fluentIcon(name = "Regular.Chat") {
            fluentPath {
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
                moveTo(8.75f, 13.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(4.6f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(8.75f, 9.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(6.6f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }
        return _chat!!
    }

private var _chat: ImageVector? = null
