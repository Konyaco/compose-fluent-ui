

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Speaker0: ImageVector
    get() {
        if (_speaker0 != null) {
            return _speaker0!!
        }
        _speaker0 = fluentIcon(name = "Filled.Speaker0") {
            fluentPath {
                moveTo(14.7f, 3.44f)
                curveToRelative(0.2f, 0.23f, 0.3f, 0.51f, 0.3f, 0.8f)
                verticalLineToRelative(15.51f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.06f, 0.95f)
                lineToRelative(-4.96f, -4.2f)
                horizontalLineTo(4.25f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-4.5f)
                curveTo(2.0f, 8.5f, 3.0f, 7.5f, 4.25f, 7.5f)
                horizontalLineToRelative(3.73f)
                lineToRelative(4.96f, -4.2f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 1.76f, 0.14f)
                close()
            }
        }
        return _speaker0!!
    }

private var _speaker0: ImageVector? = null
