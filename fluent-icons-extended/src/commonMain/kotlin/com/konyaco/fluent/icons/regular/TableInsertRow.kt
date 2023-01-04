

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TableInsertRow: ImageVector
    get() {
        if (_tableInsertRow != null) {
            return _tableInsertRow!!
        }
        _tableInsertRow = fluentIcon(name = "Regular.TableInsertRow") {
            fluentPath {
                moveTo(20.25f, 3.0f)
                lineTo(3.75f, 3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(3.0f, 9.75f)
                curveTo(3.0f, 8.51f, 4.0f, 7.5f, 5.25f, 7.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                lineTo(5.25f, 16.5f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(5.25f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                lineTo(8.5f, 15.0f)
                lineTo(8.5f, 9.0f)
                lineTo(5.25f, 9.0f)
                close()
                moveTo(14.0f, 15.0f)
                lineTo(14.0f, 9.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(15.5f, 15.0f)
                horizontalLineToRelative(3.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(15.5f, 9.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(3.75f, 19.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
            }
        }
        return _tableInsertRow!!
    }

private var _tableInsertRow: ImageVector? = null
