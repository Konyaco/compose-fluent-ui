

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.AlertBadge: ImageVector
    get() {
        if (_alertBadge != null) {
            return _alertBadge!!
        }
        _alertBadge = fluentIcon(name = "Regular.AlertBadge") {
            fluentPath {
                moveTo(11.99f, 2.0f)
                curveToRelative(1.45f, 0.0f, 2.8f, 0.4f, 3.95f, 1.11f)
                curveToRelative(-0.35f, 0.37f, -0.61f, 0.8f, -0.77f, 1.29f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.2f, 5.1f)
                verticalLineToRelative(4.4f)
                lineTo(4.64f, 17.0f)
                horizontalLineToRelative(14.72f)
                lineTo(18.0f, 13.9f)
                lineTo(18.0f, 9.28f)
                lineToRelative(-0.03f, -0.32f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 1.5f, -0.1f)
                lineToRelative(0.02f, 0.38f)
                verticalLineToRelative(4.35f)
                lineToRelative(1.39f, 3.16f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.15f, 1.75f)
                lineTo(15.0f, 18.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.17f)
                verticalLineToRelative(-0.18f)
                lineTo(4.24f, 18.49f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.15f, -1.74f)
                lineToRelative(1.38f, -3.16f)
                lineTo(4.47f, 9.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.5f, -7.5f)
                close()
                moveTo(13.49f, 18.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.14f)
                verticalLineToRelative(-0.15f)
                close()
                moveTo(16.03f, 5.05f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -2.47f, 2.05f)
                close()
            }
        }
        return _alertBadge!!
    }

private var _alertBadge: ImageVector? = null
