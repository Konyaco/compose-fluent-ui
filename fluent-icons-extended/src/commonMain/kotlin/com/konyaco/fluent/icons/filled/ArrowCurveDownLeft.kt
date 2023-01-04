

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowCurveDownLeft: ImageVector
    get() {
        if (_arrowCurveDownLeft != null) {
            return _arrowCurveDownLeft!!
        }
        _arrowCurveDownLeft = fluentIcon(name = "Filled.ArrowCurveDownLeft") {
            fluentPath {
                moveTo(16.87f, 3.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.37f, 1.37f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, -3.12f, 3.7f)
                arcToRelative(13.87f, 13.87f, 0.0f, false, false, -0.38f, 4.06f)
                verticalLineToRelative(5.46f)
                lineToRelative(3.3f, -3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, 1.42f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, -1.42f)
                lineToRelative(3.3f, 3.3f)
                verticalLineToRelative(-5.09f)
                verticalLineToRelative(-0.4f)
                curveToRelative(0.0f, -1.37f, -0.01f, -3.02f, 0.47f, -4.61f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 4.03f, -4.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.37f, 0.37f)
                close()
            }
        }
        return _arrowCurveDownLeft!!
    }

private var _arrowCurveDownLeft: ImageVector? = null
