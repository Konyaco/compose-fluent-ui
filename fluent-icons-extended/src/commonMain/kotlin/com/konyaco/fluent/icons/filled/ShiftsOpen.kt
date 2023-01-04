

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShiftsOpen: ImageVector
    get() {
        if (_shiftsOpen != null) {
            return _shiftsOpen!!
        }
        _shiftsOpen = fluentIcon(name = "Filled.ShiftsOpen") {
            fluentPath {
                moveTo(15.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(15.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.5f, 3.0f)
                lineTo(15.0f, 3.0f)
                close()
                moveTo(5.0f, 6.5f)
                curveTo(5.0f, 5.67f, 5.67f, 5.0f, 6.5f, 5.0f)
                lineTo(9.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(6.5f, 3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.0f, 6.5f)
                verticalLineToRelative(11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 21.0f)
                lineTo(9.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(6.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 17.5f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(12.5f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(16.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(12.5f, 7.0f)
                close()
            }
        }
        return _shiftsOpen!!
    }

private var _shiftsOpen: ImageVector? = null
