

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.OpenFolder: ImageVector
    get() {
        if (_openFolder != null) {
            return _openFolder!!
        }
        _openFolder = fluentIcon(name = "Filled.OpenFolder") {
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
                moveTo(9.95f, 9.0f)
                lineTo(16.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.11f, 2.0f)
                horizontalLineToRelative(-3.69f)
                lineToRelative(6.54f, 6.54f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.08f, 1.32f)
                lineToRelative(-0.08f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.08f)
                lineToRelative(-0.1f, -0.08f)
                lineTo(11.0f, 12.4f)
                verticalLineToRelative(3.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.88f, 0.99f)
                lineTo(10.0f, 16.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                verticalLineToRelative(-6.2f)
                lineToRelative(0.02f, -0.1f)
                verticalLineToRelative(-0.05f)
                lineToRelative(0.03f, -0.07f)
                lineToRelative(0.03f, -0.1f)
                lineToRelative(0.07f, -0.12f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.14f, -0.19f)
                lineToRelative(0.11f, -0.1f)
                lineToRelative(0.12f, -0.07f)
                lineToRelative(0.1f, -0.05f)
                lineToRelative(0.1f, -0.03f)
                lineToRelative(0.1f, -0.02f)
                lineToRelative(0.12f, -0.02f)
                lineTo(16.0f, 8.99f)
                lineTo(9.94f, 8.99f)
                close()
            }
        }
        return _openFolder!!
    }

private var _openFolder: ImageVector? = null
