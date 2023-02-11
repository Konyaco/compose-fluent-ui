

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Merge: ImageVector
    get() {
        if (_merge != null) {
            return _merge!!
        }
        _merge = fluentIcon(name = "Filled.Merge") {
            fluentPath {
                moveTo(3.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 1.17f)
                lineToRelative(2.95f, 2.95f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.12f, 0.88f)
                horizontalLineToRelative(3.92f)
                lineTo(15.3f, 7.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.42f, -1.41f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.4f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.42f, -1.4f)
                lineToRelative(3.3f, -3.3f)
                horizontalLineToRelative(-3.97f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.08f, 0.88f)
                lineToRelative(-2.95f, 2.95f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.76f, 18.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                horizontalLineToRelative(2.76f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.41f, -0.59f)
                lineToRelative(2.95f, -2.95f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.54f, -0.46f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.54f, -0.46f)
                lineTo(8.17f, 8.59f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.76f, 8.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
            }
        }
        return _merge!!
    }

private var _merge: ImageVector? = null
