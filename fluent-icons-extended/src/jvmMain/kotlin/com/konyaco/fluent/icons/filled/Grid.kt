

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Grid: ImageVector
    get() {
        if (_grid != null) {
            return _grid!!
        }
        _grid = fluentIcon(name = "Filled.Grid") {
            fluentPath {
                moveTo(8.75f, 13.0f)
                curveTo(9.99f, 13.0f, 11.0f, 14.0f, 11.0f, 15.25f)
                verticalLineToRelative(3.5f)
                curveTo(11.0f, 19.99f, 10.0f, 21.0f, 8.75f, 21.0f)
                horizontalLineToRelative(-3.5f)
                curveTo(4.01f, 21.0f, 3.0f, 20.0f, 3.0f, 18.75f)
                verticalLineToRelative(-3.5f)
                curveTo(3.0f, 14.01f, 4.0f, 13.0f, 5.25f, 13.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(18.75f, 13.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-3.5f)
                curveTo(14.01f, 21.0f, 13.0f, 20.0f, 13.0f, 18.75f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(8.75f, 3.0f)
                curveTo(9.99f, 3.0f, 11.0f, 4.0f, 11.0f, 5.25f)
                verticalLineToRelative(3.5f)
                curveTo(11.0f, 9.99f, 10.0f, 11.0f, 8.75f, 11.0f)
                horizontalLineToRelative(-3.5f)
                curveTo(4.01f, 11.0f, 3.0f, 10.0f, 3.0f, 8.75f)
                verticalLineToRelative(-3.5f)
                curveTo(3.0f, 4.01f, 4.0f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(18.75f, 3.0f)
                curveTo(19.99f, 3.0f, 21.0f, 4.0f, 21.0f, 5.25f)
                verticalLineToRelative(3.5f)
                curveTo(21.0f, 9.99f, 20.0f, 11.0f, 18.75f, 11.0f)
                horizontalLineToRelative(-3.5f)
                curveTo(14.01f, 11.0f, 13.0f, 10.0f, 13.0f, 8.75f)
                verticalLineToRelative(-3.5f)
                curveTo(13.0f, 4.01f, 14.0f, 3.0f, 15.25f, 3.0f)
                horizontalLineToRelative(3.5f)
                close()
            }
        }
        return _grid!!
    }

private var _grid: ImageVector? = null
