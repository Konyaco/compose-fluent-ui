

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Presenter: ImageVector
    get() {
        if (_presenter != null) {
            return _presenter!!
        }
        _presenter = fluentIcon(name = "Filled.Presenter") {
            fluentPath {
                moveTo(20.24f, 13.0f)
                curveToRelative(0.71f, 0.0f, 1.03f, 0.89f, 0.47f, 1.33f)
                lineTo(16.0f, 18.11f)
                verticalLineToRelative(1.64f)
                curveTo(16.0f, 21.0f, 14.99f, 22.0f, 13.75f, 22.0f)
                horizontalLineToRelative(-3.5f)
                curveTo(9.01f, 22.0f, 8.0f, 21.0f, 8.0f, 19.75f)
                verticalLineToRelative(-1.64f)
                lineToRelative(-4.72f, -3.78f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 3.75f, 13.0f)
                horizontalLineToRelative(16.5f)
                close()
                moveTo(8.75f, 9.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.91f, 0.0f, 1.67f, 0.7f, 1.74f, 1.6f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -0.92f, 0.7f, -1.67f, 1.6f, -1.74f)
                lineTo(8.76f, 9.0f)
                horizontalLineToRelative(6.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
            }
        }
        return _presenter!!
    }

private var _presenter: ImageVector? = null
