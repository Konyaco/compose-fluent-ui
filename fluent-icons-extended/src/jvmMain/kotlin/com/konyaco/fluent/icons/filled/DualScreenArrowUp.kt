

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DualScreenArrowUp: ImageVector
    get() {
        if (_dualScreenArrowUp != null) {
            return _dualScreenArrowUp!!
        }
        _dualScreenArrowUp = fluentIcon(name = "Filled.DualScreenArrowUp") {
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
                moveTo(22.0f, 20.25f)
                lineTo(22.0f, 9.97f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -9.26f, 1.83f)
                verticalLineToRelative(10.18f)
                lineTo(13.0f, 22.0f)
                horizontalLineToRelative(7.25f)
                curveToRelative(0.96f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                close()
                moveTo(14.74f, 17.5f)
                horizontalLineToRelative(1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(14.64f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(10.0f, 6.5f)
                curveToRelative(0.0f, -0.17f, 0.0f, -0.33f, 0.02f, -0.5f)
                lineTo(3.75f, 6.0f)
                curveTo(2.78f, 6.0f, 2.0f, 6.78f, 2.0f, 7.75f)
                verticalLineToRelative(12.5f)
                curveTo(2.0f, 21.2f, 2.78f, 22.0f, 3.75f, 22.0f)
                lineTo(11.0f, 22.0f)
                curveToRelative(0.08f, 0.0f, 0.16f, 0.0f, 0.24f, -0.02f)
                lineTo(11.24f, 10.32f)
                arcTo(6.47f, 6.47f, 0.0f, false, true, 10.0f, 6.5f)
                close()
                moveTo(7.74f, 17.5f)
                horizontalLineToRelative(1.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(7.64f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.1f)
                close()
            }
        }
        return _dualScreenArrowUp!!
    }

private var _dualScreenArrowUp: ImageVector? = null
