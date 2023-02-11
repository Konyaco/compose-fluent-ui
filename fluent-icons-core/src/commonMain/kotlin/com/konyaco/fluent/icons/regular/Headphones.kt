

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Headphones: ImageVector
    get() {
        if (_headphones != null) {
            return _headphones!!
        }
        _headphones = fluentIcon(name = "Regular.Headphones") {
            fluentPath {
                moveTo(22.0f, 12.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.82f, 3.0f)
                lineTo(16.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -0.88f)
                lineTo(15.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.88f, -1.0f)
                horizontalLineToRelative(4.62f)
                verticalLineToRelative(-2.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -17.0f, 0.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                verticalLineToRelative(7.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(7.5f, 15.5f)
                horizontalLineToRelative(-4.0f)
                lineTo(3.5f, 19.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(20.5f, 15.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.0f)
                lineTo(19.0f, 20.5f)
                curveToRelative(0.78f, 0.0f, 1.42f, -0.6f, 1.5f, -1.36f)
                lineTo(20.5f, 15.5f)
                close()
            }
        }
        return _headphones!!
    }

private var _headphones: ImageVector? = null
