

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowDownload: ImageVector
    get() {
        if (_arrowDownload != null) {
            return _arrowDownload!!
        }
        _arrowDownload = fluentIcon(name = "Filled.ArrowDownload") {
            fluentPath {
                moveTo(5.25f, 20.5f)
                horizontalLineToRelative(13.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(13.6f)
                horizontalLineToRelative(-13.5f)
                close()
                moveTo(11.88f, 2.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 0.88f)
                verticalLineTo(15.59f)
                lineToRelative(3.3f, -3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.31f, -0.08f)
                lineToRelative(0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.08f, 1.32f)
                lineToRelative(-0.08f, 0.1f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.08f)
                lineToRelative(-0.1f, -0.09f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -1.49f)
                lineToRelative(0.1f, 0.08f)
                lineTo(11.0f, 15.6f)
                verticalLineTo(2.98f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.88f, -0.99f)
                horizontalLineTo(12.0f)
                horizontalLineToRelative(-0.12f)
                close()
            }
        }
        return _arrowDownload!!
    }

private var _arrowDownload: ImageVector? = null
