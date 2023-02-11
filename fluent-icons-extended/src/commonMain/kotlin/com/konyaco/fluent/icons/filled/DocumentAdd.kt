

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentAdd: ImageVector
    get() {
        if (_documentAdd != null) {
            return _documentAdd!!
        }
        _documentAdd = fluentIcon(name = "Filled.DocumentAdd") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-6.81f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 4.0f, 11.5f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.5f, 2.5f)
                lineTo(13.5f, 8.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.5f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(6.0f, 18.0f)
                lineTo(3.5f, 18.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(7.0f, 17.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(7.0f, 18.0f)
                close()
            }
        }
        return _documentAdd!!
    }

private var _documentAdd: ImageVector? = null
