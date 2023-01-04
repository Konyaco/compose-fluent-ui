

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Production: ImageVector
    get() {
        if (_production != null) {
            return _production!!
        }
        _production = fluentIcon(name = "Regular.Production") {
            fluentPath {
                moveTo(6.25f, 3.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, 0.78f, -1.75f, 1.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, -0.78f, 1.75f, -1.75f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.97f, -0.78f, -1.75f, -1.75f, -1.75f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(13.5f, 5.25f)
                curveToRelative(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.97f, 0.0f, -1.75f, -0.78f, -1.75f, -1.75f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(15.25f, 5.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(7.0f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(13.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(17.0f, 17.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(2.0f, 16.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.5f, -4.5f)
                horizontalLineToRelative(11.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, 9.0f)
                horizontalLineToRelative(-11.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 2.0f, 16.0f)
                close()
                moveTo(6.5f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                horizontalLineToRelative(-11.0f)
                close()
            }
        }
        return _production!!
    }

private var _production: ImageVector? = null
