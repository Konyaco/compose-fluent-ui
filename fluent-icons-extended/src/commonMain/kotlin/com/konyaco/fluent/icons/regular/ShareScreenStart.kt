

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShareScreenStart: ImageVector
    get() {
        if (_shareScreenStart != null) {
            return _shareScreenStart!!
        }
        _shareScreenStart = fluentIcon(name = "Regular.ShareScreenStart") {
            fluentPath {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 5.01f, 3.0f, 4.0f, 4.25f, 4.0f)
                horizontalLineToRelative(15.5f)
                curveTo(20.99f, 4.0f, 22.0f, 5.0f, 22.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                lineTo(4.25f, 20.0f)
                curveTo(3.01f, 20.0f, 2.0f, 19.0f, 2.0f, 17.75f)
                lineTo(2.0f, 6.25f)
                close()
                moveTo(4.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(20.5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(4.25f, 5.5f)
                close()
                moveTo(12.0f, 7.25f)
                curveToRelative(0.2f, 0.0f, 0.39f, 0.07f, 0.53f, 0.22f)
                lineToRelative(3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-1.97f, -1.97f)
                verticalLineToRelative(6.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.25f, 9.81f)
                lineToRelative(-1.97f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(3.25f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.53f, -0.22f)
                close()
            }
        }
        return _shareScreenStart!!
    }

private var _shareScreenStart: ImageVector? = null
