

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.Transmission: ImageVector
    get() {
        if (_transmission != null) {
            return _transmission!!
        }
        _transmission = fluentIcon(name = "Regular.Transmission") {
            fluentPath {
                moveTo(12.0f, 2.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -0.75f, 5.4f)
                verticalLineToRelative(3.85f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(12.75f, 7.4f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 12.0f, 2.0f)
                close()
                moveTo(10.75f, 4.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                close()
                moveTo(3.0f, 6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                lineTo(8.0f, 10.0f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(1.5f)
                lineTo(6.5f, 11.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                lineTo(11.0f, 13.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(19.5f, 6.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.75f)
                lineTo(13.75f, 10.0f)
                lineTo(16.0f, 10.0f)
                lineTo(16.0f, 6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                lineTo(21.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                lineTo(9.5f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                verticalLineToRelative(-12.0f)
                close()
            }
        }
        return _transmission!!
    }

private var _transmission: ImageVector? = null
