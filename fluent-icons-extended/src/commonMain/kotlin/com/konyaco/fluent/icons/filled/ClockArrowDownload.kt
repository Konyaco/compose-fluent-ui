

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
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -19.97f, 0.78f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, 8.97f, 0.03f)
                lineTo(11.0f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                lineTo(12.5f, 12.0f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.1f)
                lineToRelative(-0.14f, -0.01f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, -0.4f, 8.48f)
                lineTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
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
