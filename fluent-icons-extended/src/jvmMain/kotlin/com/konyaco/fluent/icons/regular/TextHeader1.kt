

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextHeader1: ImageVector
    get() {
        if (_textHeader1 != null) {
            return _textHeader1!!
        }
        _textHeader1 = fluentIcon(name = "Regular.TextHeader1") {
            fluentPath {
                moveTo(19.59f, 5.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.8f, 0.08f)
                curveToRelative(-0.13f, 0.1f, -0.21f, 0.23f, -0.26f, 0.37f)
                arcToRelative(7.63f, 7.63f, 0.0f, false, true, -3.17f, 4.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.78f, 1.28f)
                arcToRelative(8.66f, 8.66f, 0.0f, false, false, 2.36f, -2.14f)
                verticalLineToRelative(9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(5.77f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.41f, -0.69f)
                close()
                moveTo(3.5f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(5.75f)
                close()
            }
        }
        return _textHeader1!!
    }

private var _textHeader1: ImageVector? = null
