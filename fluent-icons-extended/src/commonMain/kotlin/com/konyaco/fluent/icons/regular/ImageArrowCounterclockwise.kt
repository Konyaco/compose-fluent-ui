

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ImageArrowCounterclockwise: ImageVector
    get() {
        if (_imageArrowCounterclockwise != null) {
            return _imageArrowCounterclockwise!!
        }
        _imageArrowCounterclockwise = fluentIcon(name = "Regular.ImageArrowCounterclockwise") {
            fluentPath {
                moveTo(12.0f, 6.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -11.0f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 11.0f, 0.0f)
                close()
                moveTo(4.0f, 3.5f)
                verticalLineToRelative(0.55f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, true, 6.0f, 2.45f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.19f, 2.24f)
                curveToRelative(-0.26f, -0.31f, 0.0f, -0.74f, 0.41f, -0.74f)
                curveToRelative(0.18f, 0.0f, 0.34f, 0.09f, 0.46f, 0.21f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 5.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(18.75f, 5.5f)
                horizontalLineToRelative(-5.83f)
                arcTo(6.45f, 6.45f, 0.0f, false, false, 12.5f, 4.0f)
                horizontalLineToRelative(6.25f)
                curveTo(20.55f, 4.0f, 22.0f, 5.46f, 22.0f, 7.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(7.25f, 22.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 4.0f, 18.75f)
                lineTo(4.0f, 12.5f)
                curveToRelative(0.47f, 0.2f, 0.98f, 0.34f, 1.5f, 0.42f)
                verticalLineToRelative(5.83f)
                curveToRelative(0.0f, 0.2f, 0.04f, 0.4f, 0.1f, 0.6f)
                lineToRelative(5.83f, -5.7f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.02f, -0.12f)
                lineToRelative(0.12f, 0.11f)
                lineToRelative(5.83f, 5.7f)
                curveToRelative(0.06f, -0.18f, 0.1f, -0.38f, 0.1f, -0.59f)
                lineTo(20.5f, 7.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(19.33f, 20.4f)
                lineTo(13.53f, 14.71f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.97f, -0.07f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-5.81f, 5.7f)
                curveToRelative(0.18f, 0.06f, 0.38f, 0.09f, 0.58f, 0.09f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.2f, 0.0f, 0.4f, -0.03f, 0.58f, -0.1f)
                close()
                moveTo(16.25f, 7.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -4.5f)
                close()
                moveTo(16.25f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        return _imageArrowCounterclockwise!!
    }

private var _imageArrowCounterclockwise: ImageVector? = null
