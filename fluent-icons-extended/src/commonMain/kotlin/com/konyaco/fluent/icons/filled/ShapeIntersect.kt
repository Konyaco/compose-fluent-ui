

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShapeIntersect: ImageVector
    get() {
        if (_shapeIntersect != null) {
            return _shapeIntersect!!
        }
        _shapeIntersect = fluentIcon(name = "Filled.ShapeIntersect") {
            fluentPath {
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 3.45f, 3.46f, 2.0f, 5.25f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                lineTo(16.5f, 7.5f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.8f, 0.0f, 3.25f, 1.46f, 3.25f, 3.25f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.25f, -3.25f)
                lineTo(7.5f, 16.5f)
                lineTo(5.25f, 16.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 13.25f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(15.0f, 5.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                lineTo(7.5f, 15.0f)
                verticalLineToRelative(-4.25f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, 3.25f, -3.25f)
                lineTo(15.0f, 7.5f)
                lineTo(15.0f, 5.25f)
                close()
                moveTo(16.0f, 14.98f)
                arcTo(3.38f, 3.38f, 0.0f, false, true, 14.98f, 16.0f)
                curveToRelative(-0.5f, 0.32f, -1.1f, 0.5f, -1.73f, 0.5f)
                lineTo(9.0f, 16.5f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(16.5f, 9.0f)
                verticalLineToRelative(4.25f)
                curveToRelative(0.0f, 0.64f, -0.18f, 1.23f, -0.5f, 1.73f)
                close()
            }
        }
        return _shapeIntersect!!
    }

private var _shapeIntersect: ImageVector? = null
