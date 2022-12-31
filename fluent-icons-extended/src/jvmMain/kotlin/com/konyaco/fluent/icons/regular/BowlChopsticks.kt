

package com.konyaco.fluent.icons.regular

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Regular.BowlChopsticks: ImageVector
    get() {
        if (_bowlChopsticks != null) {
            return _bowlChopsticks!!
        }
        _bowlChopsticks = fluentIcon(name = "Regular.BowlChopsticks") {
            fluentPath {
                moveTo(6.4f, 2.38f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.3f, 0.74f)
                lineTo(9.63f, 11.0f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineTo(12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                verticalLineToRelative(-0.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-5.88f)
                lineTo(10.4f, 2.38f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.3f, 0.74f)
                lineTo(13.63f, 11.0f)
                horizontalLineToRelative(-2.26f)
                lineTo(6.4f, 2.38f)
                close()
                moveTo(4.79f, 16.5f)
                horizontalLineTo(19.2f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -14.42f, 0.0f)
                close()
                moveTo(4.04f, 15.0f)
                arcToRelative(8.46f, 8.46f, 0.0f, false, true, -0.53f, -2.5f)
                horizontalLineTo(20.5f)
                arcToRelative(8.46f, 8.46f, 0.0f, false, true, -0.53f, 2.5f)
                horizontalLineTo(4.04f)
                close()
            }
        }
        return _bowlChopsticks!!
    }

private var _bowlChopsticks: ImageVector? = null
