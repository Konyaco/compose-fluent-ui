

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BookLetter: ImageVector
    get() {
        if (_bookLetter != null) {
            return _bookLetter!!
        }
        _bookLetter = fluentIcon(name = "Regular.BookLetter") {
            fluentPath {
                moveTo(12.5f, 6.0f)
                curveToRelative(-0.3f, 0.0f, -0.58f, 0.18f, -0.7f, 0.47f)
                lineToRelative(-3.24f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.38f, 0.56f)
                lineToRelative(0.83f, -2.03f)
                horizontalLineToRelative(3.46f)
                lineToRelative(0.83f, 2.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.38f, -0.56f)
                lineToRelative(-3.25f, -8.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 12.5f, 6.0f)
                close()
                moveTo(11.38f, 11.5f)
                lineToRelative(1.12f, -2.76f)
                lineToRelative(1.12f, 2.76f)
                horizontalLineToRelative(-2.24f)
                close()
                moveTo(4.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 2.0f)
                lineTo(18.0f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(14.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(5.5f, 19.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(6.5f, 22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                close()
                moveTo(5.5f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(6.5f, 3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(5.5f, 18.0f)
                close()
            }
        }
        return _bookLetter!!
    }

private var _bookLetter: ImageVector? = null
