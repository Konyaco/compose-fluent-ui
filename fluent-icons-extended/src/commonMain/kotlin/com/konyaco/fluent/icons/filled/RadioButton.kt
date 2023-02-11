

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.RadioButton: ImageVector
    get() {
        if (_radioButton != null) {
            return _radioButton!!
        }
        _radioButton = fluentIcon(name = "Filled.RadioButton") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                close()
            }
        }
        return _radioButton!!
    }

private var _radioButton: ImageVector? = null
