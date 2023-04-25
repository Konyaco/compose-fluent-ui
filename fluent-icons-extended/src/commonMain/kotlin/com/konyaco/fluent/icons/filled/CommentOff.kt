

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentOff: ImageVector
    get() {
        if (_commentOff != null) {
            return _commentOff!!
        }
        _commentOff = fluentIcon(name = "Filled.CommentOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(0.7f, 0.7f)
                arcTo(3.24f, 3.24f, 0.0f, false, false, 2.0f, 6.25f)
                verticalLineToRelative(8.5f)
                curveTo(2.0f, 16.55f, 3.46f, 18.0f, 5.25f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.0f, 1.0f)
                lineTo(13.0f, 18.0f)
                horizontalLineToRelative(3.94f)
                lineToRelative(3.78f, 3.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(22.0f, 14.75f)
                curveToRelative(0.0f, 1.1f, -0.55f, 2.08f, -1.4f, 2.67f)
                lineTo(6.18f, 3.0f)
                horizontalLineToRelative(12.57f)
                curveTo(20.55f, 3.0f, 22.0f, 4.46f, 22.0f, 6.25f)
                verticalLineToRelative(8.5f)
                close()
            }
        }
        return _commentOff!!
    }

private var _commentOff: ImageVector? = null
