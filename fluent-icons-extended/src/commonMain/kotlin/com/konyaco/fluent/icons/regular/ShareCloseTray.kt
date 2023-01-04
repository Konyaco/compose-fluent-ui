

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ShareCloseTray: ImageVector
    get() {
        if (_shareCloseTray != null) {
            return _shareCloseTray!!
        }
        _shareCloseTray = fluentIcon(name = "Regular.ShareCloseTray") {
            fluentPath {
                moveTo(2.0f, 17.75f)
                curveTo(2.0f, 18.99f, 3.0f, 20.0f, 4.25f, 20.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(22.0f, 6.25f)
                curveTo(22.0f, 5.01f, 21.0f, 4.0f, 19.75f, 4.0f)
                lineTo(4.25f, 4.0f)
                curveTo(3.01f, 4.0f, 2.0f, 5.0f, 2.0f, 6.25f)
                verticalLineToRelative(11.5f)
                close()
                moveTo(4.25f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(3.5f, 6.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(4.25f, 18.5f)
                close()
                moveTo(12.0f, 16.75f)
                curveToRelative(0.2f, 0.0f, 0.39f, -0.07f, 0.53f, -0.22f)
                lineToRelative(3.25f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.97f, 1.97f)
                lineTo(12.75f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(6.44f)
                lineToRelative(-1.97f, -1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(3.25f, 3.25f)
                curveToRelative(0.14f, 0.15f, 0.33f, 0.22f, 0.53f, 0.22f)
                close()
            }
        }
        return _shareCloseTray!!
    }

private var _shareCloseTray: ImageVector? = null
