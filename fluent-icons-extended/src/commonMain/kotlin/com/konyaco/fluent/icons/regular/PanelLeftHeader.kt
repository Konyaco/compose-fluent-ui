

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PanelLeftHeader: ImageVector
    get() {
        if (_panelLeftHeader != null) {
            return _panelLeftHeader!!
        }
        _panelLeftHeader = fluentIcon(name = "Regular.PanelLeftHeader") {
            fluentPath {
                moveTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.5f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(5.25f, 4.0f)
                close()
                moveTo(9.5f, 10.5f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(6.25f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(9.5f, 18.5f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(20.5f, 9.0f)
                horizontalLineToRelative(-11.0f)
                lineTo(9.5f, 5.5f)
                horizontalLineToRelative(9.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(20.5f, 9.0f)
                close()
                moveTo(5.25f, 5.5f)
                lineTo(8.0f, 5.5f)
                verticalLineToRelative(13.0f)
                lineTo(5.25f, 18.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                close()
            }
        }
        return _panelLeftHeader!!
    }

private var _panelLeftHeader: ImageVector? = null
