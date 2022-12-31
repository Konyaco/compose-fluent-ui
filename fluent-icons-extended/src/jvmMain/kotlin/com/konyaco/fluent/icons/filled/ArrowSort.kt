

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ArrowSort: ImageVector
    get() {
        if (_arrowSort != null) {
            return _arrowSort!!
        }
        _arrowSort = fluentIcon(name = "Filled.ArrowSort") {
            fluentPath {
                moveTo(6.29f, 4.3f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-0.08f, 0.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.08f, 1.32f)
                lineToRelative(0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -0.08f)
                lineTo(6.0f, 7.4f)
                verticalLineToRelative(11.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 0.9f)
                lineToRelative(0.1f, -0.02f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.9f, -0.99f)
                verticalLineTo(7.42f)
                lineToRelative(2.28f, 2.29f)
                lineToRelative(0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -1.5f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 0.08f)
                close()
                moveTo(17.0f, 4.0f)
                lineToRelative(-0.12f, 0.01f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.88f, 1.0f)
                verticalLineToRelative(11.57f)
                lineToRelative(-2.3f, -2.29f)
                lineToRelative(-0.09f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 1.5f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(0.1f, 0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.32f, -0.08f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.08f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.08f, -1.32f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.32f, 0.08f)
                lineTo(18.0f, 16.6f)
                verticalLineTo(4.89f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 4.0f)
                close()
            }
        }
        return _arrowSort!!
    }

private var _arrowSort: ImageVector? = null
