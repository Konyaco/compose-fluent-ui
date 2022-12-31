

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) {
            return _alignCenterVertical!!
        }
        _alignCenterVertical = fluentIcon(name = "Filled.AlignCenterVertical") {
            fluentPath {
                moveTo(11.25f, 21.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-4.5f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(-4.5f)
                curveTo(5.51f, 4.0f, 4.5f, 5.0f, 4.5f, 6.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.25f)
                close()
            }
        }
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
