

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.SlideSize: ImageVector
    get() {
        if (_slideSize != null) {
            return _slideSize!!
        }
        _slideSize = fluentIcon(name = "Regular.SlideSize") {
            fluentPath {
                moveTo(16.78f, 7.22f)
                curveToRelative(0.14f, 0.14f, 0.22f, 0.33f, 0.22f, 0.53f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-0.69f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.72f, -1.72f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(2.51f)
                curveToRelative(0.2f, 0.0f, 0.39f, 0.08f, 0.53f, 0.22f)
                close()
                moveTo(7.0f, 16.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.75f, 0.75f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.69f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineTo(8.5f, 14.44f)
                verticalLineToRelative(-0.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(2.0f, 6.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 4.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 22.0f, 6.75f)
                verticalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 19.25f, 20.0f)
                lineTo(4.75f, 20.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 2.0f, 17.25f)
                lineTo(2.0f, 6.75f)
                close()
                moveTo(4.75f, 5.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.69f, 0.0f, 1.25f, -0.56f, 1.25f, -1.25f)
                lineTo(20.5f, 6.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                lineTo(4.75f, 5.5f)
                close()
            }
        }
        return _slideSize!!
    }

private var _slideSize: ImageVector? = null
