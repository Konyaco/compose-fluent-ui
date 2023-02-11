

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PresenceBusy: ImageVector
    get() {
        if (_presenceBusy != null) {
            return _presenceBusy!!
        }
        _presenceBusy = fluentIcon(name = "Filled.PresenceBusy") {
            fluentPath {
                moveTo(24.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        return _presenceBusy!!
    }

private var _presenceBusy: ImageVector? = null
