

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HeartCircle: ImageVector
    get() {
        if (_heartCircle != null) {
            return _heartCircle!!
        }
        _heartCircle = fluentIcon(name = "Filled.HeartCircle") {
            fluentPath {
                moveTo(12.0f, 22.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 0.0f, -20.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                close()
                moveTo(11.7f, 16.86f)
                lineToRelative(-4.11f, -4.8f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, true, 3.58f, -3.36f)
                lineToRelative(0.83f, 0.8f)
                lineToRelative(0.83f, -0.8f)
                arcToRelative(2.46f, 2.46f, 0.0f, false, true, 3.58f, 3.36f)
                lineToRelative(-4.1f, 4.8f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.61f, 0.0f)
                close()
            }
        }
        return _heartCircle!!
    }

private var _heartCircle: ImageVector? = null
