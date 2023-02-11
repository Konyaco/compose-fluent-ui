

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ReOrder: ImageVector
    get() {
        if (_reOrder != null) {
            return _reOrder!!
        }
        _reOrder = fluentIcon(name = "Filled.ReOrder") {
            fluentPath {
                moveTo(3.0f, 13.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(3.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(21.0f, 13.0f)
                lineTo(3.0f, 13.0f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.12f, 2.0f)
                lineTo(3.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.12f, -2.0f)
                lineTo(21.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                close()
            }
        }
        return _reOrder!!
    }

private var _reOrder: ImageVector? = null
