

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ArrowSquareDown: ImageVector
    get() {
        if (_arrowSquareDown != null) {
            return _arrowSquareDown!!
        }
        _arrowSquareDown = fluentIcon(name = "Regular.ArrowSquareDown") {
            fluentPath {
                moveTo(16.53f, 11.72f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 0.07f)
                lineToRelative(-2.72f, 2.72f)
                verticalLineTo(7.65f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 12.0f, 7.0f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.65f, 0.75f)
                verticalLineToRelative(6.7f)
                lineToRelative(-2.72f, -2.73f)
                lineToRelative(-0.08f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.98f, 1.13f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(0.08f, 0.07f)
                curveToRelative(0.3f, 0.22f, 0.71f, 0.2f, 0.98f, -0.07f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(0.07f, -0.08f)
                curveToRelative(0.22f, -0.3f, 0.2f, -0.71f, -0.07f, -0.98f)
                close()
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineTo(6.25f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineTo(6.25f)
                close()
            }
        }
        return _arrowSquareDown!!
    }

private var _arrowSquareDown: ImageVector? = null
