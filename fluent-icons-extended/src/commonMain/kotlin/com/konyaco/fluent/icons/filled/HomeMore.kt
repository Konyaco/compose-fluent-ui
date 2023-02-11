

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HomeMore: ImageVector
    get() {
        if (_homeMore != null) {
            return _homeMore!!
        }
        _homeMore = fluentIcon(name = "Filled.HomeMore") {
            fluentPath {
                moveTo(13.44f, 2.53f)
                curveToRelative(-0.84f, -0.7f, -2.07f, -0.7f, -2.9f, 0.0f)
                lineTo(3.8f, 8.23f)
                curveTo(3.3f, 8.66f, 3.0f, 9.3f, 3.0f, 9.95f)
                verticalLineToRelative(9.3f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.66f, -0.3f, -1.3f, -0.8f, -1.72f)
                lineToRelative(-6.76f, -5.7f)
                close()
                moveTo(9.0f, 11.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(13.25f, 11.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(17.5f, 11.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(9.0f, 15.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, 2.5f)
                close()
                moveTo(16.25f, 17.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, 2.5f)
                close()
            }
        }
        return _homeMore!!
    }

private var _homeMore: ImageVector? = null
