

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlideText: ImageVector
    get() {
        if (_slideText != null) {
            return _slideText!!
        }
        _slideText = fluentIcon(name = "Regular.SlideText") {
            fluentPath {
                moveTo(6.75f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(6.0f, 11.75f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(6.75f, 14.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(4.75f, 4.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 20.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 22.0f, 17.25f)
                lineTo(22.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 4.0f)
                lineTo(4.75f, 4.0f)
                close()
                moveTo(3.5f, 6.75f)
                curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                lineTo(4.75f, 18.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                lineTo(3.5f, 6.75f)
                close()
            }
        }
        return _slideText!!
    }

private var _slideText: ImageVector? = null
