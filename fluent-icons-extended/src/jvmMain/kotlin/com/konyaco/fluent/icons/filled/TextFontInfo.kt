

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextFontInfo: ImageVector
    get() {
        if (_textFontInfo != null) {
            return _textFontInfo!!
        }
        _textFontInfo = fluentIcon(name = "Filled.TextFontInfo") {
            fluentPath {
                moveTo(9.51f, 1.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.93f, 0.67f)
                lineToRelative(3.16f, 8.88f)
                arcToRelative(6.53f, 6.53f, 0.0f, false, false, -1.54f, 1.65f)
                lineToRelative(-2.6f, -7.32f)
                lineTo(6.6f, 13.0f)
                horizontalLineToRelative(5.42f)
                curveToRelative(-0.39f, 0.6f, -0.68f, 1.28f, -0.85f, 2.0f)
                lineTo(5.83f, 15.0f)
                lineToRelative(-1.4f, 3.61f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.86f, -0.72f)
                lineToRelative(6.0f, -15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.94f, -0.64f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                close()
                moveTo(18.25f, 13.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(23.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(22.0f, 16.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 9.0f, 0.0f)
                close()
            }
        }
        return _textFontInfo!!
    }

private var _textFontInfo: ImageVector? = null
