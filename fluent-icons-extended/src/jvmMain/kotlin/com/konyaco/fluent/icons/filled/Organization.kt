

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Organization: ImageVector
    get() {
        if (_organization != null) {
            return _organization!!
        }
        _organization = fluentIcon(name = "Filled.Organization") {
            fluentPath {
                moveTo(8.0f, 5.75f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, true, 4.5f, 3.68f)
                verticalLineToRelative(2.07f)
                horizontalLineToRelative(3.25f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(0.82f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.82f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.82f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.82f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.43f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.0f, -3.68f)
                close()
            }
        }
        return _organization!!
    }

private var _organization: ImageVector? = null
