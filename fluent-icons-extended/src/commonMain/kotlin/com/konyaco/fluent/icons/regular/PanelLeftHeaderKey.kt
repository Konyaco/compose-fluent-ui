

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PanelLeftHeaderKey: ImageVector
    get() {
        if (_panelLeftHeaderKey != null) {
            return _panelLeftHeaderKey!!
        }
        _panelLeftHeaderKey = fluentIcon(name = "Regular.PanelLeftHeaderKey") {
            fluentPath {
                moveTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                horizontalLineToRelative(5.95f)
                curveToRelative(0.08f, -0.16f, 0.19f, -0.3f, 0.31f, -0.43f)
                lineToRelative(1.08f, -1.07f)
                lineTo(9.5f, 18.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(0.61f)
                curveToRelative(0.54f, 0.13f, 1.05f, 0.35f, 1.5f, 0.65f)
                lineTo(22.0f, 7.25f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(5.25f, 4.0f)
                close()
                moveTo(20.5f, 9.0f)
                horizontalLineToRelative(-11.0f)
                lineTo(9.5f, 5.5f)
                horizontalLineToRelative(9.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                lineTo(20.5f, 9.0f)
                close()
                moveTo(8.0f, 5.5f)
                verticalLineToRelative(13.0f)
                lineTo(5.25f, 18.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                lineTo(8.0f, 5.5f)
                close()
                moveTo(19.5f, 19.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -3.38f, -2.59f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.15f, 0.12f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.22f, 0.53f)
                verticalLineToRelative(1.44f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(15.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(21.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
            }
        }
        return _panelLeftHeaderKey!!
    }

private var _panelLeftHeaderKey: ImageVector? = null
