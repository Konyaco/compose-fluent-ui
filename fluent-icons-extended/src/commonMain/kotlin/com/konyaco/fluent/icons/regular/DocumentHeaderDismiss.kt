

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentHeaderDismiss: ImageVector
    get() {
        if (_documentHeaderDismiss != null) {
            return _documentHeaderDismiss!!
        }
        _documentHeaderDismiss = fluentIcon(name = "Regular.DocumentHeaderDismiss") {
            fluentPath {
                moveTo(17.75f, 2.0f)
                curveToRelative(1.19f, 0.0f, 2.16f, 0.92f, 2.24f, 2.1f)
                verticalLineToRelative(7.4f)
                curveToRelative(-0.47f, -0.2f, -0.97f, -0.34f, -1.5f, -0.42f)
                lineTo(18.49f, 4.25f)
                curveToRelative(0.0f, -0.38f, -0.28f, -0.7f, -0.64f, -0.74f)
                lineToRelative(-0.1f, -0.01f)
                lineTo(6.25f, 3.5f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.37f, 0.28f, 0.69f, 0.65f, 0.74f)
                horizontalLineToRelative(5.58f)
                curveToRelative(0.29f, 0.56f, 0.65f, 1.06f, 1.08f, 1.5f)
                lineTo(6.25f, 21.99f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.24f, -2.1f)
                lineTo(4.0f, 19.75f)
                lineTo(4.0f, 4.25f)
                curveToRelative(0.0f, -1.2f, 0.92f, -2.17f, 2.1f, -2.24f)
                lineTo(6.25f, 2.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(8.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-7.0f)
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
        return _documentHeaderDismiss!!
    }

private var _documentHeaderDismiss: ImageVector? = null
