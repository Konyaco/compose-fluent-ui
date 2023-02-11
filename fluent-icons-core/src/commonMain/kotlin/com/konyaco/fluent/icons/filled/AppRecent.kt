

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AppRecent: ImageVector
    get() {
        if (_appRecent != null) {
            return _appRecent!!
        }
        _appRecent = fluentIcon(name = "Filled.AppRecent") {
            fluentPath {
                moveTo(18.0f, 19.75f)
                curveToRelative(0.0f, 1.2f, -0.93f, 2.17f, -2.1f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.93f, -2.24f, -2.1f)
                lineTo(6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(8.25f, 2.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.2f, 0.0f, 2.17f, 0.93f, 2.24f, 2.1f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.2f, 0.0f, 2.17f, 0.93f, 2.24f, 2.1f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.2f, -0.93f, 2.17f, -2.1f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.93f, -2.24f, -2.1f)
                lineTo(2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(4.25f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(14.0f)
                close()
            }
        }
        return _appRecent!!
    }

private var _appRecent: ImageVector? = null
