

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableMoveBelow: ImageVector
    get() {
        if (_tableMoveBelow != null) {
            return _tableMoveBelow!!
        }
        _tableMoveBelow = fluentIcon(name = "Filled.TableMoveBelow") {
            fluentPath {
                moveTo(9.5f, 9.5f)
                verticalLineToRelative(4.02f)
                curveToRelative(0.25f, -0.04f, 0.5f, -0.02f, 0.75f, 0.05f)
                verticalLineToRelative(-0.82f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                verticalLineToRelative(0.82f)
                curveToRelative(0.24f, -0.07f, 0.5f, -0.09f, 0.75f, -0.05f)
                lineTo(14.5f, 9.5f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 9.5f)
                verticalLineToRelative(5.0f)
                lineTo(3.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(3.0f, 9.5f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(9.5f, 8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(21.0f, 9.5f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(1.75f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                lineTo(21.0f, 8.0f)
                close()
                moveTo(8.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                lineTo(8.0f, 3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(3.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(3.75f, 19.5f)
                close()
                moveTo(9.19f, 14.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -0.06f)
                lineToRelative(1.0f, 0.89f)
                verticalLineToRelative(-2.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(2.83f)
                lineToRelative(1.0f, -0.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.0f, 1.13f)
                lineToRelative(-2.25f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.0f, 0.0f)
                lineToRelative(-2.25f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.06f, -1.06f)
                close()
            }
        }
        return _tableMoveBelow!!
    }

private var _tableMoveBelow: ImageVector? = null
