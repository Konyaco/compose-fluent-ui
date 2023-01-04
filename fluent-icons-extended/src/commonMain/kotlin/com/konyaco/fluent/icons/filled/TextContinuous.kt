

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextContinuous: ImageVector
    get() {
        if (_textContinuous != null) {
            return _textContinuous!!
        }
        _textContinuous = fluentIcon(name = "Filled.TextContinuous") {
            fluentPath {
                moveTo(3.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(4.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(8.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(8.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(9.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(20.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                close()
                moveTo(3.3f, 11.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, -1.4f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.4f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, -1.4f)
                lineToRelative(0.79f, -0.8f)
                lineToRelative(-0.8f, -0.8f)
                close()
            }
        }
        return _textContinuous!!
    }

private var _textContinuous: ImageVector? = null
