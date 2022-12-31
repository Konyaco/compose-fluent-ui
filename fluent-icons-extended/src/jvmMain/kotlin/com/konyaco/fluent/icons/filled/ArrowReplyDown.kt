

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowReplyDown: ImageVector
    get() {
        if (_arrowReplyDown != null) {
            return _arrowReplyDown!!
        }
        _arrowReplyDown = fluentIcon(name = "Filled.ArrowReplyDown") {
            fluentPath {
                moveTo(9.7f, 8.7f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 8.3f, 7.3f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.4f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.41f, -1.4f)
                lineTo(6.41f, 14.0f)
                horizontalLineTo(13.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -7.75f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.78f, 6.0f)
                horizontalLineTo(6.41f)
                lineToRelative(3.3f, -3.3f)
                close()
            }
        }
        return _arrowReplyDown!!
    }

private var _arrowReplyDown: ImageVector? = null
