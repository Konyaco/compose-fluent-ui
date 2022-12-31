

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChatVideo: ImageVector
    get() {
        if (_chatVideo != null) {
            return _chatVideo!!
        }
        _chatVideo = fluentIcon(name = "Regular.ChatVideo") {
            fluentPath {
                moveTo(12.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(9.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 13.16f)
                verticalLineToRelative(-2.32f)
                lineToRelative(1.73f, -1.64f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.27f, 0.54f)
                verticalLineToRelative(4.52f)
                curveToRelative(0.0f, 0.66f, -0.79f, 1.0f, -1.27f, 0.54f)
                lineTo(15.0f, 13.16f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -18.89f, 4.6f)
                lineToRelative(-1.06f, 3.82f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 1.54f, 1.54f)
                lineToRelative(3.82f, -1.07f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 4.37f, 7.43f)
                lineToRelative(-0.27f, -0.15f)
                lineToRelative(-3.99f, 1.11f)
                lineToRelative(1.11f, -3.98f)
                lineToRelative(-0.15f, -0.27f)
                arcTo(8.46f, 8.46f, 0.0f, false, true, 3.5f, 12.0f)
                close()
            }
        }
        return _chatVideo!!
    }

private var _chatVideo: ImageVector? = null
