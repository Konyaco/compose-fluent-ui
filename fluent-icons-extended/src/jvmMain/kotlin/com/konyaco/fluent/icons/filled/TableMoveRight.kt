

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableMoveRight: ImageVector
    get() {
        if (_tableMoveRight != null) {
            return _tableMoveRight!!
        }
        _tableMoveRight = fluentIcon(name = "Filled.TableMoveRight") {
            fluentPath {
                moveTo(8.0f, 3.0f)
                lineTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(8.0f, 9.5f)
                lineTo(3.0f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(9.5f, 14.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.02f)
                curveToRelative(-0.04f, 0.25f, -0.02f, 0.5f, 0.05f, 0.75f)
                horizontalLineToRelative(-0.82f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                horizontalLineToRelative(0.82f)
                curveToRelative(-0.07f, 0.24f, -0.09f, 0.5f, -0.05f, 0.75f)
                lineTo(9.5f, 14.5f)
                close()
                moveTo(8.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(1.75f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                lineTo(8.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(9.5f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                lineTo(9.5f, 21.0f)
                close()
                moveTo(9.5f, 8.0f)
                lineTo(9.5f, 3.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(14.5f, 8.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(19.5f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(21.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(16.5f)
                close()
                moveTo(14.75f, 14.81f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.06f, -1.06f)
                lineToRelative(0.89f, -1.0f)
                horizontalLineToRelative(-2.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.83f)
                lineToRelative(-0.89f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.12f, -1.0f)
                lineToRelative(2.0f, 2.25f)
                curveToRelative(0.25f, 0.29f, 0.25f, 0.71f, 0.0f, 1.0f)
                lineToRelative(-2.0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, 0.06f)
                close()
            }
        }
        return _tableMoveRight!!
    }

private var _tableMoveRight: ImageVector? = null
