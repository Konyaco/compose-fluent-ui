

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BookSearch: ImageVector
    get() {
        if (_bookSearch != null) {
            return _bookSearch!!
        }
        _bookSearch = fluentIcon(name = "Regular.BookSearch") {
            fluentPath {
                moveTo(14.82f, 11.8f)
                arcToRelative(3.72f, 3.72f, 0.0f, true, false, -1.02f, 1.02f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(0.07f, 0.06f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.95f, -1.09f)
                lineToRelative(-2.47f, -2.46f)
                close()
                moveTo(11.72f, 7.45f)
                arcToRelative(2.28f, 2.28f, 0.0f, true, true, 0.0f, 4.55f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, 0.0f, -4.55f)
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
        return _bookSearch!!
    }

private var _bookSearch: ImageVector? = null
