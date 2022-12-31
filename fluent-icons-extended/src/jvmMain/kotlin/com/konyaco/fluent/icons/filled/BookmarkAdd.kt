

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookmarkAdd: ImageVector
    get() {
        if (_bookmarkAdd != null) {
            return _bookmarkAdd!!
        }
        _bookmarkAdd = fluentIcon(name = "Filled.BookmarkAdd") {
            fluentPath {
                moveTo(23.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(18.0f, 7.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(17.5f, 13.0f)
                curveToRelative(0.52f, 0.0f, 1.02f, -0.06f, 1.5f, -0.17f)
                verticalLineToRelative(8.42f)
                curveToRelative(0.0f, 0.6f, -0.7f, 0.96f, -1.19f, 0.6f)
                lineToRelative(-5.8f, -4.18f)
                lineToRelative(-5.82f, 4.18f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.19f, -0.6f)
                verticalLineToRelative(-15.0f)
                curveTo(5.0f, 4.45f, 6.46f, 3.0f, 8.25f, 3.0f)
                horizontalLineToRelative(3.77f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 5.48f, 10.0f)
                close()
            }
        }
        return _bookmarkAdd!!
    }

private var _bookmarkAdd: ImageVector? = null
