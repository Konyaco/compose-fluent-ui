

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) {
            return _alignCenterHorizontal!!
        }
        _alignCenterHorizontal = fluentIcon(name = "Filled.AlignCenterHorizontal") {
            fluentPath {
                moveTo(21.25f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-2.5f)
                curveTo(5.01f, 4.5f, 4.0f, 5.5f, 4.0f, 6.75f)
                verticalLineToRelative(4.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.25f)
                close()
            }
        }
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
