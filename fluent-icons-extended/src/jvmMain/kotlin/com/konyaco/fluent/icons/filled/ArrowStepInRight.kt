

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowStepInRight: ImageVector
    get() {
        if (_arrowStepInRight != null) {
            return _arrowStepInRight!!
        }
        _arrowStepInRight = fluentIcon(name = "Filled.ArrowStepInRight") {
            fluentPath {
                moveTo(8.7f, 16.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.1f, 1.04f)
                lineToRelative(4.5f, -4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.04f)
                lineTo(9.8f, 6.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.1f, 1.04f)
                lineToRelative(3.3f, 3.48f)
                horizontalLineTo(2.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(9.26f)
                lineToRelative(-3.3f, 3.48f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                close()
            }
        }
        return _arrowStepInRight!!
    }

private var _arrowStepInRight: ImageVector? = null
