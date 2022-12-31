

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = fluentIcon(name = "Regular.Incognito") {
            fluentPath {
                moveTo(8.38f, 4.5f)
                curveToRelative(-0.5f, 0.0f, -0.94f, 0.29f, -1.14f, 0.73f)
                lineTo(6.18f, 7.56f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.36f, -0.62f)
                lineToRelative(1.06f, -2.33f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 8.38f, 3.0f)
                horizontalLineToRelative(7.24f)
                curveToRelative(1.08f, 0.0f, 2.06f, 0.63f, 2.5f, 1.61f)
                lineToRelative(1.06f, 2.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.36f, 0.62f)
                lineToRelative(-1.06f, -2.33f)
                curveToRelative(-0.2f, -0.44f, -0.65f, -0.73f, -1.14f, -0.73f)
                lineTo(8.38f, 4.5f)
                close()
                moveTo(6.5f, 13.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(2.0f, 16.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 8.97f, -0.5f)
                horizontalLineToRelative(2.06f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.08f, 1.5f)
                lineTo(10.9f, 17.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -8.89f, -1.0f)
                close()
                moveTo(17.5f, 13.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
                moveTo(2.93f, 10.97f)
                curveToRelative(5.13f, -1.3f, 13.0f, -1.3f, 18.14f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.36f, -1.45f)
                curveToRelative(-5.37f, -1.36f, -13.5f, -1.36f, -18.86f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.36f, 1.45f)
                close()
            }
        }
        return _incognito!!
    }

private var _incognito: ImageVector? = null
