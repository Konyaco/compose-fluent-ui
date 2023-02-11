

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CellularData2: ImageVector
    get() {
        if (_cellularData2 != null) {
            return _cellularData2!!
        }
        _cellularData2 = fluentIcon(name = "Filled.CellularData2") {
            fluentPath {
                moveTo(16.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(15.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
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
        return _cellularData2!!
    }

private var _cellularData2: ImageVector? = null
