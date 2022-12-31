

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentFooterDismiss: ImageVector
    get() {
        if (_documentFooterDismiss != null) {
            return _documentFooterDismiss!!
        }
        _documentFooterDismiss = fluentIcon(name = "Filled.DocumentFooterDismiss") {
            fluentPath {
                moveTo(23.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(15.86f, 4.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.71f, 0.7f)
                lineToRelative(1.64f, 1.65f)
                lineToRelative(-1.64f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(1.65f, -1.64f)
                lineToRelative(1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.7f, -0.71f)
                lineTo(18.21f, 6.5f)
                lineToRelative(1.64f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, -0.7f)
                lineTo(17.5f, 5.79f)
                lineToRelative(-1.64f, -1.64f)
                close()
                moveTo(17.5f, 13.0f)
                curveToRelative(0.89f, 0.0f, 1.73f, -0.17f, 2.5f, -0.5f)
                verticalLineToRelative(7.25f)
                curveToRelative(0.0f, 1.2f, -0.93f, 2.17f, -2.1f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                lineTo(6.25f, 22.0f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.93f, -2.24f, -2.1f)
                lineTo(4.0f, 19.75f)
                lineTo(4.0f, 4.25f)
                curveToRelative(0.0f, -1.2f, 0.92f, -2.17f, 2.1f, -2.25f)
                lineTo(12.82f, 2.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 4.69f, 11.0f)
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
