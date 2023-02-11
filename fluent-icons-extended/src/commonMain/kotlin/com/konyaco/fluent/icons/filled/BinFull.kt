

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BinFull: ImageVector
    get() {
        if (_binFull != null) {
            return _binFull!!
        }
        _binFull = fluentIcon(name = "Filled.BinFull") {
            fluentPath {
                moveTo(17.16f, 3.38f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.82f, -1.26f)
                lineToRelative(-14.0f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.34f, 0.63f)
                verticalLineToRelative(7.0f)
                curveTo(2.0f, 20.55f, 3.46f, 22.0f, 5.25f, 22.0f)
                horizontalLineToRelative(13.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.45f, 3.25f, -3.25f)
                verticalLineToRelative(-7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 7.75f)
                curveTo(21.0f, 6.78f, 20.22f, 6.0f, 19.25f, 6.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(9.5f, 11.0f)
                lineTo(5.3f, 11.0f)
                lineToRelative(11.86f, -7.62f)
                close()
                moveTo(14.5f, 10.0f)
                verticalLineToRelative(1.0f)
                lineTo(11.0f, 11.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -0.14f, 0.11f, -0.25f, 0.25f, -0.25f)
                horizontalLineToRelative(3.25f)
                close()
                moveTo(19.5f, 11.0f)
                lineTo(16.0f, 11.0f)
                lineTo(16.0f, 7.75f)
                curveToRelative(0.0f, -0.14f, 0.11f, -0.25f, 0.25f, -0.25f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.14f, 0.0f, 0.25f, 0.11f, 0.25f, 0.25f)
                lineTo(19.5f, 11.0f)
                close()
            }
        }
        return _binFull!!
    }

private var _binFull: ImageVector? = null
