

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TableSimple: ImageVector
    get() {
        if (_tableSimple != null) {
            return _tableSimple!!
        }
        _tableSimple = fluentIcon(name = "Filled.TableSimple") {
            fluentPath {
                moveTo(17.75f, 21.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-8.25f)
                lineTo(21.0f, 12.75f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                close()
                moveTo(21.0f, 11.25f)
                horizontalLineToRelative(-8.25f)
                lineTo(12.75f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(11.25f, 11.25f)
                lineTo(11.25f, 3.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.25f)
                close()
                moveTo(3.0f, 12.75f)
                verticalLineToRelative(5.0f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-8.25f)
                lineTo(3.0f, 12.75f)
                close()
            }
        }
        return _tableSimple!!
    }

private var _tableSimple: ImageVector? = null
