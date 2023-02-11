

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HandRight: ImageVector
    get() {
        if (_handRight != null) {
            return _handRight!!
        }
        _handRight = fluentIcon(name = "Filled.HandRight") {
            fluentPath {
                moveTo(10.0f, 4.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(8.75f)
                curveToRelative(0.0f, 2.18f, 1.17f, 4.51f, 1.91f, 5.8f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.54f, 22.0f)
                horizontalLineToRelative(2.16f)
                curveToRelative(1.24f, 0.0f, 2.36f, -0.7f, 2.91f, -1.8f)
                lineToRelative(0.14f, -0.26f)
                curveToRelative(0.42f, -0.84f, 0.94f, -1.63f, 1.56f, -2.34f)
                lineToRelative(2.2f, -2.55f)
                lineToRelative(2.2f, -1.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.29f, -0.6f)
                curveToRelative(0.0f, -0.48f, -0.26f, -0.84f, -0.6f, -1.06f)
                curveToRelative(-0.29f, -0.2f, -0.64f, -0.27f, -0.95f, -0.31f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, -2.1f, 0.13f)
                curveToRelative(-0.5f, 0.1f, -0.97f, 0.3f, -1.35f, 0.5f)
                verticalLineTo(4.26f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(6.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(4.25f)
                close()
            }
        }
        return _handRight!!
    }

private var _handRight: ImageVector? = null
