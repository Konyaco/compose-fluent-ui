

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.EmojiAdd: ImageVector
    get() {
        if (_emojiAdd != null) {
            return _emojiAdd!!
        }
        _emojiAdd = fluentIcon(name = "Filled.EmojiAdd") {
            fluentPath {
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.97f, 10.78f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -10.88f, 3.63f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, true, -2.63f, -1.63f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.18f, 0.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.73f, 2.21f)
                curveToRelative(0.1f, 1.56f, 0.76f, 2.98f, 1.77f, 4.05f)
                lineTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, -20.0f)
                close()
                moveTo(17.5f, 14.0f)
                horizontalLineToRelative(-0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.4f)
                lineToRelative(-0.01f, 0.1f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(-2.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, 0.4f)
                verticalLineToRelative(0.19f)
                curveToRelative(0.04f, 0.2f, 0.2f, 0.36f, 0.4f, 0.4f)
                lineTo(17.0f, 17.99f)
                verticalLineToRelative(2.61f)
                curveToRelative(0.05f, 0.2f, 0.2f, 0.36f, 0.41f, 0.4f)
                horizontalLineToRelative(0.18f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.4f)
                lineToRelative(0.01f, -0.1f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(2.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.4f, -0.41f)
                verticalLineToRelative(-0.18f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, -0.4f)
                lineToRelative(-0.1f, -0.01f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(-2.6f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.41f, -0.4f)
                horizontalLineToRelative(-0.09f)
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
        return _emojiAdd!!
    }

private var _emojiAdd: ImageVector? = null
