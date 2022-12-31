

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BookArrowClockwise: ImageVector
    get() {
        if (_bookArrowClockwise != null) {
            return _bookArrowClockwise!!
        }
        _bookArrowClockwise = fluentIcon(name = "Regular.BookArrowClockwise") {
            fluentPath {
                moveTo(21.25f, 5.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(0.63f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 23.0f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -1.67f, -3.5f)
                horizontalLineTo(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(2.75f)
                close()
                moveTo(6.5f, 2.0f)
                horizontalLineToRelative(5.6f)
                curveToRelative(-0.45f, 0.44f, -0.84f, 0.95f, -1.16f, 1.5f)
                horizontalLineTo(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(-4.29f)
                arcToRelative(6.96f, 6.96f, 0.0f, false, false, 1.5f, -0.65f)
                verticalLineToRelative(5.69f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 2.0f)
                close()
            }
        }
        return _bookArrowClockwise!!
    }

private var _bookArrowClockwise: ImageVector? = null
