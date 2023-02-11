

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Record: ImageVector
    get() {
        if (_record != null) {
            return _record!!
        }
        _record = fluentIcon(name = "Regular.Record") {
            fluentPath {
                moveTo(12.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -17.0f, 0.0f)
                close()
            }
        }
        return _record!!
    }

private var _record: ImageVector? = null
