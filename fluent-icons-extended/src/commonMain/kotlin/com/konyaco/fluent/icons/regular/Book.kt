

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = fluentIcon(name = "Regular.Book") {
            fluentPath {
                moveTo(7.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(8.5f, 7.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(1.0f)
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
        return _book!!
    }

private var _book: ImageVector? = null
