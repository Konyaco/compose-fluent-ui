

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlideTransition: ImageVector
    get() {
        if (_slideTransition != null) {
            return _slideTransition!!
        }
        _slideTransition = fluentIcon(name = "Regular.SlideTransition") {
            fluentPath {
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
                lineTo(5.0f, 5.5f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-0.25f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(3.5f, 6.75f)
                close()
                moveTo(6.5f, 18.5f)
                verticalLineToRelative(-13.0f)
                lineTo(9.0f, 5.5f)
                verticalLineToRelative(13.0f)
                lineTo(6.5f, 18.5f)
                close()
                moveTo(14.0f, 18.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-13.0f)
                lineTo(14.0f, 5.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(15.5f, 18.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(3.75f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                lineTo(15.5f, 18.5f)
                close()
            }
        }
        return _slideTransition!!
    }

private var _slideTransition: ImageVector? = null
