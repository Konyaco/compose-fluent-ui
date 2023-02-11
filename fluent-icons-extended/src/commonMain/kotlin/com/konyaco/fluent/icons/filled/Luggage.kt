

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Luggage: ImageVector
    get() {
        if (_luggage != null) {
            return _luggage!!
        }
        _luggage = fluentIcon(name = "Filled.Luggage") {
            fluentPath {
                moveTo(8.75f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                lineTo(9.0f, 3.5f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(-0.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.0f, 8.25f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.35f, 0.83f, 2.51f, 2.0f, 3.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.17f, -0.49f, 2.0f, -1.65f, 2.0f, -3.0f)
                verticalLineToRelative(-9.0f)
                curveTo(19.0f, 6.45f, 17.54f, 5.0f, 15.75f, 5.0f)
                lineTo(15.0f, 5.0f)
                lineTo(15.0f, 3.5f)
                horizontalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(13.5f, 3.5f)
                lineTo(13.5f, 5.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 3.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(8.0f, 9.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 9.75f)
                close()
            }
        }
        return _luggage!!
    }

private var _luggage: ImageVector? = null
