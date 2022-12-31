

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ColorLine: ImageVector
    get() {
        if (_colorLine != null) {
            return _colorLine!!
        }
        _colorLine = fluentIcon(name = "Regular.ColorLine") {
            fluentPath {
                moveTo(4.38f, 14.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 16.5f)
                verticalLineToRelative(3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 22.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                horizontalLineToRelative(-5.95f)
                lineToRelative(-1.32f, 1.31f)
                lineToRelative(-0.2f, 0.19f)
                horizontalLineToRelative(7.47f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.37f, 0.2f, -0.7f, 0.5f, -0.87f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.1f, -0.74f)
                lineToRelative(0.28f, -0.89f)
                close()
                moveTo(18.65f, 2.94f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, true, 0.0f, 4.56f)
                lineToRelative(-7.13f, 7.1f)
                curveToRelative(-0.26f, 0.27f, -0.58f, 0.46f, -0.94f, 0.57f)
                lineToRelative(-4.3f, 1.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.23f, -1.27f)
                lineToRelative(1.36f, -4.22f)
                curveToRelative(0.1f, -0.35f, 0.3f, -0.65f, 0.55f, -0.9f)
                lineToRelative(7.13f, -7.13f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, true, 4.56f, 0.0f)
                close()
                moveTo(15.15f, 4.0f)
                lineToRelative(-7.13f, 7.12f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.18f, 0.3f)
                lineToRelative(-1.07f, 3.33f)
                lineToRelative(3.38f, -1.02f)
                curveToRelative(0.12f, -0.03f, 0.23f, -0.1f, 0.31f, -0.19f)
                lineToRelative(7.13f, -7.1f)
                arcTo(1.72f, 1.72f, 0.0f, true, false, 15.15f, 4.0f)
                close()
            }
        }
        return _colorLine!!
    }

private var _colorLine: ImageVector? = null
