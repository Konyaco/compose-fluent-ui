

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ScanDash: ImageVector
    get() {
        if (_scanDash != null) {
            return _scanDash!!
        }
        _scanDash = fluentIcon(name = "Filled.ScanDash") {
            fluentPath {
                moveTo(6.5f, 3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 3.0f, 6.5f)
                verticalLineToRelative(1.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(5.0f, 6.5f)
                curveTo(5.0f, 5.67f, 5.67f, 5.0f, 6.5f, 5.0f)
                horizontalLineToRelative(1.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(6.5f, 3.0f)
                close()
                moveTo(15.64f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.86f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(21.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.5f, 3.0f)
                horizontalLineToRelative(-1.86f)
                close()
                moveTo(5.0f, 15.64f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(1.86f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 21.0f)
                horizontalLineToRelative(1.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(6.5f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 17.5f)
                verticalLineToRelative(-1.86f)
                close()
                moveTo(21.0f, 15.64f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(1.86f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.86f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(1.86f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f)
                verticalLineToRelative(-1.86f)
                close()
                moveTo(8.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                lineTo(8.0f, 11.0f)
                close()
            }
        }
        return _scanDash!!
    }

private var _scanDash: ImageVector? = null
