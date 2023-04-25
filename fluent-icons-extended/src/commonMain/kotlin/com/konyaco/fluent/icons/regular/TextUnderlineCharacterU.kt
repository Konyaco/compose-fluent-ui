

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextUnderlineCharacterU: ImageVector
    get() {
        if (_textUnderlineCharacterU != null) {
            return _textUnderlineCharacterU!!
        }
        _textUnderlineCharacterU = fluentIcon(name = "Regular.TextUnderlineCharacterU") {
            fluentPath {
                moveTo(8.5f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineTo(12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                verticalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineTo(12.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                verticalLineTo(4.75f)
                close()
                moveTo(6.75f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        return _textUnderlineCharacterU!!
    }

private var _textUnderlineCharacterU: ImageVector? = null
