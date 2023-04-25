

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentFolder: ImageVector
    get() {
        if (_documentFolder != null) {
            return _documentFolder!!
        }
        _documentFolder = fluentIcon(name = "Filled.DocumentFolder") {
            fluentPath {
                moveTo(18.5f, 6.75f)
                verticalLineTo(4.63f)
                curveToRelative(0.87f, 0.3f, 1.5f, 1.14f, 1.5f, 2.12f)
                verticalLineToRelative(7.5f)
                curveToRelative(-0.38f, -0.16f, -0.8f, -0.25f, -1.25f, -0.25f)
                horizontalLineToRelative(-0.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(4.0f, 4.25f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.38f, -0.16f, 0.8f, -0.25f, 1.25f, -0.25f)
                horizontalLineTo(8.1f)
                curveToRelative(0.9f, 0.0f, 1.76f, 0.38f, 2.38f, 1.04f)
                lineTo(16.0f, 14.0f)
                horizontalLineToRelative(1.49f)
                verticalLineTo(4.25f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineToRelative(-9.0f)
                curveTo(5.01f, 2.0f, 4.0f, 3.0f, 4.0f, 4.25f)
                close()
                moveTo(5.25f, 8.0f)
                curveTo(4.01f, 8.0f, 3.0f, 9.0f, 3.0f, 10.25f)
                verticalLineToRelative(8.5f)
                curveTo(3.0f, 20.55f, 4.46f, 22.0f, 6.25f, 22.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.24f, -1.0f, -2.25f, -2.25f, -2.25f)
                horizontalLineTo(15.9f)
                curveToRelative(-0.2f, 0.0f, -0.4f, -0.09f, -0.55f, -0.24f)
                lineToRelative(-5.6f, -6.04f)
                arcTo(2.25f, 2.25f, 0.0f, false, false, 8.1f, 8.0f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        return _documentFolder!!
    }

private var _documentFolder: ImageVector? = null
