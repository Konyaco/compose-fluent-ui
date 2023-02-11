

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DoorTag: ImageVector
    get() {
        if (_doorTag != null) {
            return _doorTag!!
        }
        _doorTag = fluentIcon(name = "Filled.DoorTag") {
            fluentPath {
                moveTo(12.0f, 6.5f)
                curveToRelative(-0.49f, 0.0f, -0.92f, 0.23f, -1.2f, 0.6f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -3.6f, -2.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 8.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(8.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(9.75f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
            }
        }
        return _doorTag!!
    }

private var _doorTag: ImageVector? = null
