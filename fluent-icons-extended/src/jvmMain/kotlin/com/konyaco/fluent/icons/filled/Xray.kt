

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Xray: ImageVector
    get() {
        if (_xray != null) {
            return _xray!!
        }
        _xray = fluentIcon(name = "Filled.Xray") {
            fluentPath {
                moveTo(14.0f, 16.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(9.25f, 16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(4.0f, 5.25f)
                curveTo(4.0f, 3.45f, 5.46f, 2.0f, 7.25f, 2.0f)
                horizontalLineToRelative(9.5f)
                curveTo(18.55f, 2.0f, 20.0f, 3.46f, 20.0f, 5.25f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-9.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 4.0f, 18.75f)
                lineTo(4.0f, 5.25f)
                close()
                moveTo(12.75f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(0.75f)
                lineTo(9.0f, 6.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 9.0f, 8.0f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 2.12f, 1.5f)
                horizontalLineToRelative(1.26f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 2.12f, -1.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.75f, 13.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                lineTo(12.75f, 8.0f)
                lineTo(15.0f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(-0.75f)
                close()
            }
        }
        return _xray!!
    }

private var _xray: ImageVector? = null
