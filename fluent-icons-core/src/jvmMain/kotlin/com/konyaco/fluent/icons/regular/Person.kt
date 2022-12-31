

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Person: ImageVector
    get() {
        if (_person != null) {
            return _person!!
        }
        _person = fluentIcon(name = "Regular.Person") {
            fluentPath {
                moveTo(17.75f, 14.0f)
                curveTo(19.0f, 14.0f, 20.0f, 15.0f, 20.0f, 16.25f)
                verticalLineToRelative(0.57f)
                curveToRelative(0.0f, 0.9f, -0.32f, 1.76f, -0.9f, 2.44f)
                curveTo(17.53f, 21.1f, 15.15f, 22.0f, 12.0f, 22.0f)
                curveToRelative(-3.15f, 0.0f, -5.53f, -0.9f, -7.1f, -2.74f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, true, -0.9f, -2.43f)
                verticalLineToRelative(-0.58f)
                curveTo(4.0f, 15.0f, 5.01f, 14.0f, 6.25f, 14.0f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(17.75f, 15.5f)
                lineTo(6.25f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.53f, 0.2f, 1.05f, 0.54f, 1.46f)
                curveTo(7.3f, 19.76f, 9.26f, 20.5f, 12.0f, 20.5f)
                curveToRelative(2.74f, 0.0f, 4.7f, -0.74f, 5.96f, -2.21f)
                curveToRelative(0.35f, -0.41f, 0.54f, -0.93f, 0.54f, -1.47f)
                verticalLineToRelative(-0.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(12.0f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                close()
            }
        }
        return _person!!
    }

private var _person: ImageVector? = null
