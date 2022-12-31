

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CellularData5: ImageVector
    get() {
        if (_cellularData5 != null) {
            return _cellularData5!!
        }
        _cellularData5 = fluentIcon(name = "Regular.CellularData5") {
            fluentPath {
                moveTo(3.0f, 17.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                close()
            }
        }
        return _cellularData5!!
    }

private var _cellularData5: ImageVector? = null
