

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CellularData3: ImageVector
    get() {
        if (_cellularData3 != null) {
            return _cellularData3!!
        }
        _cellularData3 = fluentIcon(name = "Filled.CellularData3") {
            fluentPath {
                moveTo(12.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(8.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(4.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.98f)
                verticalLineToRelative(1.04f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.98f)
                verticalLineToRelative(-1.04f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 17.0f)
                close()
            }
        }
        return _cellularData3!!
    }

private var _cellularData3: ImageVector? = null
