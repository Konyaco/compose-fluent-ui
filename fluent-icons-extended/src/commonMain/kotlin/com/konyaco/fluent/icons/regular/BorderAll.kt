

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BorderAll: ImageVector
    get() {
        if (_borderAll != null) {
            return _borderAll!!
        }
        _borderAll = fluentIcon(name = "Regular.BorderAll") {
            fluentPath {
                moveTo(3.0f, 5.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 3.0f)
                horizontalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 21.0f, 5.75f)
                verticalLineToRelative(12.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.25f, 21.0f)
                lineTo(5.75f, 21.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 3.0f, 18.25f)
                lineTo(3.0f, 5.75f)
                close()
                moveTo(12.75f, 19.5f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-6.75f)
                verticalLineToRelative(6.75f)
                close()
                moveTo(11.25f, 12.75f)
                lineTo(4.5f, 12.75f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-6.75f)
                close()
                moveTo(12.75f, 11.25f)
                horizontalLineToRelative(6.75f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(6.75f)
                close()
                moveTo(11.25f, 4.5f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(6.75f)
                lineTo(11.25f, 4.5f)
                close()
            }
        }
        return _borderAll!!
    }

private var _borderAll: ImageVector? = null
