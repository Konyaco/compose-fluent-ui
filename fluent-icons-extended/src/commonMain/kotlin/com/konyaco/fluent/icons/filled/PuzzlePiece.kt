

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = fluentIcon(name = "Filled.PuzzlePiece") {
            fluentPath {
                moveTo(13.0f, 2.0f)
                curveToRelative(1.36f, 0.0f, 2.47f, 1.1f, 2.47f, 2.47f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1.53f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, false, -2.46f, 2.3f)
                lineToRelative(-0.01f, 0.17f)
                verticalLineToRelative(0.06f)
                curveToRelative(0.0f, 1.31f, 1.02f, 2.38f, 2.3f, 2.46f)
                lineToRelative(0.17f, 0.01f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-3.53f)
                verticalLineToRelative(0.53f)
                arcToRelative(2.47f, 2.47f, 0.0f, true, true, -4.94f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-3.53f)
                horizontalLineToRelative(-0.53f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, true, 0.0f, -4.94f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.53f)
                verticalLineToRelative(-0.53f)
                curveTo(10.53f, 3.11f, 11.63f, 2.0f, 13.0f, 2.0f)
                close()
            }
        }
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
