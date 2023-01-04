

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TabDesktopBottom: ImageVector
    get() {
        if (_tabDesktopBottom != null) {
            return _tabDesktopBottom!!
        }
        _tabDesktopBottom = fluentIcon(name = "Filled.TabDesktopBottom") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineTo(14.5f)
                verticalLineToRelative(-3.25f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(3.0f, 17.0f)
                verticalLineToRelative(0.75f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        return _tabDesktopBottom!!
    }

private var _tabDesktopBottom: ImageVector? = null
