

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.PersonClock: ImageVector
    get() {
        if (_personClock != null) {
            return _personClock!!
        }
        _personClock = fluentIcon(name = "Filled.PersonClock") {
            fluentPath {
                moveTo(11.0f, 17.5f)
                curveToRelative(0.0f, -1.29f, 0.38f, -2.49f, 1.02f, -3.5f)
                lineTo(4.25f, 14.0f)
                curveTo(3.01f, 14.0f, 2.0f, 15.0f, 2.0f, 16.25f)
                verticalLineToRelative(0.58f)
                curveToRelative(0.0f, 0.89f, 0.32f, 1.75f, 0.9f, 2.43f)
                curveTo(4.47f, 21.1f, 6.85f, 22.0f, 10.0f, 22.0f)
                curveToRelative(0.93f, 0.0f, 1.8f, -0.08f, 2.6f, -0.24f)
                arcTo(6.48f, 6.48f, 0.0f, false, true, 11.0f, 17.5f)
                close()
                moveTo(10.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                close()
                moveTo(17.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(19.5f, 17.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
            }
        }
        return _personClock!!
    }

private var _personClock: ImageVector? = null
