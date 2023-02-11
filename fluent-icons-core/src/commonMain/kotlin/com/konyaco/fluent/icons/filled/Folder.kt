

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = fluentIcon(name = "Filled.Folder") {
            fluentPath {
                moveTo(13.82f, 6.5f)
                horizontalLineToRelative(5.93f)
                curveToRelative(1.14f, 0.0f, 2.08f, 0.84f, 2.23f, 1.94f)
                lineToRelative(0.01f, 0.16f)
                lineToRelative(0.01f, 0.15f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.2f, -0.93f, 2.17f, -2.1f, 2.24f)
                lineToRelative(-0.15f, 0.01f)
                horizontalLineTo(4.25f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.93f, -2.24f, -2.1f)
                lineTo(2.0f, 17.75f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(6.4f)
                curveToRelative(0.4f, -0.04f, 0.77f, -0.18f, 1.1f, -0.4f)
                lineToRelative(0.15f, -0.12f)
                lineToRelative(4.17f, -3.48f)
                close()
                moveTo(8.21f, 4.0f)
                curveToRelative(0.46f, 0.0f, 0.9f, 0.14f, 1.28f, 0.4f)
                lineToRelative(0.16f, 0.12f)
                lineToRelative(2.1f, 1.75f)
                lineToRelative(-3.06f, 2.56f)
                lineToRelative(-0.09f, 0.06f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.29f, 0.1f)
                lineToRelative(-0.1f, 0.01f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.25f)
                curveToRelative(0.0f, -1.2f, 0.93f, -2.17f, 2.1f, -2.24f)
                lineTo(4.25f, 4.0f)
                horizontalLineToRelative(3.96f)
                close()
            }
        }
        return _folder!!
    }

private var _folder: ImageVector? = null
