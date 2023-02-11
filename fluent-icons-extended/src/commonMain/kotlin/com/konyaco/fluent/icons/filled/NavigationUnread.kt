

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.NavigationUnread: ImageVector
    get() {
        if (_navigationUnread != null) {
            return _navigationUnread!!
        }
        _navigationUnread = fluentIcon(name = "Filled.NavigationUnread") {
            fluentPath {
                moveTo(19.25f, 8.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, -5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, 5.5f)
                close()
                moveTo(15.71f, 7.0f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, true, -0.14f, -2.0f)
                horizontalLineTo(2.88f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 7.0f)
                horizontalLineToRelative(12.71f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineTo(2.88f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 19.0f)
                horizontalLineToRelative(18.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.12f, -2.0f)
                close()
                moveTo(3.0f, 11.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        return _navigationUnread!!
    }

private var _navigationUnread: ImageVector? = null
