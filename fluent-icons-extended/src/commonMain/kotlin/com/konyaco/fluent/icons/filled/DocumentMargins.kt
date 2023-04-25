

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentMargins: ImageVector
    get() {
        if (_documentMargins != null) {
            return _documentMargins!!
        }
        _documentMargins = fluentIcon(name = "Filled.DocumentMargins") {
            fluentPath {
                moveTo(15.5f, 2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(-0.75f)
                curveTo(5.01f, 2.0f, 4.0f, 3.0f, 4.0f, 4.25f)
                verticalLineToRelative(15.5f)
                curveTo(4.0f, 20.99f, 5.0f, 22.0f, 6.25f, 22.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(8.5f, 22.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(17.0f, 22.0f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(20.0f, 4.25f)
                curveTo(20.0f, 3.01f, 19.0f, 2.0f, 17.75f, 2.0f)
                lineTo(17.0f, 2.0f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(15.5f, 2.0f)
                close()
                moveTo(7.75f, 8.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(17.0f, 9.25f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
            }
        }
        return _documentMargins!!
    }

private var _documentMargins: ImageVector? = null
