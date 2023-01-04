

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
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -19.97f, 0.78f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, 1.64f, -1.14f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, true, 16.66f, 0.36f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, true, -7.97f, 8.33f)
                curveToRelative(-0.3f, 0.6f, -0.68f, 1.16f, -1.14f, 1.64f)
                lineTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                close()
                moveTo(6.0f, 12.02f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 1.0f, 0.0f)
                verticalLineToRelative(5.77f)
                lineToRelative(1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, 0.7f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.7f, 0.0f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, -0.7f)
                lineTo(6.0f, 17.79f)
                verticalLineToRelative(-5.77f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(4.0f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                close()
                moveTo(12.5f, 6.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.1f)
                verticalLineToRelative(6.1f)
                curveToRelative(0.06f, 0.37f, 0.37f, 0.65f, 0.75f, 0.65f)
                horizontalLineToRelative(4.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                lineTo(12.5f, 12.0f)
                lineTo(12.5f, 6.65f)
                close()
            }
        }
        return _clockArrowDownload!!
    }

private var _clockArrowDownload: ImageVector? = null
