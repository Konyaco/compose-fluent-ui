

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = fluentIcon(name = "Filled.Image") {
            fluentPath {
                moveToRelative(11.56f, 13.65f)
                lineToRelative(-0.09f, 0.07f)
                lineToRelative(-6.92f, 6.8f)
                curveToRelative(0.5f, 0.3f, 1.08f, 0.48f, 1.7f, 0.48f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.62f, 0.0f, 1.2f, -0.18f, 1.7f, -0.48f)
                lineToRelative(-6.92f, -6.8f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.87f, 0.0f)
                close()
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.63f, 0.18f, 1.21f, 0.49f, 1.7f)
                lineToRelative(6.93f, -6.8f)
                lineToRelative(0.14f, -0.13f)
                curveToRelative(0.83f, -0.7f, 2.05f, -0.7f, 2.89f, 0.01f)
                lineToRelative(0.13f, 0.12f)
                lineToRelative(6.93f, 6.8f)
                curveToRelative(0.31f, -0.49f, 0.49f, -1.07f, 0.49f, -1.7f)
                lineTo(21.0f, 6.25f)
                close()
                moveTo(15.25f, 10.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        return _image!!
    }

private var _image: ImageVector? = null
