

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.City: ImageVector
    get() {
        if (_city != null) {
            return _city!!
        }
        _city = fluentIcon(name = "Regular.City") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.33f, 0.75f, 0.75f)
                lineTo(12.75f, 4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(16.5f, 11.0f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(5.25f, 22.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-8.43f)
                curveToRelative(0.0f, -0.62f, 0.33f, -1.2f, 0.86f, -1.5f)
                lineTo(7.5f, 8.45f)
                lineTo(7.5f, 5.75f)
                curveTo(7.5f, 4.78f, 8.28f, 4.0f, 9.25f, 4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.25f, 2.75f)
                curveToRelative(0.0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(9.0f, 8.02f)
                curveToRelative(0.81f, 0.12f, 1.5f, 0.8f, 1.5f, 1.73f)
                lineTo(10.5f, 20.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.75f)
                curveToRelative(0.0f, -0.88f, 0.65f, -1.61f, 1.5f, -1.73f)
                lineTo(15.0f, 5.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(2.27f)
                close()
                moveTo(15.25f, 12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(8.62f, 9.54f)
                lineToRelative(-3.5f, 2.06f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.12f, 0.22f)
                verticalLineToRelative(8.43f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                lineTo(9.0f, 20.5f)
                lineTo(9.0f, 9.75f)
                curveToRelative(0.0f, -0.2f, -0.21f, -0.31f, -0.38f, -0.21f)
                close()
            }
        }
        return _city!!
    }

private var _city: ImageVector? = null
