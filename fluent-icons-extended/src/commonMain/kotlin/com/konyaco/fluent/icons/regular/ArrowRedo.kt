

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowRedo: ImageVector
    get() {
        if (_arrowRedo != null) {
            return _arrowRedo!!
        }
        _arrowRedo = fluentIcon(name = "Regular.ArrowRedo") {
            fluentPath {
                moveTo(19.25f, 2.0f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(5.69f)
                lineToRelative(-4.57f, -4.56f)
                arcToRelative(6.41f, 6.41f, 0.0f, false, false, -8.88f, -0.18f)
                lineToRelative(-0.19f, 0.18f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 0.0f, 9.06f)
                lineToRelative(8.85f, 8.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineToRelative(-8.85f, -8.84f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, 6.77f, -7.1f)
                lineToRelative(0.18f, 0.16f)
                lineToRelative(4.57f, 4.56f)
                horizontalLineToRelative(-5.69f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.65f, 0.74f)
                lineToRelative(0.1f, 0.01f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.74f, -0.65f)
                lineToRelative(0.01f, -0.1f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
            }
        }
        return _arrowRedo!!
    }

private var _arrowRedo: ImageVector? = null
