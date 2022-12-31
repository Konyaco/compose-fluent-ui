

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DeleteDismiss: ImageVector
    get() {
        if (_deleteDismiss != null) {
            return _deleteDismiss!!
        }
        _deleteDismiss = fluentIcon(name = "Filled.DeleteDismiss") {
            fluentPath {
                moveTo(14.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(8.5f, 5.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                horizontalLineToRelative(5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-1.32f)
                lineToRelative(-0.5f, 5.2f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 11.8f, 22.0f)
                lineTo(8.97f, 22.0f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.73f, -3.39f)
                lineTo(4.07f, 6.5f)
                lineTo(2.75f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(8.5f, 5.0f)
                close()
                moveTo(22.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(14.85f, 15.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineToRelative(1.64f, 1.65f)
                lineToRelative(-1.64f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(1.65f, -1.64f)
                lineToRelative(1.65f, 1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineToRelative(-1.64f, -1.65f)
                lineToRelative(1.64f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineToRelative(-1.65f, 1.64f)
                lineToRelative(-1.65f, -1.64f)
                close()
            }
        }
        return _deleteDismiss!!
    }

private var _deleteDismiss: ImageVector? = null
