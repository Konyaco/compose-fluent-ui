

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.AlertOff: ImageVector
    get() {
        if (_alertOff != null) {
            return _alertOff!!
        }
        _alertOff = fluentIcon(name = "Regular.AlertOff") {
            fluentPath {
                moveToRelative(5.22f, 6.28f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-3.28f, -3.28f)
                lineTo(15.0f, 18.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.18f)
                verticalLineToRelative(-0.18f)
                lineTo(4.27f, 18.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.14f, -1.75f)
                lineTo(4.5f, 13.6f)
                lineTo(4.5f, 9.5f)
                curveToRelative(0.0f, -1.15f, 0.26f, -2.24f, 0.72f, -3.21f)
                close()
                moveTo(15.94f, 17.0f)
                lineTo(6.36f, 7.43f)
                arcTo(6.02f, 6.02f, 0.0f, false, false, 6.0f, 9.5f)
                verticalLineToRelative(4.4f)
                lineTo(4.66f, 17.0f)
                horizontalLineToRelative(11.28f)
                close()
                moveTo(13.5f, 18.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.15f)
                verticalLineToRelative(-0.15f)
                close()
                moveTo(18.0f, 13.9f)
                lineTo(18.7f, 15.53f)
                lineTo(20.9f, 17.71f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -0.02f, -0.96f)
                lineToRelative(-1.38f, -3.16f)
                lineTo(19.5f, 9.25f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 7.04f, 3.86f)
                lineToRelative(1.07f, 1.06f)
                arcTo(5.99f, 5.99f, 0.0f, false, true, 18.0f, 9.28f)
                lineTo(18.0f, 13.91f)
                close()
            }
        }
        return _alertOff!!
    }

private var _alertOff: ImageVector? = null
