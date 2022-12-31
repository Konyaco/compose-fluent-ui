

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ApprovalsApp: ImageVector
    get() {
        if (_approvalsApp != null) {
            return _approvalsApp!!
        }
        _approvalsApp = fluentIcon(name = "Filled.ApprovalsApp") {
            fluentPath {
                moveTo(10.54f, 1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, 0.0f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.4f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.42f, -1.4f)
                lineToRelative(0.76f, -0.77f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 7.65f, 7.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.98f, 0.24f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, -9.57f, -10.1f)
                lineToRelative(-0.82f, -0.81f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.42f)
                close()
                moveTo(16.21f, 9.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.4f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.42f, -1.4f)
                lineTo(11.0f, 13.58f)
                lineToRelative(3.8f, -3.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 0.0f)
                close()
            }
        }
        return _approvalsApp!!
    }

private var _approvalsApp: ImageVector? = null
