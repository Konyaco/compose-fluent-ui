

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EmojiSmileSlight: ImageVector
    get() {
        if (_emojiSmileSlight != null) {
            return _emojiSmileSlight!!
        }
        _emojiSmileSlight = fluentIcon(name = "Filled.EmojiSmileSlight") {
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
                moveTo(10.14f, 15.1f)
                curveToRelative(0.48f, 0.3f, 1.15f, 0.46f, 1.86f, 0.46f)
                curveToRelative(0.7f, 0.0f, 1.38f, -0.16f, 1.86f, -0.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.78f, 1.28f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, -2.64f, 0.67f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, -2.64f, -0.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.78f, -1.28f)
                close()
            }
        }
        return _emojiSmileSlight!!
    }

private var _emojiSmileSlight: ImageVector? = null
