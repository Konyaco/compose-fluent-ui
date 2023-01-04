

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentMultiple: ImageVector
    get() {
        if (_documentMultiple != null) {
            return _documentMultiple!!
        }
        _documentMultiple = fluentIcon(name = "Regular.DocumentMultiple") {
            fluentPath {
                moveTo(4.0f, 4.25f)
                curveTo(4.0f, 3.01f, 5.0f, 2.0f, 6.25f, 2.0f)
                horizontalLineToRelative(4.38f)
                curveToRelative(0.6f, 0.0f, 1.17f, 0.24f, 1.6f, 0.66f)
                lineToRelative(4.61f, 4.62f)
                curveToRelative(0.42f, 0.42f, 0.66f, 1.0f, 0.66f, 1.59f)
                verticalLineToRelative(8.38f)
                curveToRelative(0.0f, 1.24f, -1.0f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(6.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineTo(16.0f, 9.0f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.01f, -2.25f, -2.25f)
                lineTo(10.5f, 3.5f)
                lineTo(6.25f, 3.5f)
                close()
                moveTo(12.0f, 4.56f)
                verticalLineToRelative(2.19f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(2.19f)
                lineTo(12.0f, 4.56f)
                close()
            }
            fluentPath {
                moveTo(6.63f, 20.5f)
                curveToRelative(0.3f, 0.87f, 1.14f, 1.5f, 2.12f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcTo(4.75f, 4.75f, 0.0f, false, false, 20.0f, 17.25f)
                verticalLineToRelative(-5.88f)
                curveToRelative(0.0f, -0.6f, -0.24f, -1.17f, -0.66f, -1.6f)
                lineToRelative(-0.84f, -0.83f)
                verticalLineToRelative(8.31f)
                curveToRelative(0.0f, 1.8f, -1.45f, 3.25f, -3.25f, 3.25f)
                horizontalLineTo(6.63f)
                close()
            }
        }
        return _documentMultiple!!
    }

private var _documentMultiple: ImageVector? = null
