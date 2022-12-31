

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.OpenFolder: ImageVector
    get() {
        if (_openFolder != null) {
            return _openFolder!!
        }
        _openFolder = fluentIcon(name = "Regular.OpenFolder") {
            fluentPath {
                moveTo(6.75f, 3.0f)
                horizontalLineToRelative(10.5f)
                curveToRelative(2.0f, 0.0f, 3.64f, 1.57f, 3.75f, 3.55f)
                verticalLineToRelative(4.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.49f, 0.1f)
                verticalLineToRelative(-4.6f)
                curveToRelative(0.0f, -1.19f, -0.93f, -2.16f, -2.1f, -2.24f)
                horizontalLineToRelative(-0.16f)
                lineTo(6.75f, 4.5f)
                curveToRelative(-1.18f, 0.0f, -2.15f, 0.9f, -2.25f, 2.06f)
                verticalLineToRelative(10.69f)
                curveToRelative(0.0f, 1.2f, 0.93f, 2.17f, 2.1f, 2.25f)
                horizontalLineToRelative(4.65f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.6f)
                curveToRelative(-2.0f, 0.0f, -3.64f, -1.57f, -3.75f, -3.55f)
                lineTo(3.0f, 6.55f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 6.55f, 3.0f)
                lineToRelative(0.2f, -0.01f)
                close()
                moveTo(9.75f, 9.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineToRelative(-4.79f)
                lineToRelative(7.22f, 7.22f)
                curveToRelative(0.27f, 0.27f, 0.3f, 0.68f, 0.08f, 0.98f)
                lineToRelative(-0.08f, 0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.97f, 0.07f)
                lineToRelative(-0.09f, -0.07f)
                lineToRelative(-7.22f, -7.22f)
                verticalLineToRelative(4.7f)
                curveToRelative(0.0f, 0.37f, -0.28f, 0.68f, -0.65f, 0.73f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.65f)
                lineToRelative(-0.01f, -0.1f)
                lineTo(9.0f, 9.73f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.07f)
                lineToRelative(0.03f, -0.11f)
                lineToRelative(0.03f, -0.1f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.16f, -0.23f)
                lineToRelative(0.04f, -0.04f)
                lineToRelative(0.08f, -0.06f)
                lineToRelative(0.06f, -0.04f)
                lineToRelative(0.1f, -0.04f)
                lineToRelative(0.07f, -0.02f)
                lineToRelative(0.06f, -0.01f)
                lineToRelative(0.1f, -0.01f)
                horizontalLineToRelative(6.52f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }
        return _openFolder!!
    }

private var _openFolder: ImageVector? = null
