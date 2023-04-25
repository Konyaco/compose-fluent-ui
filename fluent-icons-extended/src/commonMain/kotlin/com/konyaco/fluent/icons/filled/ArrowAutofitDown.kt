

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowAutofitDown: ImageVector
    get() {
        if (_arrowAutofitDown != null) {
            return _arrowAutofitDown!!
        }
        _arrowAutofitDown = fluentIcon(name = "Filled.ArrowAutofitDown") {
            fluentPath {
                moveToRelative(12.95f, 18.1f)
                lineToRelative(0.09f, 0.1f)
                lineToRelative(2.35f, 2.36f)
                curveToRelative(0.18f, 0.27f, 0.5f, 0.44f, 0.86f, 0.44f)
                curveToRelative(0.32f, 0.0f, 0.62f, -0.14f, 0.8f, -0.37f)
                horizontalLineToRelative(0.01f)
                lineToRelative(0.05f, -0.07f)
                lineToRelative(2.36f, -2.36f)
                lineToRelative(0.08f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.01f, -1.18f)
                verticalLineToRelative(-0.01f)
                lineToRelative(-0.1f, -0.12f)
                lineToRelative(-0.1f, -0.09f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.18f, -0.01f)
                lineToRelative(-0.12f, 0.1f)
                lineToRelative(-0.8f, 0.8f)
                verticalLineTo(3.79f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(-0.07f, -0.47f, -0.51f, -0.78f, -0.99f, -0.78f)
                reflectiveCurveToRelative(-0.92f, 0.31f, -0.99f, 0.78f)
                lineToRelative(-0.01f, 0.12f)
                verticalLineToRelative(13.69f)
                lineToRelative(-0.8f, -0.8f)
                lineToRelative(-0.1f, -0.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 1.4f)
                close()
                moveTo(4.0f, 17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 20.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -0.27f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 6.5f)
                verticalLineToRelative(11.0f)
                close()
            }
        }
        return _arrowAutofitDown!!
    }

private var _arrowAutofitDown: ImageVector? = null
