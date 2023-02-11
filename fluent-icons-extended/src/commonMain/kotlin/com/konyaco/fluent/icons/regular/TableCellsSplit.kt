

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TableCellsSplit: ImageVector
    get() {
        if (_tableCellsSplit != null) {
            return _tableCellsSplit!!
        }
        _tableCellsSplit = fluentIcon(name = "Regular.TableCellsSplit") {
            fluentPath {
                moveTo(12.5f, 10.0f)
                lineTo(11.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(4.5f, 7.5f)
                lineTo(11.0f, 7.5f)
                verticalLineToRelative(-3.0f)
                lineTo(6.25f, 4.5f)
                close()
                moveTo(19.5f, 16.5f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(19.5f, 16.5f)
                close()
                moveTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(12.5f, 4.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                lineTo(19.5f, 6.25f)
                close()
                moveTo(4.5f, 16.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                lineTo(11.0f, 19.5f)
                verticalLineToRelative(-3.0f)
                lineTo(4.5f, 16.5f)
                close()
                moveTo(4.5f, 15.0f)
                horizontalLineToRelative(15.0f)
                lineTo(19.5f, 9.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        return _tableCellsSplit!!
    }

private var _tableCellsSplit: ImageVector? = null
