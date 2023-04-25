

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChatEmpty: ImageVector
    get() {
        if (_chatEmpty != null) {
            return _chatEmpty!!
        }
        _chatEmpty = fluentIcon(name = "Filled.ChatEmpty") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -18.86f, 4.65f)
                lineToRelative(-1.11f, 4.29f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, 1.04f, 1.04f)
                lineToRelative(4.29f, -1.12f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                close()
            }
        }
        return _chatEmpty!!
    }

private var _chatEmpty: ImageVector? = null
