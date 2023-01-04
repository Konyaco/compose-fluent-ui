

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = fluentIcon(name = "Regular.Broom") {
            fluentPath {
                moveTo(22.45f, 1.92f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineToRelative(-6.93f, 6.93f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -0.5f, 7.57f)
                lineToRelative(-0.82f, 0.83f)
                lineToRelative(-2.79f, 4.18f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.15f, 0.12f)
                lineToRelative(-8.49f, -8.49f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.11f, -1.15f)
                lineToRelative(4.19f, -2.8f)
                lineToRelative(0.83f, -0.82f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 7.56f, -0.5f)
                lineToRelative(6.93f, -6.93f)
                curveToRelative(0.3f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f)
                close()
                moveTo(7.6f, 10.76f)
                lineToRelative(6.01f, 6.01f)
                lineToRelative(0.36f, -0.35f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -6.01f, -6.01f)
                lineToRelative(-0.36f, 0.35f)
                close()
                moveTo(6.45f, 11.73f)
                lineTo(3.48f, 13.7f)
                lineToRelative(7.19f, 7.19f)
                lineToRelative(1.98f, -2.97f)
                lineToRelative(-6.2f, -6.2f)
                close()
            }
        }
        return _broom!!
    }

private var _broom: ImageVector? = null
