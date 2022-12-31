

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CubeTree: ImageVector
    get() {
        if (_cubeTree != null) {
            return _cubeTree!!
        }
        _cubeTree = fluentIcon(name = "Filled.CubeTree") {
            fluentPath {
                moveTo(11.76f, 2.04f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.48f, 0.0f)
                lineToRelative(3.75f, 1.25f)
                curveToRelative(0.3f, 0.1f, 0.51f, 0.39f, 0.51f, 0.71f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.32f, -0.2f, 0.6f, -0.51f, 0.71f)
                lineToRelative(-3.24f, 1.08f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.75f)
                curveToRelative(1.24f, 0.0f, 2.25f, 1.0f, 2.25f, 2.25f)
                verticalLineToRelative(0.84f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.84f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.84f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.84f)
                curveToRelative(0.0f, -1.24f, 1.0f, -2.25f, 2.25f, -2.25f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-2.2f)
                lineTo(8.01f, 9.7f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.5f, 9.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.32f, 0.2f, -0.6f, 0.51f, -0.71f)
                lineToRelative(3.75f, -1.25f)
                close()
                moveTo(9.8f, 5.5f)
                curveToRelative(-0.13f, 0.4f, 0.08f, 0.82f, 0.47f, 0.95f)
                lineToRelative(0.99f, 0.33f)
                verticalLineToRelative(0.96f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-0.96f)
                lineToRelative(0.99f, -0.33f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.48f, -1.42f)
                lineTo(12.0f, 5.46f)
                lineToRelative(-1.26f, -0.42f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.95f, 0.47f)
                close()
            }
        }
        return _cubeTree!!
    }

private var _cubeTree: ImageVector? = null
