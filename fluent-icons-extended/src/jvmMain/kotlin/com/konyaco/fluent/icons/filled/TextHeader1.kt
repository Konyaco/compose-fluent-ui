

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextHeader1: ImageVector
    get() {
        if (_textHeader1 != null) {
            return _textHeader1!!
        }
        _textHeader1 = fluentIcon(name = "Filled.TextHeader1") {
            fluentPath {
                moveTo(20.18f, 5.02f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 6.03f)
                verticalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(9.61f)
                arcToRelative(5.66f, 5.66f, 0.0f, false, true, -2.18f, 1.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.64f, -1.9f)
                curveToRelative(1.13f, -0.37f, 2.19f, -1.33f, 2.86f, -3.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.14f, -0.7f)
                close()
                moveTo(3.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        return _textHeader1!!
    }

private var _textHeader1: ImageVector? = null
