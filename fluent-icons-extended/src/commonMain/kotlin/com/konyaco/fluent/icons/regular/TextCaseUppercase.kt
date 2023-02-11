

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextCaseUppercase: ImageVector
    get() {
        if (_textCaseUppercase != null) {
            return _textCaseUppercase!!
        }
        _textCaseUppercase = fluentIcon(name = "Regular.TextCaseUppercase") {
            fluentPath {
                moveTo(7.7f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.4f, -0.02f)
                lineToRelative(-6.0f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.4f, 0.54f)
                lineToRelative(1.56f, -4.02f)
                horizontalLineToRelative(7.11f)
                lineToRelative(1.42f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.42f, -0.5f)
                lineTo(7.7f, 3.5f)
                close()
                moveTo(3.85f, 14.0f)
                lineToRelative(3.13f, -8.1f)
                lineTo(9.84f, 14.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(14.75f, 3.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 14.0f, 4.0f)
                verticalLineToRelative(15.25f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.13f)
                arcToRelative(4.63f, 4.63f, 0.0f, false, false, 2.0f, -8.8f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 18.0f, 3.26f)
                horizontalLineToRelative(-3.25f)
                close()
                moveTo(21.0f, 7.75f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(18.87f, 18.5f)
                horizontalLineTo(15.5f)
                verticalLineToRelative(-6.25f)
                horizontalLineToRelative(3.38f)
                arcToRelative(3.12f, 3.12f, 0.0f, true, true, 0.0f, 6.25f)
                close()
            }
        }
        return _textCaseUppercase!!
    }

private var _textCaseUppercase: ImageVector? = null
