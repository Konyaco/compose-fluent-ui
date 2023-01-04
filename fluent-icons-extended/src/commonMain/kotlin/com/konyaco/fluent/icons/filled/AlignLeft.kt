

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) {
            return _alignLeft!!
        }
        _alignLeft = fluentIcon(name = "Filled.AlignLeft") {
            fluentPath {
                moveTo(3.0f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(3.0f, 2.75f)
                close()
                moveTo(8.25f, 4.0f)
                curveTo(7.01f, 4.0f, 6.0f, 5.0f, 6.0f, 6.25f)
                verticalLineToRelative(2.5f)
                curveTo(6.0f, 9.99f, 7.0f, 11.0f, 8.25f, 11.0f)
                horizontalLineToRelative(10.5f)
                curveTo(19.99f, 11.0f, 21.0f, 10.0f, 21.0f, 8.75f)
                verticalLineToRelative(-2.5f)
                curveTo(21.0f, 5.01f, 20.0f, 4.0f, 18.75f, 4.0f)
                lineTo(8.25f, 4.0f)
                close()
                moveTo(8.25f, 13.0f)
                curveTo(7.01f, 13.0f, 6.0f, 14.0f, 6.0f, 15.25f)
                verticalLineToRelative(2.5f)
                curveTo(6.0f, 18.99f, 7.0f, 20.0f, 8.25f, 20.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
