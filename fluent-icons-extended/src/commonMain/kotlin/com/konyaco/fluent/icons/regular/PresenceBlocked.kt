

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PresenceBlocked: ImageVector
    get() {
        if (_presenceBlocked != null) {
            return _presenceBlocked!!
        }
        _presenceBlocked = fluentIcon(name = "Regular.PresenceBlocked") {
            fluentPath {
                moveTo(24.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -1.94f, -0.62f, -3.74f, -1.66f, -5.21f)
                lineTo(6.79f, 19.34f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 12.0f)
                close()
                moveTo(17.21f, 4.66f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 4.66f, 17.21f)
                lineTo(17.21f, 4.66f)
                close()
            }
        }
        return _presenceBlocked!!
    }

private var _presenceBlocked: ImageVector? = null
