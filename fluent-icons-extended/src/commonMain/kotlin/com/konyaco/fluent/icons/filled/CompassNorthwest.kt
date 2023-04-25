

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CompassNorthwest: ImageVector
    get() {
        if (_compassNorthwest != null) {
            return _compassNorthwest!!
        }
        _compassNorthwest = fluentIcon(name = "Filled.CompassNorthwest") {
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                close()
                moveTo(12.46f, 9.39f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.2f, 2.14f)
                lineToRelative(1.85f, 4.32f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.66f, 0.66f)
                lineToRelative(-4.32f, -1.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.14f, -2.2f)
                lineTo(7.78f, 8.44f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.65f, -0.65f)
                lineToRelative(4.03f, 1.6f)
                close()
            }
        }
        return _compassNorthwest!!
    }

private var _compassNorthwest: ImageVector? = null
