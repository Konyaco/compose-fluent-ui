

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextCaseUppercase: ImageVector
    get() {
        if (_textCaseUppercase != null) {
            return _textCaseUppercase!!
        }
        _textCaseUppercase = fluentIcon(name = "Filled.TextCaseUppercase") {
            fluentPath {
                moveTo(18.0f, 3.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(15.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(3.88f)
                arcToRelative(4.87f, 4.87f, 0.0f, false, false, 2.43f, -9.1f)
                arcTo(4.74f, 4.74f, 0.0f, false, false, 18.0f, 3.0f)
                close()
                moveTo(18.0f, 10.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, 5.5f)
                close()
                moveTo(16.0f, 18.25f)
                lineTo(16.0f, 12.5f)
                horizontalLineToRelative(2.88f)
                arcToRelative(2.88f, 2.88f, 0.0f, false, true, 0.0f, 5.75f)
                lineTo(16.0f, 18.25f)
                close()
                moveTo(7.26f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.93f, 0.66f)
                lineToRelative(5.5f, 15.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.88f, 0.68f)
                lineTo(10.51f, 16.0f)
                lineTo(3.8f, 16.0f)
                lineToRelative(-1.35f, 3.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.88f, -0.7f)
                lineTo(6.31f, 3.65f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.26f, 3.0f)
                close()
                moveTo(4.55f, 14.0f)
                horizontalLineToRelative(5.24f)
                lineTo(7.23f, 6.89f)
                lineTo(4.55f, 14.0f)
                close()
            }
        }
        return _textCaseUppercase!!
    }

private var _textCaseUppercase: ImageVector? = null
