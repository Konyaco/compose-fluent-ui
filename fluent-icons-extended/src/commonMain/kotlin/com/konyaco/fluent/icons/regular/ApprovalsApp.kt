

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ApprovalsApp: ImageVector
    get() {
        if (_approvalsApp != null) {
            return _approvalsApp!!
        }
        _approvalsApp = fluentIcon(name = "Regular.ApprovalsApp") {
            fluentPath {
                moveTo(11.78f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineTo(11.94f, 4.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 9.02f, 9.82f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, -0.13f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, -7.52f, -8.19f)
                lineToRelative(-1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.06f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                lineToRelative(-2.5f, -2.5f)
                close()
                moveTo(15.78f, 10.22f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(3.97f, -3.97f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
            }
        }
        return _approvalsApp!!
    }

private var _approvalsApp: ImageVector? = null
