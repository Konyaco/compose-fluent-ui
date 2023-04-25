

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableSimpleCheckmark: ImageVector
    get() {
        if (_tableSimpleCheckmark != null) {
            return _tableSimpleCheckmark!!
        }
        _tableSimpleCheckmark = fluentIcon(name = "Filled.TableSimpleCheckmark") {
            fluentPath {
                moveTo(11.25f, 12.75f)
                lineTo(11.25f, 21.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(8.25f)
                close()
                moveTo(12.75f, 21.0f)
                verticalLineToRelative(-8.25f)
                lineTo(21.0f, 12.75f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(12.75f, 3.0f)
                verticalLineToRelative(8.25f)
                lineTo(21.0f, 11.25f)
                verticalLineToRelative(-5.0f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(11.25f, 3.0f)
                verticalLineToRelative(8.25f)
                lineTo(3.0f, 11.25f)
                verticalLineToRelative(-5.0f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(18.78f, 16.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.47f, 1.47f)
                lineToRelative(-0.47f, -0.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, 1.06f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(0.3f, 0.3f, 0.77f, 0.3f, 1.06f, 0.0f)
                lineToRelative(2.0f, -2.0f)
                close()
            }
        }
        return _tableSimpleCheckmark!!
    }

private var _tableSimpleCheckmark: ImageVector? = null
