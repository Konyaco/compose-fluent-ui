

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = fluentIcon(name = "Filled.Map") {
            fluentPath {
                moveTo(8.5f, 4.36f)
                verticalLineToRelative(12.46f)
                lineToRelative(-4.32f, 3.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.17f, -0.5f)
                lineTo(3.0f, 19.24f)
                lineTo(3.0f, 8.62f)
                curveToRelative(0.0f, -0.21f, 0.09f, -0.41f, 0.24f, -0.55f)
                lineTo(3.32f, 8.0f)
                lineTo(8.5f, 4.36f)
                close()
                moveTo(21.0f, 4.65f)
                verticalLineToRelative(10.73f)
                curveToRelative(0.0f, 0.21f, -0.09f, 0.41f, -0.24f, 0.55f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-5.18f, 3.64f)
                lineTo(15.5f, 7.17f)
                lineToRelative(4.32f, -3.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.17f, 0.5f)
                close()
                moveTo(10.0f, 4.35f)
                lineToRelative(4.0f, 2.82f)
                verticalLineToRelative(12.47f)
                lineToRelative(-4.0f, -2.82f)
                lineTo(10.0f, 4.36f)
                close()
            }
        }
        return _map!!
    }

private var _map: ImageVector? = null
