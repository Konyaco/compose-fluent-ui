

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.AppGeneric: ImageVector
    get() {
        if (_appGeneric != null) {
            return _appGeneric!!
        }
        _appGeneric = fluentIcon(name = "Regular.AppGeneric") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(6.25f, 4.5f)
                close()
                moveTo(4.5f, 17.75f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(19.5f, 8.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(9.75f)
                close()
                moveTo(6.85f, 9.5f)
                horizontalLineToRelative(3.3f)
                curveToRelative(0.47f, 0.0f, 0.85f, 0.38f, 0.85f, 0.85f)
                verticalLineToRelative(6.8f)
                curveToRelative(0.0f, 0.47f, -0.38f, 0.85f, -0.85f, 0.85f)
                horizontalLineToRelative(-3.3f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, -0.85f, -0.85f)
                verticalLineToRelative(-6.8f)
                curveToRelative(0.0f, -0.47f, 0.38f, -0.85f, 0.85f, -0.85f)
                close()
                moveTo(7.5f, 16.5f)
                horizontalLineToRelative(2.0f)
                lineTo(9.5f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(12.0f, 10.25f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(12.75f, 12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        return _appGeneric!!
    }

private var _appGeneric: ImageVector? = null
