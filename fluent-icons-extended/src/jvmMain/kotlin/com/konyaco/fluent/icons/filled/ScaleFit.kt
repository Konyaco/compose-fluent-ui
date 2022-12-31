

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ScaleFit: ImageVector
    get() {
        if (_scaleFit != null) {
            return _scaleFit!!
        }
        _scaleFit = fluentIcon(name = "Filled.ScaleFit") {
            fluentPath {
                moveTo(4.25f, 4.0f)
                curveTo(3.01f, 4.0f, 2.0f, 5.0f, 2.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(2.0f, 18.99f, 3.0f, 20.0f, 4.25f, 20.0f)
                horizontalLineToRelative(15.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(22.0f, 6.25f)
                curveTo(22.0f, 5.01f, 21.0f, 4.0f, 19.75f, 4.0f)
                lineTo(4.25f, 4.0f)
                close()
                moveTo(7.99f, 9.44f)
                curveToRelative(0.32f, 0.27f, 0.35f, 0.74f, 0.07f, 1.05f)
                lineToRelative(-0.66f, 0.76f)
                horizontalLineToRelative(2.86f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(7.4f, 12.75f)
                lineToRelative(0.66f, 0.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.12f, 0.98f)
                lineToRelative(-1.75f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -0.98f)
                lineToRelative(1.75f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.05f, -0.07f)
                close()
                moveTo(15.95f, 10.49f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.13f, -0.98f)
                lineToRelative(1.75f, 2.0f)
                curveToRelative(0.25f, 0.28f, 0.25f, 0.7f, 0.0f, 0.98f)
                lineToRelative(-1.75f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, -0.98f)
                lineToRelative(0.66f, -0.76f)
                horizontalLineToRelative(-2.86f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.86f)
                lineToRelative(-0.66f, -0.76f)
                close()
            }
        }
        return _scaleFit!!
    }

private var _scaleFit: ImageVector? = null
