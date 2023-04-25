

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentFooterDismiss: ImageVector
    get() {
        if (_documentFooterDismiss != null) {
            return _documentFooterDismiss!!
        }
        _documentFooterDismiss = fluentIcon(name = "Regular.DocumentFooterDismiss") {
            fluentPath {
                moveTo(23.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(15.85f, 4.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.7f, 0.7f)
                lineToRelative(1.64f, 1.65f)
                lineToRelative(-1.64f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(1.65f, -1.64f)
                lineToRelative(1.65f, 1.64f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.7f, -0.7f)
                lineTo(18.21f, 6.5f)
                lineToRelative(1.64f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.7f, -0.7f)
                lineTo(17.5f, 5.79f)
                lineToRelative(-1.65f, -1.64f)
                close()
                moveTo(18.5f, 19.75f)
                verticalLineToRelative(-6.83f)
                arcToRelative(6.46f, 6.46f, 0.0f, false, false, 1.5f, -0.42f)
                verticalLineToRelative(7.24f)
                curveToRelative(0.0f, 1.2f, -0.93f, 2.17f, -2.1f, 2.25f)
                lineTo(6.25f, 21.99f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.25f, -2.1f)
                lineTo(4.0f, 4.25f)
                curveTo(4.0f, 3.06f, 4.92f, 2.09f, 6.1f, 2.0f)
                horizontalLineToRelative(6.71f)
                curveToRelative(-0.42f, 0.44f, -0.79f, 0.94f, -1.07f, 1.5f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.37f, 0.0f, -0.69f, 0.28f, -0.74f, 0.64f)
                verticalLineToRelative(15.6f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.64f, 0.75f)
                horizontalLineToRelative(11.6f)
                curveToRelative(0.39f, 0.0f, 0.7f, -0.28f, 0.75f, -0.64f)
                verticalLineToRelative(-0.1f)
                close()
                moveTo(8.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        return _documentFooterDismiss!!
    }

private var _documentFooterDismiss: ImageVector? = null
