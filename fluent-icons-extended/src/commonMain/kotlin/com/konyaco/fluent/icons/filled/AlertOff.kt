

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AlertOff: ImageVector
    get() {
        if (_alertOff != null) {
            return _alertOff!!
        }
        _alertOff = fluentIcon(name = "Filled.AlertOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(3.0f, 3.0f)
                curveToRelative(-0.42f, 0.9f, -0.68f, 1.9f, -0.72f, 2.96f)
                verticalLineToRelative(4.26f)
                lineToRelative(-1.41f, 3.16f)
                arcTo(0.95f, 0.95f, 0.0f, false, false, 3.95f, 18.0f)
                horizontalLineToRelative(13.0f)
                lineToRelative(3.77f, 3.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(21.0f, 17.05f)
                curveToRelative(0.0f, 0.22f, -0.07f, 0.42f, -0.2f, 0.58f)
                lineTo(7.06f, 3.87f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 19.5f, 9.5f)
                verticalLineToRelative(4.0f)
                lineToRelative(1.42f, 3.15f)
                curveToRelative(0.05f, 0.12f, 0.08f, 0.26f, 0.08f, 0.4f)
                close()
                moveTo(14.96f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.92f, 0.0f)
                horizontalLineToRelative(5.92f)
                close()
            }
        }
        return _alertOff!!
    }

private var _alertOff: ImageVector? = null
