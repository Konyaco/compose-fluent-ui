

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PanelLeft: ImageVector
    get() {
        if (_panelLeft != null) {
            return _panelLeft!!
        }
        _panelLeft = fluentIcon(name = "Filled.PanelLeft") {
            fluentPath {
                moveTo(4.75f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 20.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 22.0f, 17.25f)
                verticalLineTo(6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 4.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(9.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(10.25f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        return _panelLeft!!
    }

private var _panelLeft: ImageVector? = null
