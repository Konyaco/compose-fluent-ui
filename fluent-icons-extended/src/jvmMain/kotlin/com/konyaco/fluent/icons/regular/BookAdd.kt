

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BookAdd: ImageVector
    get() {
        if (_bookAdd != null) {
            return _bookAdd!!
        }
        _bookAdd = fluentIcon(name = "Regular.BookAdd") {
            fluentPath {
                moveTo(3.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 2.0f)
                lineTo(17.0f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(6.81f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, -1.5f, -0.3f)
                lineTo(18.0f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(5.5f, 3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(4.5f, 18.0f)
                horizontalLineToRelative(6.52f)
                curveToRelative(0.04f, 0.52f, 0.14f, 1.02f, 0.3f, 1.5f)
                lineTo(4.5f, 19.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.23f)
                curveToRelative(0.29f, 0.55f, 0.65f, 1.06f, 1.08f, 1.5f)
                lineTo(5.5f, 22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 19.5f)
                verticalLineToRelative(-15.0f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(18.0f, 20.5f)
                lineTo(18.0f, 18.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -1.0f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(17.0f, 18.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 1.0f, 0.0f)
                close()
                moveTo(6.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(7.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(7.5f, 7.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        return _bookAdd!!
    }

private var _bookAdd: ImageVector? = null
