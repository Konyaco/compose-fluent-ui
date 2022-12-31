

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ProjectionScreen: ImageVector
    get() {
        if (_projectionScreen != null) {
            return _projectionScreen!!
        }
        _projectionScreen = fluentIcon(name = "Regular.ProjectionScreen") {
            fluentPath {
                moveTo(3.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 5.91f)
                verticalLineToRelative(7.34f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 6.75f, 17.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                lineTo(12.75f, 17.0f)
                horizontalLineToRelative(4.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 21.0f, 13.25f)
                lineTo(21.0f, 5.91f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 3.0f)
                horizontalLineToRelative(-17.0f)
                close()
                moveTo(4.5f, 6.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(7.25f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                lineTo(6.75f, 15.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                lineTo(4.5f, 6.0f)
                close()
            }
        }
        return _projectionScreen!!
    }

private var _projectionScreen: ImageVector? = null
