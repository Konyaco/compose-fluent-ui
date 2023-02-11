

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DataPie: ImageVector
    get() {
        if (_dataPie != null) {
            return _dataPie!!
        }
        _dataPie = fluentIcon(name = "Regular.DataPie") {
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
                moveTo(9.5f, 5.79f)
                lineToRelative(-0.2f, 0.02f)
                curveToRelative(-3.7f, 0.47f, -6.05f, 3.62f, -6.05f, 7.44f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 7.5f, 7.5f)
                curveToRelative(3.82f, 0.0f, 6.97f, -2.35f, 7.44f, -6.04f)
                lineToRelative(0.02f, -0.21f)
                horizontalLineToRelative(-7.96f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(9.5f, 5.79f)
                close()
                moveTo(13.25f, 1.75f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(12.5f, 2.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(14.0f, 3.29f)
                lineTo(14.0f, 10.0f)
                horizontalLineToRelative(6.71f)
                lineToRelative(-0.02f, -0.2f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 14.2f, 3.3f)
                lineTo(14.0f, 3.3f)
                close()
            }
        }
        return _dataPie!!
    }

private var _dataPie: ImageVector? = null
