

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookArrowClockwise: ImageVector
    get() {
        if (_bookArrowClockwise != null) {
            return _bookArrowClockwise!!
        }
        _bookArrowClockwise = fluentIcon(name = "Filled.BookArrowClockwise") {
            fluentPath {
                moveTo(22.0f, 4.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.33f)
                lineToRelative(-0.02f, -0.01f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 21.5f, 7.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 23.0f, 7.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -2.5f, -4.87f)
                verticalLineTo(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(2.75f)
                close()
                moveTo(12.1f, 2.0f)
                horizontalLineTo(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 22.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(14.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-5.69f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.1f, 2.0f)
                close()
            }
        }
        return _bookArrowClockwise!!
    }

private var _bookArrowClockwise: ImageVector? = null
