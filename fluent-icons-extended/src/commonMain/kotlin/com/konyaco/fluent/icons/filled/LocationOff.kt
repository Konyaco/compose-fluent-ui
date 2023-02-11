

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LocationOff: ImageVector
    get() {
        if (_locationOff != null) {
            return _locationOff!!
        }
        _locationOff = fluentIcon(name = "Filled.LocationOff") {
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
                moveTo(12.41f, 13.47f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, true, -2.88f, -2.88f)
                lineToRelative(2.88f, 2.88f)
                close()
                moveTo(14.5f, 11.0f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.2f, -0.02f, 0.3f)
                lineToRelative(4.56f, 4.56f)
                arcTo(8.7f, 8.7f, 0.0f, false, false, 6.87f, 3.69f)
                lineToRelative(4.83f, 4.83f)
                lineToRelative(0.3f, -0.02f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                close()
            }
        }
        return _locationOff!!
    }

private var _locationOff: ImageVector? = null
