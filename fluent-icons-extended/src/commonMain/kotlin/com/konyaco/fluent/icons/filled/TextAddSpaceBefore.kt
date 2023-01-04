

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextAddSpaceBefore: ImageVector
    get() {
        if (_textAddSpaceBefore != null) {
            return _textAddSpaceBefore!!
        }
        _textAddSpaceBefore = fluentIcon(name = "Filled.TextAddSpaceBefore") {
            fluentPath {
                moveTo(9.3f, 6.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, -1.4f)
                lineTo(12.0f, 6.08f)
                lineToRelative(1.3f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, 1.42f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(3.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(4.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(3.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(4.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
        }
        return _textAddSpaceBefore!!
    }

private var _textAddSpaceBefore: ImageVector? = null
