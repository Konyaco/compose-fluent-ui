

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LocationOff: ImageVector
    get() {
        if (_locationOff != null) {
            return _locationOff!!
        }
        _locationOff = fluentIcon(name = "Regular.LocationOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(2.57f, 2.57f)
                arcToRelative(8.71f, 8.71f, 0.0f, false, false, 1.05f, 11.03f)
                lineToRelative(1.1f, 1.1f)
                lineToRelative(3.5f, 3.39f)
                curveToRelative(0.87f, 0.84f, 2.25f, 0.84f, 3.12f, 0.0f)
                arcToRelative(656.5f, 656.5f, 0.0f, false, false, 3.41f, -3.31f)
                lineToRelative(0.01f, -0.02f)
                lineToRelative(3.74f, 3.74f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(15.92f, 16.98f)
                lineTo(12.52f, 20.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.04f, 0.0f)
                lineToRelative(-3.09f, -3.0f)
                lineToRelative(-1.49f, -1.47f)
                arcToRelative(7.21f, 7.21f, 0.0f, false, true, -1.03f, -8.89f)
                lineToRelative(3.24f, 3.24f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.72f, 3.72f)
                lineToRelative(3.1f, 3.1f)
                close()
                moveTo(11.27f, 8.08f)
                lineTo(14.91f, 11.73f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.64f, -3.64f)
                close()
                moveTo(17.1f, 5.63f)
                arcToRelative(7.21f, 7.21f, 0.0f, false, true, 0.86f, 9.15f)
                lineToRelative(1.08f, 1.08f)
                arcTo(8.7f, 8.7f, 0.0f, false, false, 6.87f, 3.69f)
                lineToRelative(1.08f, 1.07f)
                arcToRelative(7.21f, 7.21f, 0.0f, false, true, 9.15f, 0.87f)
                close()
            }
        }
        return _locationOff!!
    }

private var _locationOff: ImageVector? = null
