

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.MoreHorizontal: ImageVector
    get() {
        if (_moreHorizontal != null) {
            return _moreHorizontal!!
        }
        _moreHorizontal = fluentIcon(name = "Regular.MoreHorizontal") {
            fluentPath {
                moveTo(7.75f, 12.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 3.5f, 0.0f)
                close()
                moveTo(13.75f, 12.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 3.5f, 0.0f)
                close()
                moveTo(18.0f, 13.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, -3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, 3.5f)
                close()
            }
        }
        return _moreHorizontal!!
    }

private var _moreHorizontal: ImageVector? = null
