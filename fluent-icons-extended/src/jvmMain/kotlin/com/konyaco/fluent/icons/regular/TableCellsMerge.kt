

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TableCellsMerge: ImageVector
    get() {
        if (_tableCellsMerge != null) {
            return _tableCellsMerge!!
        }
        _tableCellsMerge = fluentIcon(name = "Regular.TableCellsMerge") {
            fluentPath {
                moveTo(15.58f, 11.25f)
                lineTo(8.42f, 11.25f)
                lineToRelative(0.9f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.13f, -1.0f)
                lineToRelative(-2.0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.0f)
                lineToRelative(2.0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.12f, -1.0f)
                lineToRelative(-0.89f, -1.0f)
                horizontalLineToRelative(7.16f)
                lineToRelative(-0.89f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.12f, 1.0f)
                lineToRelative(2.0f, -2.25f)
                lineToRelative(0.01f, -0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.01f, -1.0f)
                lineToRelative(-2.0f, -2.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.12f, 1.0f)
                lineToRelative(0.89f, 1.0f)
                close()
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-0.25f)
                close()
                moveTo(4.5f, 8.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-15.0f)
                lineTo(4.5f, 8.0f)
                close()
                moveTo(19.5f, 17.5f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(6.25f, 19.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(15.0f)
                close()
            }
        }
        return _tableCellsMerge!!
    }

private var _tableCellsMerge: ImageVector? = null
