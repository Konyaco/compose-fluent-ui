

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Print: ImageVector
    get() {
        if (_print != null) {
            return _print!!
        }
        _print = fluentIcon(name = "Filled.Print") {
            fluentPath {
                moveTo(18.0f, 17.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-7.5f)
                curveTo(7.01f, 21.0f, 6.0f, 20.0f, 6.0f, 18.75f)
                lineTo(6.0f, 17.5f)
                lineTo(4.25f, 17.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-6.0f)
                curveTo(2.0f, 7.45f, 3.46f, 6.0f, 5.25f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(-0.75f)
                curveTo(6.0f, 4.01f, 7.0f, 3.0f, 8.25f, 3.0f)
                horizontalLineToRelative(7.5f)
                curveTo(17.0f, 3.0f, 18.0f, 4.0f, 18.0f, 5.25f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(0.75f)
                curveTo(20.55f, 6.0f, 22.0f, 7.46f, 22.0f, 9.25f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.24f, 2.25f)
                lineTo(18.0f, 17.5f)
                close()
                moveTo(15.75f, 13.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(15.75f, 4.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                lineTo(7.5f, 6.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
            }
        }
        return _print!!
    }

private var _print: ImageVector? = null
