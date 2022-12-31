

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.VideoClipMultiple: ImageVector
    get() {
        if (_videoClipMultiple != null) {
            return _videoClipMultiple!!
        }
        _videoClipMultiple = fluentIcon(name = "Filled.VideoClipMultiple") {
            fluentPath {
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
                moveTo(8.0f, 13.25f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.6f, 0.66f, -0.95f, 1.15f, -0.63f)
                lineToRelative(4.62f, 2.96f)
                curveToRelative(0.31f, 0.2f, 0.31f, 0.64f, 0.0f, 0.84f)
                lineToRelative(-4.62f, 2.96f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 13.25f)
                close()
                moveTo(7.75f, 21.0f)
                curveToRelative(-1.15f, 0.0f, -2.16f, -0.6f, -2.74f, -1.5f)
                horizontalLineToRelative(11.24f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 20.0f, 15.75f)
                verticalLineTo(6.01f)
                curveToRelative(0.9f, 0.58f, 1.5f, 1.59f, 1.5f, 2.74f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
                horizontalLineToRelative(-8.5f)
                close()
            }
        }
        return _videoClipMultiple!!
    }

private var _videoClipMultiple: ImageVector? = null
