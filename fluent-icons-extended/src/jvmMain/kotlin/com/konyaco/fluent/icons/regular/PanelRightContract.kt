

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PanelRightContract: ImageVector
    get() {
        if (_panelRightContract != null) {
            return _panelRightContract!!
        }
        _panelRightContract = fluentIcon(name = "Regular.PanelRightContract") {
            fluentPath {
                moveTo(9.2f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.05f, -0.06f)
                lineToRelative(2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.12f)
                lineToRelative(-2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.0f, -1.12f)
                lineToRelative(1.05f, -0.94f)
                lineTo(6.75f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(3.55f)
                lineToRelative(-1.05f, -0.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.06f, -1.06f)
                close()
                moveTo(22.0f, 17.25f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 19.25f, 20.0f)
                lineTo(4.75f, 20.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 17.25f)
                lineTo(2.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 4.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(10.5f)
                close()
                moveTo(19.25f, 18.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                lineTo(20.5f, 6.75f)
                curveToRelative(0.0f, -0.7f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(16.0f, 5.5f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(3.25f)
                close()
                moveTo(14.5f, 18.5f)
                verticalLineToRelative(-13.0f)
                lineTo(4.75f, 5.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.7f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(9.75f)
                close()
            }
        }
        return _panelRightContract!!
    }

private var _panelRightContract: ImageVector? = null
