

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DesktopArrowRight: ImageVector
    get() {
        if (_desktopArrowRight != null) {
            return _desktopArrowRight!!
        }
        _desktopArrowRight = fluentIcon(name = "Regular.DesktopArrowRight") {
            fluentPath {
                moveTo(23.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(14.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(4.8f)
                lineToRelative(-1.65f, 1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.7f, 0.7f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.7f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.7f, 0.7f)
                lineTo(19.29f, 6.0f)
                lineTo(14.5f, 6.0f)
                close()
                moveTo(20.5f, 15.75f)
                verticalLineToRelative(-3.48f)
                arcToRelative(6.52f, 6.52f, 0.0f, false, false, 1.5f, -1.08f)
                verticalLineToRelative(4.56f)
                curveToRelative(0.0f, 1.2f, -0.93f, 2.17f, -2.1f, 2.25f)
                horizontalLineToRelative(-4.4f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(6.75f, 22.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                lineTo(8.5f, 20.5f)
                lineTo(8.5f, 18.0f)
                lineTo(4.25f, 18.0f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.24f, -2.1f)
                lineTo(2.0f, 15.76f)
                lineTo(2.0f, 5.25f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.25f)
                horizontalLineToRelative(7.92f)
                curveToRelative(-0.3f, 0.46f, -0.53f, 0.97f, -0.7f, 1.5f)
                lineTo(4.24f, 4.5f)
                curveToRelative(-0.38f, 0.0f, -0.7f, 0.28f, -0.74f, 0.65f)
                lineToRelative(-0.01f, 0.1f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.38f, 0.28f, 0.7f, 0.65f, 0.75f)
                horizontalLineToRelative(15.6f)
                curveToRelative(0.38f, 0.0f, 0.7f, -0.28f, 0.74f, -0.65f)
                verticalLineToRelative(-0.1f)
                close()
                moveTo(14.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 18.0f)
                close()
            }
        }
        return _desktopArrowRight!!
    }

private var _desktopArrowRight: ImageVector? = null
