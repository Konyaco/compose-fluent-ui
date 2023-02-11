

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BookmarkOff: ImageVector
    get() {
        if (_bookmarkOff != null) {
            return _bookmarkOff!!
        }
        _bookmarkOff = fluentIcon(name = "Regular.BookmarkOff") {
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
                moveTo(17.5f, 18.56f)
                verticalLineToRelative(1.22f)
                lineToRelative(-5.06f, -3.64f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.88f, 0.0f)
                lineTo(6.5f, 19.78f)
                lineTo(6.5f, 7.56f)
                lineToRelative(11.0f, 11.0f)
                close()
                moveTo(17.5f, 6.25f)
                verticalLineToRelative(8.07f)
                lineToRelative(1.5f, 1.5f)
                lineTo(19.0f, 6.25f)
                curveTo(19.0f, 4.45f, 17.55f, 3.0f, 15.75f, 3.0f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.6f, 0.0f, -1.15f, 0.16f, -1.63f, 0.44f)
                lineToRelative(1.13f, 1.13f)
                curveToRelative(0.16f, -0.05f, 0.33f, -0.07f, 0.5f, -0.07f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                close()
            }
        }
        return _bookmarkOff!!
    }

private var _bookmarkOff: ImageVector? = null
