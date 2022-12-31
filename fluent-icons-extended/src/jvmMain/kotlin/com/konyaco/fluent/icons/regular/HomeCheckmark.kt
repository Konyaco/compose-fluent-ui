

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.HomeCheckmark: ImageVector
    get() {
        if (_homeCheckmark != null) {
            return _homeCheckmark!!
        }
        _homeCheckmark = fluentIcon(name = "Regular.HomeCheckmark") {
            fluentPath {
                moveTo(10.54f, 2.53f)
                curveToRelative(0.83f, -0.7f, 2.06f, -0.7f, 2.9f, 0.0f)
                lineToRelative(6.76f, 5.7f)
                curveToRelative(0.5f, 0.43f, 0.8f, 1.06f, 0.8f, 1.72f)
                verticalLineToRelative(9.8f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(4.75f, 21.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-9.8f)
                curveToRelative(0.0f, -0.66f, 0.3f, -1.3f, 0.8f, -1.72f)
                lineToRelative(6.74f, -5.7f)
                close()
                moveTo(12.47f, 3.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.96f, 0.0f)
                lineToRelative(-6.74f, 5.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.27f, 0.57f)
                verticalLineToRelative(9.8f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-9.8f)
                curveToRelative(0.0f, -0.22f, -0.1f, -0.43f, -0.27f, -0.57f)
                lineToRelative(-6.76f, -5.7f)
                close()
                moveTo(15.78f, 10.72f)
                curveToRelative(0.3f, 0.29f, 0.3f, 0.76f, 0.0f, 1.06f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(3.97f, -3.97f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
            }
        }
        return _homeCheckmark!!
    }

private var _homeCheckmark: ImageVector? = null
