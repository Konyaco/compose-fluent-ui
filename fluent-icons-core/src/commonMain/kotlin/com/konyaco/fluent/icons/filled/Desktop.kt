

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Desktop: ImageVector
    get() {
        if (_desktop != null) {
            return _desktop!!
        }
        _desktop = fluentIcon(name = "Filled.Desktop") {
            fluentPath {
                moveTo(6.75f, 22.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.25f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.24f, -2.1f)
                lineTo(2.0f, 15.76f)
                verticalLineTo(5.25f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(4.25f, 3.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.19f, 0.0f, 2.16f, 0.93f, 2.24f, 2.1f)
                verticalLineToRelative(10.65f)
                curveToRelative(0.0f, 1.2f, -0.92f, 2.17f, -2.09f, 2.25f)
                horizontalLineToRelative(-4.4f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        return _desktop!!
    }

private var _desktop: ImageVector? = null
