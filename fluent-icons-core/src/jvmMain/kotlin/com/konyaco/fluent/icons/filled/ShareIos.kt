

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ShareIos: ImageVector
    get() {
        if (_shareIos != null) {
            return _shareIos!!
        }
        _shareIos = fluentIcon(name = "Filled.ShareIos") {
            fluentPath {
                moveTo(19.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.99f, 0.88f)
                verticalLineTo(18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.8f, 4.0f)
                horizontalLineTo(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.8f)
                verticalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, -0.12f)
                verticalLineTo(18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.85f, 2.0f)
                horizontalLineTo(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.99f, -1.85f)
                verticalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(6.29f, 7.29f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, -0.08f)
                lineToRelative(0.09f, 0.08f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.5f)
                lineToRelative(-0.09f, -0.09f)
                lineToRelative(-3.3f, -3.28f)
                verticalLineToRelative(9.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.88f, 1.0f)
                horizontalLineTo(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                verticalLineTo(5.41f)
                lineToRelative(-3.3f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 0.08f)
                lineToRelative(-0.1f, -0.09f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.07f, -1.32f)
                lineToRelative(0.08f, -0.1f)
                lineToRelative(5.0f, -4.99f)
                lineToRelative(-5.0f, 5.0f)
                close()
            }
        }
        return _shareIos!!
    }

private var _shareIos: ImageVector? = null
