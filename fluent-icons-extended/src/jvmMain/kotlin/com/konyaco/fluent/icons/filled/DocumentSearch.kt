

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentSearch: ImageVector
    get() {
        if (_documentSearch != null) {
            return _documentSearch!!
        }
        _documentSearch = fluentIcon(name = "Filled.DocumentSearch") {
            fluentPath {
                moveTo(13.0f, 8.0f)
                lineTo(13.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(5.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.2f, 8.18f)
                lineToRelative(3.54f, 3.53f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.63f, 0.5f, 0.99f)
                lineTo(19.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(21.0f, 10.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(14.97f, 22.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-4.11f, -4.11f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, -0.35f, -6.61f)
                arcTo(4.98f, 4.98f, 0.0f, false, false, 3.0f, 14.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 7.82f, 4.13f)
                lineToRelative(4.15f, 4.15f)
                close()
                moveTo(8.0f, 11.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                close()
                moveTo(14.5f, 8.0f)
                lineTo(14.5f, 2.5f)
                lineToRelative(6.0f, 6.0f)
                lineTo(15.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        return _documentSearch!!
    }

private var _documentSearch: ImageVector? = null
