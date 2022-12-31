

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = fluentIcon(name = "Regular.Laptop") {
            fluentPath {
                moveTo(2.75f, 16.5f)
                horizontalLineToRelative(18.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.1f, 1.5f)
                lineTo(2.75f, 18.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.1f, -1.5f)
                horizontalLineToRelative(18.6f)
                horizontalLineToRelative(-18.5f)
                close()
                moveTo(18.25f, 5.0f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(5.75f, 16.0f)
                curveTo(4.78f, 16.0f, 4.0f, 15.22f, 4.0f, 14.25f)
                verticalLineToRelative(-7.5f)
                curveTo(4.0f, 5.78f, 4.78f, 5.0f, 5.75f, 5.0f)
                horizontalLineToRelative(12.5f)
                close()
                moveTo(18.25f, 6.5f)
                lineTo(5.75f, 6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        return _laptop!!
    }

private var _laptop: ImageVector? = null
