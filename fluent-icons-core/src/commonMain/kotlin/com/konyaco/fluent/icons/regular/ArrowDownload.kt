

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowDownload: ImageVector
    get() {
        if (_arrowDownload != null) {
            return _arrowDownload!!
        }
        _arrowDownload = fluentIcon(name = "Regular.ArrowDownload") {
            fluentPath {
                moveTo(18.25f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(11.65f, 2.01f)
                horizontalLineToRelative(0.1f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.64f)
                lineToRelative(0.01f, 0.1f)
                verticalLineToRelative(13.7f)
                lineToRelative(3.72f, -3.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.68f, 0.07f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.97f, 0.07f)
                lineToRelative(-0.09f, -0.07f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.98f, -1.13f)
                lineToRelative(0.08f, 0.07f)
                lineTo(11.0f, 16.43f)
                lineTo(11.0f, 2.76f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.75f)
                horizontalLineToRelative(0.1f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        return _arrowDownload!!
    }

private var _arrowDownload: ImageVector? = null
