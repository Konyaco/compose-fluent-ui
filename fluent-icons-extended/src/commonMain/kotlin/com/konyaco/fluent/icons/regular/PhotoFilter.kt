

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.PhotoFilter: ImageVector
    get() {
        if (_photoFilter != null) {
            return _photoFilter!!
        }
        _photoFilter = fluentIcon(name = "Regular.PhotoFilter") {
            fluentPath {
                moveTo(9.5f, 2.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.18f, 5.32f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, -9.36f, 9.36f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 9.5f, 2.0f)
                close()
                moveTo(16.99f, 9.04f)
                verticalLineToRelative(0.22f)
                lineToRelative(0.01f, 0.24f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -7.96f, 7.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.95f, -7.95f)
                close()
                moveTo(9.5f, 3.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.49f, 11.46f)
                verticalLineToRelative(-0.22f)
                lineTo(7.0f, 14.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.96f, -7.49f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 9.5f, 3.5f)
                close()
            }
        }
        return _photoFilter!!
    }

private var _photoFilter: ImageVector? = null
