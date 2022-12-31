

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.IosArrowRtl: ImageVector
    get() {
        if (_iosArrowRtl != null) {
            return _iosArrowRtl!!
        }
        _iosArrowRtl = fluentIcon(name = "Filled.IosArrowRtl") {
            fluentPath {
                moveTo(11.27f, 3.69f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.46f, -1.38f)
                lineToRelative(8.5f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.38f)
                lineToRelative(-8.5f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.46f, -1.38f)
                lineTo(19.12f, 12.0f)
                lineToRelative(-7.85f, -8.31f)
                close()
            }
        }
        return _iosArrowRtl!!
    }

private var _iosArrowRtl: ImageVector? = null
