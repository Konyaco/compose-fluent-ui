

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PresenceAway: ImageVector
    get() {
        if (_presenceAway != null) {
            return _presenceAway!!
        }
        _presenceAway = fluentIcon(name = "Regular.PresenceAway") {
            fluentPath {
                moveTo(13.0f, 11.31f)
                lineTo(13.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(10.0f, 12.0f)
                curveToRelative(0.0f, 0.44f, 0.2f, 0.85f, 0.52f, 1.14f)
                lineToRelative(3.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.96f, -2.28f)
                lineTo(13.0f, 11.31f)
                close()
                moveTo(0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f)
                close()
            }
        }
        return _presenceAway!!
    }

private var _presenceAway: ImageVector? = null
