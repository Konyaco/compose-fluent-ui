

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CallPause: ImageVector
    get() {
        if (_callPause != null) {
            return _callPause!!
        }
        _callPause = fluentIcon(name = "Filled.CallPause") {
            fluentPath {
                moveTo(15.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(19.5f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(10.23f, 5.34f)
                lineToRelative(-0.86f, -2.03f)
                arcTo(2.06f, 2.06f, 0.0f, false, false, 6.85f, 2.1f)
                lineToRelative(-1.08f, 0.34f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, false, -2.15f, 2.4f)
                curveToRelative(-0.63f, 2.73f, 0.13f, 6.05f, 2.26f, 9.97f)
                curveToRelative(2.13f, 3.91f, 4.46f, 6.26f, 7.0f, 7.05f)
                curveToRelative(1.08f, 0.34f, 2.24f, 0.04f, 3.06f, -0.77f)
                lineToRelative(0.81f, -0.82f)
                curveToRelative(0.77f, -0.77f, 0.88f, -2.02f, 0.26f, -2.92f)
                lineToRelative(-1.23f, -1.81f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, false, -2.33f, -0.82f)
                lineToRelative(-2.28f, 0.76f)
                arcToRelative(8.68f, 8.68f, 0.0f, false, true, -2.27f, -2.6f)
                arcToRelative(8.01f, 8.01f, 0.0f, false, true, -1.08f, -3.17f)
                lineToRelative(1.9f, -1.8f)
                curveToRelative(0.67f, -0.65f, 0.88f, -1.69f, 0.5f, -2.57f)
                close()
            }
        }
        return _callPause!!
    }

private var _callPause: ImageVector? = null
