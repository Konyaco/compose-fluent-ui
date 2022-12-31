

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ServiceBell: ImageVector
    get() {
        if (_serviceBell != null) {
            return _serviceBell!!
        }
        _serviceBell = fluentIcon(name = "Filled.ServiceBell") {
            fluentPath {
                moveTo(10.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(1.24f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, true, 6.25f, 8.0f)
                curveToRelative(0.0f, 0.42f, -0.34f, 0.76f, -0.75f, 0.76f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                curveToRelative(0.0f, -3.86f, 2.67f, -7.1f, 6.25f, -8.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(13.25f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                curveToRelative(1.25f, 0.0f, 2.14f, 0.62f, 2.89f, 1.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.22f, -0.86f)
                arcToRelative(4.87f, 4.87f, 0.0f, false, false, -4.11f, -2.32f)
                close()
                moveTo(2.0f, 17.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                lineTo(4.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
            }
        }
        return _serviceBell!!
    }

private var _serviceBell: ImageVector? = null
