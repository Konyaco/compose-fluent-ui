

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LinkDismiss: ImageVector
    get() {
        if (_linkDismiss != null) {
            return _linkDismiss!!
        }
        _linkDismiss = fluentIcon(name = "Regular.LinkDismiss") {
            fluentPath {
                moveTo(9.25f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.11f, 1.5f)
                lineTo(7.0f, 6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -0.2f, 7.0f)
                horizontalLineToRelative(2.45f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.11f, 1.5f)
                lineTo(7.0f, 15.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.25f, -10.0f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(17.0f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.43f, 7.32f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -1.3f, -0.76f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.2f, 6.5f)
                lineTo(17.0f, 6.5f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.11f, -1.5f)
                lineTo(17.0f, 5.0f)
                close()
                moveTo(7.0f, 9.25f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(7.0f, 10.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(7.0f, 9.25f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(15.85f, 15.15f)
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
        return _linkDismiss!!
    }

private var _linkDismiss: ImageVector? = null
