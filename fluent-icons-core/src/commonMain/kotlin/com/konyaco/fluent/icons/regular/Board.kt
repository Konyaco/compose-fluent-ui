

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Board: ImageVector
    get() {
        if (_board != null) {
            return _board!!
        }
        _board = fluentIcon(name = "Regular.Board") {
            fluentPath {
                moveTo(18.25f, 2.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.25f, 3.06f)
                verticalLineToRelative(12.19f)
                curveToRelative(0.0f, 1.8f, -1.45f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.06f)
                lineTo(3.0f, 17.75f)
                verticalLineToRelative(-12.0f)
                curveTo(3.0f, 3.95f, 4.46f, 2.5f, 6.25f, 2.5f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(11.5f, 9.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(8.41f)
                curveToRelative(0.09f, 0.9f, 0.84f, 1.6f, 1.75f, 1.6f)
                horizontalLineToRelative(5.25f)
                lineTo(11.5f, 9.5f)
                close()
                moveTo(20.0f, 15.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(20.0f, 15.5f)
                close()
                moveTo(18.25f, 4.0f)
                lineTo(13.0f, 4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(7.0f)
                lineTo(20.0f, 5.59f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, -1.6f)
                close()
                moveTo(11.5f, 4.0f)
                lineTo(6.11f, 4.0f)
                curveToRelative(-0.9f, 0.08f, -1.6f, 0.83f, -1.6f, 1.75f)
                lineTo(4.5f, 8.0f)
                horizontalLineToRelative(7.0f)
                lineTo(11.5f, 4.0f)
                close()
            }
        }
        return _board!!
    }

private var _board: ImageVector? = null
