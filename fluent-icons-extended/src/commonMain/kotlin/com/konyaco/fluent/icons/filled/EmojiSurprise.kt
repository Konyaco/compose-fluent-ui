

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EmojiSurprise: ImageVector
    get() {
        if (_emojiSurprise != null) {
            return _emojiSurprise!!
        }
        _emojiSurprise = fluentIcon(name = "Filled.EmojiSurprise") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, -4.5f)
                close()
                moveTo(9.0f, 8.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
                moveTo(15.0f, 8.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
            }
        }
        return _emojiSurprise!!
    }

private var _emojiSurprise: ImageVector? = null
