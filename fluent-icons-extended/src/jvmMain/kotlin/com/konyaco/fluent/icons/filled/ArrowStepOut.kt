

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowStepOut: ImageVector
    get() {
        if (_arrowStepOut != null) {
            return _arrowStepOut!!
        }
        _arrowStepOut = fluentIcon(name = "Filled.ArrowStepOut") {
            fluentPath {
                moveTo(12.75f, 13.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(4.49f)
                lineTo(7.77f, 7.8f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.04f, -1.08f)
                lineToRelative(4.75f, -4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.04f, 0.0f)
                lineToRelative(4.75f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.04f, 1.08f)
                lineToRelative(-3.48f, -3.3f)
                verticalLineToRelative(9.26f)
                close()
                moveTo(15.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
            }
        }
        return _arrowStepOut!!
    }

private var _arrowStepOut: ImageVector? = null
