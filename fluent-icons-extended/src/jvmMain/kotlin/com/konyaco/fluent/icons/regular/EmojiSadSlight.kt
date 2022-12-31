

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EmojiSadSlight: ImageVector
    get() {
        if (_emojiSadSlight != null) {
            return _emojiSadSlight!!
        }
        _emojiSadSlight = fluentIcon(name = "Regular.EmojiSadSlight") {
            fluentPath {
                moveTo(10.25f, 10.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(16.25f, 10.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(15.75f, 14.0f)
                arcToRelative(7.24f, 7.24f, 0.0f, false, false, -4.53f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                curveToRelative(0.27f, -0.28f, 0.8f, -0.6f, 1.47f, -0.86f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 2.0f, -0.42f)
                horizontalLineToRelative(0.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.6f)
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
        return _emojiSadSlight!!
    }

private var _emojiSadSlight: ImageVector? = null
