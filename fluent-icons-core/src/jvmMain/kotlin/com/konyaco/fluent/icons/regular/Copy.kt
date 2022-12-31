

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = fluentIcon(name = "Regular.Copy") {
            fluentPath {
                moveTo(5.5f, 4.63f)
                lineTo(5.5f, 17.25f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(8.62f)
                curveToRelative(-0.31f, 0.88f, -1.15f, 1.5f, -2.13f, 1.5f)
                lineTo(8.75f, 22.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 4.0f, 17.25f)
                lineTo(4.0f, 6.75f)
                curveToRelative(0.0f, -0.98f, 0.63f, -1.81f, 1.5f, -2.12f)
                close()
                moveTo(17.75f, 2.0f)
                curveTo(18.99f, 2.0f, 20.0f, 3.0f, 20.0f, 4.25f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-13.0f)
                curveTo(6.5f, 3.01f, 7.5f, 2.0f, 8.75f, 2.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(17.75f, 3.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
            }
        }
        return _copy!!
    }

private var _copy: ImageVector? = null
