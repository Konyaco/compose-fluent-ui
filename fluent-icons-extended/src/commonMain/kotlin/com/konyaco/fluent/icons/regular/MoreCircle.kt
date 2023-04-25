

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MoreCircle: ImageVector
    get() {
        if (_moreCircle != null) {
            return _moreCircle!!
        }
        _moreCircle = fluentIcon(name = "Regular.MoreCircle") {
            fluentPath {
                moveTo(20.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, -17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 17.0f, 0.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                close()
                moveTo(7.0f, 13.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
                moveTo(12.0f, 13.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
                moveTo(17.0f, 13.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
            }
        }
        return _moreCircle!!
    }

private var _moreCircle: ImageVector? = null
