

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShieldProhibited: ImageVector
    get() {
        if (_shieldProhibited != null) {
            return _shieldProhibited!!
        }
        _shieldProhibited = fluentIcon(name = "Filled.ShieldProhibited") {
            fluentPath {
                moveTo(3.75f, 5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                lineTo(3.0f, 11.0f)
                curveToRelative(0.0f, 5.0f, 2.96f, 8.68f, 8.73f, 10.95f)
                curveToRelative(0.17f, 0.07f, 0.37f, 0.07f, 0.54f, 0.0f)
                lineToRelative(0.43f, -0.17f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 8.28f, -10.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 5.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                curveToRelative(-2.66f, 0.0f, -5.26f, -0.94f, -7.8f, -2.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.9f, 0.0f)
                curveTo(9.01f, 4.05f, 6.41f, 5.0f, 3.75f, 5.0f)
                close()
                moveTo(16.5f, 22.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(13.2f, 18.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.56f, -5.56f)
                lineToRelative(-5.57f, 5.56f)
                close()
                moveTo(14.25f, 19.81f)
                lineTo(19.81f, 14.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.56f, 5.56f)
                close()
            }
        }
        return _shieldProhibited!!
    }

private var _shieldProhibited: ImageVector? = null
