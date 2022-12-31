

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DoorTag: ImageVector
    get() {
        if (_doorTag != null) {
            return _doorTag!!
        }
        _doorTag = fluentIcon(name = "Regular.DoorTag") {
            fluentPath {
                moveTo(9.75f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(10.8f, 7.1f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 9.5f)
                horizontalLineTo(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 7.2f, 4.4f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 3.6f, 2.7f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.4f, 1.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.2f, -0.9f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 16.5f, 8.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                close()
            }
        }
        return _doorTag!!
    }

private var _doorTag: ImageVector? = null
