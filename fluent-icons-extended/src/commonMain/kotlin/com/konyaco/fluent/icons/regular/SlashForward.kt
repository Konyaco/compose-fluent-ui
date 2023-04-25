

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlashForward: ImageVector
    get() {
        if (_slashForward != null) {
            return _slashForward!!
        }
        _slashForward = fluentIcon(name = "Regular.SlashForward") {
            fluentPath {
                moveTo(15.5f, 2.04f)
                curveToRelative(0.39f, 0.14f, 0.6f, 0.57f, 0.46f, 0.96f)
                lineToRelative(-6.5f, 18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.42f, -0.5f)
                lineToRelative(6.5f, -18.5f)
                curveToRelative(0.14f, -0.39f, 0.57f, -0.6f, 0.96f, -0.46f)
                close()
            }
        }
        return _slashForward!!
    }

private var _slashForward: ImageVector? = null
