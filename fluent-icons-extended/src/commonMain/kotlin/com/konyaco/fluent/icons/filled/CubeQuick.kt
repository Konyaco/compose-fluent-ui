

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CubeQuick: ImageVector
    get() {
        if (_cubeQuick != null) {
            return _cubeQuick!!
        }
        _cubeQuick = fluentIcon(name = "Filled.CubeQuick") {
            fluentPath {
                moveTo(15.6f, 6.22f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.8f, 0.0f)
                lineToRelative(3.5f, 1.76f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 9.77f)
                verticalLineToRelative(4.46f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.1f, 1.79f)
                lineToRelative(-3.5f, 1.77f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.8f, 0.0f)
                lineToRelative(-3.5f, -1.77f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.1f, -1.79f)
                lineTo(11.0f, 9.77f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.1f, -1.79f)
                lineToRelative(3.5f, -1.76f)
                close()
                moveTo(13.58f, 10.41f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.33f, 1.0f)
                lineToRelative(1.84f, 0.94f)
                verticalLineToRelative(1.9f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.9f)
                lineToRelative(1.84f, -0.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.68f, -1.33f)
                lineToRelative(-1.91f, 0.97f)
                lineToRelative(-1.91f, -0.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.0f, 0.33f)
                close()
                moveTo(4.75f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(2.75f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(4.0f, 15.75f)
                curveToRelative(0.0f, -0.42f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        return _cubeQuick!!
    }

private var _cubeQuick: ImageVector? = null
