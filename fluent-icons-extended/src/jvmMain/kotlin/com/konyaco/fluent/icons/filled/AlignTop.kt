

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AlignTop: ImageVector
    get() {
        if (_alignTop != null) {
            return _alignTop!!
        }
        _alignTop = fluentIcon(name = "Filled.AlignTop") {
            fluentPath {
                moveTo(2.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(2.75f, 3.0f)
                close()
                moveTo(4.0f, 8.25f)
                curveTo(4.0f, 7.01f, 5.0f, 6.0f, 6.25f, 6.0f)
                horizontalLineToRelative(2.5f)
                curveTo(9.99f, 6.0f, 11.0f, 7.0f, 11.0f, 8.25f)
                verticalLineToRelative(10.5f)
                curveTo(11.0f, 19.99f, 10.0f, 21.0f, 8.75f, 21.0f)
                horizontalLineToRelative(-2.5f)
                curveTo(5.01f, 21.0f, 4.0f, 20.0f, 4.0f, 18.75f)
                lineTo(4.0f, 8.25f)
                close()
                moveTo(13.0f, 8.25f)
                curveTo(13.0f, 7.01f, 14.0f, 6.0f, 15.25f, 6.0f)
                horizontalLineToRelative(2.5f)
                curveTo(18.99f, 6.0f, 20.0f, 7.0f, 20.0f, 8.25f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-7.0f)
                close()
            }
        }
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
