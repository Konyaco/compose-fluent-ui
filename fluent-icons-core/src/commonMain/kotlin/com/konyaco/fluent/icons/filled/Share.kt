

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = fluentIcon(name = "Filled.Share") {
            fluentPath {
                moveTo(6.75f, 4.0f)
                horizontalLineToRelative(3.46f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(6.75f, 5.5f)
                curveToRelative(-1.2f, 0.0f, -2.17f, 0.92f, -2.25f, 2.1f)
                verticalLineToRelative(9.65f)
                curveToRelative(0.0f, 1.19f, 0.92f, 2.17f, 2.1f, 2.24f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.19f, 0.0f, 2.16f, -0.93f, 2.24f, -2.1f)
                verticalLineToRelative(-0.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.0f, 2.0f, -1.56f, 3.64f, -3.54f, 3.74f)
                lineToRelative(-0.2f, 0.01f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-2.0f, 0.0f, -3.64f, -1.57f, -3.75f, -3.55f)
                verticalLineToRelative(-9.7f)
                curveToRelative(0.0f, -2.0f, 1.57f, -3.64f, 3.55f, -3.75f)
                horizontalLineToRelative(3.66f)
                horizontalLineToRelative(-3.46f)
                close()
                moveTo(14.5f, 6.54f)
                lineTo(14.5f, 3.75f)
                curveToRelative(0.0f, -0.62f, 0.7f, -0.96f, 1.19f, -0.61f)
                lineToRelative(0.08f, 0.07f)
                lineToRelative(6.0f, 5.75f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.7f, 0.07f, 1.0f)
                lineToRelative(-0.08f, 0.08f)
                lineToRelative(-5.99f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.26f, -0.43f)
                verticalLineToRelative(-2.91f)
                horizontalLineToRelative(-0.33f)
                curveToRelative(-2.66f, -0.01f, -4.93f, 1.08f, -6.87f, 3.3f)
                curveToRelative(-0.5f, 0.56f, -1.42f, 0.13f, -1.3f, -0.62f)
                curveTo(6.84f, 10.0f, 9.6f, 7.1f, 14.2f, 6.57f)
                lineToRelative(0.3f, -0.03f)
                lineTo(14.5f, 3.75f)
                verticalLineToRelative(2.8f)
                close()
            }
        }
        return _share!!
    }

private var _share: ImageVector? = null
