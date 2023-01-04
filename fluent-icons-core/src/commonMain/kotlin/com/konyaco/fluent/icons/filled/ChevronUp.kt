

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChevronUp: ImageVector
    get() {
        if (_chevronUp != null) {
            return _chevronUp!!
        }
        _chevronUp = fluentIcon(name = "Filled.ChevronUp") {
            fluentPath {
                moveTo(4.3f, 15.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 0.0f)
                lineTo(12.0f, 9.42f)
                lineToRelative(6.3f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, -1.42f)
                lineToRelative(-7.0f, -7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineToRelative(-7.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                close()
            }
        }
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
