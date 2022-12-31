

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.GroupDismiss: ImageVector
    get() {
        if (_groupDismiss != null) {
            return _groupDismiss!!
        }
        _groupDismiss = fluentIcon(name = "Filled.GroupDismiss") {
            fluentPath {
                moveTo(7.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(21.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(7.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(8.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.17f, 1.0f)
                horizontalLineToRelative(4.67f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(-1.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.0f, 11.5f)
                lineTo(9.0f, 13.0f)
                lineTo(6.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(6.0f, 7.83f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(4.67f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 15.0f)
                lineTo(9.0f, 15.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, -0.5f, -2.5f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.89f, 0.0f, 1.73f, 0.18f, 2.5f, 0.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 9.0f)
                lineTo(15.0f, 9.0f)
                lineTo(15.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 4.0f)
                lineTo(7.83f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 5.0f)
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
        return _groupDismiss!!
    }

private var _groupDismiss: ImageVector? = null
