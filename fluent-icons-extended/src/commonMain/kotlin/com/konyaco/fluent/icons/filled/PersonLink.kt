

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonLink: ImageVector
    get() {
        if (_personLink != null) {
            return _personLink!!
        }
        _personLink = fluentIcon(name = "Filled.PersonLink") {
            fluentPath {
                moveTo(16.75f, 14.0f)
                curveToRelative(0.78f, 0.0f, 1.47f, 0.4f, 1.88f, 1.0f)
                horizontalLineToRelative(-2.88f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, -4.19f, 6.99f)
                lineTo(11.0f, 22.0f)
                curveToRelative(-3.42f, 0.0f, -5.94f, -1.07f, -7.49f, -3.24f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.5f, -1.6f)
                verticalLineToRelative(-0.91f)
                curveTo(3.0f, 15.0f, 4.0f, 14.0f, 5.24f, 14.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(11.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(23.0f, 19.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 19.25f, 16.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(0.15f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -0.15f, 4.5f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                verticalLineToRelative(-0.01f)
                horizontalLineToRelative(0.2f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 23.0f, 19.74f)
                close()
                moveTo(16.5f, 16.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 0.2f, 7.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                horizontalLineToRelative(-0.15f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.15f, -4.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(20.0f, 19.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
            }
        }
        return _personLink!!
    }

private var _personLink: ImageVector? = null
