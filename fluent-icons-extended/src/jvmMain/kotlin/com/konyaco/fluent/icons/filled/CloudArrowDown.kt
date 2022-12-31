

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) {
            return _cloudArrowDown!!
        }
        _cloudArrowDown = fluentIcon(name = "Filled.CloudArrowDown") {
            fluentPath {
                moveTo(6.09f, 7.75f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 11.32f, 0.0f)
                horizontalLineToRelative(0.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.96f, 4.55f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, false, -11.42f, 3.45f)
                lineTo(6.0f, 15.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(0.09f)
                close()
                moveTo(22.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(16.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(4.8f)
                lineToRelative(1.65f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, 0.7f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.7f, 0.0f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, -0.7f)
                lineTo(16.0f, 18.29f)
                lineTo(16.0f, 13.5f)
                close()
            }
        }
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
