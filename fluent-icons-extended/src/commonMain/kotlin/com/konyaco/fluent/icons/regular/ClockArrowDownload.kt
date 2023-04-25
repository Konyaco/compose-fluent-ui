

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ClockArrowDownload: ImageVector
    get() {
        if (_clockArrowDownload != null) {
            return _clockArrowDownload!!
        }
        _clockArrowDownload = fluentIcon(name = "Regular.ClockArrowDownload") {
            fluentPath {
                moveTo(4.5f, 11.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 8.19f, 8.5f)
                curveToRelative(-0.17f, 0.51f, -0.4f, 1.0f, -0.68f, 1.45f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 3.05f, 12.0f)
                curveToRelative(0.45f, -0.28f, 0.94f, -0.51f, 1.46f, -0.68f)
                lineTo(4.5f, 11.0f)
                close()
                moveTo(13.0f, 5.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                verticalLineToRelative(6.1f)
                curveToRelative(0.06f, 0.37f, 0.37f, 0.65f, 0.75f, 0.65f)
                horizontalLineToRelative(4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 5.65f)
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
                moveTo(9.5f, 20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
            }
        }
        return _clockArrowDownload!!
    }

private var _clockArrowDownload: ImageVector? = null
