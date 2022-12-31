

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) {
            return _textUnderline!!
        }
        _textUnderline = fluentIcon(name = "Filled.TextUnderline") {
            fluentPath {
                moveTo(6.0f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.46f, 1.32f, 5.0f, 4.25f, 5.0f)
                curveToRelative(2.93f, 0.0f, 4.25f, -1.54f, 4.25f, -5.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 4.54f, -2.18f, 7.0f, -6.25f, 7.0f)
                curveToRelative(-4.08f, 0.0f, -6.25f, -2.46f, -6.25f, -7.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(7.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
