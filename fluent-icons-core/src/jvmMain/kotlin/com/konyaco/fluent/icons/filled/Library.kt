

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Library: ImageVector
    get() {
        if (_library != null) {
            return _library!!
        }
        _library = fluentIcon(name = "Filled.Library") {
            fluentPath {
                moveTo(5.5f, 3.0f)
                curveTo(6.33f, 3.0f, 7.0f, 3.67f, 7.0f, 4.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                curveTo(2.0f, 3.67f, 2.67f, 3.0f, 3.5f, 3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(11.5f, 3.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                curveTo(8.0f, 3.67f, 8.67f, 3.0f, 9.5f, 3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.78f, 6.12f)
                lineTo(22.0f, 18.64f)
                curveToRelative(0.21f, 0.8f, -0.27f, 1.62f, -1.07f, 1.83f)
                lineToRelative(-1.88f, 0.48f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.83f, -1.08f)
                lineTo(14.0f, 7.35f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.08f, -1.82f)
                lineToRelative(1.87f, -0.49f)
                curveToRelative(0.8f, -0.2f, 1.63f, 0.28f, 1.83f, 1.08f)
                close()
            }
        }
        return _library!!
    }

private var _library: ImageVector? = null
