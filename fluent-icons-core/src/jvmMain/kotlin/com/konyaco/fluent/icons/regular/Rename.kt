

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Rename: ImageVector
    get() {
        if (_rename != null) {
            return _rename!!
        }
        _rename = fluentIcon(name = "Regular.Rename") {
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
                horizontalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(18.25f, 5.0f)
                curveToRelative(1.79f, 0.0f, 3.24f, 1.45f, 3.25f, 3.25f)
                verticalLineToRelative(7.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 18.44f, 19.0f)
                lineTo(13.5f, 19.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(4.8f)
                curveToRelative(0.94f, -0.03f, 1.7f, -0.8f, 1.69f, -1.75f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.97f, -0.79f, -1.75f, -1.75f, -1.75f)
                lineTo(13.5f, 6.5f)
                lineTo(13.5f, 5.0f)
                horizontalLineToRelative(4.74f)
                close()
                moveTo(10.0f, 5.0f)
                verticalLineToRelative(1.5f)
                lineTo(5.25f, 6.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                lineTo(10.0f, 17.5f)
                lineTo(10.0f, 19.0f)
                lineTo(5.25f, 19.0f)
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
