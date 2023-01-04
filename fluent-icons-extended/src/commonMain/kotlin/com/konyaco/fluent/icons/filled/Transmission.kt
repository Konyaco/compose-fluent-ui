

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Transmission: ImageVector
    get() {
        if (_transmission != null) {
            return _transmission!!
        }
        _transmission = fluentIcon(name = "Filled.Transmission") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -0.75f, 5.4f)
                verticalLineToRelative(3.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineTo(7.4f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(5.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 6.5f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineTo(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.75f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 4.0f)
                close()
            }
        }
        return _transmission!!
    }

private var _transmission: ImageVector? = null
