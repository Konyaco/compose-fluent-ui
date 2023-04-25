

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Status: ImageVector
    get() {
        if (_status != null) {
            return _status!!
        }
        _status = fluentIcon(name = "Regular.Status") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                curveToRelative(1.11f, 0.0f, 2.18f, 0.2f, 3.16f, 0.57f)
                lineToRelative(-1.18f, 1.2f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, 5.28f, 5.33f)
                lineToRelative(1.2f, -1.2f)
                arcTo(9.0f, 9.0f, 0.0f, true, true, 12.0f, 3.0f)
                close()
                moveTo(21.06f, 2.67f)
                lineTo(21.21f, 2.81f)
                arcToRelative(2.76f, 2.76f, 0.0f, false, true, 0.0f, 3.9f)
                lineToRelative(-6.3f, 6.35f)
                curveToRelative(-0.18f, 0.18f, -0.4f, 0.32f, -0.65f, 0.39f)
                lineToRelative(-4.21f, 1.2f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.62f, -0.61f)
                lineToRelative(1.2f, -4.22f)
                curveToRelative(0.08f, -0.24f, 0.2f, -0.47f, 0.38f, -0.65f)
                lineToRelative(6.31f, -6.35f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, 3.74f, -0.15f)
                close()
                moveTo(18.39f, 3.87f)
                lineTo(12.08f, 10.23f)
                lineTo(11.37f, 12.72f)
                lineTo(13.84f, 12.01f)
                lineTo(20.14f, 5.65f)
                curveToRelative(0.47f, -0.46f, 0.5f, -1.18f, 0.1f, -1.68f)
                lineToRelative(-0.1f, -0.1f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, false, -1.75f, 0.0f)
                close()
            }
        }
        return _status!!
    }

private var _status: ImageVector? = null
