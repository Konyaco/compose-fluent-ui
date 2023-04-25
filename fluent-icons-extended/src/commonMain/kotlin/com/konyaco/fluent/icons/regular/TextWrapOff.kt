

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextWrapOff: ImageVector
    get() {
        if (_textWrapOff != null) {
            return _textWrapOff!!
        }
        _textWrapOff = fluentIcon(name = "Regular.TextWrapOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(3.94f, 5.0f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.69f)
                lineToRelative(5.0f, 5.0f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(9.19f)
                lineToRelative(3.03f, 3.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.19f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-0.72f, -0.72f)
                horizontalLineToRelative(3.88f)
                lineToRelative(2.28f, 2.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(16.94f, 18.0f)
                horizontalLineToRelative(-2.38f)
                lineToRelative(0.72f, -0.72f)
                curveToRelative(0.2f, -0.2f, 0.27f, -0.5f, 0.19f, -0.75f)
                lineTo(16.94f, 18.0f)
                close()
                moveTo(19.0f, 11.5f)
                horizontalLineToRelative(-4.32f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineTo(19.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.6f, 4.42f)
                lineToRelative(1.06f, 1.06f)
                arcTo(3.99f, 3.99f, 0.0f, false, false, 19.0f, 11.5f)
                close()
                moveTo(8.18f, 5.0f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(11.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(8.18f)
                close()
                moveTo(2.0f, 18.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _textWrapOff!!
    }

private var _textWrapOff: ImageVector? = null
