

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.HomeMore: ImageVector
    get() {
        if (_homeMore != null) {
            return _homeMore!!
        }
        _homeMore = fluentIcon(name = "Regular.HomeMore") {
            fluentPath {
                moveTo(7.75f, 10.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(12.0f, 10.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(17.5f, 11.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(9.0f, 15.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(13.25f, 15.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 2.5f, 0.0f)
                close()
                moveTo(16.25f, 14.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 0.0f, -2.5f)
                close()
                moveTo(10.54f, 2.53f)
                curveToRelative(0.83f, -0.7f, 2.06f, -0.7f, 2.9f, 0.0f)
                lineToRelative(6.76f, 5.7f)
                curveToRelative(0.5f, 0.43f, 0.8f, 1.06f, 0.8f, 1.72f)
                verticalLineToRelative(9.3f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(4.75f, 21.0f)
                curveTo(3.78f, 21.0f, 3.0f, 20.22f, 3.0f, 19.25f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.66f, 0.3f, -1.3f, 0.8f, -1.72f)
                lineToRelative(6.74f, -5.7f)
                close()
                moveTo(12.47f, 3.68f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.96f, 0.0f)
                lineToRelative(-6.74f, 5.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.27f, 0.57f)
                verticalLineToRelative(9.3f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.22f, -0.1f, -0.43f, -0.27f, -0.57f)
                lineToRelative(-6.76f, -5.7f)
                close()
            }
        }
        return _homeMore!!
    }

private var _homeMore: ImageVector? = null
