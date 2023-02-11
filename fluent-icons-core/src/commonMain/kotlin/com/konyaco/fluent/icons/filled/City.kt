

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.City: ImageVector
    get() {
        if (_city != null) {
            return _city!!
        }
        _city = fluentIcon(name = "Filled.City") {
            fluentPath {
                moveTo(12.75f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                lineTo(11.25f, 4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(7.5f, 7.9f)
                curveToRelative(1.52f, -0.13f, 3.0f, 1.04f, 3.0f, 2.75f)
                lineTo(10.5f, 22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, -2.75f)
                horizontalLineToRelative(0.25f)
                lineTo(16.5f, 5.75f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.75f, 2.75f)
                close()
                moveTo(14.5f, 22.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(14.5f, 22.0f)
                close()
                moveTo(9.5f, 20.75f)
                lineTo(9.5f, 22.0f)
                lineTo(5.25f, 22.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-7.96f)
                curveToRelative(0.0f, -0.59f, 0.3f, -1.14f, 0.79f, -1.46f)
                lineToRelative(2.5f, -1.65f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.71f, 1.47f)
                verticalLineToRelative(10.1f)
                close()
            }
        }
        return _city!!
    }

private var _city: ImageVector? = null
