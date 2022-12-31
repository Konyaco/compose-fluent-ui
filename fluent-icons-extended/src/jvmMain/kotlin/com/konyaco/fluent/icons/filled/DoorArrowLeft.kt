

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DoorArrowLeft: ImageVector
    get() {
        if (_doorArrowLeft != null) {
            return _doorArrowLeft!!
        }
        _doorArrowLeft = fluentIcon(name = "Filled.DoorArrowLeft") {
            fluentPath {
                moveTo(6.25f, 2.75f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.94f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 7.06f, -10.01f)
                lineTo(19.25f, 4.25f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(6.25f, 2.75f)
                close()
                moveTo(8.5f, 13.25f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(17.5f, 23.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(21.0f, 17.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-4.8f)
                lineToRelative(1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.7f, 0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, 0.7f)
                lineTo(15.71f, 17.0f)
                horizontalLineToRelative(4.79f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }
        return _doorArrowLeft!!
    }

private var _doorArrowLeft: ImageVector? = null
