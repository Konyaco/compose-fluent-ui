

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PanelLeftKey: ImageVector
    get() {
        if (_panelLeftKey != null) {
            return _panelLeftKey!!
        }
        _panelLeftKey = fluentIcon(name = "Filled.PanelLeftKey") {
            fluentPath {
                moveTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(5.95f)
                curveToRelative(0.08f, -0.16f, 0.19f, -0.3f, 0.31f, -0.43f)
                lineToRelative(1.08f, -1.07f)
                lineTo(9.5f, 18.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(9.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(3.86f)
                curveToRelative(0.54f, 0.13f, 1.05f, 0.35f, 1.5f, 0.65f)
                lineTo(22.0f, 7.25f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(5.25f, 4.0f)
                close()
                moveTo(23.0f, 15.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                lineTo(18.0f, 19.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-1.44f)
                curveToRelative(0.0f, -0.2f, 0.08f, -0.39f, 0.22f, -0.53f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(0.15f, -0.12f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 23.0f, 15.5f)
                close()
                moveTo(20.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        return _panelLeftKey!!
    }

private var _panelLeftKey: ImageVector? = null
