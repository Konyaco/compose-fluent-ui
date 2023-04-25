

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChatAdd: ImageVector
    get() {
        if (_chatAdd != null) {
            return _chatAdd!!
        }
        _chatAdd = fluentIcon(name = "Regular.ChatAdd") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.97f, 10.78f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, -1.47f, -1.05f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, -15.93f, 4.4f)
                lineToRelative(0.15f, 0.28f)
                lineToRelative(-1.1f, 3.98f)
                lineToRelative(3.98f, -1.11f)
                lineToRelative(0.27f, 0.15f)
                arcToRelative(8.45f, 8.45f, 0.0f, false, false, 3.86f, 1.07f)
                curveToRelative(0.28f, 0.54f, 0.64f, 1.03f, 1.05f, 1.47f)
                arcToRelative(10.14f, 10.14f, 0.0f, false, true, -5.37f, -1.08f)
                lineTo(3.6f, 21.96f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.54f, -1.54f)
                lineToRelative(1.06f, -3.83f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(18.0f, 18.0f)
                close()
            }
        }
        return _chatAdd!!
    }

private var _chatAdd: ImageVector? = null
