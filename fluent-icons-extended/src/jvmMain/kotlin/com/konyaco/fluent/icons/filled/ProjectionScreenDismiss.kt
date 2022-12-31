

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ProjectionScreenDismiss: ImageVector
    get() {
        if (_projectionScreenDismiss != null) {
            return _projectionScreenDismiss!!
        }
        _projectionScreenDismiss = fluentIcon(name = "Filled.ProjectionScreenDismiss") {
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
                moveTo(17.5f, 13.0f)
                curveToRelative(1.29f, 0.0f, 2.49f, -0.38f, 3.5f, -1.02f)
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
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 5.48f, 10.0f)
                close()
            }
        }
        return _projectionScreenDismiss!!
    }

private var _projectionScreenDismiss: ImageVector? = null
