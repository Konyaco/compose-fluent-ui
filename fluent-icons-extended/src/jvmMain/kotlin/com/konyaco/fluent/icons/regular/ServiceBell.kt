

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ServiceBell: ImageVector
    get() {
        if (_serviceBell != null) {
            return _serviceBell!!
        }
        _serviceBell = fluentIcon(name = "Regular.ServiceBell") {
            fluentPath {
                moveTo(11.75f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 3.4f, 1.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.24f, -0.86f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.64f, -2.4f)
                close()
                moveTo(9.5f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(0.88f)
                arcToRelative(8.25f, 8.25f, 0.0f, false, true, 5.75f, 7.87f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                curveToRelative(0.0f, -3.68f, 2.42f, -6.8f, 5.75f, -7.86f)
                lineTo(9.5f, 4.5f)
                close()
                moveTo(13.0f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(0.56f)
                arcToRelative(8.33f, 8.33f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(13.0f, 4.5f)
                close()
                moveTo(5.3f, 12.5f)
                horizontalLineToRelative(13.4f)
                arcToRelative(6.73f, 6.73f, 0.0f, false, false, -6.68f, -6.0f)
                arcToRelative(6.77f, 6.77f, 0.0f, false, false, -6.73f, 6.0f)
                close()
                moveTo(4.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                lineTo(4.0f, 15.0f)
                close()
                moveTo(3.5f, 17.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(4.0f, 17.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        return _serviceBell!!
    }

private var _serviceBell: ImageVector? = null
