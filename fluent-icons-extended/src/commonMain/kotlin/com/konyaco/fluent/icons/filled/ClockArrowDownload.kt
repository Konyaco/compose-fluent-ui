

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ClockArrowDownload: ImageVector
    get() {
        if (_clockArrowDownload != null) {
            return _clockArrowDownload!!
        }
        _clockArrowDownload = fluentIcon(name = "Filled.ClockArrowDownload") {
            fluentPath {
                moveTo(16.25f, 12.5f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(13.0f, 1.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -9.95f, 11.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 12.0f, 20.95f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 13.0f, 1.0f)
                close()
                moveTo(1.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.0f, -5.48f)
                verticalLineToRelative(5.77f)
                lineToRelative(-1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.2f, 0.7f, 0.0f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineTo(7.0f, 17.79f)
                verticalLineToRelative(-5.77f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -6.0f, 5.48f)
                close()
                moveTo(3.5f, 20.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(4.0f, 20.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
            }
        }
        return _clockArrowDownload!!
    }

private var _clockArrowDownload: ImageVector? = null
