

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BoardHeart: ImageVector
    get() {
        if (_boardHeart != null) {
            return _boardHeart!!
        }
        _boardHeart = fluentIcon(name = "Filled.BoardHeart") {
            fluentPath {
                moveTo(11.5f, 21.0f)
                verticalLineToRelative(-1.93f)
                lineToRelative(-0.2f, -0.2f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, true, 0.2f, -6.7f)
                lineTo(11.5f, 9.5f)
                lineTo(3.0f, 9.5f)
                verticalLineToRelative(8.44f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 6.26f, 21.0f)
                horizontalLineToRelative(5.25f)
                close()
                moveTo(21.5f, 5.75f)
                verticalLineToRelative(5.73f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -4.5f, 0.3f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -4.0f, -0.52f)
                lineTo(13.0f, 2.5f)
                horizontalLineToRelative(5.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.25f, 3.06f)
                verticalLineToRelative(0.19f)
                close()
                moveTo(11.5f, 17.48f)
                arcToRelative(3.73f, 3.73f, 0.0f, false, true, 0.52f, -4.42f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 4.94f, 0.0f)
                lineToRelative(0.04f, 0.04f)
                lineToRelative(0.04f, -0.04f)
                lineToRelative(0.2f, -0.2f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 4.74f, 0.2f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, 0.0f, 5.11f)
                lineToRelative(-4.45f, 4.6f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-4.45f, -4.6f)
                curveToRelative(-0.2f, -0.21f, -0.38f, -0.44f, -0.52f, -0.69f)
                close()
                moveTo(11.5f, 8.0f)
                lineTo(11.5f, 2.5f)
                lineTo(6.25f, 2.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 5.75f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(8.5f)
                close()
            }
        }
        return _boardHeart!!
    }

private var _boardHeart: ImageVector? = null
