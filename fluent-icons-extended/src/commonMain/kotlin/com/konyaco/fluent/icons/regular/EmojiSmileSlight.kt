

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EmojiSmileSlight: ImageVector
    get() {
        if (_emojiSmileSlight != null) {
            return _emojiSmileSlight!!
        }
        _emojiSmileSlight = fluentIcon(name = "Regular.EmojiSmileSlight") {
            fluentPath {
                moveTo(10.25f, 10.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(16.25f, 10.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(10.14f, 15.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.78f, 1.3f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, 2.64f, 0.66f)
                curveToRelative(0.92f, 0.0f, 1.87f, -0.2f, 2.64f, -0.67f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.78f, -1.28f)
                curveToRelative(-0.48f, 0.29f, -1.15f, 0.45f, -1.86f, 0.45f)
                curveToRelative(-0.7f, 0.0f, -1.38f, -0.16f, -1.86f, -0.45f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                close()
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -17.0f, 0.0f)
                close()
            }
        }
        return _emojiSmileSlight!!
    }

private var _emojiSmileSlight: ImageVector? = null
