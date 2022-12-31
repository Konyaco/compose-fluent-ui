

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DualScreenArrowUp: ImageVector
    get() {
        if (_dualScreenArrowUp != null) {
            return _dualScreenArrowUp!!
        }
        _dualScreenArrowUp = fluentIcon(name = "Regular.DualScreenArrowUp") {
            fluentPath {
                moveTo(22.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(16.0f, 4.7f)
                verticalLineToRelative(4.8f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                lineTo(17.0f, 4.7f)
                lineToRelative(1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.0f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineTo(16.0f, 4.71f)
                close()
                moveTo(10.0f, 6.5f)
                curveToRelative(0.0f, -0.17f, 0.0f, -0.33f, 0.02f, -0.5f)
                lineTo(3.75f, 6.0f)
                curveTo(2.78f, 6.0f, 2.0f, 6.78f, 2.0f, 7.75f)
                verticalLineToRelative(12.5f)
                curveTo(2.0f, 21.2f, 2.78f, 22.0f, 3.75f, 22.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.96f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(22.0f, 9.97f)
                curveToRelative(-0.4f, 0.64f, -0.91f, 1.2f, -1.5f, 1.66f)
                verticalLineToRelative(8.62f)
                curveToRelative(0.0f, 0.14f, -0.12f, 0.25f, -0.25f, 0.25f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-8.7f)
                curveToRelative(-0.58f, -0.4f, -1.09f, -0.9f, -1.5f, -1.47f)
                lineTo(11.25f, 20.5f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(3.5f, 7.75f)
                curveToRelative(0.0f, -0.14f, 0.11f, -0.25f, 0.25f, -0.25f)
                horizontalLineToRelative(6.33f)
                arcToRelative(6.55f, 6.55f, 0.0f, false, true, -0.08f, -1.0f)
                close()
                moveTo(16.99f, 18.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(9.99f, 18.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
            }
        }
        return _dualScreenArrowUp!!
    }

private var _dualScreenArrowUp: ImageVector? = null
