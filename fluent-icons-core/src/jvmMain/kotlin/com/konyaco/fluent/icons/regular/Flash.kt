

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Flash: ImageVector
    get() {
        if (_flash != null) {
            return _flash!!
        }
        _flash = fluentIcon(name = "Regular.Flash") {
            fluentPath {
                moveTo(7.43f, 2.83f)
                curveTo(7.6f, 2.33f, 8.07f, 2.0f, 8.6f, 2.0f)
                horizontalLineToRelative(6.46f)
                curveToRelative(0.85f, 0.0f, 1.45f, 0.84f, 1.18f, 1.65f)
                lineTo(14.8f, 8.0f)
                horizontalLineToRelative(3.96f)
                curveToRelative(1.1f, 0.0f, 1.67f, 1.33f, 0.9f, 2.12f)
                lineTo(8.59f, 21.54f)
                curveToRelative(-1.06f, 1.08f, -2.88f, 0.1f, -2.55f, -1.38f)
                lineToRelative(1.27f, -5.66f)
                lineToRelative(-1.56f, -0.01f)
                curveToRelative(-1.21f, 0.0f, -2.05f, -1.2f, -1.65f, -2.34f)
                lineToRelative(3.33f, -9.32f)
                close()
                moveTo(8.78f, 3.5f)
                lineToRelative(-3.26f, 9.16f)
                curveToRelative(-0.06f, 0.16f, 0.06f, 0.33f, 0.23f, 0.33f)
                lineToRelative(2.5f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.73f, 0.91f)
                lineTo(7.51f, 20.5f)
                lineTo(18.16f, 9.5f)
                horizontalLineToRelative(-4.41f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.71f, -0.99f)
                lineTo(14.7f, 3.5f)
                lineTo(8.78f, 3.5f)
                close()
            }
        }
        return _flash!!
    }

private var _flash: ImageVector? = null
