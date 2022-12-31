

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.TextSortDescending: ImageVector
    get() {
        if (_textSortDescending != null) {
            return _textSortDescending!!
        }
        _textSortDescending = fluentIcon(name = "Filled.TextSortDescending") {
            fluentPath {
                moveTo(3.75f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(10.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.8f, 1.6f)
                lineTo(6.75f, 9.0f)
                lineTo(10.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                lineTo(4.75f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.8f, -1.6f)
                lineTo(8.0f, 4.0f)
                lineTo(4.75f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(7.98f, 12.67f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.9f, 0.0f)
                lineTo(3.3f, 20.74f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.89f, 0.66f)
                lineToRelative(0.4f, -1.2f)
                horizontalLineToRelative(2.88f)
                lineToRelative(0.41f, 1.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.9f, -0.66f)
                lineToRelative(-2.8f, -8.07f)
                close()
                moveTo(6.29f, 18.21f)
                lineToRelative(0.74f, -2.15f)
                lineToRelative(0.75f, 2.15f)
                lineTo(6.29f, 18.21f)
                close()
                moveTo(17.5f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(15.59f)
                lineToRelative(1.8f, -1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, 1.42f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.4f, 0.0f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.4f, -1.42f)
                lineToRelative(1.8f, 1.8f)
                lineTo(16.5f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        return _textSortDescending!!
    }

private var _textSortDescending: ImageVector? = null
