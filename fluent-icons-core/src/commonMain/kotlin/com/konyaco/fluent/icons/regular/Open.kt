

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Open: ImageVector
    get() {
        if (_open != null) {
            return _open!!
        }
        _open = fluentIcon(name = "Regular.Open") {
            fluentPath {
                moveTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineTo(6.25f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(13.0f, 3.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineTo(5.56f)
                lineToRelative(-5.22f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(5.22f, -5.22f)
                horizontalLineToRelative(-4.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _open!!
    }

private var _open: ImageVector? = null
