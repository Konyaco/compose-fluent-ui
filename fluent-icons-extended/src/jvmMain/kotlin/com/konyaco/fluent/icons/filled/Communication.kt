

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Communication: ImageVector
    get() {
        if (_communication != null) {
            return _communication!!
        }
        _communication = fluentIcon(name = "Filled.Communication") {
            fluentPath {
                moveTo(12.0f, 5.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.42f, 1.41f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 14.16f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, -1.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(8.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.83f, 2.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.41f, 1.41f)
                arcTo(5.98f, 5.98f, 0.0f, false, false, 12.0f, 7.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.24f, 10.24f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.41f, -1.41f)
                arcTo(3.98f, 3.98f, 0.0f, false, true, 8.0f, 13.0f)
                close()
            }
        }
        return _communication!!
    }

private var _communication: ImageVector? = null
