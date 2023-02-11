

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableStackBelow: ImageVector
    get() {
        if (_tableStackBelow != null) {
            return _tableStackBelow!!
        }
        _tableStackBelow = fluentIcon(name = "Filled.TableStackBelow") {
            fluentPath {
                moveTo(9.5f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(9.5f, 8.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineTo(9.5f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(21.0f, 8.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(1.75f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineTo(8.0f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(3.75f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(3.75f)
                close()
            }
        }
        return _tableStackBelow!!
    }

private var _tableStackBelow: ImageVector? = null
