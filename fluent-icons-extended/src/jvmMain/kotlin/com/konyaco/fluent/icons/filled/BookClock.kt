

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookClock: ImageVector
    get() {
        if (_bookClock != null) {
            return _bookClock!!
        }
        _bookClock = fluentIcon(name = "Filled.BookClock") {
            fluentPath {
                moveTo(11.75f, 11.38f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, 0.69f, 0.62f)
                horizontalLineToRelative(1.31f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, false, 0.0f, -1.25f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.12f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, false, -1.25f, 0.0f)
                verticalLineToRelative(2.26f)
                close()
                moveTo(4.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 2.0f)
                horizontalLineTo(18.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(14.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                close()
                moveTo(12.38f, 6.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, false, 0.0f, 9.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 0.0f, -9.5f)
                close()
            }
        }
        return _bookClock!!
    }

private var _bookClock: ImageVector? = null
