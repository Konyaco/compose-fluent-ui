

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CompassNorthwest: ImageVector
    get() {
        if (_compassNorthwest != null) {
            return _compassNorthwest!!
        }
        _compassNorthwest = fluentIcon(name = "Regular.CompassNorthwest") {
            fluentPath {
                moveTo(3.5f, 12.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, 17.0f, 0.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -17.0f, 0.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(7.08f, 8.7f)
                curveToRelative(-0.4f, -1.01f, 0.6f, -2.02f, 1.63f, -1.62f)
                lineToRelative(4.03f, 1.6f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 2.6f, 2.55f)
                lineToRelative(1.86f, 4.33f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -1.64f, 1.64f)
                lineToRelative(-4.33f, -1.86f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -2.54f, -2.6f)
                lineTo(7.09f, 8.7f)
                close()
                moveTo(8.69f, 8.7f)
                lineTo(10.09f, 12.18f)
                curveToRelative(0.31f, 0.8f, 0.94f, 1.44f, 1.73f, 1.78f)
                lineToRelative(3.75f, 1.61f)
                lineToRelative(-1.6f, -3.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -1.79f, -1.74f)
                lineTo(8.69f, 8.7f)
                close()
            }
        }
        return _compassNorthwest!!
    }

private var _compassNorthwest: ImageVector? = null
