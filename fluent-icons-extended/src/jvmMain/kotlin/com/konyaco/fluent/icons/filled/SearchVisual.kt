

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SearchVisual: ImageVector
    get() {
        if (_searchVisual != null) {
            return _searchVisual!!
        }
        _searchVisual = fluentIcon(name = "Filled.SearchVisual") {
            fluentPath {
                moveTo(3.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 6.5f, 3.0f)
                lineTo(9.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(6.5f, 5.0f)
                curveTo(5.67f, 5.0f, 5.0f, 5.67f, 5.0f, 6.5f)
                lineTo(5.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(3.0f, 6.5f)
                close()
                moveTo(21.0f, 17.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                lineTo(15.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(19.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(21.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 17.5f, 3.0f)
                lineTo(15.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(19.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(21.0f, 6.5f)
                close()
                moveTo(6.5f, 21.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.0f, 17.5f)
                lineTo(3.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                lineTo(9.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(6.5f, 21.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
                moveTo(7.5f, 8.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
            }
        }
        return _searchVisual!!
    }

private var _searchVisual: ImageVector? = null
