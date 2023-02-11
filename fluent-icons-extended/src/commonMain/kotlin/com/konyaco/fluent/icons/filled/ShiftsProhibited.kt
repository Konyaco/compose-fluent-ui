

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShiftsProhibited: ImageVector
    get() {
        if (_shiftsProhibited != null) {
            return _shiftsProhibited!!
        }
        _shiftsProhibited = fluentIcon(name = "Filled.ShiftsProhibited") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(5.77f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, 8.0f, 0.8f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.0f, -0.07f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(12.5f, 12.0f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(-0.14f, -0.01f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, 0.37f, 7.51f)
                horizontalLineToRelative(5.77f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(2.5f, 17.5f)
                curveToRelative(0.0f, 0.83f, 0.25f, 1.6f, 0.7f, 2.25f)
                lineToRelative(5.55f, -5.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.25f, 3.3f)
                close()
                moveTo(6.5f, 21.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.3f, -6.25f)
                lineToRelative(-5.55f, 5.56f)
                curveToRelative(0.64f, 0.44f, 1.42f, 0.69f, 2.25f, 0.69f)
                close()
            }
        }
        return _shiftsProhibited!!
    }

private var _shiftsProhibited: ImageVector? = null
