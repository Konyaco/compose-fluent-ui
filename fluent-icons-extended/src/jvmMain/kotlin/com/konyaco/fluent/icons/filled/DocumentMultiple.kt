

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.DocumentMultiple: ImageVector
    get() {
        if (_documentMultiple != null) {
            return _documentMultiple!!
        }
        _documentMultiple = fluentIcon(name = "Filled.DocumentMultiple") {
            fluentPath {
                moveTo(4.0f, 4.25f)
                curveTo(4.0f, 3.01f, 5.0f, 2.0f, 6.25f, 2.0f)
                horizontalLineToRelative(4.25f)
                verticalLineToRelative(4.75f)
                curveTo(10.5f, 7.99f, 11.51f, 9.0f, 12.75f, 9.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(8.25f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-13.0f)
                close()
            }
            fluentPath {
                moveTo(12.0f, 6.75f)
                verticalLineTo(2.47f)
                lineToRelative(0.22f, 0.19f)
                lineToRelative(4.62f, 4.62f)
                lineToRelative(0.2f, 0.22f)
                horizontalLineToRelative(-4.29f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
            fluentPath {
                moveTo(8.75f, 22.0f)
                curveToRelative(-0.98f, 0.0f, -1.81f, -0.63f, -2.12f, -1.5f)
                horizontalLineToRelative(8.62f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(8.94f)
                lineToRelative(0.84f, 0.84f)
                curveToRelative(0.42f, 0.42f, 0.66f, 1.0f, 0.66f, 1.59f)
                verticalLineToRelative(5.88f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 15.25f, 22.0f)
                horizontalLineToRelative(-6.5f)
                close()
            }
        }
        return _documentMultiple!!
    }

private var _documentMultiple: ImageVector? = null
