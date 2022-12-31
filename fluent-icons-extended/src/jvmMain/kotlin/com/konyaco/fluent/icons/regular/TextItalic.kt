

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextItalic: ImageVector
    get() {
        if (_textItalic != null) {
            return _textItalic!!
        }
        _textItalic = fluentIcon(name = "Regular.TextItalic") {
            fluentPath {
                moveTo(9.75f, 4.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineTo(15.06f)
                lineToRelative(-5.01f, 13.0f)
                horizontalLineToRelative(4.21f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 0.38f, -0.27f, 0.7f, -0.64f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                horizontalLineToRelative(3.68f)
                lineToRelative(0.03f, -0.07f)
                lineTo(13.45f, 5.5f)
                horizontalLineToRelative(-3.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                verticalLineToRelative(-0.1f)
                curveToRelative(0.0f, -0.38f, 0.27f, -0.7f, 0.64f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                horizontalLineToRelative(8.5f)
                horizontalLineToRelative(-8.5f)
                close()
            }
        }
        return _textItalic!!
    }

private var _textItalic: ImageVector? = null
