

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowCurveDownLeft: ImageVector
    get() {
        if (_arrowCurveDownLeft != null) {
            return _arrowCurveDownLeft!!
        }
        _arrowCurveDownLeft = fluentIcon(name = "Regular.ArrowCurveDownLeft") {
            fluentPath {
                moveTo(16.4f, 3.38f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.02f, -0.28f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, -3.92f, 4.7f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, -0.46f, 4.55f)
                verticalLineTo(18.44f)
                lineToRelative(-3.72f, -3.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(5.0f, 5.0f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-3.72f, 3.72f)
                verticalLineToRelative(-5.69f)
                verticalLineToRelative(-0.38f)
                curveToRelative(0.0f, -1.41f, 0.0f, -2.8f, 0.4f, -4.13f)
                arcToRelative(6.43f, 6.43f, 0.0f, false, true, 3.22f, -3.84f)
                curveToRelative(0.36f, -0.2f, 0.49f, -0.66f, 0.28f, -1.02f)
                close()
            }
        }
        return _arrowCurveDownLeft!!
    }

private var _arrowCurveDownLeft: ImageVector? = null
