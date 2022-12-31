

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = fluentIcon(name = "Regular.Location") {
            fluentPath {
                moveTo(5.84f, 4.57f)
                arcToRelative(8.7f, 8.7f, 0.0f, true, true, 12.32f, 12.31f)
                lineToRelative(-1.19f, 1.18f)
                lineToRelative(-3.4f, 3.3f)
                curveToRelative(-0.88f, 0.85f, -2.26f, 0.85f, -3.13f, 0.0f)
                lineToRelative(-3.5f, -3.39f)
                lineToRelative(-1.1f, -1.09f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, 0.0f, -12.31f)
                close()
                moveTo(17.1f, 5.63f)
                arcToRelative(7.2f, 7.2f, 0.0f, true, false, -10.2f, 10.2f)
                lineToRelative(1.5f, 1.46f)
                lineToRelative(3.08f, 3.0f)
                curveToRelative(0.29f, 0.28f, 0.75f, 0.28f, 1.04f, 0.0f)
                lineToRelative(3.4f, -3.3f)
                lineToRelative(1.18f, -1.17f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, 0.0f, -10.2f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                close()
                moveTo(12.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        return _location!!
    }

private var _location: ImageVector? = null
