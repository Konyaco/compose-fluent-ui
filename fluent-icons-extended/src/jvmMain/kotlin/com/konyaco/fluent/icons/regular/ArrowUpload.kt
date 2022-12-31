

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowUpload: ImageVector
    get() {
        if (_arrowUpload != null) {
            return _arrowUpload!!
        }
        _arrowUpload = fluentIcon(name = "Regular.ArrowUpload") {
            fluentPath {
                moveTo(18.25f, 3.51f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(11.65f, 22.0f)
                horizontalLineToRelative(0.1f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.74f, -0.64f)
                lineToRelative(0.01f, -0.1f)
                verticalLineTo(7.56f)
                lineToRelative(3.72f, 3.72f)
                curveToRelative(0.27f, 0.27f, 0.68f, 0.29f, 0.98f, 0.07f)
                lineToRelative(0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.07f, -0.98f)
                lineToRelative(-0.07f, -0.08f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.97f, -0.07f)
                lineToRelative(-0.09f, 0.07f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.98f, 1.13f)
                lineToRelative(0.08f, -0.07f)
                lineTo(11.0f, 7.58f)
                verticalLineToRelative(13.67f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.65f, 0.75f)
                close()
            }
        }
        return _arrowUpload!!
    }

private var _arrowUpload: ImageVector? = null
