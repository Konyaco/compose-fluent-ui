

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LocationAdd: ImageVector
    get() {
        if (_locationAdd != null) {
            return _locationAdd!!
        }
        _locationAdd = fluentIcon(name = "Regular.LocationAdd") {
            fluentPath {
                moveTo(8.0f, 10.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(7.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(11.5f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(5.84f, 4.57f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, 12.32f, 12.31f)
                lineToRelative(-1.19f, 1.18f)
                lineToRelative(-3.4f, 3.3f)
                curveToRelative(-0.88f, 0.85f, -2.26f, 0.85f, -3.13f, 0.0f)
                lineToRelative(-3.5f, -3.39f)
                arcToRelative(175.0f, 175.0f, 0.0f, false, true, -1.1f, -1.09f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, 0.0f, -12.31f)
                close()
                moveTo(17.1f, 5.63f)
                arcToRelative(7.2f, 7.2f, 0.0f, true, false, -10.2f, 10.2f)
                lineToRelative(1.5f, 1.46f)
                lineToRelative(3.08f, 3.0f)
                curveToRelative(0.29f, 0.28f, 0.75f, 0.28f, 1.04f, 0.0f)
                lineToRelative(3.4f, -3.3f)
                lineToRelative(1.18f, -1.17f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, 0.0f, -10.2f)
                close()
            }
        }
        return _locationAdd!!
    }

private var _locationAdd: ImageVector? = null
