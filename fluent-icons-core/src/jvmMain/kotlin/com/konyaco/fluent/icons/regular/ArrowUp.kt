

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = fluentIcon(name = "Regular.ArrowUp") {
            fluentPath {
                moveTo(4.2f, 10.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.1f, 1.04f)
                lineToRelative(5.95f, -6.25f)
                verticalLineToRelative(14.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(5.52f)
                lineToRelative(5.95f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.1f, -1.04f)
                lineToRelative(-7.08f, -7.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.44f, 0.0f)
                lineTo(4.2f, 10.73f)
                close()
            }
        }
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
