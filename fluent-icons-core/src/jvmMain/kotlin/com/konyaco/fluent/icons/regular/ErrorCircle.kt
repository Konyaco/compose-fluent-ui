

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ErrorCircle: ImageVector
    get() {
        if (_errorCircle != null) {
            return _errorCircle!!
        }
        _errorCircle = fluentIcon(name = "Regular.ErrorCircle") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 3.67f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, false, 0.0f, 16.66f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, false, 0.0f, -16.66f)
                close()
                moveTo(12.0f, 14.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(0.37f, 0.0f, 0.69f, 0.28f, 0.74f, 0.65f)
                verticalLineToRelative(4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.48f, 0.1f)
                lineToRelative(-0.01f, -0.1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.41f, 0.33f, -0.75f, 0.74f, -0.75f)
                close()
            }
        }
        return _errorCircle!!
    }

private var _errorCircle: ImageVector? = null
