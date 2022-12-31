

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowUpload: ImageVector
    get() {
        if (_arrowUpload != null) {
            return _arrowUpload!!
        }
        _arrowUpload = fluentIcon(name = "Filled.ArrowUpload") {
            fluentPath {
                moveTo(5.25f, 3.5f)
                horizontalLineToRelative(13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, -1.5f)
                horizontalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, 1.49f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(11.88f, 22.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -0.88f)
                verticalLineTo(8.4f)
                lineToRelative(3.3f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.31f, 0.08f)
                lineToRelative(0.1f, -0.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.08f, -1.32f)
                lineToRelative(-0.08f, -0.1f)
                lineToRelative(-5.0f, -4.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, -0.08f)
                lineToRelative(-0.1f, 0.08f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, 1.5f)
                lineToRelative(0.1f, -0.09f)
                lineTo(11.0f, 8.42f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.88f, 1.0f)
                close()
            }
        }
        return _arrowUpload!!
    }

private var _arrowUpload: ImageVector? = null
