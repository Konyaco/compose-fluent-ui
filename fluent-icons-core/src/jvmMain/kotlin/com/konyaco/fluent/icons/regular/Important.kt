

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Important: ImageVector
    get() {
        if (_important != null) {
            return _important!!
        }
        _important = fluentIcon(name = "Regular.Important") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, false, -3.88f, 3.88f)
                curveToRelative(0.0f, 2.92f, 1.21f, 6.55f, 1.82f, 8.2f)
                arcTo(2.19f, 2.19f, 0.0f, false, false, 12.0f, 15.5f)
                curveToRelative(0.9f, 0.0f, 1.74f, -0.54f, 2.06f, -1.42f)
                curveToRelative(0.61f, -1.64f, 1.82f, -5.25f, 1.82f, -8.2f)
                arcTo(3.88f, 3.88f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(9.62f, 5.88f)
                arcToRelative(2.38f, 2.38f, 0.0f, false, true, 4.76f, 0.0f)
                curveToRelative(0.0f, 2.65f, -1.12f, 6.04f, -1.72f, 7.68f)
                arcTo(0.69f, 0.69f, 0.0f, false, true, 12.0f, 14.0f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, true, -0.65f, -0.44f)
                curveToRelative(-0.61f, -1.65f, -1.72f, -5.06f, -1.72f, -7.68f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                close()
                moveTo(11.0f, 19.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                close()
            }
        }
        return _important!!
    }

private var _important: ImageVector? = null
