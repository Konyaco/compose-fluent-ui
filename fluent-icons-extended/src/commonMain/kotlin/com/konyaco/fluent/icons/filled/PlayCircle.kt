

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = fluentIcon(name = "Filled.PlayCircle") {
            fluentPath {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -20.0f, 0.0f)
                close()
                moveTo(10.86f, 8.15f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 9.0f, 9.25f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.95f, 1.02f, 1.56f, 1.86f, 1.1f)
                lineToRelative(5.75f, -3.2f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.3f)
                lineToRelative(-5.75f, -3.2f)
                close()
            }
        }
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
