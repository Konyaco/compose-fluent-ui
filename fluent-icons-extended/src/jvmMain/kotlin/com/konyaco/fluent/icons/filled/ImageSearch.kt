

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageSearch: ImageVector
    get() {
        if (_imageSearch != null) {
            return _imageSearch!!
        }
        _imageSearch = fluentIcon(name = "Filled.ImageSearch") {
            fluentPath {
                moveTo(16.5f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                close()
                moveTo(3.0f, 10.75f)
                verticalLineToRelative(-4.5f)
                curveTo(3.0f, 4.45f, 4.46f, 3.0f, 6.25f, 3.0f)
                horizontalLineToRelative(11.5f)
                curveTo(19.55f, 3.0f, 21.0f, 4.46f, 21.0f, 6.25f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.63f, -0.18f, 1.21f, -0.49f, 1.7f)
                lineToRelative(-6.93f, -6.8f)
                lineToRelative(-0.13f, -0.12f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.25f, -0.38f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -8.2f, -1.4f)
                close()
                moveTo(13.5f, 8.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, 4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -4.5f, 0.0f)
                close()
                moveTo(13.98f, 21.0f)
                curveToRelative(-0.05f, -0.36f, -0.21f, -0.7f, -0.5f, -0.99f)
                lineToRelative(-2.23f, -2.24f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, 0.55f, -4.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.63f, 0.11f)
                lineToRelative(0.1f, 0.08f)
                lineToRelative(6.92f, 6.8f)
                curveToRelative(-0.5f, 0.3f, -1.08f, 0.48f, -1.7f, 0.48f)
                horizontalLineToRelative(-3.77f)
                close()
                moveTo(9.95f, 17.89f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -1.15f, 0.98f)
                lineToRelative(2.92f, 2.91f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.83f, -2.83f)
                close()
                moveTo(6.5f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
            }
        }
        return _imageSearch!!
    }

private var _imageSearch: ImageVector? = null
