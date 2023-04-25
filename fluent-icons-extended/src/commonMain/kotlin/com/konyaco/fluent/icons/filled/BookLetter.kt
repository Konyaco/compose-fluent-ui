

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookLetter: ImageVector
    get() {
        if (_bookLetter != null) {
            return _bookLetter!!
        }
        _bookLetter = fluentIcon(name = "Filled.BookLetter") {
            fluentPath {
                moveToRelative(12.5f, 8.74f)
                lineToRelative(1.12f, 2.76f)
                horizontalLineToRelative(-2.24f)
                lineToRelative(1.12f, -2.76f)
                close()
                moveTo(4.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 22.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(14.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 2.0f)
                horizontalLineTo(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 4.5f)
                close()
                moveTo(12.5f, 6.0f)
                curveToRelative(0.3f, 0.0f, 0.58f, 0.18f, 0.7f, 0.47f)
                lineToRelative(3.24f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.38f, 0.56f)
                lineTo(14.23f, 13.0f)
                horizontalLineToRelative(-3.46f)
                lineToRelative(-0.83f, 2.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.38f, -0.56f)
                lineToRelative(3.25f, -8.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 12.5f, 6.0f)
                close()
            }
        }
        return _bookLetter!!
    }

private var _bookLetter: ImageVector? = null
