

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookPulse: ImageVector
    get() {
        if (_bookPulse != null) {
            return _bookPulse!!
        }
        _bookPulse = fluentIcon(name = "Filled.BookPulse") {
            fluentPath {
                moveTo(4.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 2.0f)
                lineTo(18.0f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(14.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(5.5f, 19.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(6.5f, 22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                close()
                moveTo(11.7f, 7.46f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.37f, -0.05f)
                lineTo(8.79f, 10.5f)
                lineTo(7.75f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0.0f, 0.54f, -0.16f, 0.67f, -0.41f)
                lineToRelative(1.02f, -2.05f)
                lineToRelative(2.12f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.34f, 0.09f)
                lineTo(15.93f, 12.0f)
                horizontalLineToRelative(0.82f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(15.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.37f)
                lineToRelative(-1.0f, 1.7f)
                lineToRelative(-2.16f, -5.11f)
                close()
            }
        }
        return _bookPulse!!
    }

private var _bookPulse: ImageVector? = null
