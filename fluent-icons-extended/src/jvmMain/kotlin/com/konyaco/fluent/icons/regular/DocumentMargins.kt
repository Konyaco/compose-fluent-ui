

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentMargins: ImageVector
    get() {
        if (_documentMargins != null) {
            return _documentMargins!!
        }
        _documentMargins = fluentIcon(name = "Regular.DocumentMargins") {
            fluentPath {
                moveTo(7.0f, 15.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(7.0f)
                lineTo(7.0f, 15.5f)
                close()
                moveTo(15.5f, 15.5f)
                verticalLineToRelative(-7.0f)
                lineTo(17.0f, 8.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(4.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 22.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.5f, 2.0f)
                horizontalLineToRelative(-11.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 4.5f)
                close()
                moveTo(17.0f, 3.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(17.0f, 20.5f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-7.0f)
                lineTo(8.5f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(7.0f, 3.5f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(1.5f)
                lineTo(8.5f, 3.5f)
                horizontalLineToRelative(7.0f)
                lineTo(15.5f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 3.5f)
                close()
            }
        }
        return _documentMargins!!
    }

private var _documentMargins: ImageVector? = null
