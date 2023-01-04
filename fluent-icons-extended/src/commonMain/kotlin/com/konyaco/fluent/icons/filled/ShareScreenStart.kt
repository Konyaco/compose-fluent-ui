

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShareScreenStart: ImageVector
    get() {
        if (_shareScreenStart != null) {
            return _shareScreenStart!!
        }
        _shareScreenStart = fluentIcon(name = "Filled.ShareScreenStart") {
            fluentPath {
                moveTo(4.25f, 4.0f)
                curveTo(3.01f, 4.0f, 2.0f, 5.0f, 2.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(2.0f, 18.99f, 3.0f, 20.0f, 4.25f, 20.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(22.0f, 6.25f)
                curveTo(22.0f, 5.01f, 21.0f, 4.0f, 19.75f, 4.0f)
                lineTo(4.25f, 4.0f)
                close()
                moveTo(12.53f, 7.47f)
                lineToRelative(3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-1.97f, -1.97f)
                verticalLineToRelative(6.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                lineTo(11.25f, 9.81f)
                lineToRelative(-1.97f, 1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(3.25f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                close()
            }
        }
        return _shareScreenStart!!
    }

private var _shareScreenStart: ImageVector? = null
