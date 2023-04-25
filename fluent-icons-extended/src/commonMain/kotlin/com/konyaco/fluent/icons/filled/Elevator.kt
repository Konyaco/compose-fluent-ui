

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Elevator: ImageVector
    get() {
        if (_elevator != null) {
            return _elevator!!
        }
        _elevator = fluentIcon(name = "Filled.Elevator") {
            fluentPath {
                moveTo(12.75f, 20.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.5f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(16.72f, 14.78f)
                lineTo(14.97f, 13.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(0.47f, 0.47f)
                lineTo(16.5f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(2.94f)
                lineToRelative(0.47f, -0.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-1.75f, 1.75f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                close()
                moveTo(11.25f, 4.0f)
                horizontalLineToRelative(-6.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.25f, 4.0f)
                close()
                moveTo(7.28f, 8.97f)
                lineToRelative(1.75f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, 1.06f)
                lineToRelative(-0.47f, -0.47f)
                verticalLineToRelative(2.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.94f)
                lineToRelative(-0.47f, 0.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(1.75f, -1.75f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
            }
        }
        return _elevator!!
    }

private var _elevator: ImageVector? = null
