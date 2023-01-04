

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookmarkMultiple: ImageVector
    get() {
        if (_bookmarkMultiple != null) {
            return _bookmarkMultiple!!
        }
        _bookmarkMultiple = fluentIcon(name = "Filled.BookmarkMultiple") {
            fluentPath {
                moveTo(4.0f, 6.75f)
                curveTo(4.0f, 5.5f, 5.0f, 4.5f, 6.25f, 4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, 0.65f)
                lineToRelative(-5.62f, -3.28f)
                lineToRelative(-5.62f, 3.28f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 21.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(15.25f, 2.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 20.0f, 6.75f)
                verticalLineToRelative(11.87f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(6.75f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineTo(6.64f)
                reflectiveCurveToRelative(0.11f, -0.56f, 0.8f, -1.08f)
                curveTo(8.0f, 2.0f, 8.6f, 2.0f, 8.6f, 2.0f)
                horizontalLineToRelative(6.65f)
                close()
            }
        }
        return _bookmarkMultiple!!
    }

private var _bookmarkMultiple: ImageVector? = null
