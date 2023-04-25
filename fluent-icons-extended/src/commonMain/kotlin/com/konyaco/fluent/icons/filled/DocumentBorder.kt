

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentBorder: ImageVector
    get() {
        if (_documentBorder != null) {
            return _documentBorder!!
        }
        _documentBorder = fluentIcon(name = "Filled.DocumentBorder") {
            fluentPath {
                moveTo(7.25f, 2.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 4.0f, 5.25f)
                verticalLineToRelative(13.5f)
                curveTo(4.0f, 20.55f, 5.46f, 22.0f, 7.25f, 22.0f)
                horizontalLineToRelative(9.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(5.25f)
                curveTo(20.0f, 3.45f, 18.54f, 2.0f, 16.75f, 2.0f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(5.5f, 5.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-9.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(8.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        return _documentBorder!!
    }

private var _documentBorder: ImageVector? = null
