

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataFunnel: ImageVector
    get() {
        if (_dataFunnel != null) {
            return _dataFunnel!!
        }
        _dataFunnel = fluentIcon(name = "Regular.DataFunnel") {
            fluentPath {
                moveTo(22.0f, 4.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                lineTo(4.75f, 7.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, -5.5f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 4.75f)
                close()
                moveTo(20.0f, 11.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                lineTo(6.75f, 14.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, -5.5f)
                horizontalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 20.0f, 11.75f)
                close()
                moveTo(17.0f, 18.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 0.0f, -5.5f)
                horizontalLineToRelative(4.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 17.0f, 18.75f)
                close()
                moveTo(20.5f, 4.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(4.75f, 3.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.7f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                close()
                moveTo(18.5f, 11.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(6.75f, 10.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.7f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                close()
                moveTo(15.5f, 18.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.7f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                close()
            }
        }
        return _dataFunnel!!
    }

private var _dataFunnel: ImageVector? = null
