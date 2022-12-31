

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.RibbonAdd: ImageVector
    get() {
        if (_ribbonAdd != null) {
            return _ribbonAdd!!
        }
        _ribbonAdd = fluentIcon(name = "Filled.RibbonAdd") {
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
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(11.0f, 6.5f)
                curveToRelative(0.0f, -1.65f, 0.62f, -3.16f, 1.63f, -4.3f)
                arcTo(7.02f, 7.02f, 0.0f, false, false, 4.0f, 9.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 12.77f, 3.96f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 11.0f, 6.5f)
                close()
                moveTo(16.0f, 15.25f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.6f, -0.68f, 0.96f, -1.18f, 0.61f)
                lineTo(11.0f, 19.17f)
                lineToRelative(-3.82f, 2.7f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.0f, 21.24f)
                verticalLineToRelative(-6.0f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, false, 10.0f, 0.0f)
                close()
            }
        }
        return _ribbonAdd!!
    }

private var _ribbonAdd: ImageVector? = null
