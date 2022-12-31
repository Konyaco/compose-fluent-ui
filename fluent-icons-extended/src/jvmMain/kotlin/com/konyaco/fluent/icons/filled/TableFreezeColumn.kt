

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableFreezeColumn: ImageVector
    get() {
        if (_tableFreezeColumn != null) {
            return _tableFreezeColumn!!
        }
        _tableFreezeColumn = fluentIcon(name = "Filled.TableFreezeColumn") {
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
                moveTo(9.5f, 16.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(14.5f, 4.5f)
                lineTo(14.5f, 8.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.5f, 3.0f)
                horizontalLineToRelative(8.25f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(9.5f, 21.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(8.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(1.75f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                lineTo(8.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        return _tableFreezeColumn!!
    }

private var _tableFreezeColumn: ImageVector? = null
