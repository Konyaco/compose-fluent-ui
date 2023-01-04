

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Blur: ImageVector
    get() {
        if (_blur != null) {
            return _blur!!
        }
        _blur = fluentIcon(name = "Filled.Blur") {
            fluentPath {
                moveTo(3.0f, 12.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 13.98f, -7.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.23f)
                curveToRelative(0.47f, 0.45f, 0.89f, 0.95f, 1.25f, 1.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.06f)
                curveToRelative(0.24f, 0.48f, 0.44f, 0.98f, 0.59f, 1.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.88f)
                curveToRelative(0.08f, 0.49f, 0.12f, 0.99f, 0.12f, 1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.95f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, true, -0.3f, 1.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.3f)
                curveToRelative(-0.23f, 0.53f, -0.5f, 1.03f, -0.82f, 1.5f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.7f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 3.0f, 12.0f)
                close()
            }
        }
        return _blur!!
    }

private var _blur: ImageVector? = null
