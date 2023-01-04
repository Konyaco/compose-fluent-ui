

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableInsertRow: ImageVector
    get() {
        if (_tableInsertRow != null) {
            return _tableInsertRow!!
        }
        _tableInsertRow = fluentIcon(name = "Filled.TableInsertRow") {
            fluentPath {
                moveTo(20.25f, 4.5f)
                lineTo(3.75f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(8.0f, 8.0f)
                lineTo(5.25f, 8.0f)
                curveTo(4.01f, 8.0f, 3.0f, 8.9f, 3.0f, 10.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, 1.0f, 2.0f, 2.25f, 2.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 8.0f)
                close()
                moveTo(9.5f, 16.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(18.75f, 16.0f)
                lineTo(16.0f, 16.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(2.75f)
                curveToRelative(1.24f, 0.0f, 2.25f, 0.9f, 2.25f, 2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, -1.0f, 2.0f, -2.25f, 2.0f)
                close()
                moveTo(3.75f, 21.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(3.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                close()
            }
        }
        return _tableInsertRow!!
    }

private var _tableInsertRow: ImageVector? = null
