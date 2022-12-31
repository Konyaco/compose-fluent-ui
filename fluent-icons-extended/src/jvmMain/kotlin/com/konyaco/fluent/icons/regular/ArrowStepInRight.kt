

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowStepInRight: ImageVector
    get() {
        if (_arrowStepInRight != null) {
            return _arrowStepInRight!!
        }
        _arrowStepInRight = fluentIcon(name = "Regular.ArrowStepInRight") {
            fluentPath {
                moveTo(8.7f, 16.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.1f, 1.04f)
                lineToRelative(4.5f, -4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.04f)
                lineTo(9.8f, 6.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.1f, 1.04f)
                lineToRelative(3.3f, 3.48f)
                lineTo(2.76f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(9.26f)
                lineToRelative(-3.3f, 3.48f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        return _arrowStepInRight!!
    }

private var _arrowStepInRight: ImageVector? = null
