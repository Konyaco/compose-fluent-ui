

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = fluentIcon(name = "Filled.Headset") {
            fluentPath {
                moveTo(5.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 14.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(9.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.5f, -0.06f)
                verticalLineToRelative(0.31f)
                curveToRelative(0.0f, 1.2f, 0.93f, 2.17f, 2.1f, 2.24f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(1.13f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 1.5f)
                horizontalLineTo(8.75f)
                curveToRelative(-2.0f, 0.0f, -3.64f, -1.57f, -3.74f, -3.55f)
                lineToRelative(-0.01f, -0.2f)
                verticalLineTo(9.0f)
                close()
            }
        }
        return _headset!!
    }

private var _headset: ImageVector? = null
