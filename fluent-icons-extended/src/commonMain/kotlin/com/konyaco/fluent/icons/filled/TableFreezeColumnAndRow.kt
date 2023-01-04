

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableFreezeColumnAndRow: ImageVector
    get() {
        if (_tableFreezeColumnAndRow != null) {
            return _tableFreezeColumnAndRow!!
        }
        _tableFreezeColumnAndRow = fluentIcon(name = "Filled.TableFreezeColumnAndRow") {
            fluentPath {
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(8.25f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.5f, 9.5f)
                lineTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(14.5f, 19.5f)
                lineTo(14.5f, 16.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.25f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                close()
                moveTo(8.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(1.75f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                lineTo(8.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(9.5f, 14.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        return _tableFreezeColumnAndRow!!
    }

private var _tableFreezeColumnAndRow: ImageVector? = null
