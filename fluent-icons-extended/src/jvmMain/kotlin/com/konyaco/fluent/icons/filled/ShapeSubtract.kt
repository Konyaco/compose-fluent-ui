

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShapeSubtract: ImageVector
    get() {
        if (_shapeSubtract != null) {
            return _shapeSubtract!!
        }
        _shapeSubtract = fluentIcon(name = "Filled.ShapeSubtract") {
            fluentPath {
                moveTo(3.0f, 2.9f)
                curveToRelative(-0.62f, 0.6f, -1.0f, 1.43f, -1.0f, 2.35f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 0.56f, 1.82f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 2.69f, 1.43f)
                lineTo(7.5f, 16.5f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                lineTo(16.5f, 7.5f)
                lineTo(16.5f, 5.25f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.87f, 0.0f, -1.67f, 0.34f, -2.25f, 0.9f)
                close()
                moveTo(9.0f, 10.75f)
                curveTo(9.0f, 9.78f, 9.78f, 9.0f, 10.75f, 9.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-8.0f)
                close()
            }
        }
        return _shapeSubtract!!
    }

private var _shapeSubtract: ImageVector? = null
