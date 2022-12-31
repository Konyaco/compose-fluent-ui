

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BorderAll: ImageVector
    get() {
        if (_borderAll != null) {
            return _borderAll!!
        }
        _borderAll = fluentIcon(name = "Filled.BorderAll") {
            fluentPath {
                moveTo(3.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineTo(6.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                lineTo(3.0f, 6.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                lineTo(19.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(11.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 5.0f)
                close()
            }
        }
        return _borderAll!!
    }

private var _borderAll: ImageVector? = null
