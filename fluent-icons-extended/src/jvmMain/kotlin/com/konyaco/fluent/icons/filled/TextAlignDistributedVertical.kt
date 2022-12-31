

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextAlignDistributedVertical: ImageVector
    get() {
        if (_textAlignDistributedVertical != null) {
            return _textAlignDistributedVertical!!
        }
        _textAlignDistributedVertical = fluentIcon(name = "Filled.TextAlignDistributedVertical") {
            fluentPath {
                moveTo(19.0f, 5.41f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(5.41f)
                lineToRelative(-0.3f, 0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.4f, -1.42f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 1.42f)
                lineToRelative(-0.3f, -0.3f)
                close()
                moveTo(5.0f, 18.6f)
                lineToRelative(-0.3f, -0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.42f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.4f, -1.42f)
                lineToRelative(-0.3f, 0.3f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(15.59f)
                close()
                moveTo(13.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        return _textAlignDistributedVertical!!
    }

private var _textAlignDistributedVertical: ImageVector? = null
