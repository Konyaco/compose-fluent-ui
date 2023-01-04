

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.WindowApps: ImageVector
    get() {
        if (_windowApps != null) {
            return _windowApps!!
        }
        _windowApps = fluentIcon(name = "Filled.WindowApps") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(2.76f)
                lineTo(20.75f, 9.0f)
                lineTo(19.5f, 9.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(9.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                lineTo(9.0f, 19.5f)
                lineTo(9.0f, 21.0f)
                lineTo(6.26f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(12.25f, 15.5f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(-3.25f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-7.5f)
                curveTo(11.01f, 23.0f, 10.0f, 22.0f, 10.0f, 20.75f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                close()
                moveTo(17.0f, 12.25f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                close()
                moveTo(15.5f, 21.5f)
                lineTo(15.5f, 17.0f)
                horizontalLineToRelative(-3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3.25f)
                close()
                moveTo(17.0f, 17.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(21.5f, 17.0f)
                lineTo(17.0f, 17.0f)
                close()
            }
        }
        return _windowApps!!
    }

private var _windowApps: ImageVector? = null
