

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ReOrderDotsHorizontal: ImageVector
    get() {
        if (_reOrderDotsHorizontal != null) {
            return _reOrderDotsHorizontal!!
        }
        _reOrderDotsHorizontal = fluentIcon(name = "Filled.ReOrderDotsHorizontal") {
            fluentPath {
                moveTo(7.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(7.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(14.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(14.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(21.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
                moveTo(21.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                close()
            }
        }
        return _reOrderDotsHorizontal!!
    }

private var _reOrderDotsHorizontal: ImageVector? = null
