

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.RealEstate: ImageVector
    get() {
        if (_realEstate != null) {
            return _realEstate!!
        }
        _realEstate = fluentIcon(name = "Filled.RealEstate") {
            fluentPath {
                moveTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(5.0f, 6.0f)
                verticalLineToRelative(15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(3.0f, 4.0f)
                close()
                moveTo(6.0f, 7.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(8.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 19.0f)
                horizontalLineToRelative(-9.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 6.0f, 16.25f)
                verticalLineToRelative(-8.5f)
                close()
                moveTo(10.0f, 12.46f)
                verticalLineToRelative(3.04f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                lineTo(12.5f, 14.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-3.04f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.35f, -0.76f)
                lineToRelative(-2.82f, -2.42f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.66f, 0.0f)
                lineToRelative(-2.82f, 2.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.35f, 0.76f)
                close()
            }
        }
        return _realEstate!!
    }

private var _realEstate: ImageVector? = null
