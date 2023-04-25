

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = fluentIcon(name = "Filled.Home") {
            fluentPath {
                moveTo(13.45f, 2.53f)
                curveToRelative(-0.84f, -0.7f, -2.06f, -0.7f, -2.9f, 0.0f)
                lineTo(3.8f, 8.23f)
                curveToRelative(-0.5f, 0.43f, -0.8f, 1.05f, -0.8f, 1.72f)
                verticalLineToRelative(9.3f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.68f, 0.54f, -1.23f, 1.22f, -1.25f)
                horizontalLineToRelative(2.56f)
                curveToRelative(0.68f, 0.02f, 1.22f, 0.57f, 1.22f, 1.25f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-9.3f)
                curveToRelative(0.0f, -0.67f, -0.3f, -1.3f, -0.8f, -1.72f)
                lineToRelative(-6.75f, -5.7f)
                close()
            }
        }
        return _home!!
    }

private var _home: ImageVector? = null
