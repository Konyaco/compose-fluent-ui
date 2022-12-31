

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowReplyAll: ImageVector
    get() {
        if (_arrowReplyAll != null) {
            return _arrowReplyAll!!
        }
        _arrowReplyAll = fluentIcon(name = "Filled.ArrowReplyAll") {
            fluentPath {
                moveTo(13.7f, 16.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.41f, 1.4f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 1.4f)
                lineTo(10.41f, 11.0f)
                lineTo(13.0f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 7.75f)
                lineTo(21.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.78f, -6.0f)
                horizontalLineToRelative(-2.81f)
                lineToRelative(3.3f, 3.3f)
                close()
                moveTo(8.7f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.4f)
                lineTo(4.41f, 12.0f)
                lineToRelative(4.3f, 4.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.42f, 1.4f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.41f, 0.0f)
                close()
            }
        }
        return _arrowReplyAll!!
    }

private var _arrowReplyAll: ImageVector? = null
