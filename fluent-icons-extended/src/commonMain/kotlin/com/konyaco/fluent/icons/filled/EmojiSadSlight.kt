

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EmojiSadSlight: ImageVector
    get() {
        if (_emojiSadSlight != null) {
            return _emojiSadSlight!!
        }
        _emojiSadSlight = fluentIcon(name = "Filled.EmojiSadSlight") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                close()
                moveTo(7.75f, 10.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                close()
                moveTo(13.75f, 10.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                close()
                moveTo(15.75f, 14.0f)
                horizontalLineToRelative(0.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -3.47f, 1.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                arcTo(7.24f, 7.24f, 0.0f, false, true, 15.75f, 14.0f)
                close()
            }
        }
        return _emojiSadSlight!!
    }

private var _emojiSadSlight: ImageVector? = null
