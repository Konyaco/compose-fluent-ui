

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = fluentIcon(name = "Filled.Broom") {
            fluentPath {
                moveTo(22.45f, 1.92f)
                curveToRelative(0.3f, 0.3f, 0.3f, 0.77f, 0.0f, 1.06f)
                lineTo(16.14f, 9.3f)
                arcToRelative(6.81f, 6.81f, 0.0f, false, false, -1.07f, -1.06f)
                lineToRelative(6.32f, -6.32f)
                curveToRelative(0.3f, -0.29f, 0.77f, -0.29f, 1.06f, 0.0f)
                close()
                moveTo(15.03f, 9.35f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -8.13f, 0.0f)
                lineToRelative(-0.25f, 0.24f)
                lineToRelative(8.13f, 8.13f)
                lineToRelative(0.25f, -0.24f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 0.0f, -8.13f)
                close()
                moveTo(1.88f, 12.97f)
                lineToRelative(3.62f, -2.41f)
                lineToRelative(8.32f, 8.32f)
                lineToRelative(-2.41f, 3.61f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.15f, 0.12f)
                lineToRelative(-8.49f, -8.49f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.11f, -1.15f)
                close()
            }
        }
        return _broom!!
    }

private var _broom: ImageVector? = null
