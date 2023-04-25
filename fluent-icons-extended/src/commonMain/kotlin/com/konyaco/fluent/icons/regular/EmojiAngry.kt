

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EmojiAngry: ImageVector
    get() {
        if (_emojiAngry != null) {
            return _emojiAngry!!
        }
        _emojiAngry = fluentIcon(name = "Regular.EmojiAngry") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(1.63f, 0.0f, 3.16f, 0.65f, 4.28f, 1.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.07f, 1.04f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, -6.43f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.07f, -1.04f)
                arcTo(5.98f, 5.98f, 0.0f, false, true, 12.0f, 13.5f)
                close()
                moveTo(7.16f, 6.78f)
                curveToRelative(0.24f, -0.3f, 0.65f, -0.36f, 0.97f, -0.18f)
                lineToRelative(0.09f, 0.06f)
                lineToRelative(2.5f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.47f, 1.34f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -1.71f, -1.16f)
                lineToRelative(-1.26f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.12f, -1.06f)
                close()
                moveTo(13.28f, 8.66f)
                lineTo(15.78f, 6.66f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.02f, 1.1f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-1.26f, 1.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -1.7f, 1.3f)
                lineTo(13.76f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.55f, -1.26f)
                lineToRelative(0.07f, -0.08f)
                lineToRelative(2.5f, -2.0f)
                lineToRelative(-2.5f, 2.0f)
                close()
            }
        }
        return _emojiAngry!!
    }

private var _emojiAngry: ImageVector? = null
