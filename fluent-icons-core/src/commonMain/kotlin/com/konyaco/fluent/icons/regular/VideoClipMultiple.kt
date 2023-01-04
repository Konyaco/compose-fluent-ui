

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.VideoClipMultiple: ImageVector
    get() {
        if (_videoClipMultiple != null) {
            return _videoClipMultiple!!
        }
        _videoClipMultiple = fluentIcon(name = "Regular.VideoClipMultiple") {
            fluentPath {
                moveTo(8.0f, 7.75f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.6f, 0.66f, 0.95f, 1.15f, 0.63f)
                lineToRelative(4.62f, -2.96f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.84f)
                lineTo(9.15f, 7.12f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 8.0f, 7.75f)
                close()
                moveTo(5.25f, 3.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 2.0f, 6.25f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.8f, 1.46f, 3.25f, 3.25f, 3.25f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.8f, 0.0f, 3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineToRelative(-9.0f)
                curveTo(19.0f, 4.45f, 17.54f, 3.0f, 15.75f, 3.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 6.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineTo(5.25f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(5.01f, 19.5f)
                curveToRelative(0.58f, 0.9f, 1.59f, 1.5f, 2.74f, 1.5f)
                horizontalLineToRelative(8.5f)
                curveToRelative(2.9f, 0.0f, 5.25f, -2.35f, 5.25f, -5.25f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.15f, -0.6f, -2.16f, -1.5f, -2.74f)
                verticalLineToRelative(9.74f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -3.75f, 3.75f)
                horizontalLineTo(5.01f)
                close()
            }
        }
        return _videoClipMultiple!!
    }

private var _videoClipMultiple: ImageVector? = null
