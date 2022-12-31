

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataFunnel: ImageVector
    get() {
        if (_dataFunnel != null) {
            return _dataFunnel!!
        }
        _dataFunnel = fluentIcon(name = "Filled.DataFunnel") {
            fluentPath {
                moveTo(19.25f, 7.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, -5.5f)
                lineTo(4.75f, 2.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, 5.5f)
                horizontalLineToRelative(14.5f)
                close()
                moveTo(17.25f, 14.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, -5.5f)
                lineTo(6.75f, 9.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, 5.5f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(17.0f, 18.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 14.25f, 16.0f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, 5.5f)
                horizontalLineToRelative(4.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 17.0f, 18.75f)
                close()
            }
        }
        return _dataFunnel!!
    }

private var _dataFunnel: ImageVector? = null
