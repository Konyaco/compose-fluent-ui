

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageProhibited: ImageVector
    get() {
        if (_imageProhibited != null) {
            return _imageProhibited!!
        }
        _imageProhibited = fluentIcon(name = "Filled.ImageProhibited") {
            fluentPath {
                moveTo(6.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(6.5f, 10.5f)
                curveToRelative(-0.83f, 0.0f, -1.6f, -0.25f, -2.25f, -0.7f)
                lineToRelative(5.56f, -5.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, 6.25f)
                close()
                moveTo(3.2f, 8.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.56f, -5.56f)
                lineTo(3.18f, 8.75f)
                close()
                moveTo(16.5f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
                moveTo(6.5f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 5.48f, -10.0f)
                horizontalLineToRelative(5.77f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.63f, -0.18f, 1.21f, -0.49f, 1.7f)
                lineToRelative(-6.93f, -6.8f)
                lineToRelative(-0.13f, -0.12f)
                curveToRelative(-0.83f, -0.7f, -2.06f, -0.7f, -2.9f, 0.0f)
                lineToRelative(-0.13f, 0.12f)
                lineToRelative(-6.93f, 6.8f)
                curveToRelative(-0.31f, -0.49f, -0.49f, -1.07f, -0.49f, -1.7f)
                verticalLineToRelative(-5.77f)
                arcTo(6.47f, 6.47f, 0.0f, false, false, 6.5f, 13.0f)
                close()
                moveTo(13.5f, 8.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -4.5f, 0.0f)
                close()
                moveTo(11.56f, 13.65f)
                lineTo(11.47f, 13.72f)
                lineTo(4.55f, 20.52f)
                curveToRelative(0.5f, 0.3f, 1.08f, 0.48f, 1.7f, 0.48f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.62f, 0.0f, 1.2f, -0.18f, 1.7f, -0.48f)
                lineToRelative(-6.92f, -6.8f)
                lineToRelative(-0.1f, -0.08f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.87f, 0.0f)
                close()
            }
        }
        return _imageProhibited!!
    }

private var _imageProhibited: ImageVector? = null
