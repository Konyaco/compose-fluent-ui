

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SportAmericanFootball: ImageVector
    get() {
        if (_sportAmericanFootball != null) {
            return _sportAmericanFootball!!
        }
        _sportAmericanFootball = fluentIcon(name = "Filled.SportAmericanFootball") {
            fluentPath {
                moveTo(21.38f, 11.5f)
                arcToRelative(14.78f, 14.78f, 0.0f, false, true, -9.97f, 9.9f)
                lineToRelative(-8.82f, -8.8f)
                arcToRelative(14.78f, 14.78f, 0.0f, false, true, 9.91f, -9.98f)
                lineToRelative(8.88f, 8.88f)
                close()
                moveTo(13.72f, 9.22f)
                lineTo(9.22f, 13.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                close()
                moveTo(2.2f, 14.32f)
                lineToRelative(7.48f, 7.48f)
                curveToRelative(-0.8f, 0.13f, -1.6f, 0.2f, -2.43f, 0.2f)
                horizontalLineToRelative(-1.0f)
                arcTo(4.25f, 4.25f, 0.0f, false, true, 2.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.83f, 0.07f, -1.64f, 0.2f, -2.43f)
                close()
                moveTo(14.22f, 2.22f)
                lineTo(21.78f, 9.78f)
                curveToRelative(0.15f, -0.82f, 0.22f, -1.67f, 0.22f, -2.53f)
                verticalLineToRelative(-1.0f)
                curveTo(22.0f, 3.9f, 20.1f, 2.0f, 17.75f, 2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.86f, 0.0f, -1.71f, 0.07f, -2.53f, 0.22f)
                close()
            }
        }
        return _sportAmericanFootball!!
    }

private var _sportAmericanFootball: ImageVector? = null
