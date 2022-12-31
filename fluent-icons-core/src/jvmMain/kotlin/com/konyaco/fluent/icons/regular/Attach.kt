

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Attach: ImageVector
    get() {
        if (_attach != null) {
            return _attach!!
        }
        _attach = fluentIcon(name = "Regular.Attach") {
            fluentPath {
                moveTo(11.77f, 3.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.66f, 8.3f)
                lineToRelative(-0.19f, 0.2f)
                lineToRelative(-8.8f, 8.8f)
                lineToRelative(-0.03f, 0.03f)
                arcToRelative(3.72f, 3.72f, 0.0f, false, true, -5.4f, -5.1f)
                lineToRelative(0.05f, -0.06f)
                lineToRelative(0.08f, -0.09f)
                lineToRelative(0.14f, -0.15f)
                lineToRelative(7.44f, -7.45f)
                curveToRelative(0.27f, -0.27f, 0.69f, -0.29f, 0.98f, -0.07f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.68f, 0.08f, 0.98f)
                lineToRelative(-0.08f, 0.08f)
                lineToRelative(-7.59f, 7.61f)
                arcToRelative(2.23f, 2.23f, 0.0f, false, false, 3.17f, 3.1f)
                lineToRelative(8.84f, -8.82f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 13.0f, 4.64f)
                lineToRelative(-0.17f, 0.16f)
                lineToRelative(-0.01f, 0.02f)
                lineToRelative(-9.54f, 9.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.13f, -0.97f)
                lineToRelative(0.07f, -0.09f)
                lineToRelative(9.55f, -9.55f)
                close()
            }
        }
        return _attach!!
    }

private var _attach: ImageVector? = null
