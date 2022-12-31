

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Poll: ImageVector
    get() {
        if (_poll != null) {
            return _poll!!
        }
        _poll = fluentIcon(name = "Filled.Poll") {
            fluentPath {
                moveTo(11.75f, 2.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(14.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                lineTo(9.0f, 4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 11.75f, 2.0f)
                close()
                moveTo(18.75f, 7.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(9.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                verticalLineToRelative(-9.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.75f, 7.0f)
                close()
                moveTo(4.75f, 12.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                verticalLineToRelative(-4.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 12.0f)
                close()
            }
        }
        return _poll!!
    }

private var _poll: ImageVector? = null
