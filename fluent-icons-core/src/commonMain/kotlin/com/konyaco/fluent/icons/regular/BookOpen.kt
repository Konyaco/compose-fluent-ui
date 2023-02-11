

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) {
            return _bookOpen!!
        }
        _bookOpen = fluentIcon(name = "Regular.BookOpen") {
            fluentPath {
                moveTo(12.0f, 19.14f)
                curveToRelative(-0.5f, 0.53f, -1.21f, 0.86f, -2.0f, 0.86f)
                lineTo(3.75f, 20.0f)
                curveTo(2.78f, 20.0f, 2.0f, 19.22f, 2.0f, 18.25f)
                lineTo(2.0f, 5.75f)
                curveTo(2.0f, 4.78f, 2.78f, 4.0f, 3.75f, 4.0f)
                lineTo(10.0f, 4.0f)
                curveToRelative(0.79f, 0.0f, 1.5f, 0.33f, 2.0f, 0.86f)
                curveToRelative(0.5f, -0.53f, 1.21f, -0.86f, 2.0f, -0.86f)
                horizontalLineToRelative(6.25f)
                curveToRelative(0.97f, 0.0f, 1.75f, 0.78f, 1.75f, 1.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                lineTo(14.0f, 20.0f)
                curveToRelative(-0.79f, 0.0f, -1.5f, -0.33f, -2.0f, -0.86f)
                close()
                moveTo(3.5f, 5.75f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.14f, 0.11f, 0.25f, 0.25f, 0.25f)
                lineTo(10.0f, 18.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                lineTo(11.25f, 6.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(3.75f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(12.75f, 17.25f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(6.25f)
                curveToRelative(0.14f, 0.0f, 0.25f, -0.11f, 0.25f, -0.25f)
                lineTo(20.5f, 5.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(14.0f, 5.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                close()
            }
        }
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
