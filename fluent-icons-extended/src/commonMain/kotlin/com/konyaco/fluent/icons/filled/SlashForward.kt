

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SlashForward: ImageVector
    get() {
        if (_slashForward != null) {
            return _slashForward!!
        }
        _slashForward = fluentIcon(name = "Filled.SlashForward") {
            fluentPath {
                moveTo(15.32f, 2.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.63f, 1.27f)
                lineToRelative(-6.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.9f, -0.64f)
                lineToRelative(6.0f, -18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.27f, -0.63f)
                close()
            }
        }
        return _slashForward!!
    }

private var _slashForward: ImageVector? = null
