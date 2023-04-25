

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PanelLeftHeader: ImageVector
    get() {
        if (_panelLeftHeader != null) {
            return _panelLeftHeader!!
        }
        _panelLeftHeader = fluentIcon(name = "Filled.PanelLeftHeader") {
            fluentPath {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.45f, 3.46f, 4.0f, 5.25f, 4.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 4.0f, 22.0f, 5.46f, 22.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(5.25f, 20.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(20.5f, 7.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(9.5f, 5.5f)
                lineTo(9.5f, 9.0f)
                horizontalLineToRelative(11.0f)
                lineTo(20.5f, 7.25f)
                close()
                moveTo(20.5f, 10.5f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(9.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(20.5f, 10.5f)
                close()
            }
        }
        return _panelLeftHeader!!
    }

private var _panelLeftHeader: ImageVector? = null
