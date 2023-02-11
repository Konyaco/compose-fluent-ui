

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Board: ImageVector
    get() {
        if (_board != null) {
            return _board!!
        }
        _board = fluentIcon(name = "Filled.Board") {
            fluentPath {
                moveTo(11.5f, 9.5f)
                lineTo(11.5f, 21.0f)
                lineTo(6.25f, 21.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.06f)
                lineTo(3.0f, 17.75f)
                lineTo(3.0f, 9.5f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(13.0f, 15.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 1.8f, -1.45f, 3.25f, -3.25f, 3.25f)
                lineTo(13.0f, 21.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(18.25f, 2.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.25f, 3.06f)
                lineTo(21.5f, 14.0f)
                lineTo(13.0f, 14.0f)
                lineTo(13.0f, 2.5f)
                horizontalLineToRelative(5.25f)
                close()
                moveTo(11.5f, 2.5f)
                lineTo(11.5f, 8.0f)
                lineTo(3.0f, 8.0f)
                lineTo(3.0f, 5.75f)
                curveTo(3.0f, 3.95f, 4.46f, 2.5f, 6.25f, 2.5f)
                horizontalLineToRelative(5.25f)
                close()
            }
        }
        return _board!!
    }

private var _board: ImageVector? = null
