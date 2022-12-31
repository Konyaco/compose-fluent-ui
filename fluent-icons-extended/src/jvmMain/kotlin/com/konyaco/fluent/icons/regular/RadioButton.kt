

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.RadioButton: ImageVector
    get() {
        if (_radioButton != null) {
            return _radioButton!!
        }
        _radioButton = fluentIcon(name = "Regular.RadioButton") {
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 0.0f, -17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 0.0f, 17.0f)
                close()
            }
        }
        return _radioButton!!
    }

private var _radioButton: ImageVector? = null
