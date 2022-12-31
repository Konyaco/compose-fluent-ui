

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowMaximize: ImageVector
    get() {
        if (_arrowMaximize != null) {
            return _arrowMaximize!!
        }
        _arrowMaximize = fluentIcon(name = "Filled.ArrowMaximize") {
            fluentPath {
                moveTo(12.5f, 3.0f)
                horizontalLineToRelative(7.55f)
                lineToRelative(0.12f, 0.02f)
                lineToRelative(0.09f, 0.02f)
                lineToRelative(0.1f, 0.03f)
                lineToRelative(0.1f, 0.04f)
                lineToRelative(0.06f, 0.04f)
                lineToRelative(0.06f, 0.04f)
                lineToRelative(0.06f, 0.05f)
                lineToRelative(0.07f, 0.06f)
                lineToRelative(0.1f, 0.1f)
                lineToRelative(0.06f, 0.12f)
                lineToRelative(0.06f, 0.11f)
                lineToRelative(0.03f, 0.1f)
                lineToRelative(0.02f, 0.07f)
                verticalLineToRelative(0.05f)
                lineTo(21.0f, 4.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.12f)
                verticalLineTo(6.41f)
                lineTo(6.4f, 19.0f)
                horizontalLineToRelative(5.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                verticalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.88f, 1.0f)
                horizontalLineTo(3.94f)
                lineToRelative(-0.1f, -0.01f)
                lineToRelative(-0.07f, -0.02f)
                lineToRelative(-0.08f, -0.02f)
                lineToRelative(-0.07f, -0.02f)
                lineToRelative(-0.09f, -0.05f)
                lineToRelative(-0.09f, -0.05f)
                lineToRelative(-0.1f, -0.07f)
                lineToRelative(0.04f, 0.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.17f, -0.17f)
                lineToRelative(-0.05f, -0.07f)
                lineToRelative(-0.04f, -0.06f)
                lineToRelative(-0.03f, -0.07f)
                lineToRelative(-0.03f, -0.08f)
                lineToRelative(-0.03f, -0.08f)
                lineToRelative(-0.02f, -0.1f)
                verticalLineToRelative(-0.07f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                verticalLineToRelative(5.21f)
                lineTo(17.58f, 5.0f)
                horizontalLineTo(12.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        return _arrowMaximize!!
    }

private var _arrowMaximize: ImageVector? = null
