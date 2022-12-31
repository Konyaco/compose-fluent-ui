

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BookTheta: ImageVector
    get() {
        if (_bookTheta != null) {
            return _bookTheta!!
        }
        _bookTheta = fluentIcon(name = "Filled.BookTheta") {
            fluentPath {
                moveTo(14.12f, 14.0f)
                curveToRelative(0.37f, -0.5f, 0.66f, -1.2f, 0.8f, -2.0f)
                horizontalLineToRelative(-4.84f)
                curveToRelative(0.14f, 0.8f, 0.43f, 1.5f, 0.8f, 2.0f)
                curveToRelative(0.52f, 0.72f, 1.11f, 1.0f, 1.62f, 1.0f)
                curveToRelative(0.5f, 0.0f, 1.1f, -0.28f, 1.62f, -1.0f)
                close()
                moveTo(14.12f, 8.0f)
                curveToRelative(0.44f, 0.6f, 0.78f, 1.48f, 0.86f, 2.5f)
                horizontalLineToRelative(-4.96f)
                curveToRelative(0.08f, -1.02f, 0.42f, -1.9f, 0.86f, -2.5f)
                curveToRelative(0.52f, -0.72f, 1.11f, -1.0f, 1.62f, -1.0f)
                curveToRelative(0.5f, 0.0f, 1.1f, 0.28f, 1.62f, 1.0f)
                close()
                moveTo(4.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.5f, 2.0f)
                lineTo(18.0f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(14.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(5.5f, 19.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(13.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(6.5f, 22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                close()
                moveTo(12.5f, 16.5f)
                curveToRelative(2.2f, 0.0f, 4.0f, -2.46f, 4.0f, -5.5f)
                reflectiveCurveToRelative(-1.8f, -5.5f, -4.0f, -5.5f)
                reflectiveCurveToRelative(-4.0f, 2.46f, -4.0f, 5.5f)
                reflectiveCurveToRelative(1.8f, 5.5f, 4.0f, 5.5f)
                close()
            }
        }
        return _bookTheta!!
    }

private var _bookTheta: ImageVector? = null
