

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PanelLeftExpand: ImageVector
    get() {
        if (_panelLeftExpand != null) {
            return _panelLeftExpand!!
        }
        _panelLeftExpand = fluentIcon(name = "Filled.PanelLeftExpand") {
            fluentPath {
                moveTo(14.2f, 14.75f)
                curveToRelative(0.27f, 0.3f, 0.74f, 0.33f, 1.05f, 0.06f)
                lineToRelative(2.5f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.12f)
                lineToRelative(-2.5f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.0f, 1.12f)
                lineToRelative(1.05f, 0.94f)
                horizontalLineToRelative(-3.55f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.55f)
                lineToRelative(-1.05f, 0.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.06f, 1.06f)
                close()
                moveTo(2.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 4.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 19.25f, 20.0f)
                horizontalLineTo(4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(9.0f, 5.5f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(10.25f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineTo(6.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        return _panelLeftExpand!!
    }

private var _panelLeftExpand: ImageVector? = null
