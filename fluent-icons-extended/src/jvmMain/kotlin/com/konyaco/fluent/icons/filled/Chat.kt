

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = fluentIcon(name = "Filled.Chat") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -4.64f, 18.86f)
                lineToRelative(-4.3f, 1.12f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, -1.03f, -1.04f)
                lineToRelative(1.11f, -4.29f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(13.25f, 13.0f)
                horizontalLineToRelative(-4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(13.35f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
                moveTo(15.25f, 9.5f)
                horizontalLineToRelative(-6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(15.35f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _chat!!
    }

private var _chat: ImageVector? = null
