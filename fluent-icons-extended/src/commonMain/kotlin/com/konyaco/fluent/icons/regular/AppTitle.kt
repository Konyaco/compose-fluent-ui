

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.AppTitle: ImageVector
    get() {
        if (_appTitle != null) {
            return _appTitle!!
        }
        _appTitle = fluentIcon(name = "Regular.AppTitle") {
            fluentPath {
                moveTo(4.75f, 20.5f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(4.75f, 22.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(14.6f)
                horizontalLineToRelative(-14.5f)
                close()
                moveTo(16.25f, 3.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 20.0f, 6.75f)
                verticalLineToRelative(8.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 16.25f, 19.0f)
                horizontalLineToRelative(-8.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 4.0f, 15.25f)
                verticalLineToRelative(-8.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 7.75f, 3.0f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(16.25f, 4.5f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                close()
            }
        }
        return _appTitle!!
    }

private var _appTitle: ImageVector? = null
