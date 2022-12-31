

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PhoneLaptop: ImageVector
    get() {
        if (_phoneLaptop != null) {
            return _phoneLaptop!!
        }
        _phoneLaptop = fluentIcon(name = "Filled.PhoneLaptop") {
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
                moveTo(6.25f, 17.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
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
                lineTo(11.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.85f, -2.0f)
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
