

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = fluentIcon(name = "Regular.Hourglass") {
            fluentPath {
                moveTo(4.0f, 4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 6.75f, 2.0f)
                horizontalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 20.0f, 4.75f)
                verticalLineToRelative(0.42f)
                curveToRelative(0.0f, 2.02f, -1.06f, 3.89f, -2.8f, 4.93f)
                lineToRelative(-1.8f, 1.09f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.04f, 1.26f)
                lineToRelative(2.12f, 1.44f)
                arcTo(5.75f, 5.75f, 0.0f, false, true, 20.0f, 18.65f)
                verticalLineToRelative(0.6f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 17.25f, 22.0f)
                horizontalLineTo(6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.0f, 19.25f)
                verticalLineToRelative(-0.6f)
                curveToRelative(0.0f, -1.9f, 0.94f, -3.69f, 2.52f, -4.76f)
                lineToRelative(2.12f, -1.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.04f, -1.26f)
                lineTo(6.8f, 10.1f)
                arcTo(5.75f, 5.75f, 0.0f, false, true, 4.0f, 5.17f)
                verticalLineToRelative(-0.42f)
                close()
                moveTo(6.75f, 3.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(0.42f)
                curveToRelative(0.0f, 1.5f, 0.78f, 2.88f, 2.06f, 3.64f)
                lineTo(9.37f, 9.9f)
                curveToRelative(1.41f, 0.84f, 1.47f, 2.87f, 0.11f, 3.79f)
                lineToRelative(-2.12f, 1.44f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -1.86f, 3.52f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-0.6f)
                curveToRelative(0.0f, -1.41f, -0.7f, -2.73f, -1.86f, -3.52f)
                lineToRelative(-2.12f, -1.44f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.1f, -3.79f)
                lineToRelative(1.82f, -1.09f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, 2.06f, -3.64f)
                verticalLineToRelative(-0.42f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineTo(6.75f)
                close()
            }
        }
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
