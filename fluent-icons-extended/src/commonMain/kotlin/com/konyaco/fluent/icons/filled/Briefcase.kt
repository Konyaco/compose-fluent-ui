

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = fluentIcon(name = "Filled.Briefcase") {
            fluentPath {
                moveTo(15.25f, 3.0f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(1.75f)
                curveTo(19.55f, 7.0f, 21.0f, 8.46f, 21.0f, 10.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                lineTo(6.25f, 20.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 3.0f, 16.75f)
                verticalLineToRelative(-6.5f)
                curveTo(3.0f, 8.45f, 4.46f, 7.0f, 6.25f, 7.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 3.75f)
                curveToRelative(0.0f, -0.38f, 0.28f, -0.7f, 0.65f, -0.74f)
                lineToRelative(0.1f, -0.01f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(14.5f, 4.5f)
                horizontalLineToRelative(-5.0f)
                lineTo(9.5f, 7.0f)
                horizontalLineToRelative(5.0f)
                lineTo(14.5f, 4.5f)
                close()
            }
        }
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
