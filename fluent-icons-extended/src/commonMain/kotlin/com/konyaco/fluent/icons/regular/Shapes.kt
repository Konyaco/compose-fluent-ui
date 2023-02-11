

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = fluentIcon(name = "Regular.Shapes") {
            fluentPath {
                moveTo(8.75f, 3.5f)
                arcTo(5.25f, 5.25f, 0.0f, false, false, 8.0f, 13.95f)
                verticalLineToRelative(1.5f)
                arcTo(6.75f, 6.75f, 0.0f, true, true, 15.46f, 8.0f)
                horizontalLineToRelative(-1.51f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, -5.2f, -4.5f)
                close()
                moveTo(12.25f, 9.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 9.0f, 12.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-6.5f)
                curveTo(22.0f, 10.45f, 20.54f, 9.0f, 18.75f, 9.0f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(10.5f, 12.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-6.5f)
                close()
            }
        }
        return _shapes!!
    }

private var _shapes: ImageVector? = null
