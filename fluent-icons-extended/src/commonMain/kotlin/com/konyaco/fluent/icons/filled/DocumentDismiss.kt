

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentDismiss: ImageVector
    get() {
        if (_documentDismiss != null) {
            return _documentDismiss!!
        }
        _documentDismiss = fluentIcon(name = "Filled.DocumentDismiss") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-6.81f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 4.0f, 11.5f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.5f, 2.5f)
                lineTo(13.5f, 8.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(6.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, -11.0f)
                close()
                moveTo(8.98f, 15.73f)
                lineTo(7.2f, 17.5f)
                lineToRelative(1.77f, 1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.7f, 0.7f)
                lineTo(6.5f, 18.22f)
                lineToRelative(-1.77f, 1.76f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.7f, -0.7f)
                lineToRelative(1.76f, -1.77f)
                lineToRelative(-1.76f, -1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.7f, -0.7f)
                lineToRelative(1.77f, 1.76f)
                lineToRelative(1.77f, -1.77f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, 0.71f)
                close()
            }
        }
        return _documentDismiss!!
    }

private var _documentDismiss: ImageVector? = null
