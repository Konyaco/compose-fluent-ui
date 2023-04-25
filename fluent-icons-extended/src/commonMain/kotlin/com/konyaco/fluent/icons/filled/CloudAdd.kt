

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CloudAdd: ImageVector
    get() {
        if (_cloudAdd != null) {
            return _cloudAdd!!
        }
        _cloudAdd = fluentIcon(name = "Filled.CloudAdd") {
            fluentPath {
                moveTo(6.08f, 8.02f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.84f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.05f, 4.97f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 10.02f, 17.0f)
                lineTo(6.5f, 17.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -0.42f, -8.98f)
                close()
                moveTo(22.0f, 16.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(17.0f, 17.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(16.0f, 17.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(16.0f, 16.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                lineTo(17.0f, 16.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(17.0f, 17.0f)
                close()
            }
        }
        return _cloudAdd!!
    }

private var _cloudAdd: ImageVector? = null
