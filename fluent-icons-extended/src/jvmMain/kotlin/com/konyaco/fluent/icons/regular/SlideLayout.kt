

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlideLayout: ImageVector
    get() {
        if (_slideLayout != null) {
            return _slideLayout!!
        }
        _slideLayout = fluentIcon(name = "Regular.SlideLayout") {
            fluentPath {
                moveTo(6.75f, 7.0f)
                curveTo(5.78f, 7.0f, 5.0f, 7.78f, 5.0f, 8.75f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-6.5f)
                curveTo(19.0f, 7.78f, 18.22f, 7.0f, 17.25f, 7.0f)
                lineTo(6.75f, 7.0f)
                close()
                moveTo(6.5f, 8.75f)
                curveToRelative(0.0f, -0.14f, 0.11f, -0.25f, 0.25f, -0.25f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, 0.11f, 0.25f, 0.25f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-11.0f)
                lineTo(6.5f, 8.75f)
                close()
                moveTo(10.5f, 12.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.25f)
                curveToRelative(0.0f, 0.14f, -0.11f, 0.25f, -0.25f, 0.25f)
                lineTo(10.5f, 15.5f)
                lineTo(10.5f, 12.0f)
                close()
                moveTo(9.0f, 12.0f)
                verticalLineToRelative(3.5f)
                lineTo(6.75f, 15.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                lineTo(6.5f, 12.0f)
                lineTo(9.0f, 12.0f)
                close()
                moveTo(4.75f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 20.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 22.0f, 17.25f)
                lineTo(22.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 4.0f)
                lineTo(4.75f, 4.0f)
                close()
                moveTo(3.5f, 6.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                lineTo(4.75f, 18.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(3.5f, 6.75f)
                close()
            }
        }
        return _slideLayout!!
    }

private var _slideLayout: ImageVector? = null
