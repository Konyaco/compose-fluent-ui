

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.BowlChopsticks: ImageVector
    get() {
        if (_bowlChopsticks != null) {
            return _bowlChopsticks!!
        }
        _bowlChopsticks = fluentIcon(name = "Filled.BowlChopsticks") {
            fluentPath {
                moveTo(5.38f, 2.1f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.02f, 0.28f)
                lineTo(11.37f, 11.0f)
                horizontalLineToRelative(2.26f)
                lineTo(9.1f, 3.12f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.3f, -0.74f)
                lineTo(15.37f, 11.0f)
                horizontalLineToRelative(5.93f)
                curveToRelative(0.39f, 0.0f, 0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(0.3f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -0.46f, 3.0f)
                horizontalLineTo(2.46f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                verticalLineToRelative(-0.3f)
                curveToRelative(0.0f, -0.39f, 0.31f, -0.7f, 0.7f, -0.7f)
                horizontalLineToRelative(6.93f)
                lineTo(5.1f, 3.12f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.28f, -1.02f)
                close()
                moveTo(3.07f, 16.5f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 17.86f, 0.0f)
                horizontalLineTo(3.07f)
                close()
            }
        }
        return _bowlChopsticks!!
    }

private var _bowlChopsticks: ImageVector? = null
