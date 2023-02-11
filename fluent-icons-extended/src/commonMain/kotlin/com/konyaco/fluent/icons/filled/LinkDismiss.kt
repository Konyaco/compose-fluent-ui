

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LinkDismiss: ImageVector
    get() {
        if (_linkDismiss != null) {
            return _linkDismiss!!
        }
        _linkDismiss = fluentIcon(name = "Filled.LinkDismiss") {
            fluentPath {
                moveTo(9.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(7.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.18f, 6.0f)
                lineTo(9.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(7.0f, 15.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.22f, -10.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(17.0f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.43f, 7.32f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, -1.76f, -0.95f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.17f, 7.0f)
                lineTo(15.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(17.0f, 5.0f)
                close()
                moveTo(7.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(7.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(7.0f, 9.0f)
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
