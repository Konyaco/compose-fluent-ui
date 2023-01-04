

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Microscope: ImageVector
    get() {
        if (_microscope != null) {
            return _microscope!!
        }
        _microscope = fluentIcon(name = "Filled.Microscope") {
            fluentPath {
                moveTo(8.0f, 2.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(1.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(1.78f)
                horizontalLineToRelative(0.03f)
                arcToRelative(8.25f, 8.25f, 0.0f, false, true, 3.96f, 14.97f)
                horizontalLineToRelative(3.26f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 22.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(8.53f)
                arcTo(6.75f, 6.75f, 0.0f, false, false, 13.0f, 7.04f)
                verticalLineToRelative(5.21f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                lineTo(8.0f, 3.0f)
                verticalLineToRelative(-0.25f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 13.0f)
                close()
                moveTo(5.75f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
        return _microscope!!
    }

private var _microscope: ImageVector? = null
