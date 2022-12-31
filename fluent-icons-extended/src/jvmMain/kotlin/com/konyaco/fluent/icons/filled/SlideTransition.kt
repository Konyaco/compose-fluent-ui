

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SlideTransition: ImageVector
    get() {
        if (_slideTransition != null) {
            return _slideTransition!!
        }
        _slideTransition = fluentIcon(name = "Filled.SlideTransition") {
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
                moveTo(6.5f, 5.5f)
                verticalLineToRelative(13.0f)
                lineTo(5.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(10.5f, 18.5f)
                lineTo(9.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(15.5f, 18.5f)
                lineTo(14.0f, 18.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        return _slideTransition!!
    }

private var _slideTransition: ImageVector? = null
