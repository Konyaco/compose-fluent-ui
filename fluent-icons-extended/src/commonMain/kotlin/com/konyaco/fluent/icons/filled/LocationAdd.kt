

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.LocationAdd: ImageVector
    get() {
        if (_locationAdd != null) {
            return _locationAdd!!
        }
        _locationAdd = fluentIcon(name = "Filled.LocationAdd") {
            fluentPath {
                moveTo(16.97f, 18.06f)
                lineToRelative(1.19f, -1.18f)
                arcToRelative(8.7f, 8.7f, 0.0f, true, false, -12.32f, 0.0f)
                lineToRelative(1.1f, 1.1f)
                lineToRelative(3.5f, 3.39f)
                curveToRelative(0.87f, 0.84f, 2.25f, 0.84f, 3.12f, 0.0f)
                lineToRelative(3.41f, -3.31f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(11.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(7.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _locationAdd!!
    }

private var _locationAdd: ImageVector? = null
