

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableStackRight: ImageVector
    get() {
        if (_tableStackRight != null) {
            return _tableStackRight!!
        }
        _tableStackRight = fluentIcon(name = "Filled.TableStackRight") {
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
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
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
            }
        }
        return _tableStackRight!!
    }

private var _tableStackRight: ImageVector? = null
