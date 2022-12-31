

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CenterHorizontal: ImageVector
    get() {
        if (_centerHorizontal != null) {
            return _centerHorizontal!!
        }
        _centerHorizontal = fluentIcon(name = "Filled.CenterHorizontal") {
            fluentPath {
                moveTo(3.75f, 3.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(3.0f, 3.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(20.25f, 3.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(19.5f, 3.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(10.25f, 5.0f)
                curveTo(9.01f, 5.0f, 8.0f, 6.0f, 8.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(8.0f, 17.99f, 9.0f, 19.0f, 10.25f, 19.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-9.5f)
                curveTo(16.0f, 6.01f, 15.0f, 5.0f, 13.75f, 5.0f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        return _centerHorizontal!!
    }

private var _centerHorizontal: ImageVector? = null
