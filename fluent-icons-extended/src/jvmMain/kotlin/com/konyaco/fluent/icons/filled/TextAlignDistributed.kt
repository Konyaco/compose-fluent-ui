

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextAlignDistributed: ImageVector
    get() {
        if (_textAlignDistributed != null) {
            return _textAlignDistributed!!
        }
        _textAlignDistributed = fluentIcon(name = "Filled.TextAlignDistributed") {
            fluentPath {
                moveTo(4.3f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.4f)
                lineToRelative(-0.29f, 0.3f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineTo(5.41f)
                lineToRelative(0.3f, 0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, 1.4f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.4f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(18.58f, 19.0f)
                lineToRelative(-0.3f, 0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 1.4f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.4f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.4f)
                lineToRelative(0.3f, 0.3f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(15.59f)
                close()
                moveTo(3.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        return _textAlignDistributed!!
    }

private var _textAlignDistributed: ImageVector? = null
