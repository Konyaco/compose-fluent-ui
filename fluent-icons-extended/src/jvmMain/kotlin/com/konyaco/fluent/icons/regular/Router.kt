

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Router: ImageVector
    get() {
        if (_router != null) {
            return _router!!
        }
        _router = fluentIcon(name = "Regular.Router") {
            fluentPath {
                moveTo(12.0f, 3.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 4.5f, 11.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(3.0f, 11.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 18.0f, 0.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(19.5f, 11.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 12.0f, 3.5f)
                close()
                moveTo(12.0f, 6.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 7.5f, 11.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(6.0f, 11.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                verticalLineToRelative(0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(16.5f, 11.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 12.0f, 6.5f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.75f, 5.9f)
                lineTo(11.25f, 16.0f)
                lineTo(6.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                horizontalLineToRelative(-5.25f)
                verticalLineToRelative(-2.1f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 8.0f)
                close()
                moveTo(10.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                close()
                moveTo(6.0f, 17.5f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                lineTo(6.0f, 20.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        return _router!!
    }

private var _router: ImageVector? = null
