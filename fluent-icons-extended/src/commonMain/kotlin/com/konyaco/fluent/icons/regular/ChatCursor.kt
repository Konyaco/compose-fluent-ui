

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChatCursor: ImageVector
    get() {
        if (_chatCursor != null) {
            return _chatCursor!!
        }
        _chatCursor = fluentIcon(name = "Regular.ChatCursor") {
            fluentPath {
                moveTo(10.0f, 1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.48f, 10.86f)
                lineToRelative(-0.84f, -0.63f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -12.75f, 1.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.07f, 0.27f)
                lineToRelative(-0.02f, 0.1f)
                lineToRelative(-0.75f, 3.01f)
                lineToRelative(3.02f, -0.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.19f, -0.01f)
                lineToRelative(0.09f, 0.02f)
                lineToRelative(0.09f, 0.04f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 4.42f, 0.82f)
                verticalLineToRelative(1.0f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, true, -4.61f, -0.8f)
                lineToRelative(-0.12f, -0.05f)
                lineToRelative(-3.65f, 0.9f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.62f, -0.44f)
                verticalLineToRelative(-0.08f)
                lineToRelative(0.01f, -0.08f)
                lineToRelative(0.92f, -3.64f)
                lineToRelative(-0.07f, -0.12f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, true, -0.83f, -2.9f)
                lineToRelative(-0.02f, -0.37f)
                lineTo(2.0f, 9.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                close()
                moveTo(21.6f, 16.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 18.0f)
                horizontalLineToRelative(-4.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.88f, 0.53f)
                lineToRelative(-1.84f, 3.44f)
                curveToRelative(-0.49f, 0.92f, -1.88f, 0.57f, -1.88f, -0.47f)
                lineTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.6f, -0.8f)
                lineToRelative(8.0f, 6.0f)
                close()
            }
        }
        return _chatCursor!!
    }

private var _chatCursor: ImageVector? = null
