

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlideLink: ImageVector
    get() {
        if (_slideLink != null) {
            return _slideLink!!
        }
        _slideLink = fluentIcon(name = "Regular.SlideLink") {
            fluentPath {
                moveTo(2.0f, 6.25f)
                curveTo(2.0f, 5.01f, 3.0f, 4.0f, 4.25f, 4.0f)
                horizontalLineToRelative(15.5f)
                curveTo(20.99f, 4.0f, 22.0f, 5.0f, 22.0f, 6.25f)
                verticalLineToRelative(7.13f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, false, -1.5f, -0.71f)
                lineTo(20.5f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(4.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(6.92f)
                curveToRelative(0.14f, 0.55f, 0.39f, 1.05f, 0.7f, 1.5f)
                lineTo(4.26f, 20.0f)
                curveTo(3.01f, 20.0f, 2.0f, 19.0f, 2.0f, 17.75f)
                lineTo(2.0f, 6.25f)
                close()
                moveTo(23.0f, 17.25f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -3.75f, -3.75f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(0.15f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -0.15f, 4.5f)
                lineToRelative(-0.1f, 0.01f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                lineTo(19.25f, 21.0f)
                horizontalLineToRelative(0.2f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 23.0f, 17.24f)
                close()
                moveTo(16.5f, 14.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, 0.2f, 7.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.1f, -1.5f)
                horizontalLineToRelative(-0.15f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.15f, -4.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
                moveTo(20.0f, 17.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.1f, 1.5f)
                horizontalLineToRelative(3.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.65f, -0.75f)
                close()
            }
        }
        return _slideLink!!
    }

private var _slideLink: ImageVector? = null
