

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = fluentIcon(name = "Regular.Wrench") {
            fluentPath {
                moveTo(10.5f, 7.75f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 8.38f, -5.11f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.19f, 1.2f)
                lineTo(16.3f, 6.6f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(2.78f, -2.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.2f, 0.18f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -6.42f, 8.28f)
                lineToRelative(-7.37f, 7.62f)
                arcToRelative(3.05f, 3.05f, 0.0f, false, true, -4.4f, -4.24f)
                lineTo(10.64f, 9.0f)
                curveToRelative(-0.08f, -0.4f, -0.13f, -0.81f, -0.13f, -1.24f)
                close()
                moveTo(16.25f, 3.5f)
                arcTo(4.25f, 4.25f, 0.0f, false, false, 12.18f, 9.0f)
                curveToRelative(0.08f, 0.26f, 0.01f, 0.54f, -0.18f, 0.74f)
                lineToRelative(-7.76f, 8.03f)
                arcToRelative(1.55f, 1.55f, 0.0f, true, false, 2.23f, 2.16f)
                lineToRelative(7.67f, -7.94f)
                curveToRelative(0.2f, -0.2f, 0.5f, -0.28f, 0.78f, -0.2f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, 5.46f, -5.02f)
                lineToRelative(-2.49f, 2.5f)
                curveToRelative(-0.3f, 0.28f, -0.77f, 0.28f, -1.06f, 0.0f)
                lineToRelative(-2.12f, -2.13f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(2.47f, -2.47f)
                curveToRelative(-0.3f, -0.06f, -0.61f, -0.1f, -0.93f, -0.1f)
                close()
            }
        }
        return _wrench!!
    }

private var _wrench: ImageVector? = null
