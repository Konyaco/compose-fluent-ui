

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableCellsMerge: ImageVector
    get() {
        if (_tableCellsMerge != null) {
            return _tableCellsMerge!!
        }
        _tableCellsMerge = fluentIcon(name = "Filled.TableCellsMerge") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(0.25f)
                lineTo(3.0f, 6.5f)
                verticalLineToRelative(-0.25f)
                close()
                moveTo(3.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                close()
                moveTo(15.58f, 11.25f)
                lineTo(14.69f, 10.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.12f, -1.0f)
                lineToRelative(2.0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.01f, 0.99f)
                lineToRelative(-2.0f, 2.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.13f, -1.0f)
                lineToRelative(0.89f, -1.0f)
                lineTo(8.42f, 12.75f)
                lineToRelative(0.9f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, 1.0f)
                lineToRelative(-2.0f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.0f)
                lineToRelative(2.0f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.12f, 1.0f)
                lineToRelative(-0.89f, 1.0f)
                horizontalLineToRelative(7.16f)
                close()
                moveTo(3.0f, 17.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                close()
            }
        }
        return _tableCellsMerge!!
    }

private var _tableCellsMerge: ImageVector? = null
