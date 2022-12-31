

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AppsListDetail: ImageVector
    get() {
        if (_appsListDetail != null) {
            return _appsListDetail!!
        }
        _appsListDetail = fluentIcon(name = "Filled.AppsListDetail") {
            fluentPath {
                moveTo(4.25f, 4.0f)
                curveTo(3.01f, 4.0f, 2.0f, 5.0f, 2.0f, 6.25f)
                verticalLineToRelative(2.5f)
                curveTo(2.0f, 9.99f, 3.0f, 11.0f, 4.25f, 11.0f)
                horizontalLineToRelative(2.5f)
                curveTo(7.99f, 11.0f, 9.0f, 10.0f, 9.0f, 8.75f)
                verticalLineToRelative(-2.5f)
                curveTo(9.0f, 5.01f, 8.0f, 4.0f, 6.75f, 4.0f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(11.25f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(11.25f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(4.25f, 13.0f)
                curveTo(3.01f, 13.0f, 2.0f, 14.0f, 2.0f, 15.25f)
                verticalLineToRelative(2.5f)
                curveTo(2.0f, 18.99f, 3.0f, 20.0f, 4.25f, 20.0f)
                horizontalLineToRelative(2.5f)
                curveTo(7.99f, 20.0f, 9.0f, 19.0f, 9.0f, 17.75f)
                verticalLineToRelative(-2.5f)
                curveTo(9.0f, 14.01f, 8.0f, 13.0f, 6.75f, 13.0f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(11.25f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(11.25f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        return _appsListDetail!!
    }

private var _appsListDetail: ImageVector? = null
