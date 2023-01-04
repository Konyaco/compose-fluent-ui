

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PanelRight: ImageVector
    get() {
        if (_panelRight != null) {
            return _panelRight!!
        }
        _panelRight = fluentIcon(name = "Filled.PanelRight") {
            fluentPath {
                moveTo(19.25f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 19.25f, 20.0f)
                horizontalLineTo(4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 4.0f)
                horizontalLineToRelative(14.5f)
                close()
                moveTo(15.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineTo(4.75f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        return _panelRight!!
    }

private var _panelRight: ImageVector? = null
