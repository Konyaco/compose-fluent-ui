

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EmojiMultiple: ImageVector
    get() {
        if (_emojiMultiple != null) {
            return _emojiMultiple!!
        }
        _emojiMultiple = fluentIcon(name = "Filled.EmojiMultiple") {
            fluentPath {
                moveTo(2.0f, 8.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 4.94f, 6.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.72f, -4.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.68f, 0.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.14f, -0.97f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 4.02f, -0.95f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.95f, -1.84f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 2.0f, 8.5f)
                close()
                moveTo(7.5f, 6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(11.5f, 6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(22.0f, 15.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 14.0f, 0.0f)
                close()
                moveTo(13.5f, 13.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(17.97f, 16.72f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, false, -0.88f, 0.07f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -4.18f, 0.0f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, false, -0.95f, 0.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.08f, -0.01f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, -0.07f, -0.88f)
                close()
                moveTo(17.5f, 14.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        return _emojiMultiple!!
    }

private var _emojiMultiple: ImageVector? = null
