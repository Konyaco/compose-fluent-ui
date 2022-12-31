

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.ImageSearch: ImageVector
    get() {
        if (_imageSearch != null) {
            return _imageSearch!!
        }
        _imageSearch = fluentIcon(name = "Regular.ImageSearch") {
            fluentPath {
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.45f, 19.54f, 3.0f, 17.75f, 3.0f)
                lineTo(6.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 3.0f, 6.25f)
                verticalLineToRelative(4.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 1.5f, -0.88f)
                lineTo(4.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.2f, -0.04f, 0.4f, -0.1f, 0.6f)
                lineToRelative(-5.83f, -5.7f)
                lineToRelative(-0.12f, -0.12f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -2.25f, -0.38f)
                curveToRelative(0.26f, 0.42f, 0.46f, 0.89f, 0.6f, 1.38f)
                curveToRelative(0.25f, -0.07f, 0.53f, 0.0f, 0.72f, 0.18f)
                lineToRelative(5.81f, 5.7f)
                curveToRelative(-0.18f, 0.06f, -0.38f, 0.09f, -0.58f, 0.09f)
                horizontalLineToRelative(-4.78f)
                lineToRelative(0.52f, 0.51f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.63f, 0.5f, 0.99f)
                horizontalLineToRelative(3.76f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                lineTo(21.0f, 6.25f)
                close()
                moveTo(17.5f, 8.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, false, -4.5f, 0.0f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, 4.5f, 0.0f)
                close()
                moveTo(14.5f, 8.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
                moveTo(9.95f, 17.9f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -1.15f, 0.98f)
                lineToRelative(2.92f, 2.91f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.83f, -2.83f)
                close()
                moveTo(6.5f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        return _imageSearch!!
    }

private var _imageSearch: ImageVector? = null
