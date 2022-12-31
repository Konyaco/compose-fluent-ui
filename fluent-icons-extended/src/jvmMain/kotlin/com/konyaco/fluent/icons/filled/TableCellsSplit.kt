

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableCellsSplit: ImageVector
    get() {
        if (_tableCellsSplit != null) {
            return _tableCellsSplit!!
        }
        _tableCellsSplit = fluentIcon(name = "Filled.TableCellsSplit") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                lineTo(11.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(-0.75f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                close()
                moveTo(21.0f, 7.0f)
                verticalLineToRelative(-0.75f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(12.5f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(21.0f, 7.0f)
                close()
                moveTo(12.5f, 21.0f)
                horizontalLineToRelative(5.25f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 17.0f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(3.0f, 8.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 8.5f)
                close()
                moveTo(12.5f, 10.0f)
                verticalLineToRelative(4.0f)
                lineTo(11.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(3.0f, 17.75f)
                lineTo(3.0f, 17.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                close()
            }
        }
        return _tableCellsSplit!!
    }

private var _tableCellsSplit: ImageVector? = null
