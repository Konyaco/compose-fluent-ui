

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.RibbonAdd: ImageVector
    get() {
        if (_ribbonAdd != null) {
            return _ribbonAdd!!
        }
        _ribbonAdd = fluentIcon(name = "Regular.RibbonAdd") {
            fluentPath {
                moveTo(23.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(18.0f, 7.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(11.0f, 2.0f)
                curveToRelative(0.56f, 0.0f, 1.1f, 0.07f, 1.63f, 0.2f)
                curveToRelative(-0.36f, 0.4f, -0.67f, 0.85f, -0.92f, 1.35f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 3.47f, 9.03f)
                curveToRelative(0.5f, 0.19f, 1.04f, 0.32f, 1.6f, 0.38f)
                curveToRelative(-0.24f, 0.33f, -0.5f, 0.65f, -0.78f, 0.94f)
                verticalLineToRelative(7.35f)
                curveToRelative(0.0f, 0.57f, -0.6f, 0.92f, -1.1f, 0.67f)
                lineToRelative(-0.08f, -0.06f)
                lineTo(11.0f, 19.17f)
                lineToRelative(-3.82f, 2.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.17f, -0.52f)
                verticalLineToRelative(-0.1f)
                lineTo(6.0f, 13.9f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 11.0f, 2.0f)
                close()
                moveTo(14.5f, 19.8f)
                verticalLineToRelative(-4.74f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, -7.0f, 0.0f)
                verticalLineToRelative(4.74f)
                lineToRelative(3.07f, -2.16f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.76f, -0.06f)
                lineToRelative(0.1f, 0.06f)
                lineToRelative(3.07f, 2.16f)
                close()
            }
        }
        return _ribbonAdd!!
    }

private var _ribbonAdd: ImageVector? = null
