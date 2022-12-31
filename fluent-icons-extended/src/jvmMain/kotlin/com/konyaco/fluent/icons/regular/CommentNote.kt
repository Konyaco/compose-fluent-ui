

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.CommentNote: ImageVector
    get() {
        if (_commentNote != null) {
            return _commentNote!!
        }
        _commentNote = fluentIcon(name = "Regular.CommentNote") {
            fluentPath {
                moveTo(12.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(14.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(14.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
            fluentPath {
                moveTo(5.25f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(5.25f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(3.75f)
                lineToRelative(5.01f, -3.75f)
                horizontalLineToRelative(6.24f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.0f, -0.17f)
                verticalLineToRelative(2.92f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.74f)
                lineTo(8.0f, 21.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.0f, -1.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-0.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 14.75f)
                verticalLineToRelative(-8.5f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                close()
            }
        }
        return _commentNote!!
    }

private var _commentNote: ImageVector? = null
