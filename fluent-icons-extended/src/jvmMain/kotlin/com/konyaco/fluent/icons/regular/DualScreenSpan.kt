

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DualScreenSpan: ImageVector
    get() {
        if (_dualScreenSpan != null) {
            return _dualScreenSpan!!
        }
        _dualScreenSpan = fluentIcon(name = "Regular.DualScreenSpan") {
            fluentPath {
                moveTo(8.31f, 10.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.12f, -1.0f)
                lineToRelative(-2.0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.0f)
                lineToRelative(2.0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.12f, -1.0f)
                lineToRelative(-0.89f, -1.0f)
                horizontalLineToRelative(9.16f)
                lineToRelative(-0.89f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.12f, 1.0f)
                lineToRelative(2.0f, -2.25f)
                lineToRelative(0.01f, -0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.01f, -0.99f)
                lineToRelative(-2.0f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.12f, 1.0f)
                lineToRelative(0.9f, 1.0f)
                lineTo(7.41f, 11.25f)
                lineToRelative(0.9f, -1.0f)
                close()
                moveTo(12.76f, 4.0f)
                horizontalLineToRelative(7.5f)
                curveTo(21.21f, 4.0f, 22.0f, 4.8f, 22.0f, 5.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(3.75f, 20.0f)
                curveToRelative(-0.96f, 0.0f, -1.74f, -0.79f, -1.74f, -1.75f)
                lineTo(2.01f, 5.75f)
                curveTo(2.0f, 4.8f, 2.79f, 4.0f, 3.76f, 4.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(20.26f, 5.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.13f, 0.0f, 0.24f, -0.11f, 0.24f, -0.25f)
                lineTo(20.5f, 5.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        return _dualScreenSpan!!
    }

private var _dualScreenSpan: ImageVector? = null
