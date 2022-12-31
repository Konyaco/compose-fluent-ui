

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EmojiSad: ImageVector
    get() {
        if (_emojiSad != null) {
            return _emojiSad!!
        }
        _emojiSad = fluentIcon(name = "Filled.EmojiSad") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(-1.63f, 0.0f, -3.17f, 0.65f, -4.29f, 1.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.07f, 1.05f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, 6.43f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.07f, -1.06f)
                arcTo(5.98f, 5.98f, 0.0f, false, false, 12.0f, 13.5f)
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
        return _emojiSad!!
    }

private var _emojiSad: ImageVector? = null
