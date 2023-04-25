

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.EmojiEdit: ImageVector
    get() {
        if (_emojiEdit != null) {
            return _emojiEdit!!
        }
        _emojiEdit = fluentIcon(name = "Regular.EmojiEdit") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.97f, 9.25f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -1.53f, -0.24f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, -9.14f, 9.46f)
                lineToRelative(-0.24f, 0.94f)
                curveToRelative(-0.04f, 0.18f, -0.06f, 0.36f, -0.06f, 0.54f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 16.5f)
                curveToRelative(1.12f, 0.0f, 2.17f, -0.41f, 2.98f, -1.13f)
                lineToRelative(-2.49f, 2.5f)
                lineToRelative(-0.12f, 0.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.09f, -2.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.18f, -0.93f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 12.0f, 16.5f)
                close()
                moveTo(9.0f, 8.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(15.0f, 8.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(19.1f, 12.67f)
                lineTo(13.2f, 18.57f)
                curveToRelative(-0.35f, 0.35f, -0.6f, 0.78f, -0.7f, 1.25f)
                lineToRelative(-0.47f, 1.83f)
                curveToRelative(-0.2f, 0.8f, 0.53f, 1.52f, 1.32f, 1.32f)
                lineToRelative(1.83f, -0.46f)
                curveToRelative(0.47f, -0.12f, 0.9f, -0.36f, 1.25f, -0.7f)
                lineToRelative(5.9f, -5.9f)
                arcToRelative(2.29f, 2.29f, 0.0f, false, false, -3.23f, -3.24f)
                close()
            }
        }
        return _emojiEdit!!
    }

private var _emojiEdit: ImageVector? = null
