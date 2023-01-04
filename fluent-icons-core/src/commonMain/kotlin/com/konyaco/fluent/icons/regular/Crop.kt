

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = fluentIcon(name = "Regular.Crop") {
            fluentPath {
                moveTo(21.25f, 17.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                horizontalLineTo(18.5f)
                verticalLineToRelative(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.1f)
                verticalLineTo(18.5f)
                horizontalLineTo(8.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.24f, -3.07f)
                lineToRelative(-0.01f, -0.18f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, -0.1f)
                verticalLineToRelative(12.6f)
                curveToRelative(0.0f, 0.92f, 0.7f, 1.67f, 1.6f, 1.74f)
                lineToRelative(0.15f, 0.01f)
                horizontalLineToRelative(12.5f)
                close()
                moveTo(8.0f, 5.5f)
                horizontalLineToRelative(7.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.24f, 3.07f)
                lineToRelative(0.01f, 0.18f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.75f)
                curveToRelative(0.0f, -0.92f, -0.7f, -1.67f, -1.6f, -1.74f)
                lineTo(15.24f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.5f)
                close()
            }
        }
        return _crop!!
    }

private var _crop: ImageVector? = null
