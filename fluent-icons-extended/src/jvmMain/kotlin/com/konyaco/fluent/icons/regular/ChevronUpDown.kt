

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ChevronUpDown: ImageVector
    get() {
        if (_chevronUpDown != null) {
            return _chevronUpDown!!
        }
        _chevronUpDown = fluentIcon(name = "Regular.ChevronUpDown") {
            fluentPath {
                moveTo(12.54f, 2.23f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.08f, 0.0f)
                lineTo(5.2f, 8.73f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.08f, 1.04f)
                lineTo(12.0f, 3.83f)
                lineToRelative(5.7f, 5.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.1f, -1.04f)
                lineToRelative(-6.26f, -6.5f)
                close()
                moveTo(12.54f, 21.77f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.08f, 0.0f)
                lineToRelative(-6.25f, -6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.08f, -1.04f)
                lineTo(12.0f, 20.17f)
                lineToRelative(5.7f, -5.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.1f, 1.04f)
                lineToRelative(-6.26f, 6.5f)
                close()
            }
        }
        return _chevronUpDown!!
    }

private var _chevronUpDown: ImageVector? = null
