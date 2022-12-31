

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Stream: ImageVector
    get() {
        if (_stream != null) {
            return _stream!!
        }
        _stream = fluentIcon(name = "Regular.Stream") {
            fluentPath {
                moveTo(9.0f, 11.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 7.5f, -7.5f)
                horizontalLineToRelative(0.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.0f, 9.0f)
                verticalLineToRelative(1.25f)
                curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(3.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 9.0f, 12.25f)
                lineTo(9.0f, 11.0f)
                close()
                moveTo(16.75f, 7.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -4.25f, 4.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -5.75f, 5.75f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(4.0f)
                curveTo(9.1f, 17.0f, 11.0f, 15.1f, 11.0f, 12.75f)
                verticalLineToRelative(-1.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 5.75f, -5.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(17.25f, 10.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                lineTo(16.0f, 13.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, 9.0f)
                horizontalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(7.0f, 20.5f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 7.5f, -7.5f)
                verticalLineToRelative(-1.25f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 17.25f, 9.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        return _stream!!
    }

private var _stream: ImageVector? = null
