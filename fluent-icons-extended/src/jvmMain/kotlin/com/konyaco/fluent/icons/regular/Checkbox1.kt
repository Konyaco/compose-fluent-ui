

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Checkbox1: ImageVector
    get() {
        if (_checkbox1 != null) {
            return _checkbox1!!
        }
        _checkbox1 = fluentIcon(name = "Regular.Checkbox1") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.64f, 0.0f, 1.24f, -0.19f, 1.75f, -0.51f)
                verticalLineToRelative(-1.66f)
                curveToRelative(-0.16f, 0.08f, -0.33f, 0.13f, -0.5f, 0.15f)
                curveToRelative(-0.33f, 0.32f, -0.76f, 0.52f, -1.25f, 0.52f)
                lineTo(6.25f, 19.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                lineTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(8.16f)
                lineToRelative(0.66f, -0.53f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.84f, -0.36f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(17.28f, 9.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(10.0f, 14.44f)
                lineToRelative(-2.22f, -2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.75f, 2.75f)
                curveToRelative(0.29f, 0.29f, 0.76f, 0.29f, 1.06f, 0.0f)
                lineToRelative(6.75f, -6.75f)
                close()
                moveTo(21.0f, 14.54f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.22f, 0.12f)
                lineToRelative(-2.5f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.94f, 1.18f)
                lineToRelative(1.28f, -1.03f)
                verticalLineToRelative(4.44f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.0f, -0.7f)
                close()
            }
        }
        return _checkbox1!!
    }

private var _checkbox1: ImageVector? = null
