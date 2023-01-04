

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DualScreenMirror: ImageVector
    get() {
        if (_dualScreenMirror != null) {
            return _dualScreenMirror!!
        }
        _dualScreenMirror = fluentIcon(name = "Regular.DualScreenMirror") {
            fluentPath {
                moveTo(17.17f, 9.42f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.34f, 0.0f)
                lineToRelative(-2.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.67f, 1.08f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.67f, -1.08f)
                lineToRelative(-2.25f, -4.5f)
                close()
                moveTo(15.47f, 13.5f)
                lineToRelative(1.03f, -2.07f)
                lineToRelative(1.04f, 2.07f)
                horizontalLineToRelative(-2.08f)
                close()
                moveTo(7.5f, 9.0f)
                curveToRelative(0.28f, 0.0f, 0.54f, 0.16f, 0.67f, 0.42f)
                lineToRelative(2.25f, 4.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.75f, 15.0f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.67f, -1.08f)
                lineToRelative(2.25f, -4.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.5f, 9.0f)
                close()
                moveTo(7.5f, 11.43f)
                lineTo(6.46f, 13.5f)
                horizontalLineToRelative(2.08f)
                lineTo(7.5f, 11.43f)
                close()
                moveTo(12.76f, 4.0f)
                horizontalLineToRelative(7.5f)
                curveTo(21.21f, 4.0f, 22.0f, 4.8f, 22.0f, 5.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 20.0f)
                curveToRelative(-0.96f, 0.0f, -1.74f, -0.79f, -1.74f, -1.75f)
                lineTo(2.01f, 5.75f)
                curveTo(2.0f, 4.8f, 2.79f, 4.0f, 3.76f, 4.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(20.26f, 5.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.13f, 0.0f, 0.24f, -0.11f, 0.24f, -0.25f)
                lineTo(20.5f, 5.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(11.26f, 5.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-13.0f)
                close()
            }
        }
        return _dualScreenMirror!!
    }

private var _dualScreenMirror: ImageVector? = null
