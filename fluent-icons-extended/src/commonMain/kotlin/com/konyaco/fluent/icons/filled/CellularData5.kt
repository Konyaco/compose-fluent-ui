

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CellularData5: ImageVector
    get() {
        if (_cellularData5 != null) {
            return _cellularData5!!
        }
        _cellularData5 = fluentIcon(name = "Filled.CellularData5") {
            fluentPath {
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
        return _cellularData5!!
    }

private var _cellularData5: ImageVector? = null
