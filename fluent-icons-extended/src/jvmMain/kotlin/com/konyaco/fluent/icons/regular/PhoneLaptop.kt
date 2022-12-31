

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PhoneLaptop: ImageVector
    get() {
        if (_phoneLaptop != null) {
            return _phoneLaptop!!
        }
        _phoneLaptop = fluentIcon(name = "Regular.PhoneLaptop") {
            fluentPath {
                moveTo(8.25f, 8.0f)
                curveTo(9.22f, 8.0f, 10.0f, 8.8f, 10.0f, 9.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-4.5f)
                curveTo(2.78f, 21.0f, 2.0f, 20.22f, 2.0f, 19.25f)
                verticalLineToRelative(-9.5f)
                curveTo(2.0f, 8.8f, 2.78f, 8.0f, 3.75f, 8.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(8.25f, 9.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.1f, 0.25f, -0.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(6.25f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(0.6f)
                close()
                moveTo(21.25f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(11.0f, 18.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10.25f)
                close()
                moveTo(18.25f, 5.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(11.0f, 16.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(7.25f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(5.75f, 6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(5.5f, 7.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(-0.25f)
                curveTo(4.0f, 5.78f, 4.78f, 5.0f, 5.75f, 5.0f)
                horizontalLineToRelative(12.5f)
                close()
            }
        }
        return _phoneLaptop!!
    }

private var _phoneLaptop: ImageVector? = null
