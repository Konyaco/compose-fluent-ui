

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookmarkOff: ImageVector
    get() {
        if (_bookmarkOff != null) {
            return _bookmarkOff!!
        }
        _bookmarkOff = fluentIcon(name = "Filled.BookmarkOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.79f, 2.79f)
                verticalLineToRelative(15.18f)
                curveToRelative(0.0f, 0.6f, 0.68f, 0.96f, 1.18f, 0.6f)
                lineTo(12.0f, 17.67f)
                lineToRelative(5.81f, 4.18f)
                curveToRelative(0.5f, 0.36f, 1.2f, 0.0f, 1.2f, -0.6f)
                verticalLineToRelative(-1.19f)
                lineToRelative(1.7f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.07f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(19.0f, 6.25f)
                verticalLineToRelative(9.57f)
                lineTo(6.62f, 3.44f)
                arcTo(3.24f, 3.24f, 0.0f, false, true, 8.25f, 3.0f)
                horizontalLineToRelative(7.5f)
                curveTo(17.55f, 3.0f, 19.0f, 4.45f, 19.0f, 6.25f)
                close()
            }
        }
        return _bookmarkOff!!
    }

private var _bookmarkOff: ImageVector? = null
