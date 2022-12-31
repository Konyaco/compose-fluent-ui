

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
                moveTo(8.7f, 7.08f)
                curveToRelative(-1.01f, -0.4f, -2.02f, 0.6f, -1.62f, 1.63f)
                lineToRelative(1.6f, 4.03f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 2.55f, 2.6f)
                lineToRelative(4.33f, 1.86f)
                curveToRelative(1.03f, 0.44f, 2.08f, -0.6f, 1.64f, -1.64f)
                lineToRelative(-1.86f, -4.33f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, -2.6f, -2.54f)
                lineTo(8.7f, 7.09f)
                close()
                moveTo(10.08f, 12.18f)
                lineTo(8.7f, 8.69f)
                lineToRelative(3.49f, 1.4f)
                curveToRelative(0.8f, 0.31f, 1.44f, 0.94f, 1.78f, 1.73f)
                lineToRelative(1.61f, 3.75f)
                lineToRelative(-3.75f, -1.6f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -1.74f, -1.79f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, 20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                close()
                moveTo(4.25f, 11.0f)
                horizontalLineToRelative(-0.7f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 11.0f, 3.56f)
                verticalLineToRelative(0.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-0.74f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 20.44f, 11.0f)
                horizontalLineToRelative(-0.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(0.74f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -7.99f, 7.99f)
                verticalLineToRelative(-0.74f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(0.7f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -7.49f, -7.95f)
                horizontalLineToRelative(0.74f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        return _compassNorthwest!!
    }

private var _compassNorthwest: ImageVector? = null
