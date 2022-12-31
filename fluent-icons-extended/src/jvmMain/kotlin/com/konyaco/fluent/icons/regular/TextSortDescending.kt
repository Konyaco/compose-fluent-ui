

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextSortDescending: ImageVector
    get() {
        if (_textSortDescending != null) {
            return _textSortDescending!!
        }
        _textSortDescending = fluentIcon(name = "Regular.TextSortDescending") {
            fluentPath {
                moveTo(4.0f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(9.5f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.63f, 1.15f)
                lineTo(6.11f, 9.5f)
                lineTo(9.5f, 9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(4.75f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.63f, -1.15f)
                lineTo(8.14f, 3.5f)
                lineTo(4.75f, 3.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 2.75f)
                close()
                moveTo(6.37f, 12.48f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.4f, 0.0f)
                lineToRelative(3.18f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.4f, 0.53f)
                lineToRelative(-0.76f, -2.01f)
                lineTo(5.24f, 19.5f)
                lineToRelative(-0.8f, 2.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.39f, -0.54f)
                lineToRelative(3.32f, -8.5f)
                close()
                moveTo(8.23f, 18.0f)
                lineToRelative(-1.18f, -3.15f)
                lineTo(5.82f, 18.0f)
                horizontalLineToRelative(2.41f)
                close()
                moveTo(17.25f, 2.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(16.69f)
                lineToRelative(2.22f, -2.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.5f, 3.5f)
                curveToRelative(-0.3f, 0.3f, -0.77f, 0.3f, -1.06f, 0.0f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.22f, 2.22f)
                lineTo(16.5f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
            }
        }
        return _textSortDescending!!
    }

private var _textSortDescending: ImageVector? = null
