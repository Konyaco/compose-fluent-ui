

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Space3D: ImageVector
    get() {
        if (_space3D != null) {
            return _space3D!!
        }
        _space3D = fluentIcon(name = "Regular.Space3D") {
            fluentPath {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                lineTo(4.5f, 11.0f)
                horizontalLineToRelative(15.0f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                lineTo(6.25f, 4.5f)
                close()
                moveTo(4.5f, 14.08f)
                lineToRelative(1.19f, -1.58f)
                lineTo(4.5f, 12.5f)
                verticalLineToRelative(1.58f)
                close()
                moveTo(5.69f, 15.0f)
                horizontalLineToRelative(3.29f)
                lineToRelative(0.62f, -2.5f)
                lineTo(7.56f, 12.5f)
                lineTo(5.7f, 15.0f)
                close()
                moveTo(4.5f, 16.5f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(1.6f)
                lineToRelative(0.75f, -3.0f)
                lineTo(4.5f, 16.5f)
                close()
                moveTo(10.15f, 16.5f)
                lineTo(9.4f, 19.5f)
                horizontalLineToRelative(5.66f)
                lineToRelative(-0.94f, -3.0f)
                horizontalLineToRelative(-3.97f)
                close()
                moveTo(15.69f, 16.5f)
                lineTo(16.63f, 19.5f)
                horizontalLineToRelative(1.12f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                lineTo(19.5f, 16.5f)
                horizontalLineToRelative(-3.8f)
                close()
                moveTo(18.31f, 15.0f)
                lineTo(16.44f, 12.5f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.78f, 2.5f)
                horizontalLineToRelative(3.1f)
                close()
                moveTo(13.65f, 15.0f)
                lineTo(12.87f, 12.5f)
                horizontalLineToRelative(-1.72f)
                lineToRelative(-0.63f, 2.5f)
                horizontalLineToRelative(3.13f)
                close()
                moveTo(19.5f, 14.08f)
                lineTo(19.5f, 12.5f)
                horizontalLineToRelative(-1.19f)
                lineToRelative(1.19f, 1.58f)
                close()
            }
        }
        return _space3D!!
    }

private var _space3D: ImageVector? = null
