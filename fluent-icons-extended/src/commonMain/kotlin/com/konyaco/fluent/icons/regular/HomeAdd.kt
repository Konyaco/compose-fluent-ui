

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.HomeAdd: ImageVector
    get() {
        if (_homeAdd != null) {
            return _homeAdd!!
        }
        _homeAdd = fluentIcon(name = "Regular.HomeAdd") {
            fluentPath {
                moveTo(10.55f, 2.53f)
                curveToRelative(0.84f, -0.7f, 2.06f, -0.7f, 2.9f, 0.0f)
                lineToRelative(6.75f, 5.7f)
                curveToRelative(0.5f, 0.42f, 0.8f, 1.05f, 0.8f, 1.71f)
                verticalLineToRelative(2.08f)
                curveToRelative(-0.46f, -0.3f, -0.97f, -0.53f, -1.5f, -0.7f)
                lineTo(19.5f, 9.93f)
                curveToRelative(0.0f, -0.22f, -0.1f, -0.43f, -0.27f, -0.57f)
                lineToRelative(-6.75f, -5.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.96f, 0.0f)
                lineToRelative(-6.75f, 5.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.27f, 0.57f)
                verticalLineToRelative(9.31f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(6.56f)
                curveToRelative(0.18f, 0.54f, 0.42f, 1.04f, 0.71f, 1.5f)
                lineTo(4.75f, 20.99f)
                curveTo(3.78f, 21.0f, 3.0f, 20.22f, 3.0f, 19.25f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.67f, 0.3f, -1.3f, 0.8f, -1.73f)
                lineToRelative(6.75f, -5.69f)
                close()
                moveTo(23.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(17.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(18.0f, 18.0f)
                close()
            }
        }
        return _homeAdd!!
    }

private var _homeAdd: ImageVector? = null
