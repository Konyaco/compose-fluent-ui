

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Info: ImageVector
    get() {
        if (_info != null) {
            return _info!!
        }
        _info = fluentIcon(name = "Regular.Info") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(12.0f, 10.5f)
                curveToRelative(0.38f, 0.0f, 0.69f, 0.28f, 0.74f, 0.65f)
                verticalLineToRelative(0.1f)
                lineToRelative(0.01f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineToRelative(-5.6f)
                curveToRelative(0.0f, -0.41f, 0.33f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        return _info!!
    }

private var _info: ImageVector? = null
