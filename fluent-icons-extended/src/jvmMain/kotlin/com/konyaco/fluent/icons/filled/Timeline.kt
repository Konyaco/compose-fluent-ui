

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Timeline: ImageVector
    get() {
        if (_timeline != null) {
            return _timeline!!
        }
        _timeline = fluentIcon(name = "Filled.Timeline") {
            fluentPath {
                moveTo(15.25f, 13.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 21.0f)
                curveTo(2.78f, 21.0f, 2.0f, 20.22f, 2.0f, 19.25f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(21.0f, 14.9f)
                verticalLineToRelative(5.35f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                lineTo(19.5f, 14.91f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.5f, -0.01f)
                close()
                moveTo(20.25f, 10.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, true, true, 0.0f, 3.8f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, -3.8f)
                close()
                moveTo(15.25f, 3.0f)
                curveTo(16.2f, 3.0f, 17.0f, 3.78f, 17.0f, 4.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.97f, -0.79f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 11.0f)
                curveTo(2.78f, 11.0f, 2.0f, 10.22f, 2.0f, 9.25f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.92f, 0.7f, -1.67f, 1.6f, -1.75f)
                horizontalLineToRelative(11.65f)
                close()
                moveTo(20.25f, 3.0f)
                curveToRelative(0.38f, 0.0f, 0.7f, 0.28f, 0.74f, 0.65f)
                lineToRelative(0.01f, 0.1f)
                lineTo(21.0f, 9.1f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.5f, -0.01f)
                lineTo(19.5f, 3.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _timeline!!
    }

private var _timeline: ImageVector? = null
