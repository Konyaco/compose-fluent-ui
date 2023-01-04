

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextWrap: ImageVector
    get() {
        if (_textWrap != null) {
            return _textWrap!!
        }
        _textWrap = fluentIcon(name = "Regular.TextWrap") {
            fluentPath {
                moveTo(2.75f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(2.75f, 5.0f)
                close()
                moveTo(2.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(19.0f, 13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                horizontalLineToRelative(-4.44f)
                lineToRelative(0.72f, -0.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-0.72f, -0.72f)
                lineTo(19.0f, 19.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(2.75f, 11.5f)
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
        return _textWrap!!
    }

private var _textWrap: ImageVector? = null
