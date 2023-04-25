

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PanelLeftHeaderKey: ImageVector
    get() {
        if (_panelLeftHeaderKey != null) {
            return _panelLeftHeaderKey!!
        }
        _panelLeftHeaderKey = fluentIcon(name = "Filled.PanelLeftHeaderKey") {
            fluentPath {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.45f, 3.46f, 4.0f, 5.25f, 4.0f)
                horizontalLineToRelative(13.5f)
                curveTo(20.55f, 4.0f, 22.0f, 5.46f, 22.0f, 7.25f)
                verticalLineToRelative(4.5f)
                curveToRelative(-0.45f, -0.3f, -0.96f, -0.52f, -1.5f, -0.64f)
                verticalLineToRelative(-0.61f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.09f)
                lineToRelative(-1.08f, 1.07f)
                curveToRelative(-0.12f, 0.13f, -0.23f, 0.27f, -0.31f, 0.43f)
                lineTo(5.25f, 20.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(9.5f, 9.0f)
                horizontalLineToRelative(11.0f)
                lineTo(20.5f, 7.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(9.5f, 5.5f)
                lineTo(9.5f, 9.0f)
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
