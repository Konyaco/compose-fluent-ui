

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.DocumentCopy: ImageVector
    get() {
        if (_documentCopy != null) {
            return _documentCopy!!
        }
        _documentCopy = fluentIcon(name = "Regular.DocumentCopy") {
            fluentPath {
                moveTo(5.5f, 4.63f)
                lineTo(5.5f, 17.25f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(8.62f)
                curveToRelative(-0.31f, 0.88f, -1.15f, 1.5f, -2.13f, 1.5f)
                lineTo(8.75f, 22.0f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 4.0f, 17.25f)
                lineTo(4.0f, 6.75f)
                curveToRelative(0.0f, -0.98f, 0.63f, -1.81f, 1.5f, -2.12f)
                close()
                moveTo(13.13f, 2.0f)
                curveToRelative(0.6f, 0.0f, 1.17f, 0.24f, 1.59f, 0.66f)
                lineToRelative(4.62f, 4.62f)
                curveToRelative(0.42f, 0.42f, 0.66f, 1.0f, 0.66f, 1.6f)
                verticalLineToRelative(8.37f)
                curveToRelative(0.0f, 1.25f, -1.01f, 2.25f, -2.25f, 2.25f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-1.24f, 0.0f, -2.25f, -1.0f, -2.25f, -2.25f)
                verticalLineToRelative(-13.0f)
                curveTo(6.5f, 3.01f, 7.51f, 2.0f, 8.75f, 2.0f)
                horizontalLineToRelative(4.38f)
                close()
                moveTo(13.0f, 3.5f)
                lineTo(8.75f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.42f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.33f, 0.75f, -0.75f)
                lineTo(18.5f, 9.0f)
                horizontalLineToRelative(-3.25f)
                curveToRelative(-1.2f, 0.0f, -2.17f, -0.92f, -2.24f, -2.1f)
                lineTo(13.0f, 6.76f)
                lineTo(13.0f, 3.5f)
                close()
                moveTo(14.5f, 4.56f)
                verticalLineToRelative(2.2f)
                curveToRelative(0.0f, 0.37f, 0.28f, 0.69f, 0.65f, 0.74f)
                horizontalLineToRelative(2.29f)
                lineTo(14.5f, 4.56f)
                close()
            }
        }
        return _documentCopy!!
    }

private var _documentCopy: ImageVector? = null
