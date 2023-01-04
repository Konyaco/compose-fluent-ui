

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DeleteOff: ImageVector
    get() {
        if (_deleteOff != null) {
            return _deleteOff!!
        }
        _deleteOff = fluentIcon(name = "Filled.DeleteOff") {
            fluentPath {
                moveTo(3.94f, 5.0f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 1.06f)
                lineToRelative(-2.2f, -2.19f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.5f, 2.41f)
                lineTo(8.98f, 22.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.73f, -3.39f)
                lineTo(4.07f, 6.5f)
                lineTo(2.75f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.19f)
                close()
                moveTo(15.0f, 16.06f)
                lineToRelative(-1.5f, -1.5f)
                verticalLineToRelative(2.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.19f)
                close()
                moveTo(10.5f, 11.56f)
                lineTo(9.0f, 10.06f)
                verticalLineToRelative(7.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-5.69f)
                close()
                moveTo(15.0f, 9.75f)
                verticalLineToRelative(2.07f)
                lineToRelative(4.03f, 4.03f)
                lineToRelative(0.9f, -9.35f)
                horizontalLineToRelative(1.32f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(15.5f, 5.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -7.0f, 0.0f)
                horizontalLineToRelative(-0.32f)
                lineToRelative(5.32f, 5.32f)
                verticalLineToRelative(-0.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                close()
            }
        }
        return _deleteOff!!
    }

private var _deleteOff: ImageVector? = null
