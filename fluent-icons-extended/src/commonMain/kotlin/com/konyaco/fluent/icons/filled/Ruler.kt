

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = fluentIcon(name = "Filled.Ruler") {
            fluentPath {
                moveTo(7.0f, 4.25f)
                curveTo(7.0f, 3.01f, 8.0f, 2.0f, 9.25f, 2.0f)
                horizontalLineToRelative(5.5f)
                curveTo(15.99f, 2.0f, 17.0f, 3.0f, 17.0f, 4.25f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-5.5f)
                arcTo(2.26f, 2.26f, 0.0f, false, true, 7.0f, 19.75f)
                lineTo(7.0f, 4.25f)
                close()
                moveTo(8.5f, 5.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(8.5f, 5.0f)
                close()
                moveTo(8.5f, 8.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(8.5f, 8.0f)
                close()
                moveTo(8.5f, 11.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(8.5f, 11.25f)
                close()
                moveTo(8.5f, 14.5f)
                lineTo(8.5f, 16.0f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(8.5f, 14.5f)
                close()
                moveTo(8.5f, 17.5f)
                lineTo(8.5f, 19.0f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(8.5f, 17.5f)
                close()
            }
        }
        return _ruler!!
    }

private var _ruler: ImageVector? = null
