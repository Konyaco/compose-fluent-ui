

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Space3D: ImageVector
    get() {
        if (_space3D != null) {
            return _space3D!!
        }
        _space3D = fluentIcon(name = "Filled.Space3D") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                lineTo(21.0f, 15.0f)
                horizontalLineToRelative(-0.81f)
                lineToRelative(-2.25f, -3.0f)
                horizontalLineToRelative(1.56f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(4.5f, 12.0f)
                horizontalLineToRelative(1.56f)
                lineToRelative(-2.25f, 3.0f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(15.7f, 16.5f)
                lineTo(21.0f, 16.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-0.67f)
                lineToRelative(-0.36f, -1.22f)
                lineToRelative(-1.03f, -3.28f)
                close()
                moveTo(18.3f, 15.0f)
                horizontalLineToRelative(-3.09f)
                lineToRelative(-0.93f, -3.0f)
                horizontalLineToRelative(1.77f)
                lineToRelative(2.25f, 3.0f)
                close()
                moveTo(10.51f, 15.0f)
                horizontalLineToRelative(3.13f)
                lineToRelative(-0.94f, -3.0f)
                horizontalLineToRelative(-1.44f)
                lineToRelative(-0.75f, 3.0f)
                close()
                moveTo(14.11f, 16.5f)
                horizontalLineToRelative(-3.97f)
                lineTo(9.02f, 21.0f)
                horizontalLineToRelative(6.5f)
                lineToRelative(-0.24f, -0.78f)
                lineToRelative(-1.16f, -3.72f)
                close()
                moveTo(9.72f, 12.0f)
                lineToRelative(-0.74f, 3.0f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(2.26f, -3.0f)
                horizontalLineToRelative(1.79f)
                close()
                moveTo(8.6f, 16.5f)
                lineTo(3.0f, 16.5f)
                verticalLineToRelative(1.25f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(1.23f)
                lineToRelative(1.12f, -4.5f)
                close()
            }
        }
        return _space3D!!
    }

private var _space3D: ImageVector? = null
