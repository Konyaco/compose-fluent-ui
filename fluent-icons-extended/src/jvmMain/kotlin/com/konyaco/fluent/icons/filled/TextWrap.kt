

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextWrap: ImageVector
    get() {
        if (_textWrap != null) {
            return _textWrap!!
        }
        _textWrap = fluentIcon(name = "Filled.TextWrap") {
            fluentPath {
                moveTo(3.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(3.0f, 5.0f)
                close()
                moveTo(3.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(16.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                horizontalLineToRelative(-3.84f)
                lineToRelative(0.3f, -0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.4f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.4f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, -1.4f)
                lineToRelative(-0.3f, -0.3f)
                horizontalLineToRelative(3.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(3.0f, 11.0f)
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
        return _textWrap!!
    }

private var _textWrap: ImageVector? = null
