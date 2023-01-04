

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataScatter: ImageVector
    get() {
        if (_dataScatter != null) {
            return _dataScatter!!
        }
        _dataScatter = fluentIcon(name = "Regular.DataScatter") {
            fluentPath {
                moveTo(3.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                lineTo(4.5f, 19.5f)
                horizontalLineToRelative(15.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 21.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(3.0f, 3.75f)
                close()
                moveTo(17.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(15.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(6.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                close()
                moveTo(9.0f, 7.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(15.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(13.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
            }
        }
        return _dataScatter!!
    }

private var _dataScatter: ImageVector? = null
