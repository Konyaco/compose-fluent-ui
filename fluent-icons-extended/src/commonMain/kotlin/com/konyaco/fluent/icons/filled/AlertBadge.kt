

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AlertBadge: ImageVector
    get() {
        if (_alertBadge != null) {
            return _alertBadge!!
        }
        _alertBadge = fluentIcon(name = "Filled.AlertBadge") {
            fluentPath {
                moveTo(18.5f, 9.0f)
                curveToRelative(0.34f, 0.0f, 0.66f, -0.05f, 0.97f, -0.14f)
                curveToRelative(0.02f, 0.21f, 0.03f, 0.43f, 0.03f, 0.64f)
                verticalLineToRelative(4.0f)
                lineToRelative(1.42f, 3.16f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -0.87f, 1.34f)
                lineTo(3.95f, 18.0f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -0.86f, -1.34f)
                lineTo(4.5f, 13.5f)
                lineTo(4.5f, 9.24f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 11.44f, -6.12f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 18.5f, 9.0f)
                close()
                moveTo(14.96f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.92f, 0.0f)
                horizontalLineToRelative(5.92f)
                close()
                moveTo(18.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
            }
        }
        return _alertBadge!!
    }

private var _alertBadge: ImageVector? = null
