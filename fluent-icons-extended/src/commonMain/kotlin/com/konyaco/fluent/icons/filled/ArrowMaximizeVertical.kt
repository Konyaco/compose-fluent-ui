

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowMaximizeVertical: ImageVector
    get() {
        if (_arrowMaximizeVertical != null) {
            return _arrowMaximizeVertical!!
        }
        _arrowMaximizeVertical = fluentIcon(name = "Filled.ArrowMaximizeVertical") {
            fluentPath {
                moveTo(15.2f, 6.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-0.8f, -0.79f)
                verticalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineTo(5.41f)
                lineToRelative(-0.8f, 0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, -1.42f)
                lineToRelative(2.5f, -2.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.7f, 0.3f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.4f)
                close()
            }
            fluentPath {
                moveTo(5.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineTo(5.0f)
                close()
            }
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.7f, -0.3f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, -1.4f)
                lineToRelative(-0.8f, 0.79f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(3.59f)
                lineToRelative(-0.8f, -0.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.42f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.7f, 0.29f)
            }
        }
        return _arrowMaximizeVertical!!
    }

private var _arrowMaximizeVertical: ImageVector? = null
