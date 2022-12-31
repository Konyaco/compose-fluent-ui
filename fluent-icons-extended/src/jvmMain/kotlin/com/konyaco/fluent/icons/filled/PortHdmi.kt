

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PortHdmi: ImageVector
    get() {
        if (_portHdmi != null) {
            return _portHdmi!!
        }
        _portHdmi = fluentIcon(name = "Filled.PortHdmi") {
            fluentPath {
                moveTo(21.41f, 11.41f)
                lineToRelative(-2.82f, -2.82f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.17f, 8.0f)
                horizontalLineTo(6.83f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.42f, 0.59f)
                lineToRelative(-2.82f, 2.82f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 12.83f)
                verticalLineTo(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-1.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.59f, -1.42f)
                close()
                moveTo(17.0f, 12.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(8.5f)
                arcTo(0.76f, 0.76f, 0.0f, false, true, 17.0f, 12.0f)
                close()
            }
        }
        return _portHdmi!!
    }

private var _portHdmi: ImageVector? = null
