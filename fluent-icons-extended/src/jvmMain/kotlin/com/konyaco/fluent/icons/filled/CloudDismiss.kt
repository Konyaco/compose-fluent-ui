

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CloudDismiss: ImageVector
    get() {
        if (_cloudDismiss != null) {
            return _cloudDismiss!!
        }
        _cloudDismiss = fluentIcon(name = "Filled.CloudDismiss") {
            fluentPath {
                moveTo(6.09f, 7.75f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 11.32f, 0.0f)
                horizontalLineToRelative(0.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.96f, 4.55f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, false, -11.42f, 3.45f)
                lineTo(6.0f, 15.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(0.09f)
                close()
                moveTo(16.5f, 22.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(14.15f, 14.15f)
                curveToRelative(0.2f, -0.2f, 0.5f, -0.2f, 0.7f, 0.0f)
                lineToRelative(1.65f, 1.64f)
                lineToRelative(1.65f, -1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, 0.7f)
                lineToRelative(-1.64f, 1.65f)
                lineToRelative(1.64f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.7f, 0.7f)
                lineToRelative(-1.65f, -1.64f)
                lineToRelative(-1.65f, 1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.7f, -0.7f)
                lineToRelative(1.64f, -1.65f)
                lineToRelative(-1.64f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.7f)
                close()
            }
        }
        return _cloudDismiss!!
    }

private var _cloudDismiss: ImageVector? = null
