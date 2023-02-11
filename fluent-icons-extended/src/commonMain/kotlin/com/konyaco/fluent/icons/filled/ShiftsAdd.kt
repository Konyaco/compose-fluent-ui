

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShiftsAdd: ImageVector
    get() {
        if (_shiftsAdd != null) {
            return _shiftsAdd!!
        }
        _shiftsAdd = fluentIcon(name = "Filled.ShiftsAdd") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(5.77f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, 8.0f, 0.8f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.0f, -0.07f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(-0.14f, -0.01f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, 0.37f, 7.51f)
                horizontalLineToRelative(5.77f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        return _shiftsAdd!!
    }

private var _shiftsAdd: ImageVector? = null
