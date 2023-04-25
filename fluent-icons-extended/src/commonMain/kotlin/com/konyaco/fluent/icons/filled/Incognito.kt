

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = fluentIcon(name = "Filled.Incognito") {
            fluentPath {
                moveToRelative(18.12f, 4.61f)
                lineToRelative(2.11f, 4.64f)
                curveToRelative(0.41f, 0.08f, 0.82f, 0.17f, 1.2f, 0.27f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.36f, 1.45f)
                curveToRelative(-0.48f, -0.12f, -0.98f, -0.23f, -1.5f, -0.33f)
                arcToRelative(44.74f, 44.74f, 0.0f, false, false, -15.14f, 0.0f)
                curveToRelative(-0.52f, 0.1f, -1.02f, 0.21f, -1.5f, 0.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.36f, -1.45f)
                curveToRelative(0.39f, -0.1f, 0.79f, -0.2f, 1.2f, -0.27f)
                lineToRelative(2.1f, -4.64f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 8.39f, 3.0f)
                horizontalLineToRelative(7.24f)
                curveToRelative(1.08f, 0.0f, 2.06f, 0.63f, 2.5f, 1.61f)
                close()
                moveTo(3.5f, 16.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                close()
                moveTo(6.5f, 12.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 4.39f, 5.5f)
                horizontalLineToRelative(2.22f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -0.08f, -1.5f)
                horizontalLineToRelative(-2.06f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.47f, -4.0f)
                close()
                moveTo(14.5f, 16.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                close()
            }
        }
        return _incognito!!
    }

private var _incognito: ImageVector? = null
