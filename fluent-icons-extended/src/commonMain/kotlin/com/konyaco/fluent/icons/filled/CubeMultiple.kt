

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CubeMultiple: ImageVector
    get() {
        if (_cubeMultiple != null) {
            return _cubeMultiple!!
        }
        _cubeMultiple = fluentIcon(name = "Filled.CubeMultiple") {
            fluentPath {
                moveTo(10.52f, 4.25f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 3.07f, 0.04f)
                lineToRelative(5.91f, 2.1f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.0f, 0.59f)
                verticalLineToRelative(-0.42f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.33f, -1.88f)
                lineTo(14.0f, 2.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.02f, 0.0f)
                lineTo(4.83f, 4.68f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.5f, 6.56f)
                verticalLineToRelative(0.42f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.0f, -0.6f)
                lineToRelative(5.91f, -2.1f)
                curveToRelative(0.04f, 0.0f, 0.07f, -0.02f, 0.1f, -0.03f)
                close()
                moveTo(13.25f, 5.23f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -2.5f, 0.0f)
                lineToRelative(-5.92f, 2.1f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.5f, 9.2f)
                verticalLineToRelative(8.24f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.33f, 1.88f)
                lineToRelative(5.92f, 2.1f)
                curveToRelative(0.8f, 0.29f, 1.7f, 0.29f, 2.5f, 0.0f)
                lineToRelative(5.92f, -2.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.33f, -1.88f)
                lineTo(20.5f, 9.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.33f, -1.88f)
                lineToRelative(-5.92f, -2.1f)
                close()
                moveTo(6.45f, 10.11f)
                curveToRelative(0.14f, -0.39f, 0.57f, -0.6f, 0.96f, -0.45f)
                lineTo(12.0f, 11.29f)
                lineToRelative(4.6f, -1.63f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.5f, 1.4f)
                lineToRelative(-4.35f, 1.55f)
                verticalLineToRelative(4.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-4.72f)
                lineToRelative(-4.34f, -1.54f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.46f, -0.96f)
                close()
            }
        }
        return _cubeMultiple!!
    }

private var _cubeMultiple: ImageVector? = null
