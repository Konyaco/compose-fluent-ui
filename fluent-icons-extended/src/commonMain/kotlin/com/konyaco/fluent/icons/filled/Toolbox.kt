

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Toolbox: ImageVector
    get() {
        if (_toolbox != null) {
            return _toolbox!!
        }
        _toolbox = fluentIcon(name = "Filled.Toolbox") {
            fluentPath {
                moveTo(7.0f, 6.25f)
                lineTo(7.0f, 7.0f)
                lineTo(4.25f, 7.0f)
                curveTo(3.01f, 7.0f, 2.0f, 8.0f, 2.0f, 9.25f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(0.75f)
                lineTo(22.0f, 11.5f)
                lineTo(22.0f, 9.25f)
                curveTo(22.0f, 8.01f, 21.0f, 7.0f, 19.75f, 7.0f)
                lineTo(17.0f, 7.0f)
                verticalLineToRelative(-0.75f)
                curveTo(17.0f, 5.01f, 16.0f, 4.0f, 14.75f, 4.0f)
                horizontalLineToRelative(-5.5f)
                curveTo(8.01f, 4.0f, 7.0f, 5.01f, 7.0f, 6.25f)
                close()
                moveTo(9.25f, 5.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(15.5f, 7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(16.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(6.5f, 13.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(4.75f)
                curveTo(2.0f, 18.99f, 3.0f, 20.0f, 4.25f, 20.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.01f, 2.25f, -2.25f)
                lineTo(22.0f, 13.0f)
                close()
            }
        }
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
