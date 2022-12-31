

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DoorArrowLeft: ImageVector
    get() {
        if (_doorArrowLeft != null) {
            return _doorArrowLeft!!
        }
        _doorArrowLeft = fluentIcon(name = "Regular.DoorArrowLeft") {
            fluentPath {
                moveTo(6.25f, 2.0f)
                curveTo(5.01f, 2.0f, 4.0f, 3.0f, 4.0f, 4.25f)
                verticalLineToRelative(15.5f)
                curveTo(4.0f, 20.99f, 5.0f, 22.0f, 6.25f, 22.0f)
                horizontalLineToRelative(6.56f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, -1.08f, -1.5f)
                lineTo(6.25f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(5.5f, 4.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.83f)
                curveToRelative(0.52f, 0.08f, 1.03f, 0.22f, 1.5f, 0.42f)
                lineTo(20.0f, 4.25f)
                curveTo(20.0f, 3.01f, 19.0f, 2.0f, 17.75f, 2.0f)
                lineTo(6.25f, 2.0f)
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
                moveTo(8.5f, 13.25f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
            }
        }
        return _doorArrowLeft!!
    }

private var _doorArrowLeft: ImageVector? = null
