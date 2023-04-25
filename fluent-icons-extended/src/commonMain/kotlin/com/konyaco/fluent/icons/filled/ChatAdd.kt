

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChatAdd: ImageVector
    get() {
        if (_chatAdd != null) {
            return _chatAdd!!
        }
        _chatAdd = fluentIcon(name = "Filled.ChatAdd") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -18.86f, 4.65f)
                lineToRelative(-1.11f, 4.29f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, 1.04f, 1.04f)
                lineToRelative(4.29f, -1.12f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, false, 5.42f, 1.11f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 9.19f, -9.19f)
                lineTo(22.0f, 12.0f)
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
