

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.LeafOne: ImageVector
    get() {
        if (_leafOne != null) {
            return _leafOne!!
        }
        _leafOne = fluentIcon(name = "Regular.LeafOne") {
            fluentPath {
                moveTo(13.24f, 3.27f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -2.48f, 0.0f)
                lineToRelative(-3.7f, 3.71f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 4.19f, 11.91f)
                verticalLineToRelative(2.36f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-2.36f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 16.95f, 7.0f)
                lineToRelative(-3.71f, -3.72f)
                close()
                moveTo(12.75f, 17.38f)
                verticalLineToRelative(-5.63f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(5.63f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -3.14f, -9.34f)
                lineToRelative(3.71f, -3.7f)
                curveToRelative(0.1f, -0.1f, 0.26f, -0.1f, 0.36f, 0.0f)
                lineToRelative(3.7f, 3.7f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -3.13f, 9.34f)
                close()
            }
        }
        return _leafOne!!
    }

private var _leafOne: ImageVector? = null
