

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.NavigationUnread: ImageVector
    get() {
        if (_navigationUnread != null) {
            return _navigationUnread!!
        }
        _navigationUnread = fluentIcon(name = "Regular.NavigationUnread") {
            fluentPath {
                moveTo(19.25f, 8.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, -5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, 5.5f)
                close()
                moveTo(15.58f, 6.5f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(2.74f, 5.0f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(12.83f)
                close()
                moveTo(21.25f, 18.0f)
                lineTo(2.65f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(18.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                close()
                moveTo(2.75f, 11.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.49f)
                horizontalLineToRelative(0.1f)
                close()
            }
        }
        return _navigationUnread!!
    }

private var _navigationUnread: ImageVector? = null
