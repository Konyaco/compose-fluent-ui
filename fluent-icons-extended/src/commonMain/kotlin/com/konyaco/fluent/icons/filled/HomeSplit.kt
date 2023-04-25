

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.HomeSplit: ImageVector
    get() {
        if (_homeSplit != null) {
            return _homeSplit!!
        }
        _homeSplit = fluentIcon(name = "Filled.HomeSplit") {
            fluentPath {
                moveTo(13.45f, 2.53f)
                curveToRelative(-0.84f, -0.7f, -2.06f, -0.7f, -2.9f, 0.0f)
                lineTo(3.8f, 8.23f)
                curveToRelative(-0.5f, 0.43f, -0.8f, 1.05f, -0.8f, 1.72f)
                verticalLineToRelative(9.3f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.67f, -0.3f, -1.3f, -0.8f, -1.72f)
                lineToRelative(-6.75f, -5.7f)
                close()
                moveTo(12.75f, 6.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(12.0f, 10.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                close()
                moveTo(12.75f, 16.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
            }
        }
        return _homeSplit!!
    }

private var _homeSplit: ImageVector? = null
