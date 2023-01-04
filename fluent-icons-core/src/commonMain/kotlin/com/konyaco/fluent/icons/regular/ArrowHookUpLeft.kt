

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowHookUpLeft: ImageVector
    get() {
        if (_arrowHookUpLeft != null) {
            return _arrowHookUpLeft!!
        }
        _arrowHookUpLeft = fluentIcon(name = "Regular.ArrowHookUpLeft") {
            fluentPath {
                moveTo(7.0f, 19.25f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(14.0f)
                curveToRelative(1.98f, 0.0f, 3.5f, -0.82f, 4.52f, -2.07f)
                arcTo(7.05f, 7.05f, 0.0f, false, false, 20.0f, 13.5f)
                curveToRelative(0.0f, -1.58f, -0.48f, -3.2f, -1.48f, -4.43f)
                arcTo(5.63f, 5.63f, 0.0f, false, false, 14.0f, 7.0f)
                horizontalLineTo(7.56f)
                lineToRelative(2.47f, -2.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(5.22f, 7.22f)
                curveToRelative(-0.3f, 0.3f, -0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(7.56f, 8.5f)
                horizontalLineTo(14.0f)
                curveToRelative(1.52f, 0.0f, 2.62f, 0.61f, 3.36f, 1.52f)
                arcToRelative(5.56f, 5.56f, 0.0f, false, true, 1.14f, 3.48f)
                curveToRelative(0.0f, 1.3f, -0.4f, 2.56f, -1.14f, 3.48f)
                arcTo(4.13f, 4.13f, 0.0f, false, true, 14.0f, 18.5f)
                horizontalLineTo(7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
            }
        }
        return _arrowHookUpLeft!!
    }

private var _arrowHookUpLeft: ImageVector? = null
