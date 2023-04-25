

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PanelRightCursor: ImageVector
    get() {
        if (_panelRightCursor != null) {
            return _panelRightCursor!!
        }
        _panelRightCursor = fluentIcon(name = "Filled.PanelRightCursor") {
            fluentPath {
                moveTo(18.75f, 4.0f)
                curveTo(20.55f, 4.0f, 22.0f, 5.46f, 22.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.42f, -0.08f, 0.81f, -0.22f, 1.18f)
                lineToRelative(-5.73f, -6.35f)
                curveToRelative(-0.4f, -0.44f, -0.98f, -0.65f, -1.55f, -0.56f)
                lineTo(14.5f, 5.5f)
                lineTo(5.25f, 5.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                lineTo(13.0f, 18.5f)
                lineTo(13.0f, 20.0f)
                lineTo(5.25f, 20.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 16.75f)
                verticalLineToRelative(-9.5f)
                curveTo(2.0f, 5.45f, 3.46f, 4.0f, 5.25f, 4.0f)
                horizontalLineToRelative(13.5f)
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
