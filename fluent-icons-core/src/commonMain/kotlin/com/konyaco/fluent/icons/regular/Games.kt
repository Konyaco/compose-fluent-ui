

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Games: ImageVector
    get() {
        if (_games != null) {
            return _games!!
        }
        _games = fluentIcon(name = "Regular.Games") {
            fluentPath {
                moveTo(15.0f, 5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.24f, 14.0f)
                lineTo(9.0f, 19.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.24f, -14.0f)
                lineTo(15.0f, 5.0f)
                close()
                moveTo(15.0f, 6.5f)
                lineTo(9.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.22f, 11.0f)
                lineTo(15.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.22f, -11.0f)
                lineTo(15.0f, 6.5f)
                close()
                moveTo(8.0f, 9.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(14.75f, 12.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(16.75f, 9.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
            }
        }
        return _games!!
    }

private var _games: ImageVector? = null
