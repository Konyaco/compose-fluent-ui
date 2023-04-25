

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SelectAllOn: ImageVector
    get() {
        if (_selectAllOn != null) {
            return _selectAllOn!!
        }
        _selectAllOn = fluentIcon(name = "Regular.SelectAllOn") {
            fluentPath {
                moveTo(20.5f, 5.63f)
                curveToRelative(0.87f, 0.3f, 1.5f, 1.14f, 1.5f, 2.12f)
                verticalLineToRelative(10.0f)
                curveTo(22.0f, 20.1f, 20.1f, 22.0f, 17.75f, 22.0f)
                horizontalLineToRelative(-10.0f)
                curveToRelative(-0.98f, 0.0f, -1.82f, -0.63f, -2.12f, -1.5f)
                horizontalLineToRelative(12.12f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, -2.75f)
                lineTo(20.5f, 5.63f)
                close()
                moveTo(17.25f, 2.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.24f, -1.01f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-13.0f)
                curveTo(3.01f, 19.5f, 2.0f, 18.49f, 2.0f, 17.25f)
                verticalLineToRelative(-13.0f)
                curveTo(2.0f, 3.01f, 3.0f, 2.0f, 4.25f, 2.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(17.25f, 3.5f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(9.58f, 11.36f)
                lineTo(13.47f, 7.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.13f, 0.98f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-4.5f, 4.5f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.29f, -1.06f, 0.0f)
                lineToRelative(-0.07f, -0.08f)
                lineToRelative(-1.5f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.13f, -0.98f)
                lineToRelative(0.07f, 0.08f)
                lineToRelative(0.98f, 1.3f)
                lineToRelative(3.89f, -3.88f)
                lineToRelative(-3.89f, 3.89f)
                close()
            }
        }
        return _selectAllOn!!
    }

private var _selectAllOn: ImageVector? = null
