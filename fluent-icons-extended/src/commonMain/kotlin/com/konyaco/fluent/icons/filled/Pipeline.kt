

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Pipeline: ImageVector
    get() {
        if (_pipeline != null) {
            return _pipeline!!
        }
        _pipeline = fluentIcon(name = "Filled.Pipeline") {
            fluentPath {
                moveTo(2.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(18.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                lineTo(18.0f, 6.0f)
                close()
                moveTo(16.5f, 6.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(9.0f)
                lineTo(16.5f, 6.0f)
                close()
            }
        }
        return _pipeline!!
    }

private var _pipeline: ImageVector? = null
