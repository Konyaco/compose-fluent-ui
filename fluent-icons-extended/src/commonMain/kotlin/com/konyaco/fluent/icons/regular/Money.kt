

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = fluentIcon(name = "Regular.Money") {
            fluentPath {
                moveTo(10.5f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(9.0f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 6.01f, 3.0f, 5.0f, 4.25f, 5.0f)
                horizontalLineToRelative(12.5f)
                curveTo(17.99f, 5.0f, 19.0f, 6.0f, 19.0f, 7.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                lineTo(4.25f, 17.0f)
                curveTo(3.01f, 17.0f, 2.0f, 16.0f, 2.0f, 14.75f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(4.25f, 6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                lineTo(3.5f, 8.0f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(5.0f, 6.5f)
                horizontalLineToRelative(-0.75f)
                close()
                moveTo(3.5f, 12.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                lineTo(14.5f, 6.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(0.75f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                lineTo(3.5f, 9.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.5f, 8.0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(16.0f, 6.5f)
                verticalLineToRelative(0.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.75f)
                close()
                moveTo(17.5f, 14.0f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(17.5f, 14.0f)
                close()
                moveTo(3.5f, 14.75f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                lineTo(5.0f, 15.5f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(3.5f, 14.0f)
                verticalLineToRelative(0.75f)
                close()
                moveTo(4.4f, 18.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 20.0f)
                horizontalLineToRelative(10.25f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 22.0f, 15.25f)
                lineTo(22.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.5f, -2.6f)
                verticalLineToRelative(7.85f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(4.4f, 18.5f)
                close()
            }
        }
        return _money!!
    }

private var _money: ImageVector? = null
