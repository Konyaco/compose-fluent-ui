

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowReply: ImageVector
    get() {
        if (_arrowReply != null) {
            return _arrowReply!!
        }
        _arrowReply = fluentIcon(name = "Filled.ArrowReply") {
            fluentPath {
                moveTo(9.7f, 16.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.41f, 1.4f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                lineToRelative(5.0f, -5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.7f, 7.7f)
                lineTo(6.41f, 11.0f)
                horizontalLineTo(13.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 7.75f)
                verticalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.78f, -6.0f)
                horizontalLineTo(6.41f)
                lineToRelative(3.3f, 3.3f)
                close()
            }
        }
        return _arrowReply!!
    }

private var _arrowReply: ImageVector? = null
