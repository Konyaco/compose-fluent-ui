

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = fluentIcon(name = "Filled.Money") {
            fluentPath {
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.78f, 2.78f, 5.0f, 3.75f, 5.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 17.0f)
                curveTo(2.78f, 17.0f, 2.0f, 16.22f, 2.0f, 15.25f)
                verticalLineToRelative(-8.5f)
                close()
                moveTo(5.0f, 6.25f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 6.25f)
                close()
                moveTo(10.5f, 13.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 0.0f, -4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 0.0f, 4.5f)
                close()
                moveTo(3.25f, 14.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-1.0f)
                lineTo(3.25f, 14.0f)
                close()
                moveTo(16.0f, 14.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                verticalLineToRelative(1.0f)
                lineTo(16.0f, 15.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(1.0f)
                lineTo(17.75f, 8.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
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
