

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.Dock: ImageVector
    get() {
        if (_dock != null) {
            return _dock!!
        }
        _dock = fluentIcon(name = "Filled.Dock") {
            fluentPath {
                moveTo(12.7f, 3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.4f, 0.0f)
                lineTo(7.8f, 6.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.4f, 1.4f)
                lineTo(11.0f, 6.42f)
                verticalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                verticalLineTo(6.41f)
                lineToRelative(1.8f, 1.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.4f, -1.42f)
                lineToRelative(-3.5f, -3.5f)
                close()
                moveTo(4.0f, 12.74f)
                curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                horizontalLineTo(4.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 2.0f, 12.75f)
                verticalLineToRelative(4.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 4.75f, 20.0f)
                horizontalLineToRelative(14.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 22.0f, 17.25f)
                verticalLineToRelative(-4.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 19.25f, 10.0f)
                horizontalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }
        return _dock!!
    }

private var _dock: ImageVector? = null
