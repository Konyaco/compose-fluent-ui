

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CopyAdd: ImageVector
    get() {
        if (_copyAdd != null) {
            return _copyAdd!!
        }
        _copyAdd = fluentIcon(name = "Filled.CopyAdd") {
            fluentPath {
                moveTo(4.5f, 6.75f)
                lineTo(4.5f, 4.63f)
                curveTo(3.63f, 4.93f, 3.0f, 5.77f, 3.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 7.75f, 22.0f)
                horizontalLineToRelative(5.06f)
                curveToRelative(-0.42f, -0.44f, -0.79f, -0.94f, -1.08f, -1.5f)
                lineTo(7.75f, 20.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.25f, -3.25f)
                lineTo(4.5f, 6.75f)
                close()
                moveTo(19.0f, 11.17f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, -7.69f, 8.33f)
                lineTo(7.75f, 19.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-13.0f)
                curveTo(5.5f, 3.01f, 6.5f, 2.0f, 7.75f, 2.0f)
                horizontalLineToRelative(9.0f)
                curveTo(17.99f, 2.0f, 19.0f, 3.0f, 19.0f, 4.25f)
                verticalLineToRelative(6.92f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(18.0f, 20.5f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(17.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                close()
            }
        }
        return _copyAdd!!
    }

private var _copyAdd: ImageVector? = null
