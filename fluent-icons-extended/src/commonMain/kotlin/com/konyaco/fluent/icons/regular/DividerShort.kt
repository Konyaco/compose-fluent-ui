

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DividerShort: ImageVector
    get() {
        if (_dividerShort != null) {
            return _dividerShort!!
        }
        _dividerShort = fluentIcon(name = "Regular.DividerShort") {
            fluentPath {
                moveTo(11.25f, 4.75f)
                verticalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                close()
            }
        }
        return _dividerShort!!
    }

private var _dividerShort: ImageVector? = null
