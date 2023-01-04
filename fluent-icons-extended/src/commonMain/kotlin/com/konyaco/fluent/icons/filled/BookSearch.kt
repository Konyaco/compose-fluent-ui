

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookSearch: ImageVector
    get() {
        if (_bookSearch != null) {
            return _bookSearch!!
        }
        _bookSearch = fluentIcon(name = "Filled.BookSearch") {
            fluentPath {
                moveTo(11.72f, 7.45f)
                arcToRelative(2.28f, 2.28f, 0.0f, true, false, 0.0f, 4.55f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, false, 0.0f, -4.55f)
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
                moveTo(14.82f, 11.8f)
                arcToRelative(3.72f, 3.72f, 0.0f, true, false, -1.02f, 1.02f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(0.07f, 0.06f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.95f, -1.09f)
                lineToRelative(-2.47f, -2.46f)
                close()
            }
        }
        return _bookSearch!!
    }

private var _bookSearch: ImageVector? = null
