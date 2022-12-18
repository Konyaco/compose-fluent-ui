

package com.konyaco.fluent.icons.default

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Default.Accept: ImageVector
    get() {
        if (_accept != null) {
            return _accept!!
        }
        _accept = fluentIcon(name = "Default.Accept") {
            fluentPath {
                moveTo(640.0f, 1755.0f)
                lineTo(19.0f, 1133.0f)
                lineToRelative(90.0f, -90.0f)
                lineToRelative(531.0f, 530.0f)
                lineTo(1939.0f, 275.0f)
                lineToRelative(90.0f, 90.0f)
                lineTo(640.0f, 1755.0f)
                close()
            }
        }
        return _accept!!
    }

private var _accept: ImageVector? = null
