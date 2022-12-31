

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.System: ImageVector
    get() {
        if (_system != null) {
            return _system!!
        }
        _system = fluentIcon(name = "Regular.System") {
            fluentPath {
                moveTo(4.75f, 5.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 7.75f)
                verticalLineToRelative(8.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 19.25f, 19.0f)
                lineTo(4.75f, 19.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 16.25f)
                verticalLineToRelative(-8.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 5.0f)
                close()
                moveTo(4.75f, 6.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(4.75f, 6.5f)
                close()
            }
        }
        return _system!!
    }

private var _system: ImageVector? = null
