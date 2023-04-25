

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PenProhibited: ImageVector
    get() {
        if (_penProhibited != null) {
            return _penProhibited!!
        }
        _penProhibited = fluentIcon(name = "Filled.PenProhibited") {
            fluentPath {
                moveTo(20.95f, 3.05f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, -5.06f, 0.0f)
                lineTo(3.94f, 15.0f)
                curveToRelative(-0.4f, 0.4f, -0.7f, 0.92f, -0.82f, 1.48f)
                lineToRelative(-1.1f, 4.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.9f, 0.9f)
                lineToRelative(4.6f, -1.1f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 9.0f, 20.06f)
                lineToRelative(1.15f, -1.15f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, true, 7.76f, -7.76f)
                lineToRelative(3.04f, -3.04f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, false, 0.0f, -5.06f)
                close()
                moveTo(22.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(12.5f, 17.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.25f, -3.3f)
                lineToRelative(-5.56f, 5.55f)
                arcToRelative(3.98f, 3.98f, 0.0f, false, true, -0.69f, -2.25f)
                close()
                moveTo(16.5f, 21.5f)
                curveToRelative(-0.83f, 0.0f, -1.6f, -0.26f, -2.25f, -0.7f)
                lineToRelative(5.56f, -5.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, 6.25f)
                close()
            }
        }
        return _penProhibited!!
    }

private var _penProhibited: ImageVector? = null
