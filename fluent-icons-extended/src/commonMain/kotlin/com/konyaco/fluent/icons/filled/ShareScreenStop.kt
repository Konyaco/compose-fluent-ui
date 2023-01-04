

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShareScreenStop: ImageVector
    get() {
        if (_shareScreenStop != null) {
            return _shareScreenStop!!
        }
        _shareScreenStop = fluentIcon(name = "Filled.ShareScreenStop") {
            fluentPath {
                moveTo(4.25f, 4.0f)
                horizontalLineToRelative(15.5f)
                curveTo(20.99f, 4.0f, 22.0f, 5.0f, 22.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                lineTo(4.25f, 20.0f)
                curveTo(3.01f, 20.0f, 2.0f, 19.0f, 2.0f, 17.75f)
                lineTo(2.0f, 6.25f)
                curveTo(2.0f, 5.01f, 3.0f, 4.0f, 4.25f, 4.0f)
                close()
                moveTo(9.28f, 8.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineTo(10.94f, 12.0f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineTo(12.0f, 13.06f)
                lineToRelative(2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(13.06f, 12.0f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(12.0f, 10.94f)
                lineTo(9.28f, 8.22f)
                close()
            }
        }
        return _shareScreenStop!!
    }

private var _shareScreenStop: ImageVector? = null
