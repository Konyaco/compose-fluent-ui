

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
                moveTo(15.25f, 2.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-6.5f)
                curveTo(7.78f, 22.0f, 7.0f, 21.22f, 7.0f, 20.25f)
                lineTo(7.0f, 3.75f)
                curveTo(7.0f, 2.78f, 7.78f, 2.0f, 8.75f, 2.0f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(12.25f, 8.0f)
                lineTo(8.5f, 8.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(10.33f, 11.25f)
                lineTo(8.5f, 11.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                close()
                moveTo(12.25f, 14.5f)
                lineTo(8.5f, 14.5f)
                lineTo(8.5f, 16.0f)
                horizontalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(10.33f, 17.5f)
                lineTo(8.5f, 17.5f)
                lineTo(8.5f, 19.0f)
                horizontalLineToRelative(1.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(10.33f, 5.0f)
                lineTo(8.5f, 5.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        return _ruler!!
    }

private var _ruler: ImageVector? = null
