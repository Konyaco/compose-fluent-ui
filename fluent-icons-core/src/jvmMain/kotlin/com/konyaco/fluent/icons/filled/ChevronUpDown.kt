

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ChevronUpDown: ImageVector
    get() {
        if (_chevronUpDown != null) {
            return _chevronUpDown!!
        }
        _chevronUpDown = fluentIcon(name = "Filled.ChevronUpDown") {
            fluentPath {
                moveTo(18.79f, 8.39f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.5f, 1.32f)
                lineTo(12.0f, 4.4f)
                lineToRelative(-5.3f, 5.3f)
                lineToRelative(-0.09f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, -1.5f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(0.1f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, 0.08f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(0.08f, 0.1f)
                close()
                moveTo(5.21f, 15.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.5f, -1.32f)
                lineTo(12.0f, 19.6f)
                lineToRelative(5.3f, -5.3f)
                lineToRelative(0.09f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, 1.5f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, -0.08f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(-0.08f, -0.1f)
                close()
            }
        }
        return _chevronUpDown!!
    }

private var _chevronUpDown: ImageVector? = null
