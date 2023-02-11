

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) {
            return _alignCenterVertical!!
        }
        _alignCenterVertical = fluentIcon(name = "Regular.AlignCenterVertical") {
            fluentPath {
                moveTo(11.25f, 21.25f)
                lineTo(11.25f, 20.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.5f)
                curveTo(5.51f, 11.0f, 4.5f, 10.0f, 4.5f, 8.75f)
                verticalLineToRelative(-2.5f)
                curveTo(4.5f, 5.01f, 5.5f, 4.0f, 6.75f, 4.0f)
                horizontalLineToRelative(4.5f)
                lineTo(11.25f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(12.75f, 4.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(15.25f, 18.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(17.25f, 9.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(6.75f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(10.5f)
                close()
            }
        }
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
