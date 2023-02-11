

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Organization: ImageVector
    get() {
        if (_organization != null) {
            return _organization!!
        }
        _organization = fluentIcon(name = "Regular.Organization") {
            fluentPath {
                moveTo(11.75f, 2.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 11.0f, 9.43f)
                verticalLineToRelative(2.07f)
                horizontalLineTo(7.75f)
                curveToRelative(-1.24f, 0.0f, -2.25f, 1.0f, -2.25f, 2.25f)
                verticalLineToRelative(0.83f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, false, 1.5f, 0.0f)
                verticalLineToRelative(-0.83f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(0.83f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, false, 1.5f, 0.0f)
                verticalLineToRelative(-0.83f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.43f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 11.75f, 2.0f)
                close()
                moveTo(9.5f, 5.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -4.5f, 0.0f)
                close()
                moveTo(4.0f, 18.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -4.5f, 0.0f)
                close()
                moveTo(17.25f, 16.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -4.5f)
                close()
            }
        }
        return _organization!!
    }

private var _organization: ImageVector? = null
