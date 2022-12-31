

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TableInsertColumn: ImageVector
    get() {
        if (_tableInsertColumn != null) {
            return _tableInsertColumn!!
        }
        _tableInsertColumn = fluentIcon(name = "Regular.TableInsertColumn") {
            fluentPath {
                moveTo(4.5f, 3.75f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(3.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(14.25f, 3.0f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                lineTo(7.5f, 5.25f)
                curveTo(7.5f, 4.01f, 8.5f, 3.0f, 9.75f, 3.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(15.0f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                lineTo(9.0f, 8.5f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 5.25f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                lineTo(9.0f, 10.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(9.0f, 15.5f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(15.0f, 15.5f)
                lineTo(9.0f, 15.5f)
                close()
                moveTo(21.0f, 20.25f)
                lineTo(21.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
            }
        }
        return _tableInsertColumn!!
    }

private var _tableInsertColumn: ImageVector? = null
