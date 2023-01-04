

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = fluentIcon(name = "Filled.Shapes") {
            fluentPath {
                moveTo(2.0f, 8.75f)
                arcTo(6.75f, 6.75f, 0.0f, false, true, 15.46f, 8.0f)
                horizontalLineToRelative(-3.21f)
                arcTo(4.25f, 4.25f, 0.0f, false, false, 8.0f, 12.25f)
                verticalLineToRelative(3.2f)
                arcToRelative(6.75f, 6.75f, 0.0f, false, true, -6.0f, -6.7f)
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
            }
        }
        return _shapes!!
    }

private var _shapes: ImageVector? = null
