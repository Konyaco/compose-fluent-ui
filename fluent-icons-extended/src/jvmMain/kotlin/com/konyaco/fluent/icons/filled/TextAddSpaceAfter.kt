

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextAddSpaceAfter: ImageVector
    get() {
        if (_textAddSpaceAfter != null) {
            return _textAddSpaceAfter!!
        }
        _textAddSpaceAfter = fluentIcon(name = "Filled.TextAddSpaceAfter") {
            fluentPath {
                moveTo(3.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(4.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(3.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(4.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(9.3f, 18.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, 1.4f)
                lineToRelative(1.3f, -1.29f)
                lineToRelative(1.3f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, -1.42f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineToRelative(-2.0f, 2.0f)
                close()
            }
        }
        return _textAddSpaceAfter!!
    }

private var _textAddSpaceAfter: ImageVector? = null
