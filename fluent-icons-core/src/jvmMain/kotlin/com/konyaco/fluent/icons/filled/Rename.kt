

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Rename: ImageVector
    get() {
        if (_rename != null) {
            return _rename!!
        }
        _rename = fluentIcon(name = "Filled.Rename") {
            fluentPath {
                moveTo(9.75f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(12.5f, 3.5f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.37f, 0.0f, 0.69f, 0.28f, 0.74f, 0.65f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.64f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(11.0f, 20.5f)
                verticalLineToRelative(-17.0f)
                lineTo(9.75f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineTo(9.0f, 2.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                close()
                moveTo(18.25f, 5.0f)
                curveToRelative(1.79f, 0.0f, 3.24f, 1.45f, 3.25f, 3.25f)
                verticalLineToRelative(7.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 18.44f, 19.0f)
                lineTo(13.5f, 19.0f)
                lineTo(13.5f, 5.0f)
                horizontalLineToRelative(4.74f)
                close()
                moveTo(10.0f, 5.0f)
                verticalLineToRelative(14.0f)
                lineTo(5.24f, 19.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 15.75f)
                verticalLineToRelative(-7.5f)
                curveTo(2.0f, 6.45f, 3.46f, 5.0f, 5.25f, 5.0f)
                lineTo(10.0f, 5.0f)
                close()
            }
        }
        return _rename!!
    }

private var _rename: ImageVector? = null
