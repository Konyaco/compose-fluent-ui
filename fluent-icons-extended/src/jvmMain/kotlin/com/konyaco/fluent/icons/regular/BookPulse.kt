

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BookPulse: ImageVector
    get() {
        if (_bookPulse != null) {
            return _bookPulse!!
        }
        _bookPulse = fluentIcon(name = "Regular.BookPulse") {
            fluentPath {
                moveTo(11.7f, 7.46f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.37f, -0.05f)
                lineTo(8.79f, 10.5f)
                horizontalLineTo(7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0.0f, 0.54f, -0.16f, 0.67f, -0.41f)
                lineToRelative(1.02f, -2.05f)
                lineToRelative(2.12f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.34f, 0.09f)
                lineTo(15.93f, 12.0f)
                horizontalLineToRelative(0.82f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.37f)
                lineToRelative(-1.0f, 1.7f)
                lineToRelative(-2.16f, -5.11f)
                close()
                moveTo(6.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 22.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                horizontalLineToRelative(14.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 2.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(19.0f, 18.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        return _bookPulse!!
    }

private var _bookPulse: ImageVector? = null
