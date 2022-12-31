

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.MapDrive: ImageVector
    get() {
        if (_mapDrive != null) {
            return _mapDrive!!
        }
        _mapDrive = fluentIcon(name = "Filled.MapDrive") {
            fluentPath {
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 4.01f, 3.0f, 3.0f, 4.25f, 3.0f)
                horizontalLineToRelative(15.5f)
                curveTo(20.99f, 3.0f, 22.0f, 4.0f, 22.0f, 5.25f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.42f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(18.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        return _mapDrive!!
    }

private var _mapDrive: ImageVector? = null
