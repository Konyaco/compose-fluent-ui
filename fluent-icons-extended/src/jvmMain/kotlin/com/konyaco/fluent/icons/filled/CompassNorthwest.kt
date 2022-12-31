

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
                moveTo(3.25f, 11.0f)
                horizontalLineToRelative(-1.2f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 11.0f, 2.05f)
                verticalLineToRelative(1.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(12.5f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 21.95f, 11.0f)
                horizontalLineToRelative(-1.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(1.24f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -9.5f, 9.49f)
                verticalLineToRelative(-1.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(1.2f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -8.98f, -9.45f)
                horizontalLineToRelative(1.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(14.65f, 11.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.2f, -2.14f)
                lineTo(8.44f, 7.78f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.65f, 0.65f)
                lineToRelative(1.6f, 4.03f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.14f, 2.2f)
                lineToRelative(4.33f, 1.85f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.66f, -0.66f)
                lineToRelative(-1.86f, -4.32f)
                close()
            }
        }
        return _compassNorthwest!!
    }

private var _compassNorthwest: ImageVector? = null
