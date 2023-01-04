

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.TextSortAscending: ImageVector
    get() {
        if (_textSortAscending != null) {
            return _textSortAscending!!
        }
        _textSortAscending = fluentIcon(name = "Regular.TextSortAscending") {
            fluentPath {
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
                moveTo(7.77f, 2.49f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.4f, -0.01f)
                lineToRelative(-3.32f, 8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.4f, 0.54f)
                lineToRelative(0.79f, -2.02f)
                horizontalLineToRelative(3.55f)
                lineToRelative(0.76f, 2.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.4f, -0.52f)
                lineToRelative(-3.18f, -8.5f)
                close()
                moveTo(5.82f, 8.0f)
                lineToRelative(1.23f, -3.15f)
                lineTo(8.23f, 8.0f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(4.0f, 13.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(9.5f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.63f, 1.15f)
                lineTo(6.11f, 20.5f)
                lineTo(9.5f, 20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(4.75f, 22.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.63f, -1.15f)
                lineToRelative(4.02f, -6.35f)
                lineTo(4.75f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _textSortAscending!!
    }

private var _textSortAscending: ImageVector? = null
