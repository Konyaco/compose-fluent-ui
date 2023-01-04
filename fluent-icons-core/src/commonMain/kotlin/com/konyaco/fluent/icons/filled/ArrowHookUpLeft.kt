

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowHookUpLeft: ImageVector
    get() {
        if (_arrowHookUpLeft != null) {
            return _arrowHookUpLeft!!
        }
        _arrowHookUpLeft = fluentIcon(name = "Filled.ArrowHookUpLeft") {
            fluentPath {
                moveTo(7.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.24f, 0.0f, 4.01f, -0.78f, 5.22f, -2.02f)
                arcTo(6.42f, 6.42f, 0.0f, false, false, 20.0f, 13.5f)
                curveToRelative(0.0f, -1.61f, -0.59f, -3.24f, -1.78f, -4.48f)
                arcTo(7.06f, 7.06f, 0.0f, false, false, 13.0f, 7.0f)
                horizontalLineTo(8.41f)
                lineToRelative(2.05f, -2.04f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.42f)
                lineTo(5.3f, 7.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, -1.42f)
                lineTo(8.4f, 9.0f)
                horizontalLineTo(13.0f)
                curveToRelative(1.76f, 0.0f, 2.99f, 0.6f, 3.78f, 1.41f)
                curveToRelative(0.8f, 0.83f, 1.22f, 1.95f, 1.22f, 3.09f)
                reflectiveCurveToRelative(-0.41f, 2.26f, -1.22f, 3.09f)
                arcTo(5.07f, 5.07f, 0.0f, false, true, 13.0f, 18.0f)
                horizontalLineTo(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
            }
        }
        return _arrowHookUpLeft!!
    }

private var _arrowHookUpLeft: ImageVector? = null
