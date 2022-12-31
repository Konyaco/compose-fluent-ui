

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.SquareArrowForward: ImageVector
    get() {
        if (_squareArrowForward != null) {
            return _squareArrowForward!!
        }
        _squareArrowForward = fluentIcon(name = "Filled.SquareArrowForward") {
            fluentPath {
                moveTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveTo(3.0f, 19.55f, 4.46f, 21.0f, 6.25f, 21.0f)
                horizontalLineToRelative(5.77f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 21.0f, 12.02f)
                lineTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                close()
                moveTo(12.0f, 17.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -11.0f, 0.0f)
                close()
                moveTo(18.65f, 15.35f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.7f, -0.7f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.5f, 0.0f, 0.7f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.7f, -0.7f)
                lineToRelative(0.64f, -0.65f)
                horizontalLineToRelative(-2.04f)
                curveTo(16.01f, 17.0f, 15.0f, 18.0f, 15.0f, 19.25f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0.0f, -1.8f, 1.46f, -3.25f, 3.25f, -3.25f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-0.64f, -0.65f)
                close()
            }
        }
        return _squareArrowForward!!
    }

private var _squareArrowForward: ImageVector? = null
