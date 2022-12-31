

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = fluentIcon(name = "Regular.Archive") {
            fluentPath {
                moveTo(10.25f, 11.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(3.0f, 5.25f)
                curveTo(3.0f, 4.01f, 4.0f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(13.5f)
                curveTo(19.99f, 3.0f, 21.0f, 4.0f, 21.0f, 5.25f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.78f, -0.4f, 1.47f, -1.0f, 1.87f)
                verticalLineToRelative(8.63f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 16.25f, 21.0f)
                horizontalLineToRelative(-8.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, true, 4.0f, 17.25f)
                lineTo(4.0f, 8.62f)
                curveToRelative(-0.6f, -0.4f, -1.0f, -1.09f, -1.0f, -1.87f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(5.5f, 9.0f)
                verticalLineToRelative(8.25f)
                curveToRelative(0.0f, 1.24f, 1.0f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.0f, 2.25f, -2.25f)
                lineTo(18.5f, 9.0f)
                horizontalLineToRelative(-13.0f)
                close()
                moveTo(5.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(5.25f, 4.5f)
                close()
            }
        }
        return _archive!!
    }

private var _archive: ImageVector? = null
