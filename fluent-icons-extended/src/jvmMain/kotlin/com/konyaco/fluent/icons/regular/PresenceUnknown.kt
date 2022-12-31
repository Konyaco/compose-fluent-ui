

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PresenceUnknown: ImageVector
    get() {
        if (_presenceUnknown != null) {
            return _presenceUnknown!!
        }
        _presenceUnknown = fluentIcon(name = "Regular.PresenceUnknown") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f)
                close()
                moveTo(0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
            }
        }
        return _presenceUnknown!!
    }

private var _presenceUnknown: ImageVector? = null
