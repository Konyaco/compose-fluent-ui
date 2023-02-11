

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ProjectionScreenDismiss: ImageVector
    get() {
        if (_projectionScreenDismiss != null) {
            return _projectionScreenDismiss!!
        }
        _projectionScreenDismiss = fluentIcon(name = "Regular.ProjectionScreenDismiss") {
            fluentPath {
                moveTo(23.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(15.85f, 4.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(1.64f, 1.65f)
                lineToRelative(-1.64f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(1.65f, -1.64f)
                lineToRelative(1.65f, 1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineTo(18.21f, 6.5f)
                lineToRelative(1.64f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineTo(17.5f, 5.79f)
                lineToRelative(-1.65f, -1.64f)
                close()
                moveTo(19.5f, 13.25f)
                verticalLineToRelative(-0.56f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, 1.5f, -0.71f)
                verticalLineToRelative(1.27f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 17.25f, 17.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.5f)
                lineTo(11.25f, 17.0f)
                horizontalLineToRelative(-4.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 3.0f, 13.25f)
                lineTo(3.0f, 5.91f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 3.0f)
                horizontalLineToRelative(8.52f)
                curveToRelative(-0.56f, 0.88f, -0.92f, 1.9f, -1.0f, 3.0f)
                lineTo(4.5f, 6.0f)
                verticalLineToRelative(7.25f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                close()
            }
        }
        return _projectionScreenDismiss!!
    }

private var _projectionScreenDismiss: ImageVector? = null
