

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TableSimpleCheckmark: ImageVector
    get() {
        if (_tableSimpleCheckmark != null) {
            return _tableSimpleCheckmark!!
        }
        _tableSimpleCheckmark = fluentIcon(name = "Regular.TableSimpleCheckmark") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.75f)
                lineTo(4.5f, 11.25f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(12.75f, 11.25f)
                lineTo(12.75f, 4.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-6.75f)
                close()
                moveTo(4.5f, 12.75f)
                horizontalLineToRelative(6.75f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(18.28f, 14.72f)
                curveToRelative(0.3f, 0.29f, 0.3f, 0.76f, 0.0f, 1.06f)
                lineToRelative(-2.0f, 2.0f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-1.0f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(0.47f, 0.47f)
                lineToRelative(1.47f, -1.47f)
                curveToRelative(0.3f, -0.3f, 0.77f, -0.3f, 1.06f, 0.0f)
                close()
            }
        }
        return _tableSimpleCheckmark!!
    }

private var _tableSimpleCheckmark: ImageVector? = null
