

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableMoveLeft: ImageVector
    get() {
        if (_tableMoveLeft != null) {
            return _tableMoveLeft!!
        }
        _tableMoveLeft = fluentIcon(name = "Filled.TableMoveLeft") {
            fluentPath {
                moveTo(16.0f, 21.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 16.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 14.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(10.48f, 9.5f)
                horizontalLineToRelative(4.02f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.02f)
                curveToRelative(0.04f, -0.25f, 0.02f, -0.5f, -0.05f, -0.75f)
                horizontalLineToRelative(0.82f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, -3.5f)
                horizontalLineToRelative(-0.82f)
                curveToRelative(0.07f, -0.24f, 0.09f, -0.5f, 0.05f, -0.75f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(16.0f, 3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(14.5f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(4.25f)
                close()
                moveTo(14.5f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(9.5f, 16.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(4.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(4.5f, 3.75f)
                close()
                moveTo(9.25f, 9.19f)
                curveToRelative(0.3f, 0.27f, 0.34f, 0.75f, 0.06f, 1.06f)
                lineToRelative(-0.89f, 1.0f)
                horizontalLineToRelative(2.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(8.42f, 12.75f)
                lineToRelative(0.9f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, 1.0f)
                lineToRelative(-2.0f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.0f)
                lineToRelative(2.0f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -0.06f)
                close()
            }
        }
        return _tableMoveLeft!!
    }

private var _tableMoveLeft: ImageVector? = null
