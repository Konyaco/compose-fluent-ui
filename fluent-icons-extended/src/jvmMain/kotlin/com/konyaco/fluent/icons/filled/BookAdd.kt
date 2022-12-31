

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookAdd: ImageVector
    get() {
        if (_bookAdd != null) {
            return _bookAdd!!
        }
        _bookAdd = fluentIcon(name = "Filled.BookAdd") {
            fluentPath {
                moveTo(5.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 22.0f)
                horizontalLineToRelative(7.31f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, -1.08f, -1.5f)
                lineTo(5.5f, 20.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(6.81f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 8.19f, -8.19f)
                lineTo(19.5f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.0f, 2.0f)
                lineTo(5.5f, 2.0f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(7.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                lineTo(18.0f, 18.0f)
                close()
            }
        }
        return _bookAdd!!
    }

private var _bookAdd: ImageVector? = null
