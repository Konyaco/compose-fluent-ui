

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.AlignRight: ImageVector
    get() {
        if (_alignRight != null) {
            return _alignRight!!
        }
        _alignRight = fluentIcon(name = "Regular.AlignRight") {
            fluentPath {
                moveTo(21.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(21.0f, 2.75f)
                close()
                moveTo(15.75f, 4.0f)
                curveTo(16.99f, 4.0f, 18.0f, 5.0f, 18.0f, 6.25f)
                verticalLineToRelative(2.5f)
                curveTo(18.0f, 9.99f, 17.0f, 11.0f, 15.75f, 11.0f)
                lineTo(5.25f, 11.0f)
                curveTo(4.01f, 11.0f, 3.0f, 10.0f, 3.0f, 8.75f)
                verticalLineToRelative(-2.5f)
                curveTo(3.0f, 5.01f, 4.0f, 4.0f, 5.25f, 4.0f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(16.5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(5.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(15.75f, 13.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(16.5f, 15.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
