

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SlideMultipleArrowRight: ImageVector
    get() {
        if (_slideMultipleArrowRight != null) {
            return _slideMultipleArrowRight!!
        }
        _slideMultipleArrowRight = fluentIcon(name = "Filled.SlideMultipleArrowRight") {
            fluentPath {
                moveTo(2.0f, 7.75f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 6.75f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveTo(17.99f, 3.0f, 19.0f, 4.0f, 19.0f, 5.25f)
                verticalLineToRelative(0.25f)
                lineTo(7.75f, 5.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 4.5f, 8.75f)
                lineTo(4.5f, 17.0f)
                horizontalLineToRelative(-0.25f)
                curveTo(3.01f, 17.0f, 2.0f, 16.0f, 2.0f, 14.75f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(7.75f, 6.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(3.98f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 22.0f, 12.81f)
                lineTo(22.0f, 8.75f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-12.0f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(14.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineTo(19.29f, 17.0f)
                lineTo(14.5f, 17.0f)
                close()
            }
        }
        return _slideMultipleArrowRight!!
    }

private var _slideMultipleArrowRight: ImageVector? = null
