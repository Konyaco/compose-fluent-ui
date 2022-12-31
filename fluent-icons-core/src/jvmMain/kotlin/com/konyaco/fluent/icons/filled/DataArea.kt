

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataArea: ImageVector
    get() {
        if (_dataArea != null) {
            return _dataArea!!
        }
        _dataArea = fluentIcon(name = "Filled.DataArea") {
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
                moveTo(19.5f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.2f, -0.6f)
                lineToRelative(-5.6f, 4.2f)
                lineTo(8.88f, 8.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.72f, -0.02f)
                lineTo(5.5f, 9.4f)
                verticalLineToRelative(9.09f)
                horizontalLineToRelative(14.0f)
                lineTo(19.5f, 6.75f)
                close()
            }
        }
        return _dataArea!!
    }

private var _dataArea: ImageVector? = null
