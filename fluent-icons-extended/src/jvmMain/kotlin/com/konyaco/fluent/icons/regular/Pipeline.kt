

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Pipeline: ImageVector
    get() {
        if (_pipeline != null) {
            return _pipeline!!
        }
        _pipeline = fluentIcon(name = "Regular.Pipeline") {
            fluentPath {
                moveTo(2.0f, 6.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 6.49f, 6.0f)
                lineTo(17.5f, 6.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 4.49f, 0.25f)
                verticalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -4.49f, 0.25f)
                lineTo(6.5f, 17.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 2.0f, 16.75f)
                lineTo(2.0f, 6.25f)
                close()
                moveTo(5.0f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(5.0f, 6.25f)
                close()
                moveTo(6.5f, 15.5f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(20.5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(20.5f, 6.25f)
                close()
            }
        }
        return _pipeline!!
    }

private var _pipeline: ImageVector? = null
