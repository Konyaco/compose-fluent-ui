

package com.konyaco.fluent.icons.default

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Default.Cancel: ImageVector
    get() {
        if (_cancel != null) {
            return _cancel!!
        }
        _cancel = fluentIcon(name = "Default.Cancel") {
            fluentPath {
                moveTo(1115.0f, 1024.0f)
                lineToRelative(690.0f, 691.0f)
                lineToRelative(-90.0f, 90.0f)
                lineToRelative(-691.0f, -690.0f)
                lineToRelative(-691.0f, 690.0f)
                lineToRelative(-90.0f, -90.0f)
                lineToRelative(690.0f, -691.0f)
                lineToRelative(-690.0f, -691.0f)
                lineToRelative(90.0f, -90.0f)
                lineToRelative(691.0f, 690.0f)
                lineToRelative(691.0f, -690.0f)
                lineToRelative(90.0f, 90.0f)
                lineToRelative(-690.0f, 691.0f)
                close()
            }
        }
        return _cancel!!
    }

private var _cancel: ImageVector? = null
