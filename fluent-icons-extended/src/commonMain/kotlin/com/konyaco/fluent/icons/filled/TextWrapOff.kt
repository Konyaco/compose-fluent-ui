

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextWrapOff: ImageVector
    get() {
        if (_textWrapOff != null) {
            return _textWrapOff!!
        }
        _textWrapOff = fluentIcon(name = "Filled.TextWrapOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(3.94f, 5.0f)
                lineTo(3.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.94f)
                lineToRelative(4.0f, 4.0f)
                lineTo(3.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.94f)
                lineToRelative(2.32f, 2.32f)
                lineToRelative(-1.97f, 1.97f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, -1.42f)
                lineToRelative(-0.3f, -0.29f)
                horizontalLineToRelative(2.53f)
                lineToRelative(2.78f, 2.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(14.18f, 11.0f)
                lineTo(19.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.39f, 7.2f)
                lineToRelative(-1.45f, -1.44f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 13.0f)
                horizontalLineToRelative(-2.82f)
                lineToRelative(-2.0f, -2.0f)
                close()
                moveTo(10.18f, 7.0f)
                lineTo(8.18f, 5.0f)
                lineTo(21.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(10.18f, 7.0f)
                close()
                moveTo(2.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(3.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
        }
        return _textWrapOff!!
    }

private var _textWrapOff: ImageVector? = null
