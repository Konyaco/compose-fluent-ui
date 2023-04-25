

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = fluentIcon(name = "Regular.Image") {
            fluentPath {
                moveTo(17.75f, 3.0f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 21.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 17.75f)
                lineTo(3.0f, 6.25f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(18.33f, 19.4f)
                lineTo(12.53f, 13.71f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.97f, -0.07f)
                lineToRelative(-0.08f, 0.07f)
                lineToRelative(-5.81f, 5.7f)
                curveToRelative(0.18f, 0.06f, 0.38f, 0.09f, 0.58f, 0.09f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.2f, 0.0f, 0.4f, -0.03f, 0.58f, -0.1f)
                lineToRelative(-5.8f, -5.69f)
                lineToRelative(5.8f, 5.7f)
                close()
                moveTo(17.75f, 4.5f)
                lineTo(6.25f, 4.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.2f, 0.04f, 0.4f, 0.1f, 0.6f)
                lineToRelative(5.83f, -5.7f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.02f, -0.12f)
                lineToRelative(0.12f, 0.11f)
                lineToRelative(5.83f, 5.7f)
                curveToRelative(0.06f, -0.18f, 0.1f, -0.38f, 0.1f, -0.59f)
                lineTo(19.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                close()
                moveTo(15.25f, 6.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 4.5f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, -4.5f)
                close()
                moveTo(15.25f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        return _image!!
    }

private var _image: ImageVector? = null
