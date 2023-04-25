

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.GroupList: ImageVector
    get() {
        if (_groupList != null) {
            return _groupList!!
        }
        _groupList = fluentIcon(name = "Regular.GroupList") {
            fluentPath {
                moveTo(2.75f, 12.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(3.5f, 13.5f)
                lineTo(3.5f, 19.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 0.38f, -0.27f, 0.7f, -0.64f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.75f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(21.25f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(7.75f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(13.6f)
                close()
                moveTo(21.25f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(7.75f, 15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(13.6f)
                close()
                moveTo(2.75f, 2.5f)
                lineTo(5.25f, 2.51f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(3.5f, 4.01f)
                verticalLineToRelative(5.48f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.29f, 0.74f, 0.65f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 0.38f, -0.27f, 0.7f, -0.64f, 0.75f)
                horizontalLineToRelative(-2.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.64f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                close()
                moveTo(21.25f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(7.75f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.49f)
                horizontalLineToRelative(13.6f)
                close()
                moveTo(21.25f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(7.75f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.49f)
                horizontalLineToRelative(13.6f)
                close()
            }
        }
        return _groupList!!
    }

private var _groupList: ImageVector? = null
