

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PanelRightCursor: ImageVector
    get() {
        if (_panelRightCursor != null) {
            return _panelRightCursor!!
        }
        _panelRightCursor = fluentIcon(name = "Regular.PanelRightCursor") {
            fluentPath {
                moveTo(22.0f, 7.25f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(5.25f, 4.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveTo(2.0f, 18.55f, 3.46f, 20.0f, 5.25f, 20.0f)
                lineTo(13.0f, 20.0f)
                verticalLineToRelative(-1.5f)
                lineTo(5.25f, 18.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(9.25f)
                verticalLineToRelative(5.52f)
                curveToRelative(0.55f, -0.08f, 1.1f, 0.1f, 1.5f, 0.5f)
                lineTo(16.0f, 5.5f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(9.26f)
                lineToRelative(1.28f, 1.42f)
                curveToRelative(0.14f, -0.37f, 0.22f, -0.76f, 0.22f, -1.18f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(14.49f, 12.05f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.82f, 0.2f)
                lineToRelative(6.37f, 7.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, 1.23f)
                lineToRelative(-3.54f, -0.88f)
                lineToRelative(-2.03f, 3.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.37f, -0.42f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.31f, 0.2f, -0.59f, 0.49f, -0.7f)
                close()
            }
        }
        return _panelRightCursor!!
    }

private var _panelRightCursor: ImageVector? = null
