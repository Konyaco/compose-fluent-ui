

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EmojiAngry: ImageVector
    get() {
        if (_emojiAngry != null) {
            return _emojiAngry!!
        }
        _emojiAngry = fluentIcon(name = "Filled.EmojiAngry") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(-1.63f, 0.0f, -3.17f, 0.66f, -4.29f, 1.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.07f, 1.05f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, 6.43f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.07f, -1.06f)
                arcTo(5.98f, 5.98f, 0.0f, false, false, 12.0f, 13.5f)
                close()
                moveTo(8.22f, 6.66f)
                lineToRelative(-0.1f, -0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.92f, 1.16f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(1.26f, 1.0f)
                arcTo(1.25f, 1.25f, 0.0f, true, false, 10.25f, 10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.55f, -1.26f)
                lineToRelative(-0.08f, -0.08f)
                lineToRelative(-2.5f, -2.0f)
                lineToRelative(-0.1f, -0.06f)
                lineToRelative(0.1f, 0.06f)
                close()
                moveTo(16.84f, 6.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.97f, -0.18f)
                lineToRelative(-0.09f, 0.06f)
                lineToRelative(-2.5f, 2.0f)
                lineToRelative(-0.08f, 0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.44f, 1.25f)
                horizontalLineToRelative(0.11f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 1.83f, -1.1f)
                lineToRelative(-0.12f, -0.05f)
                lineToRelative(1.26f, -1.0f)
                lineToRelative(0.08f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.04f, -0.98f)
                close()
            }
        }
        return _emojiAngry!!
    }

private var _emojiAngry: ImageVector? = null
