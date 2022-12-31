

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.ImageCopy: ImageVector
    get() {
        if (_imageCopy != null) {
            return _imageCopy!!
        }
        _imageCopy = fluentIcon(name = "Filled.ImageCopy") {
            fluentPath {
                moveTo(4.5f, 6.0f)
                curveTo(3.6f, 6.59f, 3.0f, 7.6f, 3.0f, 8.76f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 2.9f, 2.35f, 5.25f, 5.25f, 5.25f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.15f, 0.0f, 2.17f, -0.6f, 2.74f, -1.5f)
                lineTo(8.25f, 19.01f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.75f, -3.75f)
                verticalLineToRelative(-9.0f)
                verticalLineToRelative(-0.24f)
                close()
                moveTo(12.57f, 12.15f)
                lineToRelative(-0.1f, 0.08f)
                lineToRelative(-5.39f, 5.31f)
                curveToRelative(0.49f, 0.3f, 1.06f, 0.46f, 1.67f, 0.46f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.62f, 0.0f, 1.2f, -0.17f, 1.7f, -0.48f)
                lineToRelative(-5.42f, -5.3f)
                lineToRelative(-0.09f, -0.07f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.77f, -0.06f)
                lineToRelative(-0.1f, 0.06f)
                close()
                moveTo(8.75f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.5f, 6.25f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 0.64f, 0.19f, 1.24f, 0.5f, 1.74f)
                lineToRelative(5.42f, -5.33f)
                lineToRelative(0.13f, -0.12f)
                curveToRelative(0.83f, -0.7f, 2.06f, -0.7f, 2.9f, 0.0f)
                lineToRelative(0.13f, 0.11f)
                lineTo(20.0f, 16.47f)
                curveToRelative(0.31f, -0.5f, 0.49f, -1.09f, 0.49f, -1.72f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -1.8f, -1.46f, -3.25f, -3.25f, -3.25f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(9.5f, 5.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
            }
        }
        return _imageCopy!!
    }

private var _imageCopy: ImageVector? = null
