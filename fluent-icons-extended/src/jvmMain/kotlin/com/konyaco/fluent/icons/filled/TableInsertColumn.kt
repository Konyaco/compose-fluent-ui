

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableInsertColumn: ImageVector
    get() {
        if (_tableInsertColumn != null) {
            return _tableInsertColumn!!
        }
        _tableInsertColumn = fluentIcon(name = "Filled.TableInsertColumn") {
            fluentPath {
                moveTo(4.5f, 3.75f)
                verticalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(3.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(16.0f, 5.25f)
                curveTo(16.0f, 4.01f, 15.1f, 3.0f, 14.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                curveTo(8.9f, 3.0f, 8.0f, 4.0f, 8.0f, 5.25f)
                lineTo(8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 5.25f)
                close()
                moveTo(8.0f, 14.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                lineTo(8.0f, 14.5f)
                close()
                moveTo(8.0f, 16.0f)
                verticalLineToRelative(2.75f)
                curveToRelative(0.0f, 1.24f, 0.9f, 2.25f, 2.0f, 2.25f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -1.0f, 2.0f, -2.25f)
                lineTo(16.0f, 16.0f)
                lineTo(8.0f, 16.0f)
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
