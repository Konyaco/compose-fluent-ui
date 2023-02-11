

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookmarkSearch: ImageVector
    get() {
        if (_bookmarkSearch != null) {
            return _bookmarkSearch!!
        }
        _bookmarkSearch = fluentIcon(name = "Filled.BookmarkSearch") {
            fluentPath {
                moveTo(19.1f, 9.17f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.62f, 2.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineTo(19.1f, 9.17f)
                close()
                moveTo(19.5f, 5.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                close()
                moveTo(19.0f, 10.48f)
                verticalLineToRelative(10.76f)
                curveToRelative(0.0f, 0.62f, -0.7f, 0.97f, -1.19f, 0.61f)
                lineToRelative(-5.8f, -4.18f)
                lineToRelative(-5.82f, 4.18f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.19f, -0.6f)
                verticalLineToRelative(-15.0f)
                curveTo(5.0f, 4.45f, 6.46f, 3.0f, 8.25f, 3.0f)
                horizontalLineToRelative(3.35f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 7.35f, 7.43f)
                lineToRelative(0.05f, 0.05f)
                close()
            }
        }
        return _bookmarkSearch!!
    }

private var _bookmarkSearch: ImageVector? = null
