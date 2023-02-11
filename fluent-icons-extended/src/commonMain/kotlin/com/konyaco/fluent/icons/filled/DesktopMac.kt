

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DesktopMac: ImageVector
    get() {
        if (_desktopMac != null) {
            return _desktopMac!!
        }
        _desktopMac = fluentIcon(name = "Filled.DesktopMac") {
            fluentPath {
                moveTo(4.25f, 3.0f)
                curveTo(3.01f, 3.0f, 2.0f, 4.0f, 2.0f, 5.25f)
                verticalLineToRelative(10.5f)
                curveTo(2.0f, 16.99f, 3.0f, 18.0f, 4.25f, 18.0f)
                lineTo(9.5f, 18.0f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(14.5f, 18.0f)
                horizontalLineToRelative(5.25f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(22.0f, 5.25f)
                curveTo(22.0f, 4.01f, 21.0f, 3.0f, 19.75f, 3.0f)
                lineTo(4.25f, 3.0f)
                close()
                moveTo(13.0f, 18.0f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.45f, 0.1f, 0.88f, 0.3f, 1.25f)
                horizontalLineToRelative(-2.6f)
                curveToRelative(0.2f, -0.38f, 0.3f, -0.8f, 0.3f, -1.25f)
                lineTo(11.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.5f, 14.5f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                lineTo(4.25f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                lineTo(3.5f, 14.5f)
                close()
            }
        }
        return _desktopMac!!
    }

private var _desktopMac: ImageVector? = null
