

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ImageArrowForward: ImageVector
    get() {
        if (_imageArrowForward != null) {
            return _imageArrowForward!!
        }
        _imageArrowForward = fluentIcon(name = "Regular.ImageArrowForward") {
            fluentPath {
                moveTo(1.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -11.0f, 0.0f)
                close()
                moveTo(7.65f, 4.35f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.7f, -0.7f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.5f, 0.0f, 0.7f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.7f, -0.7f)
                lineTo(8.29f, 6.0f)
                lineTo(6.25f, 6.0f)
                curveTo(5.01f, 6.0f, 4.0f, 7.0f, 4.0f, 8.25f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-0.25f)
                curveTo(3.0f, 6.45f, 4.46f, 5.0f, 6.25f, 5.0f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-0.64f, -0.65f)
                close()
                moveTo(3.0f, 11.98f)
                curveToRelative(0.46f, 0.3f, 0.97f, 0.53f, 1.5f, 0.7f)
                verticalLineToRelative(5.07f)
                curveToRelative(0.0f, 0.2f, 0.04f, 0.4f, 0.1f, 0.6f)
                lineToRelative(5.83f, -5.7f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.02f, -0.12f)
                lineToRelative(0.12f, 0.11f)
                lineToRelative(5.83f, 5.7f)
                curveToRelative(0.06f, -0.18f, 0.1f, -0.38f, 0.1f, -0.59f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-5.06f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, -0.71f, -1.5f)
                horizontalLineToRelative(5.77f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                verticalLineToRelative(-5.77f)
                close()
                moveTo(18.33f, 19.4f)
                lineTo(12.53f, 13.71f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.97f, -0.07f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-5.81f, 5.7f)
                curveToRelative(0.18f, 0.06f, 0.38f, 0.09f, 0.58f, 0.09f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.2f, 0.0f, 0.4f, -0.03f, 0.58f, -0.1f)
                close()
                moveTo(15.25f, 6.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -4.5f)
                close()
                moveTo(15.25f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        return _imageArrowForward!!
    }

private var _imageArrowForward: ImageVector? = null
