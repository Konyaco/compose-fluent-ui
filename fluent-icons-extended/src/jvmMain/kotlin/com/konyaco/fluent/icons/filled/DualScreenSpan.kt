

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DualScreenSpan: ImageVector
    get() {
        if (_dualScreenSpan != null) {
            return _dualScreenSpan!!
        }
        _dualScreenSpan = fluentIcon(name = "Filled.DualScreenSpan") {
            fluentPath {
                moveTo(22.0f, 5.75f)
                curveTo(22.0f, 4.8f, 21.22f, 4.0f, 20.25f, 4.0f)
                horizontalLineToRelative(-7.24f)
                lineToRelative(-0.26f, 0.02f)
                verticalLineToRelative(7.23f)
                horizontalLineToRelative(4.83f)
                lineToRelative(-0.89f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.12f, -1.0f)
                lineToRelative(2.0f, 2.25f)
                curveToRelative(0.25f, 0.29f, 0.25f, 0.71f, 0.0f, 1.0f)
                lineToRelative(-2.0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.12f, -1.0f)
                lineToRelative(0.9f, -1.0f)
                horizontalLineToRelative(-4.84f)
                verticalLineToRelative(7.23f)
                lineToRelative(0.26f, 0.02f)
                horizontalLineToRelative(7.24f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(22.0f, 5.75f)
                close()
                moveTo(11.25f, 11.25f)
                lineTo(6.42f, 11.25f)
                lineToRelative(0.9f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.13f, -1.0f)
                lineToRelative(-2.0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.0f)
                lineToRelative(2.0f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.12f, -1.0f)
                lineToRelative(-0.89f, -1.0f)
                horizontalLineToRelative(4.83f)
                verticalLineToRelative(7.23f)
                lineToRelative(-0.24f, 0.02f)
                lineTo(3.76f, 20.0f)
                curveTo(2.79f, 20.0f, 2.0f, 19.2f, 2.0f, 18.25f)
                lineTo(2.0f, 5.75f)
                curveTo(2.0f, 4.8f, 2.79f, 4.0f, 3.76f, 4.0f)
                lineTo(11.0f, 4.0f)
                curveToRelative(0.08f, 0.0f, 0.16f, 0.0f, 0.24f, 0.02f)
                verticalLineToRelative(7.23f)
                close()
            }
        }
        return _dualScreenSpan!!
    }

private var _dualScreenSpan: ImageVector? = null
