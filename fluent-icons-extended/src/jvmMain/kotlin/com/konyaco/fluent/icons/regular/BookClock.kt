

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BookClock: ImageVector
    get() {
        if (_bookClock != null) {
            return _bookClock!!
        }
        _bookClock = fluentIcon(name = "Regular.BookClock") {
            fluentPath {
                moveTo(13.0f, 9.13f)
                verticalLineToRelative(1.62f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, true, 0.0f, 1.25f)
                horizontalLineToRelative(-1.37f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.63f, -0.63f)
                lineTo(11.75f, 9.13f)
                arcToRelative(0.62f, 0.62f, 0.0f, true, true, 1.25f, 0.0f)
                close()
                moveTo(12.37f, 6.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, false, 0.0f, 9.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 0.0f, -9.5f)
                close()
                moveTo(8.87f, 10.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                close()
                moveTo(6.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 22.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(6.5f, 20.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(14.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(20.5f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 2.0f)
                lineTo(6.5f, 2.0f)
                close()
                moveTo(19.0f, 18.0f)
                lineTo(5.5f, 18.0f)
                lineTo(5.5f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(18.0f, 3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(19.0f, 18.0f)
                close()
            }
        }
        return _bookClock!!
    }

private var _bookClock: ImageVector? = null
