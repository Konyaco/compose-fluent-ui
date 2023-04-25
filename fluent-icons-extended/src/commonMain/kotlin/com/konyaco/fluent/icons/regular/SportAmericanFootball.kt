

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SportAmericanFootball: ImageVector
    get() {
        if (_sportAmericanFootball != null) {
            return _sportAmericanFootball!!
        }
        _sportAmericanFootball = fluentIcon(name = "Regular.SportAmericanFootball") {
            fluentPath {
                moveTo(13.72f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(4.5f, -4.5f)
                close()
                moveTo(17.75f, 2.0f)
                curveTo(20.1f, 2.0f, 22.0f, 3.9f, 22.0f, 6.25f)
                verticalLineToRelative(1.0f)
                curveTo(22.0f, 15.4f, 15.4f, 22.0f, 7.25f, 22.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(4.25f, 4.25f, 0.0f, false, true, 2.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                curveTo(2.0f, 8.6f, 8.6f, 2.0f, 16.75f, 2.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(20.5f, 6.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.75f, -2.75f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.4f, 0.0f, -0.8f, 0.02f, -1.2f, 0.05f)
                lineToRelative(4.9f, 4.9f)
                curveToRelative(0.03f, -0.4f, 0.05f, -0.8f, 0.05f, -1.2f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(20.15f, 10.27f)
                lineTo(13.73f, 3.85f)
                arcToRelative(13.27f, 13.27f, 0.0f, false, false, -9.9f, 9.97f)
                lineToRelative(6.35f, 6.36f)
                arcToRelative(13.27f, 13.27f, 0.0f, false, false, 9.97f, -9.9f)
                close()
                moveTo(3.55f, 15.67f)
                curveToRelative(-0.04f, 0.35f, -0.05f, 0.71f, -0.05f, 1.08f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, 2.75f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.37f, 0.0f, 0.73f, -0.01f, 1.09f, -0.04f)
                lineToRelative(-4.8f, -4.8f)
                close()
            }
        }
        return _sportAmericanFootball!!
    }

private var _sportAmericanFootball: ImageVector? = null
