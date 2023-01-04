

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PanelLeftContract: ImageVector
    get() {
        if (_panelLeftContract != null) {
            return _panelLeftContract!!
        }
        _panelLeftContract = fluentIcon(name = "Regular.PanelLeftContract") {
            fluentPath {
                moveTo(14.8f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.05f, -0.06f)
                lineToRelative(-2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.12f)
                lineToRelative(2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.0f, -1.12f)
                lineToRelative(-1.05f, -0.94f)
                horizontalLineToRelative(3.55f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, -1.5f)
                lineTo(13.7f, 11.25f)
                lineToRelative(1.05f, -0.94f)
                curveToRelative(0.31f, -0.28f, 0.33f, -0.75f, 0.06f, -1.06f)
                close()
                moveTo(2.0f, 17.25f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 20.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 22.0f, 17.25f)
                lineTo(22.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 4.0f)
                lineTo(4.75f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 6.75f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(4.75f, 18.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(3.5f, 6.75f)
                curveToRelative(0.0f, -0.7f, 0.56f, -1.25f, 1.25f, -1.25f)
                lineTo(8.0f, 5.5f)
                verticalLineToRelative(13.0f)
                lineTo(4.75f, 18.5f)
                close()
                moveTo(9.5f, 18.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(9.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.7f, -0.56f, 1.25f, -1.25f, 1.25f)
                lineTo(9.5f, 18.5f)
                close()
            }
        }
        return _panelLeftContract!!
    }

private var _panelLeftContract: ImageVector? = null
