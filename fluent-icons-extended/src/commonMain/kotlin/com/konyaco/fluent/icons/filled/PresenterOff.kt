

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PresenterOff: ImageVector
    get() {
        if (_presenterOff != null) {
            return _presenterOff!!
        }
        _presenterOff = fluentIcon(name = "Filled.PresenterOff") {
            fluentPath {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(5.85f, 5.86f)
                curveTo(7.44f, 9.4f, 7.0f, 10.02f, 7.0f, 10.75f)
                lineTo(7.0f, 12.0f)
                horizontalLineToRelative(3.94f)
                lineToRelative(1.0f, 1.0f)
                horizontalLineToRelative(-8.2f)
                curveToRelative(-0.7f, 0.0f, -1.01f, 0.89f, -0.46f, 1.33f)
                lineTo(8.0f, 18.11f)
                verticalLineToRelative(1.64f)
                curveTo(8.0f, 21.0f, 9.0f, 22.0f, 10.25f, 22.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                verticalLineToRelative(-1.64f)
                lineToRelative(0.58f, -0.47f)
                lineToRelative(4.14f, 4.14f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(16.18f, 13.0f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(1.77f, -1.43f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.47f, -1.33f)
                horizontalLineToRelative(-4.06f)
                close()
                moveTo(12.18f, 9.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(17.0f, 12.0f)
                lineTo(17.0f, 10.61f)
                curveTo(16.92f, 9.7f, 16.16f, 9.0f, 15.24f, 9.0f)
                horizontalLineToRelative(-3.06f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.98f, -0.16f)
                lineTo(9.16f, 5.98f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 12.0f, 8.0f)
                close()
            }
        }
        return _presenterOff!!
    }

private var _presenterOff: ImageVector? = null
