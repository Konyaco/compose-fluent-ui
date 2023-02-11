

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Games: ImageVector
    get() {
        if (_games != null) {
            return _games!!
        }
        _games = fluentIcon(name = "Filled.Games") {
            fluentPath {
                moveTo(15.0f, 5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.24f, 14.0f)
                lineTo(9.0f, 19.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.24f, -14.0f)
                lineTo(15.0f, 5.0f)
                close()
                moveTo(14.75f, 12.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.5f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.1f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.5f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 8.0f, 9.0f)
                close()
                moveTo(16.75f, 9.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                close()
            }
        }
        return _games!!
    }

private var _games: ImageVector? = null
