

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DualScreenHeader: ImageVector
    get() {
        if (_dualScreenHeader != null) {
            return _dualScreenHeader!!
        }
        _dualScreenHeader = fluentIcon(name = "Filled.DualScreenHeader") {
            fluentPath {
                moveTo(22.0f, 8.0f)
                verticalLineToRelative(10.25f)
                curveToRelative(0.0f, 0.97f, -0.79f, 1.75f, -1.75f, 1.75f)
                lineTo(13.0f, 20.0f)
                curveToRelative(-0.09f, 0.0f, -0.17f, 0.0f, -0.26f, -0.02f)
                lineTo(12.74f, 8.0f)
                lineTo(22.0f, 8.0f)
                close()
                moveTo(11.24f, 8.0f)
                verticalLineToRelative(11.98f)
                lineTo(11.0f, 20.0f)
                lineTo(3.75f, 20.0f)
                curveTo(2.78f, 20.0f, 2.0f, 19.2f, 2.0f, 18.25f)
                lineTo(2.0f, 8.0f)
                horizontalLineToRelative(9.24f)
                close()
                moveTo(11.0f, 4.0f)
                curveToRelative(0.08f, 0.0f, 0.16f, 0.0f, 0.24f, 0.02f)
                lineTo(11.24f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 5.75f)
                curveTo(2.0f, 4.8f, 2.78f, 4.0f, 3.75f, 4.0f)
                lineTo(11.0f, 4.0f)
                close()
                moveTo(20.25f, 4.0f)
                curveTo(21.2f, 4.0f, 22.0f, 4.8f, 22.0f, 5.75f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-9.26f)
                lineTo(12.74f, 4.02f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(7.25f)
                close()
            }
        }
        return _dualScreenHeader!!
    }

private var _dualScreenHeader: ImageVector? = null
