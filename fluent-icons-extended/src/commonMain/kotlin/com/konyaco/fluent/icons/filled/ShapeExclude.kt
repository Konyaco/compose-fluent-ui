

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShapeExclude: ImageVector
    get() {
        if (_shapeExclude != null) {
            return _shapeExclude!!
        }
        _shapeExclude = fluentIcon(name = "Filled.ShapeExclude") {
            fluentPath {
                moveTo(5.25f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 5.25f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(2.25f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineTo(16.5f)
                verticalLineTo(5.25f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(16.5f, 7.5f)
                verticalLineToRelative(5.75f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-5.75f)
                curveToRelative(0.0f, -1.8f, 1.46f, -3.25f, 3.25f, -3.25f)
                horizontalLineToRelative(5.75f)
                close()
            }
        }
        return _shapeExclude!!
    }

private var _shapeExclude: ImageVector? = null
