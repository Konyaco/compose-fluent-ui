

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageArrowCounterclockwise: ImageVector
    get() {
        if (_imageArrowCounterclockwise != null) {
            return _imageArrowCounterclockwise!!
        }
        _imageArrowCounterclockwise = fluentIcon(name = "Filled.ImageArrowCounterclockwise") {
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
                moveTo(17.5f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
                moveTo(13.0f, 6.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -9.0f, 6.0f)
                verticalLineToRelative(6.25f)
                curveToRelative(0.0f, 0.63f, 0.18f, 1.21f, 0.49f, 1.7f)
                lineToRelative(6.93f, -6.8f)
                lineToRelative(0.14f, -0.13f)
                curveToRelative(0.83f, -0.7f, 2.05f, -0.7f, 2.89f, 0.01f)
                lineToRelative(0.13f, 0.12f)
                lineToRelative(6.93f, 6.8f)
                curveToRelative(0.31f, -0.49f, 0.49f, -1.07f, 0.49f, -1.7f)
                lineTo(22.0f, 7.25f)
                curveTo(22.0f, 5.45f, 20.54f, 4.0f, 18.75f, 4.0f)
                lineTo(12.5f, 4.0f)
                curveToRelative(0.32f, 0.77f, 0.5f, 1.61f, 0.5f, 2.5f)
                close()
                moveTo(14.5f, 9.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -4.5f, 0.0f)
                close()
                moveTo(12.47f, 14.72f)
                lineTo(12.56f, 14.65f)
                curveToRelative(0.26f, -0.2f, 0.61f, -0.2f, 0.87f, -0.01f)
                lineToRelative(0.1f, 0.08f)
                lineToRelative(6.92f, 6.8f)
                curveToRelative(-0.5f, 0.3f, -1.08f, 0.48f, -1.7f, 0.48f)
                lineTo(7.25f, 22.0f)
                curveToRelative(-0.62f, 0.0f, -1.2f, -0.18f, -1.7f, -0.48f)
                lineToRelative(6.92f, -6.8f)
                close()
            }
        }
        return _imageArrowCounterclockwise!!
    }

private var _imageArrowCounterclockwise: ImageVector? = null
