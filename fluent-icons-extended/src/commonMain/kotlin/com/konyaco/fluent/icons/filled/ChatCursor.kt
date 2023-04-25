

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChatCursor: ImageVector
    get() {
        if (_chatCursor != null) {
            return _chatCursor!!
        }
        _chatCursor = fluentIcon(name = "Filled.ChatCursor") {
            fluentPath {
                moveTo(10.0f, 1.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.48f, 10.86f)
                lineTo(14.2f, 9.4f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 11.0f)
                verticalLineToRelative(5.94f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, true, -4.61f, -0.8f)
                lineToRelative(-0.12f, -0.07f)
                lineToRelative(-3.65f, 0.92f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.62f, -0.45f)
                verticalLineToRelative(-0.08f)
                lineToRelative(0.01f, -0.08f)
                lineToRelative(0.92f, -3.64f)
                lineToRelative(-0.07f, -0.12f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, true, -0.83f, -2.9f)
                lineToRelative(-0.02f, -0.37f)
                lineTo(2.0f, 9.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                close()
                moveTo(13.6f, 10.2f)
                lineTo(21.6f, 16.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 18.0f)
                horizontalLineToRelative(-4.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.88f, 0.53f)
                lineToRelative(-1.84f, 3.44f)
                curveToRelative(-0.49f, 0.92f, -1.88f, 0.57f, -1.88f, -0.47f)
                lineTo(12.0f, 11.0f)
                arcToRelative(1.05f, 1.05f, 0.0f, false, true, 0.12f, -0.47f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.48f, -0.33f)
                close()
            }
        }
        return _chatCursor!!
    }

private var _chatCursor: ImageVector? = null
