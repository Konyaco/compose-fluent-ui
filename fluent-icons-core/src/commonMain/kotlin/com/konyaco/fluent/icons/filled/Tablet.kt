

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = fluentIcon(name = "Filled.Tablet") {
            fluentPath {
                moveTo(19.75f, 4.0f)
                curveTo(20.99f, 4.0f, 22.0f, 5.0f, 22.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(22.0f, 19.0f, 21.0f, 20.0f, 19.75f, 20.0f)
                lineTo(4.25f, 20.0f)
                curveTo(3.01f, 20.0f, 2.0f, 19.0f, 2.0f, 17.75f)
                lineTo(2.0f, 6.25f)
                curveTo(2.0f, 5.01f, 3.0f, 4.0f, 4.25f, 4.0f)
                horizontalLineToRelative(15.5f)
                close()
                moveTo(13.75f, 15.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                close()
            }
        }
        return _tablet!!
    }

private var _tablet: ImageVector? = null
