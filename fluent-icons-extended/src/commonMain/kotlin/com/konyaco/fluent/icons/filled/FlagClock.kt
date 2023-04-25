

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.FlagClock: ImageVector
    get() {
        if (_flagClock != null) {
            return _flagClock!!
        }
        _flagClock = fluentIcon(name = "Filled.FlagClock") {
            fluentPath {
                moveTo(3.0f, 3.75f)
                curveToRelative(0.0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.62f, 0.0f, 0.98f, 0.7f, 0.6f, 1.2f)
                lineTo(16.7f, 9.75f)
                lineToRelative(0.94f, 1.25f)
                horizontalLineToRelative(-0.13f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -6.42f, 5.5f)
                lineTo(4.5f, 16.5f)
                verticalLineToRelative(4.75f)
                curveToRelative(0.0f, 0.38f, -0.28f, 0.7f, -0.65f, 0.74f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(3.0f, 3.75f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(19.5f, 17.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
            }
        }
        return _flagClock!!
    }

private var _flagClock: ImageVector? = null
