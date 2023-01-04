

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DataPie: ImageVector
    get() {
        if (_dataPie != null) {
            return _dataPie!!
        }
        _dataPie = fluentIcon(name = "Filled.DataPie") {
            fluentPath {
                moveTo(10.25f, 4.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                curveToRelative(0.0f, 4.97f, -4.03f, 8.5f, -9.0f, 8.5f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, -9.0f)
                curveToRelative(0.0f, -4.97f, 3.53f, -9.0f, 8.5f, -9.0f)
                close()
                moveTo(13.25f, 1.75f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(12.5f, 2.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _dataPie!!
    }

private var _dataPie: ImageVector? = null
