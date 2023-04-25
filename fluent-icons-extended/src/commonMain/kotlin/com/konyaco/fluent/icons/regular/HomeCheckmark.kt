

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
                moveTo(13.45f, 2.53f)
                curveToRelative(-0.84f, -0.7f, -2.06f, -0.7f, -2.9f, 0.0f)
                lineTo(3.8f, 8.23f)
                curveToRelative(-0.5f, 0.42f, -0.8f, 1.05f, -0.8f, 1.71f)
                verticalLineToRelative(9.31f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.67f, -0.3f, -1.3f, -0.8f, -1.73f)
                lineToRelative(-6.75f, -5.69f)
                close()
                moveTo(11.52f, 3.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.96f, 0.0f)
                lineToRelative(6.75f, 5.7f)
                curveToRelative(0.17f, 0.13f, 0.27f, 0.34f, 0.27f, 0.56f)
                verticalLineToRelative(9.31f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.25f, -0.25f, 0.25f)
                lineTo(4.75f, 19.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.23f, 0.1f, -0.44f, 0.27f, -0.58f)
                lineToRelative(6.75f, -5.7f)
                close()
                moveTo(15.78f, 11.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-3.97f, 3.97f)
                lineToRelative(-1.47f, -1.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(4.5f, -4.5f)
                close()
            }
        }
        return _homeCheckmark!!
    }

private var _homeCheckmark: ImageVector? = null
