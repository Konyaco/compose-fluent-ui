

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Presenter: ImageVector
    get() {
        if (_presenter != null) {
            return _presenter!!
        }
        _presenter = fluentIcon(name = "Regular.Presenter") {
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
                moveTo(18.11f, 14.5f)
                lineTo(5.89f, 14.5f)
                lineToRelative(3.33f, 2.66f)
                curveToRelative(0.18f, 0.15f, 0.28f, 0.36f, 0.28f, 0.59f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.42f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.23f, 0.1f, -0.44f, 0.28f, -0.59f)
                lineToRelative(3.33f, -2.66f)
                close()
                moveTo(8.75f, 9.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.91f, 0.0f, 1.67f, 0.7f, 1.74f, 1.6f)
                lineTo(16.99f, 12.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.19f, -0.24f)
                lineToRelative(-0.05f, -0.01f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.24f, 0.2f)
                lineToRelative(-0.01f, 0.05f)
                lineTo(8.5f, 12.0f)
                lineTo(7.0f, 12.0f)
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
                moveTo(12.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        return _presenter!!
    }

private var _presenter: ImageVector? = null
